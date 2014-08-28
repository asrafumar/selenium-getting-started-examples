import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataDriven {

	@Test(dataProvider = "getData")
	public void doTest(String name,String age, String Section, String Year){
		System.out.println(name + " " + age + " "+ Section +" "+ Year);
		Assert.assertEquals("Good", "Good"); //print both value in error log if fails to compare
		Assert.assertTrue(1<6, "First Error"); // print message if condition is true
		Assert.assertFalse(1>6, "Second Error"); // print message if condition is false
		
	}
	
	@DataProvider
	public Object[][] getData(){
		// rows = number of times test has to be repeated
		// cols = parameters in data
		Object data[][] = new Object[3][4];
		
		//First Row
		data[0][0] = "Name1";
		data[0][1] = "Age1";
		data[0][2] = "Section1";
		data[0][3] = "Year1";
				
		//Second Row
		data[1][0] = "Name2";
		data[1][1] = "Age2";
		data[1][2] = "Section2";
		data[1][3] = "Year2";
		
		//Third Row
		data[2][0] = "Name3";
		data[2][1] = "Age3";
		data[2][2] = "Section3";
		data[2][3] = "Year3";
				
		return data;
	}
}
