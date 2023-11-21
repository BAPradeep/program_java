package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example11_DataProvider {
  @Test(dataProvider = "loginData")
  public void login(String username1, String password) {
	  System.out.println(username1);
	  System.out.println(password);
  }
  @DataProvider(name = "loginData")
  public Object[][] getData(){
	  Object[][] data = new Object[3][2];
	  data[0][0]="pradeep";
	  data[0][1]="4587990";
	  data[1][0]="ersdfdfa";
	  data[1][1]="852963741";
	  data[2][0]="pradeep";
	  data[2][1]="&*()";
	  return data;
  }
}
