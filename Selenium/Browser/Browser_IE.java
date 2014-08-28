package Browser;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browser_IE {

	public static void main(String[] args) throws InterruptedException {
		//**************Code to work on IE ***********
				//Code to locate IE Binary
				System.setProperty("webdriver.ie.driver", "C:\\Core-Jars\\IEDriverServer.exe");
				
				InternetExplorerDriver IE = new InternetExplorerDriver();
				
				IE.get("http://facebook.com");
				
				Thread.sleep(5000);
				
				IE.close();
				
			}

	}


