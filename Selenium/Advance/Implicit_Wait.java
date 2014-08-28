package Advance;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Implicit_Wait {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.findElement(By.xpath("//*[@id='p_13838465-p']")).sendKeys("hello");
		
		//implicit wait - Global wait , once used, applicable to all driver.findelement command
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Explicit wait - not a global timeout , specific to an element
		String str = driver.findElement(By.xpath("//*[@id='yui_3_4_0_1_1379512277181_2076']/ul/li[1]/a")).getText();
		System.out.println(str);

		//WebDriverWait , FluentWait
	}

}
