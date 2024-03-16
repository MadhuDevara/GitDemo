package JavaSeleniumTraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To set browser to accept the certificates
		FirefoxOptions options= new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(options);	
		
		driver.get("https://expired.badssl.com/");;
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
