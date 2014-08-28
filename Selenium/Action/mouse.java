package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouse {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		WebElement srchjob = driver.findElement(By.id("dropmenu1"));
		builder.moveToElement(srchjob).build().perform();
		WebElement advsrch = driver.findElement(By.xpath("a[href='http://jobsearch.monsterindia.com/search.html']"));
		System.out.println("Submenu displayed? " + advsrch.isDisplayed());
		advsrch.click();
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.titleContains("Monsterindia.com - More jobs for Indians."));



	}

}
