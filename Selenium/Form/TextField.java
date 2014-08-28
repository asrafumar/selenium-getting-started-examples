package Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextField {
	public static void main(String args[]){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");

		//***Working on Text Input box
		WebElement we = driver.findElement(By.id("email"));
		//code to verify object is displayed & enable
		if (we.isDisplayed() && we.isEnabled()) {
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		}
		//***Enter value on Text Input box
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("pocuser12@gmail.com");
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		
		//code to enter username
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
					
		//code to read text from application
		System.out.println(driver.findElement(By.id("email")).getText());
		
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
}
}