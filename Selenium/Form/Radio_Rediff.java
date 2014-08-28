package Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Rediff {

	public static void main(String[] args) {
		//Launch Firefox 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		
		// ***** Working on Radio button ********
		System.out.println("Value of Radio Button Before Action :"
				+ driver.findElement(
						By.xpath("//input[@name='gender' and @value ='f']"))
						.isSelected());
		if (!driver.findElement(
				By.xpath("//input[@name='gender' and @value ='f']"))
				.isSelected()) {
			driver.findElement(
					By.xpath("//input[@name='gender' and @value ='f']"))
					.click();
		} else {
			System.out
					.println("Gender Radio button is already selected "
							+ driver.findElement(
									By.xpath("//input[@name='gender' and @value ='f']"))
									.isSelected());
		}
		System.out.println("Value of Radio Button After Action :"
				+ driver.findElement(
						By.xpath("//input[@name='gender' and @value ='f']"))
						.isSelected());
	}
}
