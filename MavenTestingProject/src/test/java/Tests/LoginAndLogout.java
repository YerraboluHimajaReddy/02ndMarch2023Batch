package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOut;

public class LoginAndLogout {

	public WebDriver driver ;
	
	LoginPage lp;
	
	HomePage hp;
	
	SignOut sp;

	@BeforeSuite
	public void launchBrowser() {

	    driver = new EdgeDriver();
	    
	    lp = new LoginPage(driver);
	    
	    hp = PageFactory.initElements(driver, HomePage.class);
	    
	    sp = PageFactory.initElements(driver, SignOut.class);

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
	public void enterUsername() {
		
		lp.enterUsername();
		
		System.out.println("I am in @Test enterUsername method ");

	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		lp.enterPassword("admin123");
		
		System.out.println("I am in @Test enterPassword method ");

	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println("I am in @Test clickLogin method ");

	}
	
	
	@Test(priority = 4)
	public void clickButtonInHomePage() {
		
		hp.clickButton();
		
		System.out.println("I am in @Test clickButtonInHomePage method ");

	}
	
	
	@Test(priority = 5)
	public void clickLogoutButton() {
		
		sp.clickLogout();
		
		System.out.println("I am in @Test clickLogoutButton method ");

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
