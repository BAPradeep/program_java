package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example17_ParameterTest {
  @Test
  public void Chrome() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.close();
	  
  }
  @Test
  private void Firefox() {
	// TODO Auto-generated method stub
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://winvinayafoundation.org/");
	  driver.close();

  }
  @Test
  private void Edge() {
	// TODO Auto-generated method stub
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.bing.com/new");
	  driver.close();

  }
}
