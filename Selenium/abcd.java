import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abcd {
	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
		dr.findElement(By.cssSelector("selector"));
	}

}
