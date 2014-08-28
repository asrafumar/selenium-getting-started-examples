package Form;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ChildWindow {

	//1.
	
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.hdfc.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("1st Window URL " + driver.getCurrentUrl());
		
		// working on 1st pop up
		driver.findElement(By.xpath("//a[@title='Customer Care']")).click();
		
		driver.findElement(By.xpath("//*[@id='acc-1-section-2']/li[2]/a")).click();
		
		// working on 2nd pop up
		Set<String> winIDs = driver.getWindowHandles();
		
		// getwindowhandle(); - returns handle of one browser 
		// getwindowhandles(); - returns handle of all browser associated with driver
	
		Iterator<String> sIDs = winIDs.iterator();
		
		String Window1 = sIDs.next();
		String Window2 = sIDs.next();
		
		driver.switchTo().window(Window2);
		
		System.out.println("2nd Window URL " + driver.getCurrentUrl());
		
		List<WebElement> we =driver.findElements(By.cssSelector(".rhs-customer>p>a"));
		
		System.out.println("for " +we.get(1).getText());
		
		we.get(1).click();
		
		winIDs = driver.getWindowHandles();
		
		sIDs = winIDs.iterator();
		Window1 = sIDs.next();
		Window2 = sIDs.next();
		String Window3 = sIDs.next();
		
		// working on 3rd pop up
		driver.switchTo().window(Window3);
		System.out.println("HDFC 3rd window - " + driver.getTitle());
		
		driver.switchTo().window(Window1);
		
	}
	
}
