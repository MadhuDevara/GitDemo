//
package JavaSeleniumTraning;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Locaters {
public static void main1(String[] args) throws InterruptedException 
			{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
								
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputusername")).sendKeys("rahul");
		driver.findElement(By.name("inputpassword")).sendKeys("hello123");
		driver.findElement(By.className("singInBtn")).click();
			
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jhon");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("jhon@random.com");
		driver.findElement(By.cssSelector("input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("jh@gmail.com");
		driver.findElement( By.xpath("//form/input[3]")).sendKeys("9000002121");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//to clear a field
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		// to find phone number / child parent tags
		driver.findElement(By.xpath("form/input[3]")).sendKeys("9000002121");
		// to click on reset login
		driver.findElement(By.cssSelector("reset-pwd-btn")).click();
		//grabbing the text
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		// with id we can generate CSS out of it 
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputusername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit' )]")).click();
		
		
	}

}
