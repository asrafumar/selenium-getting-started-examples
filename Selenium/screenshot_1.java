package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {

	/** TakesScreenshot interface & getScreenshotAs method
	 * @param scrFile
	 * @param screenshotpath
	 * 
	 */
	public static void main(String[] args) {
		String screenshotpath;
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.co.in");
		
		
		// code to take screen shot of browser
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//create a unique name & assign path to Java project folder		
		//screenshotpath = System.getProperty("user.dir")+ "\\Screenshot\\" + sDateTime+ ".png";
		
		//file name where image saved
		screenshotpath = "C:\\google.png";
				
		try {
	   		
			//save image to driver
			FileUtils.copyFile(scrFile, new File(screenshotpath));
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

	}

}
