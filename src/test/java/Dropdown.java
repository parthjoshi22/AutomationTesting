import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=google.com&utm_medium=organic/");
		
		driver.manage().window().maximize();
		
		WebElement ddown = driver.findElement(By.name("employee_c"));
		Select select = new Select(ddown);
		
		select.selectByValue("Level1");
		
		select.selectByVisibleText("51 - 100 employees");
		
		select.selectByIndex(5);
	}

}
