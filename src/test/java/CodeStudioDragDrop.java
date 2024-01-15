import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CodeStudioDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Find source & target web element
		WebElement source = driver.findElement(By.id("box6"));   // Rome
		WebElement target = driver.findElement(By.id("box106")); // Italy
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
	}

}
