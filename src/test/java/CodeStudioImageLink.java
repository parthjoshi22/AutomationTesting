import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeStudioImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		// Find webpage element image link opencart
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
		// Verify title of current page with expected home page title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test Failed");
		}
	}

}
