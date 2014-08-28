import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// go to facebook & find count of input fields
public class Facebook {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		List<WebElement> we = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(we.size());
		
		for (int i=0;i<we.size();i++){
			String temp =" ";
					temp = temp + i; 
			we.get(i).sendKeys(temp);
		}
		driver.close();

	}

}
