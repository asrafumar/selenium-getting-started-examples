import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Links {

	public static void main(String[] args) {
		
		
		// XPath to locate Sport
		/*//ul[@id='blq-nav-main']/li[2]/a[@href='http://www.bbc.co.uk/sport/']
		//ul[@id='blq-nav-main']/li[2]
		//ul[@id='blq-nav-main']/li[2]/a
		//a[@href='http://www.bbc.co.uk/sport/']
		//*[@href='http://www.bbc.co.uk/sport/']*/
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://bbc.com");
		String x =driver.findElement(By.xpath("//ul[@id='blq-nav-main']/li[2]/a")).getText();
		System.out.println("After SendKeys method :"+x);

	}

}
