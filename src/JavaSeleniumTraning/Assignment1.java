package JavaSeleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();	
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

	Assert.assertTrue(driver.findElements(By.cssSelector("input[type='checkbox']")).size()>0);
	
	
	
	
	}

}
