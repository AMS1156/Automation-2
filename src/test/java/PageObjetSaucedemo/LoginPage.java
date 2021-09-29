package PageObjetSaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(css = "#user-name")
	WebElement userName;
	@FindBy(css = "#password")
	WebElement password;
	@FindBy(css = "#login-button")
	WebElement button;
	@FindBy(css = "[data-test='error']")
	WebElement errorMsg;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public void login(String userNameText, String passwordText) {
		fillText(userName, userNameText);
		fillText(password, passwordText);
		clik(button);

	}
	
	//validation
	
	public String getErrorMessage() {
	return	getText(errorMsg);
	}

}
