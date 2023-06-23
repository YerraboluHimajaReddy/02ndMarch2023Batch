package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
public class BaseClass {
	
	public WebDriver driver ;
	
	public void launchBrowser(String browersName) {
		
		if(browersName.equalsIgnoreCase("chrome"))
		{
		    driver = new ChromeDriver();
		}
		else if(browersName.equalsIgnoreCase("edge"))
		{
		    driver = new EdgeDriver();
		}
		else if(browersName.equalsIgnoreCase("safari"))
		{
		    driver = new SafariDriver();
		}
	}
	
	public void launchURL(String url) {
		
		driver.get(url);		
	}
	
	public void waitForSometime() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));		
	}
	
	public void close_Browser() {
		
		driver.quit();		
	}	
	
	public void takeScreenshot(String imageName)throws IOException {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("C:\\Users\\himaj\\eclipse-workspace\\02ndMar2023Batch\\MavenTestingProject\\src\\test\\java\\ScreenshotImages\\"+imageName));
			
	}

}
