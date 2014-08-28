import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkedin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://secure.membersaccounts.com/BusinessApp/Application/Apply/BUS421/CPCorpDefault");
		WebElement we =driver.findElement(By.cssSelector("#BusinessType"));
		we.sendKeys("Charity");
		 

	}

}