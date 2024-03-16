package JavaSeleniumTraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelfFlightCodeAll {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

// RoundTrip
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

//Don't use ; while using if condition if not else will appear error
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

// From place
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);

// To place
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();

//DropDown
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1000);
		int i = 1;
		while (i < 4)

		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

//Country
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		;
		dropdown.selectByIndex(3);
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

// Senior citizen 
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

//Search 
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

	}

}
