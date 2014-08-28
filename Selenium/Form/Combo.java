package Form;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Combo {

	public static void main(String[] args) {
		
		WebElement we =null;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Select drpMonth = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		
		
		//select by visible text
		drpMonth.selectByVisibleText("Jan");
		we = drpMonth.getFirstSelectedOption();
		System.out.println(we.getText());
		
		//select by index
		drpMonth.selectByIndex(5);
		we = drpMonth.getFirstSelectedOption();
		System.out.println(we.getText());
		
		//select by value
		drpMonth.selectByValue("2");
		we = drpMonth.getFirstSelectedOption();
		System.out.println(we.getText());
		
		//print all values from drop down
        List<WebElement> theseOptions = drpMonth.getOptions();
	    for(WebElement option:theseOptions){
	      System.out.println(option.getText());
	    } 
	}

}
