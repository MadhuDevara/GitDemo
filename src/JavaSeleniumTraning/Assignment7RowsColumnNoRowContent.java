/*
1.Code to count no of rows and columns
2.Step by step flow from Html code
*/
package JavaSeleniumTraning;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Assignment7RowsColumnNoRowContent {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		//tr represents row and th for columns
		
		WebElement table = driver.findElement(By.id("product"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println(table.findElements(By.tagName("tr"))
				.get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> secondrow=table.findElements(By.tagName("tr"))
				.get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());
		
		System.out.println(secondrow.get(1).getText());
		
		System.out.println(secondrow.get(2).getText());
	

	}

}
