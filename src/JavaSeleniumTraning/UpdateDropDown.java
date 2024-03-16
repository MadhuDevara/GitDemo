// DropDown selection and clicking the selection numbers 5 time
// using while and i++ for limiting
// execution for infinity
// select the CheckBox using CSS by * and half of the id to identify 
// check check box is selected or not
// dot is selected for to check its is selected or not
// count the number of CheckBoxes

package JavaSeleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
public class UpdateDropDown {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
	FirefoxOptions co = new FirefoxOptions();
	co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	WebDriver driver = new FirefoxDriver();	
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	Assert.assertFalse(false);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
		
	//driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
	
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
	//Don't use ; while using if condition if not else will appear error
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
		System.out.println("Its enabled");
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
	
	
	//driver.findElement(By.id("input[id='ctl00_mainContent_view_date2']")).isEnabled();
			
	// Counting the number of CheckBoxs
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	// Creating a variable for while loop and for loop after syntax adding i++
	// we can also use loop code for repeating the code 

	// Print the Adult value before selecting
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	//for(int i=1;i<5;i++)
	int i=1;
	while(i<5) 
	
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	
	// close button
	driver.findElement(By.id("btnclosepaxoption")).click();
	//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	//Print the selected value After
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	
	}

}
