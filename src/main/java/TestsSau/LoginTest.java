package TestsSau;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjetSaucedemo.LoginPage;

public class LoginTest extends BaseTest{

	
 @Test(dataProvider="getData", description="use incorect login information")
	public void l1_loginFailed(String user,String password) {
		//login failed
		LoginPage loginPage = new LoginPage(driver);
		//Using the variables we get from the @DataProvider method
		loginPage.login(user, password);
		
		//Should check that we get the right message 
		String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = loginPage.getErrorMessage();
		Assert.assertEquals(actual, expected);
	}

	/*
	 * This is example of a method that return 2 dimensional object (like a table)
	 * Using the @DataProvider the method above will get the parameters for each iteration.
	 */
	@DataProvider
	public Object[][] getData(){
		Object[][] myData = {
				{"user1","123"},
				{"gal","123"},
				{"yonit","1#444"},
				{"gal","123456878"},
		};
		return myData;
	}
}
