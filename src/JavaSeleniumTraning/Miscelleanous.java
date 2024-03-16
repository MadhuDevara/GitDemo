// 108 Maximizing window and deleting cookies
// Take Screen Shot and creating destination folder
// Delete all cookies
package JavaSeleniumTraning;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.apache.commons.io.FileUtils;
public class Miscelleanous {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sample");
		driver.get("http://google.com");
		
		//Take screen shot and save in given folder
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("E:\\screenshot.png"));
		
		
		
	}

}
