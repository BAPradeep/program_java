package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example03_Executeof2testcase {
	@Test(priority = 1)
	public void f() {

		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver = new EdgeDriver();
		 * 
		 * driver.get("https://demo.guru99.com/v1/index.php"); WebElement user =
		 * driver.findElement(By.name("uid")); user.sendKeys("mngr476493"); WebElement
		 * password = driver.findElement(By.name("password"));
		 * password.sendKeys("tAqEtun");
		 * driver.findElement(By.cssSelector("input[type=submit][name=btnLogin]")).click
		 * ();
		 * 
		 * Alert alert= driver.switchTo().alert(); alert.accept();
		 * 
		 * driver.close();
		 */
		System.out.println(" zero Index");
	}

	@Test(priority = 0)
	private void run() {
		// TODO Auto-generated method stub
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver1 = new
		 * ChromeDriver(); driver1.get("https://demo.guru99.com/v1/index.php");
		 * driver1.findElement(By.linkText("here")).click(); driver1.close();
		 */
		System.out.println("First Index");

	}

	@Test(priority = 2)
	private void Run() {
		// TODO Auto-generated method stub

		System.out.println(" third Index --- Hello the World");

	}
}
