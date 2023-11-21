package DriverBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Pradeep B A/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
		
			WebDriverManager.chromedriver().setup(); // Chrome Browser
			WebDriver driver = new ChromeDriver();
		
		//	WebDriverManager.edgedriver().setup(); // Edge Browser
		//	WebDriver driver = new EdgeDriver();
		
		//	WebDriverManager.firefoxdriver().setup(); // fire fox browser
		//	WebDriver driver = new FirefoxDriver();
			
			
			driver.get("https://academy.winvinayafoundation.org/");
			
			// User name
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Pradeep7manasa@gmail.com");
			
			// password
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("0123456789");
			
			// button to submit
			driver.findElement(By.cssSelector("input[id = login-submit][name = login-submit]")).click();
			
			// button to logout
			driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[4]/a")).click();
			
			// Web site is exit
			driver.close();


	}

}
