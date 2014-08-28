package CertificateError;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeCertificate {
	

	WebDriver driver = null;

	void certificateIeError(){
		driver.get("http://google.co.in");
		if(driver instanceof InternetExplorerDriver){
		  driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		}
	}
}
