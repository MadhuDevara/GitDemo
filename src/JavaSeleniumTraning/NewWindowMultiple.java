 
// 126, 127 evoking multiple windows and switch between windows getting text.
// Taking screen shot of webElement and saving in destination by downloading jar file.
package JavaSeleniumTraning;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NewWindowMultiple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Switching Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		
		driver.get("https://www.rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector
				("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentWindowId);	
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		//ScreenSHOT
		File file=name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		//Get Height and Width
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
	}

}
