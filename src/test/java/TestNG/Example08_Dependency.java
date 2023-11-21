package TestNG;

import org.testng.annotations.Test;

import org.testng.Assert;

public class Example08_Dependency {
  @Test
  public void Login() {
	  Assert.assertEquals(12, 13);
	  System.out.println("Login");
  }
  @Test(dependsOnMethods = "Login")
  public void Dashboard() {
	  System.out.println("DashBoard");
  }
  @Test
  public void logout() {
	  System.out.println("Logout");
  }
  @Test
  public void mailBox() {
	  System.out.println("Mail Box");
  }
  
}
