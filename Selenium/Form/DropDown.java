package Form;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		
		// Select, find total , print, selected
		WebDriver driver = new FirefoxDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		int count = driver.findElements(By.xpath("//*[@id='cityselection']")).size();
		
		WebElement we =driver.findElement(By.xpath("//*[@id='cityselection']"));
		
		we.sendKeys("Delhi");
						
		List<WebElement> alloption = we.findElements(By.tagName("option"));
		System.out.println(alloption.size());
		
		for (int i=0; i<alloption.size();i++){
			System.out.println(alloption.get(i).getText()+" ----" + alloption.get(i).getAttribute("selected"));
		}
				
		Select s = new Select(we); 
		driver.quit();
	}
}
