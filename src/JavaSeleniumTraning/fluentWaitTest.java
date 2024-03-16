package JavaSeleniumTraning;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
import org.openqa.selenium.NoSuchElementException;
public class fluentWaitTest {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		// FluentWait
		
		Wait <WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
			if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
			else
				return null;
				
				
				
			}
			});		
				
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
				
		}
						
		
	}


