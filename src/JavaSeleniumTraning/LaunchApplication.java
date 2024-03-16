//CODE WORKING
package JavaSeleniumTraning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LaunchApplication {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.setBinary("C:\\Users\\madhu\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	WebDriver driver = new ChromeDriver(co);
	
	driver.get("https://rahulshettyacademy.com/");
	driver.manage().window().maximize();
	}

}
