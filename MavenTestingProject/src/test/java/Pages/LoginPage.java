package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By username_Textbox = By.xpath("//input[@name='username']");

	private By password_Textbox = By.xpath("//input[@name='password']");

	private By login_Button = By.xpath("//button[@type='submit']");

	private By forgotYourPassword_Link = By.xpath("//p[text()='Forgot your password? ']");

	public void enterUsername() {

		driver.findElement(username_Textbox).sendKeys("Admin");
	}

	public void enterPassword(String password) {

		driver.findElement(password_Textbox).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(login_Button).click();
	}

	public void forgotYourPassword() {

		driver.findElement(forgotYourPassword_Link).click();
	}


	
}
