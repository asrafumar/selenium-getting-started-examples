package Browser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Mozilla {

	public static void main(String[] args) throws InterruptedException {
				
		//code to open firefox driver
		  WebDriver driver = new FirefoxDriver();
		  
		  Thread.sleep(5000);  
		
		  //code to open URL 
		  driver.get("http://facebook.com");
		  
        //close the browser
		  driver.quit();
	}
}
