



import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
				
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div/div[2]/div/div[3]/div[2]/span/input")).sendKeys("Bangalore, India (BLR)");
		                             
		
		driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div/div[2]/div/div[3]/div[3]/span/input")).sendKeys("Goa, India (GOI))");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='bottom_buttons']/button[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> winIDs = driver.getWindowHandles();
		System.out.println("Size "+winIDs.size());
		Iterator <String>iter = winIDs.iterator();
		
		//String winMain = iter.next();
		//String wintab = iter.next();
		
		//System.out.println("wintab "+ wintab);
		    
		/*driver.switchTo().window(wintab);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(winMain);
		System.out.println("Main URL "+driver.getCurrentUrl());*/
		 }

		
	}


