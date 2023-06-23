package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginOrangeHRM_Edge {
	
	public WebDriver driver ;

	@BeforeSuite
	public void launchBrowser() {

	    driver = new EdgeDriver();
	    
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		System.out.println("I am in @AfterMethod method ");

	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
		
		System.out.println("I am in @AfterSuite method ");

	}

}
