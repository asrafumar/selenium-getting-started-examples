import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Broken_Link {

    @Test
      public void saveAllLinks(){
          FirefoxDriver firefoxDriver = new FirefoxDriver(); //Starts Firefox browser
                  
          firefoxDriver.navigate().to("http://google.co.in"); //opens Web Page
               
           List <WebElement>linksList = firefoxDriver.findElements(By.tagName("a")); // finds link  elements & stores in a list
//traverse each link from collection
          for(WebElement linkElement: linksList){
              String link =linkElement.getAttribute("href");
              if(link!=null){
                verifyLinkActive(link);
              }
          }
          firefoxDriver.quit(); // close Firefox browser
      }
          
      /**
       * This method verifies that link is active
       * @param link - link(URL)
       * @return - true/false
       */
       public void verifyLinkActive(String linkUrl){
          try {
             URL url = new URL(linkUrl);
             HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
             httpURLConnect.setConnectTimeout(3000);
             httpURLConnect.connect();
             if(httpURLConnect.getResponseCode()==200){
                 System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
              }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
             {
                 System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+                  HttpURLConnection.HTTP_NOT_FOUND);
              }
          } catch (MalformedURLException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
}