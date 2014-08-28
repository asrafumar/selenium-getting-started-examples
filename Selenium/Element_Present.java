import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Element_Present {

	WebDriver driver;
	public static void main(String[] args) {
		

	}
	
	public boolean isElementPresent(String Element_Xpath){
		int count = driver.findElements(By.xpath(Element_Xpath)).size();
		
		if (count == 0) {
			return false;
		}else {
			return true;
		}
			
	}

}
