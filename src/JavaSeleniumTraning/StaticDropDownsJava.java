//Code Working
//SelectBy index //selectByVisibleText //selectByValue

package JavaSeleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
public class StaticDropDownsJava {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	// Crating an class Select for select tagname and adding the variable static dropdown to syntax
	// and import webElemetn
	// Dropdown is object and select is class
	// All this methods only supports when select tagname is there in HTML code
	// Dropdown does't support De-select option
	// Dot selectbyvisible text option to identify 
	// Giving the same system means it will display whichever is selected in above code
	
	WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(staticdropdown);;
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
				
	}

}
