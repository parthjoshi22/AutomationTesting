import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeStudio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			
			driver.findElement(By.id("login-button")).click();
			
			//Switch to product page
			String currWindowHandle = driver.getWindowHandle();
			driver.switchTo().window(currWindowHandle);
			
			//Locate Sauce Labs Bolt T-Shirt - Link Opening Code
			//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
			
			//Product add to cart
			//driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	}

}
