package TestNG;

import org.testng.annotations.Test;

public class Example06_Priority {
  @Test (priority = 1)
  public void Login() {
	  System.out.println("Login Method");
  }
  
  @Test (priority = 3)
  public void DashBoard() {
	  System.out.println("DashBoard Method");
}
  @Test (priority = 2)
  public void Logout() {
	  System.out.println("Logout Method");
  }
}
