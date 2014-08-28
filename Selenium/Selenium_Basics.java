import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Selenium_Basics {

	public static void main(String[] args) {
		//Code to include Firefox binary
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
		FirefoxDriver dr1 = new FirefoxDriver(binary,null);
		
		//Code to launch Firefox
		FirefoxDriver dr = new FirefoxDriver();
		
		//Code to work on Chrome
		//Code to associated binary for Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2\\JavaCode\\Library\\chromedriver.exe");
		
		//Code to start Chrome browser
		ChromeDriver cr = new ChromeDriver();
		
		//Working on IE
		//Code to associate binary for IE
		System.setProperty("webdriver.ie.driver","D:\\Selenium2\\JavaCode\\Library\\IEDriverServer.exe");
		
		//Code to launch IE
		InternetExplorerDriver ir = new InternetExplorerDriver();
	
	}

}
