package Browser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Mozilla_Profile {

	public static void main(String[] args) throws InterruptedException {
		
//**************Code to work on Firefox ***********
		//Code locate Firefox binary
		  FirefoxBinary fb = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
		  
		//Firefoxprofile & ProfilesIni, code to create & open Firefox in predefined User Profile
		  ProfilesIni pi = new ProfilesIni();
		  
		  FirefoxProfile pf = pi.getProfile("Selenium_User");
				  
		// code to set homepage
		  pf.setPreference("browser.startup.homepage", "http://in.rediff.com");
		
		//code to open firefox driver
		  WebDriver driver = new FirefoxDriver(fb,pf);
		  
		  Thread.sleep(5000);  
		//code to add extension  
		  pf.addExtension("firebug.xpi", null);
		  
		//code to open URL 
		  driver.get("http://facebook.com");
		  
        //close the browser
		  driver.quit();
	}
}
