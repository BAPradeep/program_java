package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Time_OrangeHRM {
  @Test 
  public void Duration() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  // URL name is OrangeHRM
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //add wait here
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  // Username
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  // Password
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  
	  // Login on click
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  // Browser is close
	  driver.close();
  }
}
