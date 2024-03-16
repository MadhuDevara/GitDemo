//code working
// Dot TagName // Assert Comparison // String name replicate // * for TagName
// Grabbing the text which changes sometimes and replacing the changed text back to element.

package JavaSeleniumTraning;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

	public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		
	String name = "rahul";
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();
						
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	// to call any methods from below class in to the main block nether we create the
	// object of the class and call that method object dot method.
	// use getpassword and change into static.
	// BY changing the method to static we can call with out creating the object or 
	// or create object for this class if you don't want declare the static 
	// video no 43 in udemy 
	
	String password = getpassword(driver);
			
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	Thread.sleep(1000);
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys(password);
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.tagName("p")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
	driver.findElement(By.xpath("//*[text()='Log Out']")).click();	
	Thread.sleep(1000);
	driver.close();
	}
	
	// Grabbing the text from forgot password page and spitting the text and copying the password from the text
	// * Reapplying the text from code to back to password element and login back in case the
	// ** the Passwords changes automatically.
	// Creating methods in class also that methods should go outside of the main execution block.
		
	// this method does;t no about the driver which is in the above block.
	// By giving the webdriver we are giving input to driver
		
	public static String getpassword(WebDriver driver) throws InterruptedException 
	
	{
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	//Copying the text from the variable
	// Pushing the text into variable
	// Please use temporary password 'rahulshettyacademy' to Login.
	
	String passwordText =driver.findElement(By.cssSelector("form p")).getText();
	
	// Create a string and array
	String[] passwordArray=passwordText.split("'");
	
	//String[] passwordArray2=passwordArray.split("'");
	//passwordArray2[0]
	//below line is same as above line shortcut
	String password = passwordArray[1].split("'")[0];
	
	return password;
	// change void to string
			
	}
		
}