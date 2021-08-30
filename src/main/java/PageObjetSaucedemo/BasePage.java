package PageObjetSaucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clik(WebElement el) {
		el.click();
	}

	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}

	public String getText(WebElement el) {
		return el.getText();

	}
}
