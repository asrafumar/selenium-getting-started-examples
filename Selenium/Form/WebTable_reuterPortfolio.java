package Form;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable_reuterPortfolio {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://in.reuters.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testAbcd() throws Exception {
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

  @After
  public void tearDown() throws Exception {
  driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}