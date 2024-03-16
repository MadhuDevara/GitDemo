//118 Sorting and getting text of elements and scanning
//119 PageNation searching multiple webPages of webTable

package JavaSeleniumTraning;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
public class LiveDemoJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\madhu\\Downloads\\geckodriver-v0.33.0-win64 (3)\\geckodriver.exe");
		FirefoxOptions co = new FirefoxOptions();
		co.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on that column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all the webElement into list 
		List<WebElement> elementsList= driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all web elements into new (original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on apply sort in the list of step3 ->sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		//Scan the name column with get text -> Rice -> print the price of the vegetable
		// -> Lambda Expression left side expression is items present in stream and right side what 
		// what action you need to perform 
		
		List<String> price; 
		
		do
		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			
		price = rows.stream().filter(s->s.getText().contains("Rice"))
			.map(s->getPriceVeggie(s)).collect(Collectors.toList());

		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		
		}while (price.size()<1);
		
				
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
	}

}
