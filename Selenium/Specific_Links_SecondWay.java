/*import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Specific_Links_SecondWay {
	static WebDriver driver =null;
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		String s1 ="//*[@id='business_moreTopStories']/ul/li[";
		String s2 ="]/a";
		
		int i =1;
		while (isElementPresent(s1+i+s2)){
			String text = driver.findElement(By.xpath(s1+i+s2)).getText();
			System.out.println(text);
		
			//check the response of URL
			String url = driver.findElement(By.xpath(s1+i+s2)).getAttribute("href");
			
			if (checkResponse(url)){
				driver.findElement(By.xpath(s1+i+s2)).click();
	
				System.out.println(driver.getTitle());
				
				driver.get("http://bbc.com");
				
				
			}else {
				System.out.println("Something wrong with URL Response code");
			}
			
			i++;
			System.out.println("*****************************");
		}
	}
	
	
	public static boolean isElementPresent(String Element_Xpath){
		int count = driver.findElements(By.xpath(Element_Xpath)).size();
		
		if (count == 0) {
			return false;
		}else {
			return true;
		}
			
	}
	
	
//HTTP Response Code - 200 OK
	public static boolean checkResponse(String url) {
		
		try{
			int resp_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			
			System.out.println("Response Code for URL " + url+ " is  -> " + resp_code);
			
			if (resp_code ==200) {
				return true;
			}else
				return false;
			
		} catch(Exception e) {
			return false;
		}
	}

}

*/
