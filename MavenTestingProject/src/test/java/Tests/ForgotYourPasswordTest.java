package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class ForgotYourPasswordTest {

	public WebDriver driver ;
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;

	@BeforeSuite
	public void launchBrowser() {

	    driver = new EdgeDriver();
	    
	    lp = new LoginPage(driver);
	    
	    fpm = new ForgotYourPasswordMethods(driver);
	    
	    driver.manage().window().maximize();	    

		System.out.println("I am in @BeforeSuite method ");
	}
	
	@BeforeClass
	public void launchURL() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("I am in @BeforeClass method ");

	}
	
	@BeforeMethod
	public void wait1() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		System.out.println("I am in @BeforeMethod method ");

	}
	
	@Test(priority = 1)
	public void clickForgootYourPasswordLink() {
		
		lp.forgotYourPassword();
		
		System.out.println("I am in @Test clickForgootYourPasswordLink method ");

	}
	
	@Test(priority = 2)
	public void enterUsername() {
		
		fpm.enterUsername("Aswini and Nikitha");
		
		System.out.println("I am in @Test enterUsername method ");

	}
	
	@Test(priority = 3)
	public void clickCancel() {
		
		fpm.clickCancel();
		
		System.out.println("I am in @Test clickCancel method ");

	}
	
	@AfterMethod
	public void wait2() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		System.out.println("I am in @AfterMethod method ");

	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
		
		System.out.println("I am in @AfterSuite method ");

	}
}
