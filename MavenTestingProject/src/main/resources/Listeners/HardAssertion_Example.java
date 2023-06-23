package Listeners;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestNg.BaseClass;

public class HardAssertion_Example extends ListenersExample {

	public WebDriver driver;
		
	@BeforeSuite
	public void launchBrowser() throws IOException {

		driver = new EdgeDriver();

		driver.manage().window().maximize();

		System.out.println("I am in @BeforeSuite method ");
	}

	@BeforeClass
	public void launchURL() throws IOException {
		
		beforeNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		afterNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);

		System.out.println("I am in @BeforeClass method ");

	}

	@BeforeMethod
	public void wait1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		System.out.println("I am in @BeforeMethod method ");

	}

	@Test(priority = 1)
	public void verifyTitle() throws IOException {

		String actualTitle = driver.getTitle();

		String expectedTitle = "OrangeHRM";

		Assert.assertEquals(actualTitle, expectedTitle);

		System.out.println("Hi");

		System.out.println("Hello");
	}

	@Test(priority = 2)
	public void verifyTitle1() throws IOException {

		String actualTitle = driver.getTitle();

		String expectedTitle = "testing";

		Assert.assertEquals(actualTitle, expectedTitle, "Both are not same");

		System.out.println("Hi");

		System.out.println("Hello");
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
