package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {

	@Parameters({ "first-name" })
	@Test
	public void testSingleString(String firstName) {
	  System.out.println("Invoked testString " + firstName);
	  assert "Cedric".equals(firstName);
	}
}
