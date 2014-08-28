package WebDriverListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class IAmTheDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

	      EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
	      IAmTheEventListener eventListener = new IAmTheEventListener();
	      eventFiringDriver.register(eventListener);

	      eventFiringDriver.get("http://127.0.0.1/sugarcrm/index.php?module=Users&action=Login");
	      eventFiringDriver.navigate().back();

	}
}
