package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser_Chrome_SSL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(capabilities); 
		driver.get("https://en.wikipedia.org"); 
		driver.manage().window().maximize(); 
		driver.close(); 
	}

}
