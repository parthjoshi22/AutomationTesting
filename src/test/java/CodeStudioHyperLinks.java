import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeStudioHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		//Printing total number of links count i.e. 55
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links on webpage:" + linkElements.size());
		
		driver.close(); 
	}

}
