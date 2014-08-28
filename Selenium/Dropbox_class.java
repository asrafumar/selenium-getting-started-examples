import java.util.Collection;



import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/* assignment part of Module 12, Open URL dropbox.com, identify objects using ID, name, Xpath, CSSSelector*/
public class Dropbox_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.get("http://dropbox.com");
		System.out.println("Title of Dropbox.com = " + driver.getTitle());
		System.out.println("Identified Using ID = " + driver.findElement(By.cssSelector("img[id='devices-background']")).isDisplayed());
		System.out.println("Identified Using SRC = " + driver.findElement(By.cssSelector("img[src*='https://dt8kf6553cww8.cloudfront.net/static/images/index/devices-vfl3TTUs-.png']")).isDisplayed());
		
		System.out.println("Download Link, Identified Using Class = " + driver.findElement(By.cssSelector("a[class='downloading-link']")).isDisplayed());
		System.out.println("Download Link, Identified Using href = " + driver.findElement(By.cssSelector("a[href='/downloading?src=index']")).isDisplayed());
		
		Collection<WebElement> ab =driver.findElements(By.cssSelector("p"));
		
			
		//css=a[href='/login']
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Sign in")).click();
		
		//this method will you handle of all opened windows
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
			System.out.println("Window Handle :- " + winHandle);
		    driver.switchTo().window(winHandle);
		    System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.cssSelector("*[id='login_email']")).sendKeys("hello");
		
		driver.findElement(By.cssSelector("*[id='login_password']")).sendKeys("hello");
		
		driver.findElement(By.name("login_submit_dummy")).click();
		
		driver.switchTo().window(parent);
		
		System.out.println("Parent Window " +driver.getTitle());
		
		//driver.quit();
	}

}
