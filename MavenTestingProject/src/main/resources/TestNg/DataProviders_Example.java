package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_Example extends BaseClass{	

	@BeforeSuite
	public void launchBrowser() {

	    launchBrowser("edge");
	    
	    driver.manage().window().maximize();	    

		System.out.println("I am in @BeforeSuite method ");
	}
	
	@BeforeClass
	public void launchURL() {
		
		launchURL("https://www.facebook.com/");
		
		System.out.println("I am in @BeforeClass method ");

	}
	
	@BeforeMethod
	public void wait1() {
		
		waitForSometime();
		
		System.out.println("I am in @BeforeMethod method ");

	}
	
	@DataProvider(name = "facebookdata")
	public Object[][] getData(){
		
		Object[][] values = new Object[3][2];
		
		values[0][0] = "nikitha@gmail.com";
		values[0][1] = "nikitha";

		values[1][0] = "aswini@gmail.com";
		values[1][1] = "aswini";
		
		values[2][0] = "kavya@gmail.com";
		values[2][1] = "kavya";
		
		return values;
	}
	
	@Test(dataProvider = "facebookdata")
	public void verifyCredentials(String  username, String password) {
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
		System.out.println("I am in @Test enterUsername method ");

	}
	
	@AfterSuite
	public void closeBrowser() {
		
		close_Browser();
		
		System.out.println("I am in @AfterSuite method ");

	}

}
