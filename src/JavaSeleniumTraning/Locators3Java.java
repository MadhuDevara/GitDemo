// Siblings-Parents element Traverse mix // Siblings to siblings // 

package JavaSeleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Locators3Java {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	// Parent to child traverse and sibling to sibling
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	//child to parent
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	
	;
		
		
		
		
	}

}
