package Advance;

public class ScrollBar {

	Actions dragger = new Actions(driver);
	WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("yourscrollbarsXpaht"));

	// drag downwards
	int numberOfPixelsToDragTheScrollbarDown = 10;
	for (int i=10;i<150;i=i+numberOfPixelsToDragTheScrollbarDown){
	  // this causes a gradual drag of the scroll bar, 10 units at a time
	  dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
	  Thread.sleep(1000L);
	}

	  // now drag opposite way (downwards)
	  numberOfPixelsToDragTheScrollbarDown = -10;
	for (int i=150;i>10;i=i+numberOfPixelsToDragTheScrollbarDown){
	  // this causes a gradual drag of the scroll bar, -10 units at a time
	  dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
	  Thread.sleep(1000L);
	}
}
