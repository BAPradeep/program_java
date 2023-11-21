package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// chrome
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver demo = new ChromeDriver();
		
		//Edge
		WebDriverManager.edgedriver().setup();
		WebDriver demo = new EdgeDriver();
		
		
		demo.get("https://demo.automationtesting.in/Register.html");
		
		// Full name in First name
		demo.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pradeep");
		
		// Full Name in Last Name
		demo.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("B A");
		
		// Address
		demo.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Veerabhadra nagar 3rd stage bsk bangalore - 560085, karnataka");
		
		// Email Address
		demo.findElement(By.xpath("//input[@type='email']")).sendKeys("PradeepWvf@gmail.com");
		
		// Phone
		demo.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		
		// Gender
		WebElement male = demo.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]"));
		male.click();
		
		// Hobbies
		WebElement cricket = demo.findElement(By.xpath("//input[@id='checkbox1']"));
		cricket.click();
		WebElement movies = demo.findElement(By.xpath("//input[@id='checkbox2']"));
		movies.click();
		
		//Language
		//WebElement speak =	demo.findElement(By.xpath("//div[@id='msdd']"));
		
		//skill
		WebElement skill = demo.findElement(By.xpath("//select[@id='Skills']"));
		Select selectskill = new Select(skill);
		selectskill.selectByVisibleText("Client Support");
		
		// Country
		WebElement country = demo.findElement(By.xpath("//select[@id='countries']"));
		Select selectcountry = new Select(country);
		selectcountry.selectByVisibleText("Select Country");
		
		// Select Country
		//WebElement selectc = demo.findElement(By.xpath("//span[@id='select2-country-container']"));
		//Span selectselectc = new Span(country);
		//selectselectc.
		
		
		// Date of Birth
		// Year
		WebElement Year = demo.findElement(By.xpath("//select[@id='yearbox']"));
		Select selectyear = new Select(Year);
		selectyear.selectByVisibleText("1929");
		
		//Month
		WebElement Month = demo.findElement(By.xpath("//select[@placeholder='Month']"));
		Select selectmonth = new Select(Month);
		selectmonth.selectByVisibleText("March");
		
		//Day
		WebElement Day = demo.findElement(By.xpath("//select[@id='daybox']"));
		Select selectday = new Select(Day);
		selectday.selectByVisibleText("6");
		
		// Password
		demo.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456789WER");
		
		// Confirm Password
		demo.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456789WER");
		
		//submit
		demo.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		//exit
		demo.close();
	

	}

}
