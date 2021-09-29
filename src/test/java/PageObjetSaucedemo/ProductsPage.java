package PageObjetSaucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
	 List<WebElement> li;
	@FindBy(css = ".shopping_cart_link")
	 WebElement clickopenCart;
	

	public ProductsPage(WebDriver driver) {
		super(driver);
		li = driver.findElements(By.cssSelector(".inventory_item_label a"));
	}

	public void choosProduct(String name) {
		
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i).getText().contains(name)) {
				li.get(i).click();
				break;
			}
			System.out.println(i + ": " + li.get(i).getText());
		}
	}

	public void openCart() {
		clik(clickopenCart);
	}
}
