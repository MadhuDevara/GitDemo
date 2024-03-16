// window activities back and forward

package JavaSeleniumTraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserActivities {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// navigating to another webcite
		// in get it has inbuilt wait mechanism
		driver.navigate().to("https://rahulshettyacademy.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().forward();

	}

}
