import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Certificate_Error {

	public static void main(String[] args) {
		// code to handle certificate error in Firefox
		FirefoxProfile fp = new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true); // to accept certificate
		fp.setAssumeUntrustedCertificateIssuer(true); // to accept certificate , if above one does not work
		WebDriver driver = new FirefoxDriver(fp);
		
		// Certificate error handling is not required in Chrome, automatically handled by ChromeDriver.exe
		
		
		//Code to handle certificate error in IE, this line should written where error comes
		// --- 	driver.navigate().to("javascript:document.getElementByID('overridelink').click()");
		
		
		driver.get("http://qtpselenium.com/login/seleniumLogin.php");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhaybharti@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abhay54");
		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/table[3]/tbody/tr[11]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td/a/img")).click();
		
		Set <String> winIDs = driver.getWindowHandles();
		Iterator <String> iter = winIDs.iterator();
		
		String Mainwindow = iter.next();
		
		String Tabwindow = iter.next();
		
		driver.switchTo().window(Tabwindow);
		
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/a[1]")).click();
	}

}
