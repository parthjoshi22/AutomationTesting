import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			

			driver.manage().window().maximize();
			
		//	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		//	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		//	WebElement sign= driver.findElement(By.xpath("//button[@name='login']"));
			
		//	username.sendKeys("joshi.parth19@gmail.com");
		//	password.sendKeys("abcd");
		//	sign.click();
			
			WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
			create.click();
			
		/*	WebElement firstname = driver.findElement(By.name("firstname"));
			WebElement lastname= driver.findElement(By.id("u_2_d_RA"));  
			WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']")); 
			WebElement password= driver.findElement(By.xpath("//input[@name='reg_passwd__']")); 
			
			
			firstname.sendKeys("Steve");
			lastname.sendKeys("Smith");
			email.sendKeys("steve@gmail.com");
			password.sendKeys("123456");           */
			
			WebElement dayofBirth= driver.findElement(By.xpath("//select[@name='birthday_day']")); 
			Select day = new Select(dayofBirth);
			day.selectByValue("16");
			
			
			WebElement monthofBirth= driver.findElement(By.xpath("birthday_month")); 
			Select month = new Select(monthofBirth);
			day.selectByVisibleText("Jul");
			
			WebElement yearofBirth= driver.findElement(By.xpath("birthday_year")); 
			Select year = new Select(yearofBirth);
			day.selectByVisibleText("1984");
	}

}
