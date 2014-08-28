package Form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
	
	public static void main(String[] args) {
		String temp;
	
		System.setProperty("webdriver.ie.driver", "C://Core-Jars//Driver//IEDriverServer_Win32_2.37.0//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("https://commerce.in.reuters.com/login/pages/login/portfolioLogin.do?go=http%3A%2F%2Fin.reuters.com%2F");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/form/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/form/div[4]/input")).sendKeys("sss");
		
				
		//work around to click on IE as click method does not work for retures
		driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/form/div[6]/div[1]/input")).sendKeys("\n");
			
		//Explicit wait
	   WebDriverWait wait = new WebDriverWait(driver, 30);
       
	   wait.until(ExpectedConditions.alertIsPresent());
	   
	   Alert alert = driver.switchTo().alert();
       
	   alert.accept(); //click on OK button of alert
	   	     
	   driver.switchTo().defaultContent(); //returning back reference to browser
			      
	}

}
