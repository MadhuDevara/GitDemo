//112 Iterate over all links and find out broken links mechanism
//113 Importance of softassertions in Selenium WebDriver 
//Broken URL
//Step 1- IS to get all Url's tied to the links using Selenium
//Java methods will call URL and gets you the status code
//If status code >400 then that Url's is not working> Link which tied to url is broken
//To call any method you can call that method using object of that class then object. method

package JavaSeleniumTraning;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		SoftAssert a = new SoftAssert();
				
		for (WebElement link:links)
		{
			String url=link.getAttribute("href");
			
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();		
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with text"+link.getText()+"is broken with code"+respCode);
		
		}
			
		a.assertAll();
						
	}

}
