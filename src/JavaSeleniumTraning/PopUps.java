package JavaSeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PopUps {

	public static void main(String[] args) throws InterruptedException {

		String text = "Rahul";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Enter String
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);

		// Writing ID attribute by using CssSelector not id and alert button
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(2000);

		// Grabbing the text from alert pop-up and print
		System.out.println(driver.switchTo().alert().getText());

		// accepting the alert for OK button
		driver.switchTo().alert().accept();

		// confirm button
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);

		// grabbing the text
		System.out.println(driver.switchTo().alert().getText());

		// choose dismiss for remaining cancel or any words
		driver.switchTo().alert().dismiss();

	}

	private static void getScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
