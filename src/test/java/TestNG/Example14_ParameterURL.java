package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example14_ParameterURL {
  @Test
  public void chrome(String url) {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get(url);
	  driver.close();
  }
  
	  @Test
	  @Parameters({"url"})
	  public void firefox(String url) {
		  WebDriverManager.firefoxdriver().setup();
		  WebDriver driver = new FirefoxDriver();
		  driver.get(url);
		  driver.close();
	}
	  
	  @Test
	  @Parameters({"url"})
	  private void edge(String url) {
		// TODO Auto-generated method stub
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();
		  driver.get(url);
		  driver.close();

	}
}

