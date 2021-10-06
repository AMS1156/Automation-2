package TestsSau;


import org.testng.annotations.Test;

import PageObjetSaucedemo.LoginPage;
import PageObjetSaucedemo.ProductPage;
import PageObjetSaucedemo.ProductsPage;
import PageObjetSaucedemo.YourCart;

public class TestBase extends BaseTest {
	
	@Test
	public void LoginError() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");

		ProductsPage psp = new ProductsPage(driver);
		psp.choosProduct("Backpack");

		ProductPage pp = new ProductPage(driver);
//	        Thread.sleep(4000);
	        pp.addToCart();
		pp.back();

		psp = new ProductsPage(driver);
		psp.openCart();

		YourCart yc = new YourCart(driver);
		yc.checkOut();
	}
}
