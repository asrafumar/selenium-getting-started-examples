package Form;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Forms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch Firefox & open Facebook
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");

		//===========================================================================
		//***Working on Text Input box
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("pocuser12@gmail.com");
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		
				
		//*** Working on Link ******
		driver.get("http://in.rediff.com/");
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[1]/td")).getText());
		
		//===========================================================================
		//verify that Rediff Create Email page is displayed
			String str = "Create a Rediffmail account";
			WebElement rediff_local = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[1]/td"));
			
																	
			
				if (rediff_local.isDisplayed()){
					
					if (str.equals(rediff_local.getText())) {
						
						System.out.println("Create Account Page : - Title Matched, Actual : " +rediff_local.getText()+ " Expected : "+ str);
					
					}
					else{
					
						System.out.println("Fail !! : - Title did not Match, Actual : " +rediff_local.getText()+ " Expected : "+ str);
						
					}
					
				}
		
		//===========================================================================
		//***** Working on Radio button ********
		System.out.println("Value of Radio Button Before Action :" +driver.findElement(By.xpath("//input[@name='gender' and @value ='f']")).isSelected());
		
		if (!driver.findElement(By.xpath("//input[@name='gender' and @value ='f']")).isSelected()){
		
			driver.findElement(By.xpath("//input[@name='gender' and @value ='f']")).click();	
		
		}
		
		else {
		
			System.out.println("Gender Radio button is already selected "+driver.findElement(By.xpath("//input[@name='gender' and @value ='f']")).isSelected());
		
		}

		System.out.println("Value of Radio Button After Action :" +driver.findElement(By.xpath("//input[@name='gender' and @value ='f']")).isSelected());
		
		//===========================================================================
		//***** Working on Checkbox button ********
		System.out.println("Value of Checkbox Button Before Action :" +driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected());
		
		if (!driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected()){
		
			driver.findElement(By.xpath("//input[@name='chk_altemail']")).click();	
		
		}
		
		else {
		
			System.out.println("Gender Radio button is already selected "+driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected());
		
		}
		System.out.println("Value of Checkbox Button After Action :" +driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected());
		
		//===========================================================================
		//***** Working on Combo Box ********
		Select country = new Select(driver.findElement(By.xpath("//*[@name='country']")));
		
		country.selectByIndex(2);
		
		country.selectByValue("189");
		
		country.selectByVisibleText("Malaysia");
		
		country.deselectByVisibleText("Malaysia");
		
		
		if (country.isMultiple()) {
			
			System.out.println("Country combo box allows multiple selection");
			
		}
		
		driver.navigate().to("http://in.rediff.com/");
		
		driver.findElement(By.partialLinkText("Create a")).click();
		
	}
	
}


