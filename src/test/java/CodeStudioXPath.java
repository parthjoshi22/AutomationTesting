import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeStudioXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().window().maximize();
			
			//Locate Xpath username by single attribute
			//driver.findElement(By.xpath("//input[@id ='user-name']")).sendKeys("standard_user");
			
			//Locate Xpath username by using Contains
			driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
			
			//Locate Xpath password by multiple attribute
			driver.findElement(By.xpath("//*[@id ='password'][@name ='password']")).sendKeys("secret_sauce");
			
			//Locate Xpath login button
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			//Switch to product page
			String currWindowHandle = driver.getWindowHandle();
			driver.switchTo().window(currWindowHandle);
			
			//Locate Xpath using and & or expression
			driver.findElement(By.xpath("//button[@id ='add-to-cart-sauce-labs-backpack'and @name ='add-to-cart-sauce-labs-backpack']")).click();
			driver.findElement(By.xpath("//button[@id ='add-to-cart-sauce-labs-bike-light' or @name ='add-to-cart-sauce-labs-bike-light']")).click();
	}

}
