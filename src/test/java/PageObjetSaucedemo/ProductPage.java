package PageObjetSaucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	
	@FindBy(css = ".btn.btn_primary.btn_small")
	WebElement clickAddToCart;
	@FindBy(css = ".left_componSSent")
	WebElement clickBack;

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void addToCart() {
		clik(clickAddToCart);
	}

	public void back() {
		String s = getText(clickBack);
		System.out.println(s);
		clik(clickBack);
	}
}
