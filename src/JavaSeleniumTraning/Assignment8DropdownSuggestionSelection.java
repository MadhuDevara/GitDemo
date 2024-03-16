
// 1.Assignment DropDown suggestion selection from trainer code

package JavaSeleniumTraning;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment8DropdownSuggestionSelection {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);

		// Value is am attribute which stored in frontEnd stored value will get by attribute
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

			
		
	}

}







/*

1.DropDown suggestion selection chat gpt self

package JavaSeleniumTraning;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment8DropdownSuggestionSelection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		WebElement drop =driver.findElement(By.id("autocomplete"));
		
		String suggestionToSelect = "IND";
		
		drop.sendKeys(suggestionToSelect);
		
		drop.sendKeys(Keys.ARROW_DOWN);
		
		drop.sendKeys(Keys.ARROW_DOWN);
		
		drop.sendKeys(Keys.ARROW_DOWN);
		
		drop.sendKeys(Keys.ENTER);
		
		String selectedValue = drop.getAttribute("India");
		
		assert selectedValue.equals(suggestionToSelect);
						
	}

}

*/