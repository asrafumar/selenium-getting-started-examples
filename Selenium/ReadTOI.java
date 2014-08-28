import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReadTOI {
	private static boolean acceptNextAlert = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://timesofindia.indiatimes.com/");
		
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("img[alt='Facebook']")).click();
				
		
		//this method will you handle of all opened windows
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		
		    driver.switchTo().window(winHandle);
		    
		    System.out.println(driver.getTitle());
		}
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("abhaybharti@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Baba1981");
		
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.findElement(By.name("__SKIP__")).click();
		
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		
		List<WebElement> alllinks  = driver.findElements(By.tagName("a"));
		
		for (int i=0 ;i<alllinks.size();i++){
			alllinks.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://timesofindia.indiatimes.com/");
			alllinks  = driver.findElements(By.tagName("a"));
		}
		
		
	/*	for(String winHandle1 : driver.getWindowHandles()){
			
		    driver.switchTo().window(winHandle1);
		    
		    System.out.println(driver.getTitle());
		}*/
		
		 /* try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      System.out.println("Alert Message" + alertText);
		    } finally {
		      acceptNextAlert = true;
		    }
		
	*/
		
		/*List<WebElement> we = driver.findElements(By.cssSelector("a"));

		for (int i =0;i<we.size();i++){
			System.out.println(we.get(i).getText());
		}
		
		driver.quit();*/
	}
	

}

