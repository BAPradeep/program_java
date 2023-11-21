package TestNG;

import org.testng.annotations.Test;

public class Example07_Enable {
  @Test (enabled = false)
  public void login() {
	  System.out.println("Login");
  }
  @Test
  private void Dashboard() {
	// TODO Auto-generated method stub
	  System.out.println("DashBoard");
}
  
  @Test
  private void Logout() {
	// TODO Auto-generated method stub
	  System.out.println("Logout");
}
}
