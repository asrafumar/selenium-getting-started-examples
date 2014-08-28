package Browser;

import java.net.URL; 
import java.util.Arrays; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.remote.CapabilityType; 
import org.openqa.selenium.remote.CommandExecutor; 
import org.openqa.selenium.remote.DesiredCapabilities; 
import org.openqa.selenium.remote.RemoteWebDriver; 

public class Browser_FF_SSL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver; DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 
		driver= new FirefoxDriver(capabilities); 
		driver.get("https://en.wikipedia.org"); 
		driver.manage().window().maximize(); 
		driver.close(); 
	}
}
