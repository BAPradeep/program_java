import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/v1/index.php");
		/*
		String urlname = driver.getCurrentUrl();
		System.out.println("URLname"+urlname);
		Thread.sleep(3000);
		
		String pagesource = driver.getPageSource();
		System.out.println("Pagesource"+pagesource);
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println("Title"+title);
		Thread.sleep(3000);
		
		String a = driver.getWindowHandle();
		System.out.println("WindowHandle"+a);
		
		//String b = driver.getWindowHandles();
		//System.out.println("WindowHandles"+b);
		
		driver.close();
		*/
		
		driver.findElement(By.name("uid")).sendKeys("mngr476493");
		
		driver.findElement(By.name("password")).sendKeys("tAqEtun");
		
		driver.findElement(By.cssSelector("input[type=submit][name=btnLogin]")).click();
		
		driver.findElement(By.partialLinkText("Edit Customer")).click();
		
		driver.navigate().back();
		
		//driver.findElement(By.name("cusid")).sendKeys("1254636");
		
		//driver.findElement(By.name("AccSubmit")).click();
		
		
		
		//customer name
		driver.findElement(By.linkText("New Customer")).click();
		
		//Gender
		driver.findElement(By.name("name")).sendKeys("Pradeep");
		WebElement male = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
		male.click();
		
		// Date of birth
		WebElement day = driver.findElement(By.xpath("//input[@id='dob']"));
		
		
		
		
		// address
		driver.findElement(By.name("addr")).sendKeys("3rd cross royal area left winvinaya foundation btm bengaluru = 560100");
		
		// City
		driver.findElement(By.name("city")).sendKeys("Bengaluru");
		
		//State
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		
		//Pin
		driver.findElement(By.name("pinno")).sendKeys("560100");
		
		//Telephone
		driver.findElement(By.name("telephoneno")).sendKeys("9876543210");
		
		//Email
		driver.findElement(By.name("emailid")).sendKeys("Pradeep@gamil.com");
		
		//Submit
		driver.findElement(By.name("sub")).click();
		
		
		
		//driver.findElement(By.linkText("Log out")).click();
		
		
	
		driver.close();

		

	}

}
