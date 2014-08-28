package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriver_Example {

	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
	      capabilities.setBrowserName("firefox");
	      RemoteWebDriver remoteWD = null;
	      try {
	         remoteWD = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
	         remoteWD.get("http://127.0.0.1/sugarcrm/index.php?module=Home&action=index");
	         System.out.println("Done");
	      } catch (MalformedURLException e) {
	         e.printStackTrace();
	      }
	  	}

}
