import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Profilling {

	public static void main(String[] args) {
		
		//firefox.exe -p profilemanager 
		// ProfilesIni, FirefoxProfile - two class for managing profiles in FireFox
		ProfilesIni pni= new ProfilesIni();
		FirefoxProfile p =pni.getProfile("Selenium_User");
		FirefoxDriver dr = new FirefoxDriver(p);
		

	}

}
