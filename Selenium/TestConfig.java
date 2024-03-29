

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {

	public static void main(String[] args) throws IOException {
		
		Properties CONFIG = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//com//qtpselenium//config//config.properties");
		CONFIG.load(ip);
		System.out.println(CONFIG.getProperty("screenShotPath"));
		

		Properties OR = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+"//src//com//qtpselenium//config//OR.properties");
		CONFIG.load(ip);
		System.out.println(CONFIG.getProperty("Login_Link"));
	}

}
