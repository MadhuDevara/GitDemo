/*
1.Script for scroll
2.Grabbing text from Column
3.making the sum
*/
package JavaSeleniumTraning;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		//Casting the driver to the executor
		//KnowdLedge will be in js
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//To scroll code from Html page
				
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000 ");
		
		List<WebElement>values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		//Iterate and sum them
		//String to integer conversion
		
		int sum=0;		
				
		for(int i=0; i <values.size();i++) //for (int i = 0; i < values.size(); i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}		

		System.out.println(sum);
		
		//Compare the sum from cite
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		int total = Integer .parseInt(driver.findElement(By.cssSelector(".totalAmount"))
				.getText().split(":")[1].trim()); 

		Assert.assertEquals(sum, total);

		
		
	}

}
