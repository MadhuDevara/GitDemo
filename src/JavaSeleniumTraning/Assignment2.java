package JavaSeleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/form-comp[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("madhu");
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/form-comp[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("madhu@gmail.com");
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/form-comp[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("Madhu");
	
	driver.findElement(By.id("exampleCheck1")).click();
	
	WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	Select dropdown = new Select(staticdropdown);
	dropdown.selectByVisibleText("Male");
	
	driver.findElement(By.id("inlineRadio1")).click();
	
	//driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("21112023");
	
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	
	
	
	
	
	
	}

}
