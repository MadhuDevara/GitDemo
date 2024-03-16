package JavaSeleniumTraning;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebDriverWait w =new WebDriverWait(driver, 5);
		
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");	
		
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		
		//driver.findElement(By.xpath("//label[2]//span[2]")).click();
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		//WebElement staticdropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		
		//Select dropdown = new Select(staticdropdown);
		
		//dropdown.selectByIndex(2);
		
		//driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		//driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
		//driver.findElement(By.xpath("//app-card[1]//div[1]//div[2]//button[1]")).click();	
		
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[2]/div[1]/div[2]/button[1]")).click();
		
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[3]/div[1]/div[2]/button[1]")).click();
		
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[4]/div[1]/div[2]/button[1]")).click();
				
		//driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");


		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

		//Thread.sleep(3000);
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		

		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select dropdown = new Select(options);

		dropdown.selectByValue("consult");

		driver.findElement(By.id("signInBtn")).click();


		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();}




		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
