import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jobserver_Tab {

	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium2\\JavaCode\\Library\\chromedriver.exe");
		WebDriver driver =null;  
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//main window
		driver.get("http://www.jobserve.com/gb/en/Job-Search/");
		
		Set<String> winIDs = driver.getWindowHandles();
		
		Iterator <String> iter = winIDs.iterator();
		//System.out.println("1st ID :- "+ iter.next());
		
		System.out.println("Size of Set is : -" + winIDs.size());
		
		driver.findElement(By.xpath("//*[@id='OtherSites']/p[1]/a[1]")).click();
		
		winIDs = driver.getWindowHandles();
		
		System.out.println("Size of Set is : -" + winIDs.size());
		
		//Two window - Main & Tab,  driver still refers to main windwo
		iter = winIDs.iterator();
		/*while (iter.hasNext()) {
			System.out.println(iter.next()); //print the value & move the iterator to next point	
		}*/
		
		String winMain = iter.next();
		String wintab = iter.next();
		
		
		driver.switchTo().window(wintab); //switch to tab window
		System.out.println("Tab URL -> " +driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(winMain); //switching back control to main window
		System.out.println("Main URL -> " +driver.getCurrentUrl());
		

	}

}
