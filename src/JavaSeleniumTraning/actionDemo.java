package JavaSeleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
public class actionDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	Actions a=new Actions(driver);
	WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	
	// Adding methods and creating composite action
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
		.click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
	//Move to specific element
	a.moveToElement(move).contextClick().build().perform();
	
	//Drag and Drop
	
	
	
	// driver will now get the capabilities of action class methods
	// We need to build entire action and it is ready to execute
	// perform is execution
	// Moves to specific element
	// below argument takes webElement and lets define in variable
	
	//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
