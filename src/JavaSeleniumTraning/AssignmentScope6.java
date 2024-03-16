/*
1.Select any checkBox or option 2 and grab the text
2.Grab the label of the selected checkBox //put into variable
3.select an option in dropDown, here option to select should come from step2 
// do not hard code text it dynamically
4.enter the step2 grabbed label
5.should not use option text 
6.click alert and the verify if the text grabbed from step2 is present in the pop up message
7.do not hard code
*/

package JavaSeleniumTraning;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
public class AssignmentScope6 {
	public static void main(String[] args) {
	

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
		
		driver.findElement(By.cssSelector("select[id='dropdown-class-example")).click();
		WebElement staticdropdown = driver.findElement(By.cssSelector("select[id='dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
	
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Option2");
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
