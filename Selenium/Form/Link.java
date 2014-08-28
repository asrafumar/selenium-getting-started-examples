package Form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {

	public static void main(String[] args) {
		// *** Working on Link ******
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		driver.findElement(By.linkText("Create a Rediffmail account")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.findElement(
				By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[1]/td"))
				.getText());

		// verify that Rediff Create Email page is displayed
		String str = "Create a Rediffmail account";
		WebElement rediff_local = driver.findElement(By
				.xpath("//*[@id='wrapper']/table[2]/tbody/tr[1]/td"));
		if (rediff_local.isDisplayed()) {
			if (str.equals(rediff_local.getText())) {
				System.out
						.println("Create Account Page : - Title Matched, Actual : "
								+ rediff_local.getText() + " Expected : " + str);
			} else {
				System.out.println("Fail !! : - Title did not Match, Actual : "
						+ rediff_local.getText() + " Expected : " + str);
			}
		}
	}
}