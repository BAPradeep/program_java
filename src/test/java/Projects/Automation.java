package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Edge
	//	WebDriverManager.edgedriver().setup();
	//	WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// Full name in First name
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pradeep");
		
		// Full Name in Last Name
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("B A");
		
		// Address
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Veerabhadra nagar 3rd stage bsk bangalore - 560085, karnataka");
		
		// Email Address
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("PradeepWvf@gmail.com");
		
		// Phone
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		
		// Gender
		WebElement male = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]"));
		male.click();
		
		// Hobbies
		WebElement cricket = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		cricket.click();
		WebElement movies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		movies.click();
		
		//Language
		//WebElement speak =	driver.findElement(By.xpath("//div[@id='msdd']"));
		
		//skill
		WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select selectskill = new Select(skill);
		selectskill.selectByVisibleText("Client Support");
		
		// Country
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		Select selectcountry = new Select(country);
		selectcountry.selectByVisibleText("Select Country");
		
		// Select Country
		//WebElement selectc = driver.findElement(By.xpath("//span[@id='select2-country-container']"));
		//Span selectselectc = new Span(country);
		//selectselectc.
		
		
		// Date of Birth
		// Year
		WebElement Year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select selectyear = new Select(Year);
		selectyear.selectByVisibleText("1929");
		
		//Month
		WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select selectmonth = new Select(Month);
		selectmonth.selectByVisibleText("March");
		
		//Day
		WebElement Day = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select selectday = new Select(Day);
		selectday.selectByVisibleText("6");
		
		// Password
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456789WER");
		
		// Confirm Password
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456789WER");
		
		//submit
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		//exit
		driver.close();
	

	}

}
