//package testCases;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import base.BaseClass;
//import elementRepository.DashboardPage;
//import elementRepository.LoginPage;
//
//
//
//public class ClientTestCases extends BaseClass {
//	// Open the application --> Login to the application --> Navigate to "Client"
//	// menu --> verify the tooltip value for "Edit" icon for any row in the table.
//	@Test(groups = "Critical")
//	public void verifyToolTipValueOfEditIconInTableOfClientMenu() {
//		LoginPage lp = new LoginPage(driver);
////		lp.inputUserName("Carol");
////		lp.inputPassword("1q2w3e4r");
////		lp.clickLoginButton();
//		lp.performLogin("Carol", "1q2w3e4r");// rightclick - open declaration
//
//		 DashboardPage dp = new DashboardPage(driver);
//		//DashboardPage dp = lp.performLogin("Carol", "1q2w3e4r");// Page chaining
//		// dp.navigateToClientMenu();// rightclick - open declaration
//
//		// ClientPage cp = new ClientPage(driver);
//		//ClientPage cp = dp.navigateToClientMenu();
//
//		String actualResult = cp.getTooltipValueOfUpdateIcon();
//		String expectedResult = "Update";
//
//		// Assert.assertEquals(actualResult, expectedResult, "Tooltip of Edit icon is
//		// not working as expected");
//
//		Assert.assertEquals(actualResult, expectedResult, Constant.errorMessagesForClientTestCase);
//	}
//
//	// Open the application --> Login to the application --> Navigate to "Client"
//	// menu -->Click "Create Client" sub menu --> Select the check-box - "Require
//	// Po" and verify the same is selected.
//	@Test(groups = "Low")
//	public void verifySelectedValueInCheckBoxofCreateClientInClientMenu() {
//		LoginPage lp = new LoginPage(driver);
//		// lp.performLogin("Carol", "1q2w3e4r");
//
//		// DashboardPage dp = new DashboardPage(driver);
//		DashboardPage dp = lp.performLogin("Carol", "1q2w3e4r");
//		// dp.navigateToClientMenu();
//
//		// ClientPage cp = new ClientPage(driver);
//		ClientPage cp = dp.navigateToClientMenu();
//		boolean actualResult = cp.isCheckBoxSelectedInCreateClientMenu();
//		boolean expectedResult = true;
//
//		Assert.assertEquals(actualResult, expectedResult, "Checkbox is not working as expected");
//	}
//}
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.ClientPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class ClientTestCases extends BaseClass {

	// Open the application --> Login to the application --> Navigate to "Client"
	// menu --> verify the tooltip value for "Edit" icon for any row in the table.
	@Test
	public void verifyToolTipValueOfEditIconInTableOfClientMenu() {
		LoginPage lp = new LoginPage(driver);
		// lp.performLogin("Carol", "1q2w3e4r");
		// DashboardPage dp = new DashboardPage(driver);
		DashboardPage dp = lp.performLogin("Carol", "1q2w3e4r");
		// dp.navigateToClientMenu();
		ClientPage cp = dp.navigateToClientMenu();
		// ClientPage cp = new ClientPage(driver);
		String actualResult = cp.getTooltipValueOfUpdateIcon();
		String expectedResult = "Update";

		Assert.assertEquals(actualResult, expectedResult, "Tooltip of Edit icon is not working as expected");
	}

	// Open the application --> Login to the application --> Navigate to "Client"
	// menu -->Click "Create Client" sub menu --> Select the check-box - "Require
	// Po" and verify the same is selected.
	@Test
	public void verifySelectedValueInCheckBoxofCreateClientInClientMenu() {
		LoginPage lp = new LoginPage(driver);
		// lp.performLogin("Carol", "1q2w3e4r");

		// DashboardPage dp = new DashboardPage(driver);
		DashboardPage dp = lp.performLogin("Carol", "1q2w3e4r");
		// dp.navigateToClientMenu();

		// ClientPage cp = new ClientPage(driver);
		ClientPage cp = dp.navigateToClientMenu();
		boolean actualResult = cp.isCheckBoxSelectedInCreateClientMenu();
		boolean expectedResult = true;

		Assert.assertEquals(actualResult, expectedResult, "Checkbox is not working as expected");
	}
}
