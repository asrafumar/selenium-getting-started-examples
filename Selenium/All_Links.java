import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class All_Links {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		List<WebElement> alllinks  = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		WebElement link35 = alllinks.get(1);
		System.out.println(link35.getText());
		System.out.println(alllinks.get(5).getText());
		
		for (int i =0 ; i<alllinks.size();i++){
			System.out.println(alllinks.get(i).getText() + "-----" +alllinks.get(i).isDisplayed());	
		}
			

	}

}
