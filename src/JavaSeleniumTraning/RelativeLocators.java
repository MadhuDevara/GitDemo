// 123,124 Relative Locators and copy supporting file
//import this package import (static org.openqa.selenium.support.locators.RelativeLocator.*;)

package JavaSeleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;//import this package

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label"))
				.above(nameEditBox)).getText());
		
		WebElement dateofBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		WebElement iceCreamLabel = driver.findElement(By.xpath
				("//label[text()='Check me out if you Love IceCreams!']"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		
		System.out.println(driver.findElement(with(By.tagName("label"))
				.toRightOf(rdb)).getText());
			
	}

}
