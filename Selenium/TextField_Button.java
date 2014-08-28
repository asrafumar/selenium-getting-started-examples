import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.os.WindowsUtils;

public class TextField_Button {

	public static void main(String[] args) {
		//TextField
		// Read, Write, Clear, check for existence --- Operation on Text Field
		
		String browser ="Mozilla"; 
		WebDriver driver =null;
		
		if (browser.equals("Mozilla")) {
			
			driver= new FirefoxDriver();
			
		}
		else if (browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium2\\JavaCode\\Library\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}else if (browser.equals("IE")){
			
			System.setProperty("webdriver.ie.driver","D:\\Automation\\Selenium2\\JavaCode\\Library\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}
			
			driver.get("http://golfclubs.com");
		
			driver.manage().window().maximize();
			
		String x=driver.findElement(By.xpath("//input[@id='search-input']")).getAttribute("value");
		System.out.println(x);
		
		driver.findElement(By.xpath("//input[@id='search-input']")).clear();
		x=driver.findElement(By.xpath("//input[@id='search-input']")).getAttribute("value");
		System.out.println("After Clear method :"+x);
		
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Abhay");
		x=driver.findElement(By.xpath("//input[@id='search-input']")).getAttribute("value");
		String y=driver.findElement(By.xpath("//input[@id='search-input']")).getText();
		System.out.println("After SendKeys method :"+x);
		System.out.println("After SendKeys, using GetText :"+y);
		
		//Buttons
		//Click, read the text
		x =driver.findElement(By.xpath("//input[@value='Sign Up']")).getAttribute("value");
		System.out.println("Button Text : "+x);
		
		driver.findElement(By.xpath("//input[@value='Sign Up']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://golfclubs.com");
		driver.findElement(By.xpath("//input[@value='Sign Up']")).submit();
		
		driver.close();
		
		//WindowsUtils.tryToKillByName("chromedriver.exe *32");
		//WindowsUtils.tryToKillByName("IEDriverServer.exe");
		
	}

}
