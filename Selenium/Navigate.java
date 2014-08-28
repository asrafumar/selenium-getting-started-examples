import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Navigate {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
