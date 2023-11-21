package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example12_SumParameter {
  @Test
  @Parameters ({"val1" , "val2"})
  public void parameter(int a, int b) {
	  
	  int finalsum = a+b;
	  System.out.println("The final sum of the given values is "+ finalsum);
  }
}
