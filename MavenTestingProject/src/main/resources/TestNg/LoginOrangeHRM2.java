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
import org.testng.annotations.Test;

public class LoginOrangeHRM2 extends BaseClass{	

	@BeforeSuite
	public void launchBrowser() {

	    launchBrowser("chrome");
	    
	    driver.manage().window().maximize();	    

		System.out.println("I am in @BeforeSuite method ");
	}
	
	@BeforeClass
	public void launchURL() {
		
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("I am in @BeforeClass method ");

	}
	
	@BeforeMethod
	public void wait1() {
		
		waitForSometime();
		
		System.out.println("I am in @BeforeMethod method ");

	}
	
	@Test(priority = 1)
	public void enterUsername() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("I am in @Test enterUsername method ");

	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("I am in @Test enterPassword method ");

	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("I am in @Test clickLogin method ");

	}
	
	@AfterMethod
	public void wait2() {
		
		waitForSometime();
		
		System.out.println("I am in @AfterMethod method ");

	}
	
	@AfterSuite
	public void closeBrowser() {
		
		close_Browser();
		
		System.out.println("I am in @AfterSuite method ");

	}

}
