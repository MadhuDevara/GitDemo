// SELECTING FROM AND TOO LOCATION AND SELECTING DATE

package JavaSeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// //a[@value='MAA'] - XAPTH FOR CHENNAI
		// //a[@value='BLR'] - XPATH FOR BANGLORE
		// for selecting required XPATH (//a[@value='MAA'] )[2]

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); ( Example For
		// index)

		// Parent child traverse relation ship xpath or element
		// //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='MAA']

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.id("input[id='ctl00_mainContent_view_date2']")).isEnabled();

	}

}
