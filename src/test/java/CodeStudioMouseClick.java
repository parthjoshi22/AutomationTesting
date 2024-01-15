import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CodeStudioMouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		//WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		//button.click();
		
		//Actions act = new Actions (driver);
		//act.contextClick(button).perform();
		
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		button.click();
				
		Actions act = new Actions (driver);
		act.doubleClick(button).perform();
		
	}

}
