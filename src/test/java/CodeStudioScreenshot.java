import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeStudioScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		// Convert web driver object to TakeScreeshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		// Call getScreenshotAs() method to create image file
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		//getscreenshot method will return a file & we will save in file type object variable
		
		File dest = new File("C:\\Users\\hp\\Desktop\\Study\\amazon.png");
		// For copying this file we need Apache IO library
		
		// Copy image file to destination
		FileUtils.copyFile(src, dest);
	}

}
