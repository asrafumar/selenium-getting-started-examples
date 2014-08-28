import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Desired_Capabilities_Example {

	public static void main(String[] args) {
		DesiredCapabilities cr = new DesiredCapabilities();
        cr.setJavascriptEnabled(true);
        //cr.setCapability(CapabilityType.PROXY, "value");
        
        FirefoxDriver driver = new FirefoxDriver(cr);
        
	}

}
