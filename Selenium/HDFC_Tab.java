import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HDFC_Tab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium2\\JavaCode\\Library\\chromedriver.exe");
		WebDriver driver =null;  
		
		driver = new FirefoxDriver();
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://www.hdfcbank.com");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/ul/li[1]/a")).getText());
		driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/ul/li[1]/a")).click();
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://www.hdfcbank.com");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/ul/li[1]/a")).getText());
		driver.findElement(By.xpath("//*[@id='hometab1']/div[1]/div[1]/ul/li[1]/a")).click();
		

	}

}
