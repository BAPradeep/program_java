package demo;

import java.time.Duration;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoP_Regsiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver first = new ChromeDriver();
		
		// Edge Browser
		//WebDriverManager.edgedriver().setup();
		//WebDriver first = new EdgeDriver();
		
		// open browser
		first.get("https://demo.nopcommerce.com/");
		
		// click on register
		first.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Gender
		WebElement male = first.findElement(By.xpath("//*[@id=\"gender\"]/span[1]/label"));
		male.click();
		System.out.println(male.isSelected());
		System.out.println(male.isDisplayed());
		System.out.println(male.isEnabled());
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//first name
		first.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Pradeep");
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Last name
		first.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("B A");
		
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Date of Birth
		//Day
		WebElement day = first.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
		Select selectday = new Select(day);
		selectday.selectByVisibleText("5");
		
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Month
		WebElement month = first.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		Select selectmonth = new Select(month);
		selectmonth.selectByVisibleText("June");
		
		
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Year
		WebElement year = first.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText("2012");
		
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Email
		first.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Pradee7Wvf@gmail.com");
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Company name
		first.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Win Vinaya Foundation");
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Password
		first.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("123456789Pradeep");
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//confirm password
		first.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("123456789Pradeep");
		
		first.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//submit
		first.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
		//exit
		first.close();
		
		

	}

}
