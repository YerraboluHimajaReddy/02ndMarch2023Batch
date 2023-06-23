package TestNgAssertions;

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
import org.testng.asserts.SoftAssert;

import TestNg.BaseClass;

public class SoftAssertion_Example extends BaseClass {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		driver = new EdgeDriver();

		takeScreenshot("launchbrowser.png");

		driver.manage().window().maximize();

		System.out.println("I am in @BeforeSuite method ");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		takeScreenshot("launchurl.png");

		System.out.println("I am in @BeforeClass method ");

	}

	@BeforeMethod
	public void wait1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		System.out.println("I am in @BeforeMethod method ");

	}

	@Test(priority = 1)
	public void verifyTitle() throws IOException {
		
		SoftAssert ass = new SoftAssert();

		String actualTitle = driver.getTitle();

		String expectedTitle = "OrangeHRM";

		ass.assertEquals(actualTitle, expectedTitle);

		System.out.println("Hi");

		System.out.println("Hello");
		
		ass.assertAll();
	}

	@Test(priority = 2)
	public void verifyTitle1() throws IOException {
		
		SoftAssert ass = new SoftAssert();

		String actualTitle = driver.getTitle();

		String expectedTitle = "testing";

		ass.assertEquals(actualTitle, expectedTitle, "Both are not same");

		System.out.println("Hi");

		System.out.println("Hello");
		
		ass.assertAll();
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
