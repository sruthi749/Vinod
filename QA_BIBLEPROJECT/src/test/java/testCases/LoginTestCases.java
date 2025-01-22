package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import utilities.ExcelReadUtility;

public class LoginTestCases extends BaseClass {
	// Verify login page is working
	@Test(groups = "Critical", dataProvider = "logindataprovider", dataProviderClass = ExcelReadUtility.class)
	public void verifyLoginPageWorking(String username, String password) {
		// public void verifyLoginPageWorking() {
		LoginPage lp = new LoginPage(driver);
//		lp.inputUserName("Carol");
//		lp.inputPassword("1q2w3e4r");
//		lp.clickLoginButton();
		// lp.performLogin("Carol", "1q2w3e4r");

		// DashboardPage dp = new DashboardPage(driver);
		DashboardPage dp = lp.performLogin(username, password);
		// DashboardPage dp = lp.performLogin("Carol", "1q2w3e4r");
		String actualResult = dp.getTextOfWelcomeText();
		String expectedResult = "Welcome to Payroll Application";
		Assert.assertEquals(actualResult, expectedResult, "Login Page not working as expected");
	}

	// Open the application --> Click "Reset It" hyper link --> Verify the text of
	// "Send" button.
	@Test(retryAnalyzer = retryPackage.RetryTestCases.class, groups = "Low")
	public void verifyTheTextOfResetLinkSendButton() {
		LoginPage lp = new LoginPage(driver);
		lp.navigateToResetItLink();
		String actualResult = lp.getTextOfSendButtonInsideResetItLink();
		String expectedResult = "SEND";

		Assert.assertEquals(actualResult, expectedResult,
				"Send button inside Reset It link is not working as expected");
	}

	// Open the application --> Click "Reset It" hyper link --> Verify the font type
	// of "Send" button text.
	@Test
	public void verifyFontTypeOfSendButtonInsideResetLink() {
		LoginPage lp = new LoginPage(driver);
		String actualResult = lp.getFontTypeOfSendButtonInsideResetItLink();
		String expectedResult = "Overpass, sans-serif";

		Assert.assertEquals(actualResult, expectedResult,
				"Send button inside Reset It link is not working as expected");
	}

}
