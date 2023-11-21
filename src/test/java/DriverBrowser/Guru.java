package DriverBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Pradeep B A/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://academy.winvinayafoundation.org/");
		
		// User name
		//driver.findElement(By.name("username")).sendKeys("pradeep7manasa@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Pradeep7manasa@gmail.com");
		
		// password
		driver.findElement(By.name("password")).sendKeys("0123456789");
		
		// button to submit
		driver.findElement(By.cssSelector("input[id = login-submit][name = login-submit]")).click();
		
		// Website is exit
		driver.close();

	}

}
