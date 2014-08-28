package Advance;

public class Sliding {

	WebElement draggable = driver.findElement("find your slider in here by id or xpath etc.."); 
	new Actions(driver).dragAndDropBy(draggable, 120, 0).build().perform();
}
