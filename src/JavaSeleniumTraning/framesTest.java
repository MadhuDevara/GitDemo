// Frames code for drag and drop
package JavaSeleniumTraning;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
public class framesTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");	
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// 1.Using index to switch
		//driver.switchTo().frame(0);
		
		// 2.Using 
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		driver.findElement(By.cssSelector("div[id='draggable']")).click();
		
		//Actions
		Actions a = new Actions(driver);
		
		//Drag and Drop for frames
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		// Switch selenium to regular window
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
