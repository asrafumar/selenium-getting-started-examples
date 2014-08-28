package DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {
    public static void main(String args) {
      Map capabilitiesMap = new HashMap();
      capabilitiesMap.put("takesScreenShot", true);
      DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
      WebDriver driver = new FirefoxDriver(capabilities);
      driver.get("http://www.google.com");
    }
  }
