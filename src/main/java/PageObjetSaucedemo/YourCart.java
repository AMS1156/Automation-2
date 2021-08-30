package PageObjetSaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCart extends BasePage{
 @FindBy(css = "#checkout")
WebElement clickcheckOut;


public YourCart(WebDriver driver) {
		super(driver);
	}

public void checkOut() {
	clik(clickcheckOut);
} 
 
}
