package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	WebDriver driver=null;
	
	public void abc(){
	WebElement From = driver.findElement(By.xpath("yourlocationElement"));
			WebElement To = driver.findElement(By.xpath("yourlocationElement"));
			Actions builder = new Actions(driver);
			Action dragAndDrop = builder.clickAndHold(From)
			.moveToElement(To)
			.release(To)
			.build();
			dragAndDrop.perform();
	}
}
