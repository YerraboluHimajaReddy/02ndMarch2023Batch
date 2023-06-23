package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotYourPasswordPage;

public class ForgotYourPasswordMethods {

	WebDriver driver;

	public ForgotYourPasswordMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	ForgotYourPasswordPage fp = new ForgotYourPasswordPage(driver);
	
	public void enterUsername(String username) {

		driver.findElement(fp.username_Textbox).sendKeys(username);
	}

	public void clickCancel() {

		driver.findElement(fp.cancel_Button).click();
	}

	public void clickReset() {

		driver.findElement(fp.resetPassword_Button).click();
	}


}
