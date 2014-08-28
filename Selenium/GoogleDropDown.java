import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleDropDown {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium2\\JavaCode\\Library\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Selenium");

	}

}
