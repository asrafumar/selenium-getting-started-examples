import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailNumber {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.medindia.net/patients/calculators/pop_clock.asp");
		String newVal = driver.findElement(By.cssSelector("#pop")).getAttribute("value");
		System.out.println("Count " +newVal);

	}

}
