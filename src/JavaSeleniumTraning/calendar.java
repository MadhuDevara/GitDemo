package JavaSeleniumTraning;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class calendar {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.path2usa.com/travel-companion/");
		
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		//driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}


		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}

		}
		}

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		
		//To get compleate list of days
		
		//List <WebElement> dates = (List<WebElement>) driver.findElement(By.className(".day"));
		
		//int count=driver.findElement(By.className(".day")).si
				
				//input[@id='form-field-travel_comp_date']
		
			
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

