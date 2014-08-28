import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverWait_Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//Page loading timeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		WebDriverWait wait = new WebDriverWait(driver,20);
	
		driver.get("http://www.commonfloor.com/apartments-for-sale");
		
		driver.findElement(By.xpath("//*[@id='sale_type_chzn']/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id='sale_type_chzn_o_1']")).click();
		
		
		//wait maximum 20 seconds for element to be present
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='listing_loader']/img")));
		System.out.println("A");
		//wait maximum 20 seconds for element to disappear 
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='listing_loader']/img")));
		System.out.println("B");
		
		//FluentWait , this code wait max for 30 seconds and checks for element every 5 seconds
		new FluentWait<WebDriver>(driver)
			.withTimeout(30, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='listing_loader']/img")));
			
			
	}

}
