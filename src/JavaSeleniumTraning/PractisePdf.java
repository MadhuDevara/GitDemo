//Write a script for the following:
//Open the browser
//Delete all cookies
//Set size of the window
//Set position of the window
//Maximize the window

package JavaSeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PractisePdf {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://adactin.com/HotelApp/index.php");
	driver.manage().window().maximize();
	WebElement x = driver.findElement(By.id("username"));
	x.sendKeys("madhu");
	

		
		
		
	}

}
