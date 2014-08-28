package Form;
import java.util.List;  
import java.util.List;  
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;;  

public class Date_redbus {

	public static void main(String[] args) {
		 WebDriver driver;  
		 driver = new FirefoxDriver();  
		 driver.manage().window().maximize();
		 driver.get("http://www.redbus.in/");  
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		  //Click on textbox so that datepicker will come  
		 driver.findElement(By.id("calendar")).click();  
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		    
		  /*DatePicker is a table.So navigate to each cell   
		   * If a particular cell matches value 17 then select it  
		   */  
		  WebElement dateWidget = driver.findElement(By.xpath("//*[@id='rbcal_calendar']/div/div/table[1]"));  
		  List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));  
		  List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
		    
		  for (WebElement cell: columns){  
		   //Select 17th Date   
		   if (cell.getText().equals("17")){  
		   cell.findElement(By.linkText("17")).click();  
		   break;  
		   }  
		  }   
		 } 

	}


