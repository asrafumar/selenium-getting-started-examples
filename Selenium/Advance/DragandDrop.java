package Advance;

public class DragandDrop {
	WebElement From = driver.findElement(By.xpath("yourlocationElement));
			WebElement To = driver.findElement(By.xpath("yourlocationElement"));
			Actions builder = new Actions(driver);
			Action dragAndDrop = builder.clickAndHold(From)
			.moveToElement(To)
			.release(To)
			.build();
			dragAndDrop.perform();

}
