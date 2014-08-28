import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//extract links from a section of BBC.com
public class Specific_Links {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		WebElement box = driver.findElement(By.xpath("//*[@id='business']"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println("Total Count on Link In Business -> "+ links.size() );
		
		for (int i =0; i<links.size();i++){
			System.out.println(links.get(i).getTagName()+ " : "+links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://bbc.com");
			System.out.println("***************************");
			 box = driver.findElement(By.xpath("//*[@id='business']"));
			 links = box.findElements(By.tagName("a"));
		}
		
		driver.close();
	}

}
