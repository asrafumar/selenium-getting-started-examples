package Form;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;



import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webTable {
	  static WebDriver driver;
	  static String baseUrl;
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  	driver = new FirefoxDriver();
	    baseUrl = "http://in.reuters.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
  
	    driver.get(baseUrl + "/");
	    driver.findElement(By.linkText("Sign In")).click();
	    
	    driver.findElement(By.linkText("Sign In")).getText();
	    driver.findElement(By.xpath("//input[@name='loginName']")).clear();
	    driver.findElement(By.xpath("//input[@name='loginName']")).sendKeys("abhaybharti@gmail.com");
	    driver.findElement(By.xpath("//input[@name='password']")).clear();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo123");
	    driver.findElement(By.xpath("//input[@type='image']")).click();
	    driver.findElement(By.linkText("Money")).click();
	    
	    driver.findElement(By.linkText("Portfolio")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    WebElement table = driver.findElement(By.id("table-holding-data"));
	    
	    if (table.isDisplayed()){
	    	
	    	List<WebElement> rows = table.findElements(By.tagName("tr"));
	    	
	    	System.out.println("Row Count - " + rows.size());
	    	
	    	Iterator<WebElement> i = rows.iterator();
			
	       	System.out.println("Table has following content");
			
			while(i.hasNext()){
			  
				WebElement row = i.next();
			    
				List<WebElement> columns= row.findElements(By.tagName("td"));
			    
				Iterator<WebElement> j = columns.iterator();
			    
					while(j.hasNext()){
		  
						WebElement column = j.next();
			            
						System.out.print(column.getText());
			            
						System.out.print("    |  ");
			        
					}System.out.println("--------------------");
			    
			}System.out.println("Table content is printed");
		}
	    
	    else {
	    	System.out.println("Table not found");
	    }
	    

	    
	}
}