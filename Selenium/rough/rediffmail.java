package rough;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rediffmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rediff.com");
			
		Set<String> winIDs = driver.getWindowHandles();
		System.out.println(winIDs.size());
		
		driver.findElement(By.xpath("//*[@id='homewrapper']/div[5]/a[1]/div/u")).click();
		
		Set<String> winIDs1 = driver.getWindowHandles();
		System.out.println(winIDs1.size());

	}

}
