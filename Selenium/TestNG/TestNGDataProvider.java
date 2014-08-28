package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	 @Test(dataProvider = "dp")
	  public void f(Integer n, String s) {
		  System.out.println("Data Provider 1");
		  System.out.println(n);
	  }
	  
	 @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }
}
