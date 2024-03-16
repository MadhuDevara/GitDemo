package JavaSeleniumTraning;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignmentFrames5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	
			
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_top']")));
						
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
			
		
		
	}

}
