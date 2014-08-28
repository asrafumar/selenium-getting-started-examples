package Advance;

//Run this code once selenium execution is done
import org.openqa.selenium.os.WindowsUtils;


public class Kill {

	public static void main(String[] args) {
		
		WindowsUtils.tryToKillByName("chromedriver.exe");
		WindowsUtils.tryToKillByName("IEDriverServer.exe");
		
	}

}
