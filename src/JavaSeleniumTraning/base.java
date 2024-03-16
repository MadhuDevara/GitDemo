package JavaSeleniumTraning;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class base {


	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w =new WebDriverWait(driver, null);
			
String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};

		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();	
		
		// Explicit Wait
		
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

	
	public static void addItems(WebDriver driver, String[] itemsNeeded) 
	{
	
		int j=0;
		
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	for (int i = 0; i < products.size(); i++)
	{
	
		// Brocolli - 1 Kg we need to split 2 parts
		// Brocolli, 1 Kg

		String[] name = products.get(i).getText().split("-");
		
		// Trimming space from attribute to not to use -1kg use.trim() which delete
		// spaces
		
		String formatedName = name[0].trim();
		
		// Format it to get actual vegetable name to add - 1kg
		// Check whether name you extracted is present in array or not
		// Convert array into array list for easy search
		// We can update array and add items

		List itemsNeededList = Arrays.asList(itemsNeeded);

		
		if (itemsNeededList.contains(formatedName)) 
			
		{
			j++;
			
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==itemsNeeded.length)
			{
			break;
			}
	
		}
	}
			
	}
}
