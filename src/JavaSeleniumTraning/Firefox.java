//CODE WORKING
package JavaSeleniumTraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.youtube.com/");

	}
}
