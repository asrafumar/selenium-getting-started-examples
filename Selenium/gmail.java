import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class gmail {
	
	@Test
	public void loginGmail(){
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium2\\JavaCode\\Library\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		
	    System.setProperty("webdriver.ie.driver","D:\\Automation\\Selenium2\\JavaCode\\Library\\IEDriverServer.exe");
	    InternetExplorerDriver driver = new InternetExplorerDriver();
	
		//WebDriver driver =new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("traininguser");
		driver.findElement(By.name("Passwd")).sendKeys("xxxx");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("signIn")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		if (driver.findElement(By.cssSelector("#errormsg_0_Passwd")).isDisplayed()) {
			System.out.println(driver.findElement(By.cssSelector("#errormsg_0_Passwd")).getText());
		}
		driver.close();
		}
 
}
