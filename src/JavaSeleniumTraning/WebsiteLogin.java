//WEBCITE LOGIN
package JavaSeleniumTraning;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
public class WebsiteLogin {
	public static void main(String[] args) throws InterruptedException {
									
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	driver.findElement(By.id("inputUsername")).sendKeys("maddy1");	
	driver.findElement(By.name("inputPassword")).sendKeys("maddy12");	
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(2000);
	//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("maddy");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@madhu.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("gmail@gmail.com");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("123123");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	
	}

}






	
	
	//driver.get("https://rahulshettyacademy.com/");
	//driver.findElement(By.xpath("//button[@id='visitUsTwo']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
	//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("madhu");
	//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("karanmartin@gmail.com");
	//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9000002121");
	//Thread.sleep(2000);
	//driver.findElement(By.className("ghost")).click();
	//System.out.println(driver.findElement(By.cssSelector("p./p")).getText());
	//driver.findElement(By.className("logout-btn")).click();

//code to view the error and messages code
//linkText locator for click on link
// space in class that means two classes are applicable for this button
// In inspect section of console we can identify locators by $('p.error') and enter
// it will show you locations
//Inspect>console>and enter $(‘example’) in case your company doesn’t  allow browser plugins tools
//code for implicit wait guiding selenium to wait for results in console to view
// it will globally be applicable if something not showing up it take time and display
	