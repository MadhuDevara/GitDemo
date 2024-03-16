/*
1.Count and size of links with tagName a and footerDriver
2.we can different pages with out coming back its optimization method we can skip old method
3.Navigate to each and tab and get title
4.Creating webElement so that it works like driver 
*/

package JavaSeleniumTraning;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class scopeJava {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Count no of links in a page?
		// a must have tag name as a link count

		System.out.println(driver.findElements(By.tagName("a")).size());

		// Creating webElement for footerDriver so that it works like driver
		// Limiting webDriver scope

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3.Parent to child to count first column link

		WebElement coloumdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(coloumdriver.findElements(By.tagName("a")).size());

		// 4.click on each link check if the links are working
		// 0th link is not working so using from 1

		for (int i = 1; i < coloumdriver.findElements(By.tagName("a")).size(); i++) 
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			// Instead of click we are using keys.enter we can do send keys and say
			// keys.enter to on enter
			// for keyboard event

			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}
		
		// Opens all the tabs
		// Iterates in each and every tab and get the title
		// 4 Tabs //Set as a data type
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		// while loop continuously until the condition term to false it will come out of
		// loop

		while (it.hasNext()) 
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
