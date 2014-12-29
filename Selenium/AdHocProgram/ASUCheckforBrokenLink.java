package AdHocProgram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ASUCheckforBrokenLink {

	static WebDriver driver = null; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://stage.pll.asu.edu/pll/");
		try {
			isLinkBroken();
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String isLinkBroken() throws Exception{
		  // AppLogs.info("isLinkBroken starts.. for URL : "+driver.getCurrentUrl());
		   String link = null;
	       List <WebElement>linksList = driver.findElements(By.tagName("a")); 
	       System.out.println("Total Number of hyperlink - "+linksList.size());
	        for(WebElement linkElement: linksList){
	          link =linkElement.getAttribute("href");
	          System.out.println("URL - " + link+ " Hyperlink - "+linkElement.getText());
	          
	          if(link!=null){
	            if (getResponseCode(link)){
	            	System.out.println("isLinkBroken : "+link + "  works fine");
	            }else {
	            	System.out.println("isLinkBroken : "+link + "  works fine");
	            }
	          }
	      }
	        //AppLogs.info("isLinkBroken starts.. for URL : "+driver.getCurrentUrl());
	      return link;
	  }         



/**
 * Purpose : returns HTTP code for a given URL
 * @param urlString
 * @return
 */
public static boolean getResponseCode(String urlString) throws Exception{
	//AppLogs.info("getResponseCode starts.. for URL : "+urlString);
    boolean isValid = false;
    int code = 0;
    try {
        URL url = new URL(urlString);
        HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
        httpURLConnect.setRequestMethod("GET");
        httpURLConnect.connect();
        code = httpURLConnect.getResponseCode();
        if (code == 200){
        	//AppLogs.debug(urlString +" - "+httpURLConnect.getResponseMessage());
        	isValid = true;
        }
        if(code == HttpURLConnection.HTTP_NOT_FOUND)  
        {
        	//AppLogs.debug(urlString +" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
        	isValid = true;
        }
     } catch (MalformedURLException e) {
        System.out.println("MalformedURLException Error : "+e +" , "+ urlString);
     } catch (IOException e) {
    	 System.out.println("IOException Error : "+e+" , "+ urlString);
     } catch (Exception e) {
    	 System.out.println("Exception Error : "+e+" , "+ urlString);
     }
 //   AppLogs.info("getResponseCode ends..");
    return isValid;
}
}