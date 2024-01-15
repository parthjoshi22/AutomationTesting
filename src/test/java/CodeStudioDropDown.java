import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CodeStudioDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		
		driver.manage().window().maximize();
		
		 WebElement birthday = driver.findElement(By.xpath("//select[@id='day']")); 
		    Select date = new Select(birthday);
		    date.selectByValue("16");
		    
		    WebElement month = driver.findElement(By.xpath("//select[@id='month']")); 
		    Select mo = new Select(month);
		    mo.selectByVisibleText("Jul"); 

		    WebElement year= driver.findElement(By.xpath("//select[@id='year']")); 
		    Select yr = new Select(year);
		    yr.selectByValue("1984");
	
	}

}
