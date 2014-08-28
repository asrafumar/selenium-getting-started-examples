package Advance;

public class RightClick {
Actions actions = new Actions(driver);    
Action action=actions.contextClick(WebElement).build(); //pass WebElement as an argument
action.perform();
}
