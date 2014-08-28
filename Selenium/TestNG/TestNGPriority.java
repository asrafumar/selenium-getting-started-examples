package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPriority {

	@Test (priority =1)
	public void testLogin(){
	//	Assert.assertEquals("A", "B");
		System.out.println("Login Test");
	}
	
	@Test (priority =1, dependsOnMethods={"testLogin"})
	public void testChangePassword(){
		System.out.println("Password change test");
	}
	
	@Test(priority =3, dependsOnMethods={"testLogin", "testChangePassword"})
	public void logOut(){
		System.out.println("Logout Test");
	}
}
