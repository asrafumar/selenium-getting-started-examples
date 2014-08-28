package Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement we =driver.findElement(By.xpath("//*[@id='email']"));
		we.sendKeys("Hi");
		we.clear();
		
		Actions builder = new Actions(driver); // Action class which does keyboard modifier events
				
		builder.keyDown(we, Keys.SHIFT); //press Shift key down
		builder.sendKeys("hello").perform(); // performs action
		builder.keyUp(Keys.SHIFT); //release Shift key
	}
}
