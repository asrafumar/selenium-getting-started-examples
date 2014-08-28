package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Browser_Chrome {

	public static void main(String[] args) throws InterruptedException {
	
		//**************Code to work on Chrome ***********
	    //Locate Chrome Binary
		System.setProperty("webdriver.chrome.driver", "C:\\Core-Jars\\chromedriver.exe");
		
		//Code to start Chrome
		ChromeDriver cr = new ChromeDriver();
		
		//code to open URL
		cr.get("http://facebook.com");
		
		//code to maximize browser
		cr.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Code to close browse
		cr.quit();
		
}
}