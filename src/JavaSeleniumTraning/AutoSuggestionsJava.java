package JavaSeleniumTraning;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AutoSuggestionsJava {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		// Get all the items in the list figure out the generic locator which extracts
		// all the items
		// Enhanced for loop everytime when loop iterates you pick one option and that
		// option
		// will get stored in the variable and the return type of the option is our web
		// element.
		// If we find any autosuggestion dropdowns without any options our first goal is
		// provide input
		// and figure out the generic locator which extracts all the items and store it
		// the list
		// and iterate over the list and text it matches the required text and click.

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;// For loop will ends abruptly it will skip all the iterations
			}
		}

	}

}
