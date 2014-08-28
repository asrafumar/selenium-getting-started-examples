package Advance;

import org.openqa.selenium.WebElement;

public class mouseHover {
	// find the menu that have the dropdown showing when we mouse over it.   
	WebElement element = driver.findElement(By.linkText("Category"));
	//Create instance of action class
	Actions action = new Actions(driver);
	//move mouse over the menu.
	action.moveToElement(element).build().perform();
	//find the link you want and click it.
	driver.findElement(By.linkText("News")).click();
	
	WebElement element = driver.findElement(By.linkText("Category"));
    Actions action = new Actions(driver);
action.moveToElement(element).moveToElement(driver.findElement(By.linkText("News"))).click().build().perform();


WebElement element = driver.findElement(By.linkText("Category"));
Actions action = new Actions(driver);
action.moveToElement(element).perform();
WebElement subElement = driver.findElement(By.linkText("News"));
action.moveToElement(subElement);
action.click();
action.perform();

}
