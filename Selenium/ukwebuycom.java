import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ukwebuycom {

	public static void main(String[] args) {
		//login into uk.webuy.com 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://in.webuy.com/"); 
	}

}
