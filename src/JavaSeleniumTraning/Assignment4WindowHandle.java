//WindowsHandleAssignment

package JavaSeleniumTraning;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Assignment4WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentId=it.next();
		String childId =it.next();
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.switchTo().window(parentId);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		

	}

}

/*
 * Instructor example
 
Complete the Assignment and Post the code here

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
public static void main(String[] args) {
// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://the-internet.herokuapp.com/");
driver.findElement(By.linkText("Multiple Windows")).click();
driver.findElement(By.cssSelector("a[href*='windows']")).click();

Set<String> abc=driver.getWindowHandles();
Iterator<String> it=abc.iterator();
String parentWindow=it.next();
driver.switchTo().window(it.next());

System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
driver.switchTo().window(parentWindow);
System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

}

}

*/

