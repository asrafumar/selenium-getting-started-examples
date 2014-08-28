import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;


public class Html_Unit_Driver {

	public static void main(String[] args) {
		HtmlUnitDriver dr = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_9);
		dr.get("http://gmail.com");
		System.out.println(dr.getTitle());

	}

}
