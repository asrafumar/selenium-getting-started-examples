package day5_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotation {
   WebDriver driver = new FirefoxDriver();
   String baseUrl = "https://www.google.co.in/";
   String expected = null;
   String actual =null;
	
   TestNGannotation(){
	}
	
		
	@BeforeSuite //once before executing all tests in all Java files
	public void StartSelenium(){
		System.out.println("@BeforeSuite = Start Selenium");
	}
	
	
	@AfterSuite
	public void ShutDownSelenium(){
		System.out.println("@AfterSuite = Shutdown Selenium");
	}
	
	@BeforeTest //before executing all test cases
	public void launchBrowser(){
		System.out.println("@BeforeTest = Connecting to DB");
		driver.get(baseUrl);
		
	}
	

	@Test (priority =0)
	public void SendEmail(){
		System.out.println("@Test = Sending Email");
	}
	
	@Test (priority =0)
	public void ReceiveMail(){

		System.out.println("@Test = Receiving Email");
	}
	
	@AfterMethod //After executing every test
	public void AfterMethod(){
		System.out.println("@AfterMethod");
		//Log out from Application
	}
 
	@BeforeMethod //before executing every test
	public void verifyHomePageTitle(){
		System.out.println("@BeforeMethod");
		expected = "Google";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		
		//connect with database
		//Open URL
		//Login
	}
	
	@AfterTest
	public void terminateBrowser(){
		System.out.println("@@AfterTest");
		driver.quit();
	}
	
}
