package JavaSeleniumTraning;
import java.util.Iterator; 
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
								
		//PatentId,childId.subchildId
		//All the window id's are stored in setData structure
		//to Access the id's we are applying iterator method. with next method we are moving 
		//to zero'th index 
		//it is the object and creating string
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentId=it.next();
		String childId =it.next();
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
			
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		// Code created using debug breakpoint selecting the line and using right click watch to
		//to extract the email id from childId page from required line
		String emailId =driver.findElement
				(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);
			
		
	}

}
