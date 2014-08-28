package Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		//Launch Firefox 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		
		//***** Working on Checkbox button ********
		System.out.println("Value of Checkbox Button Before Action :" +driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected());
		if (!driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected()){
			driver.findElement(By.xpath("//input[@name='chk_altemail']")).click();	
		}
		else {
				System.out.println("Gender Radio button is already selected "+driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected());
		}
		System.out.println("Value of Checkbox Button After Action :" +driver.findElement(By.xpath("//input[@name='chk_altemail']")).isSelected());
	}
}
