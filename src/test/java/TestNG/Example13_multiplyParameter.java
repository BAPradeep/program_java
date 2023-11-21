package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example13_multiplyParameter {
  @Test
  @Parameters ({"val1","val2"})
  public void multiply(int a, int b) {
	  int finalmultiplication = a*b;
	  System.out.println("The final mutliply of the given value is "+finalmultiplication);
  }
}
