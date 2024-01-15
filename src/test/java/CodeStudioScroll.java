import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeStudioScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net//" );
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		// Scroll down vertically by 500 pixel
		//js.executeScript("window.scrollBy(0,500)"); // Scroll down vertically by 500 pixel
		
		// Scroll till visibility of element
		WebElement element = driver.findElement(By.linkText("Pace Calculator"));
		//js.executeScript("arguments[0].scrollIntoView();",element);	
		
		//Scroll page upto last bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//Horizontal scroll
		WebElement ele = driver.findElement(By.id("a7"));
		js.executeScript("arguments[0].scrollIntoView();",ele);	
		}

}
