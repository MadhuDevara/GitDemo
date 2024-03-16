
//120 Filter the webTable

package JavaSeleniumTraning;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

public class Filter118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		//5 Results
		 List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Rice"))
	                .collect(Collectors.toList());
		
	    //List<WebElement>filteredList, veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
		//collect(Collectors.toList());
		
		//1RESULTS 
		Assert.assertEquals(veggies.size(),filteredList.size());
				
	}

}
