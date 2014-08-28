package Form;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// 1. Open rediff.com & close the pop up window
// 2. Go to hdfc.com, click on [Call US], click again on [Call US], click again [For any other office, please click here] & 
//    enter United Kingdom on new window 
public class Exercise {
	
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hdfc.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("1st Window URL " + driver.getCurrentUrl());
		// first browser window
		driver.findElement(By.xpath("//a[@title='Customer Care']")).click();
		driver.findElement(By.xpath("//*[@id='acc-1-section-2']/li[2]/a")).click();
		
		//Second Browser window
		
		Set<String> winIDs = driver.getWindowHandles();
		Iterator<String> sIDs = winIDs.iterator();
		
		String Window1 = sIDs.next();
		String Window2 = sIDs.next();
		
		driver.switchTo().window(Window2);
		System.out.println("2nd Window URL " + driver.getCurrentUrl());
		List<WebElement> we =driver.findElements(By.cssSelector(".rhs-customer>p>a"));
		System.out.println("for " +we.get(1).getText());
		we.get(1).click();
		
	}
	
}
