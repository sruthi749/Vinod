/*package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AnnotationEg {

	WebDriver driver; // commonly using for all method

	@Test

	public void VerifyLoginFeatureIsWorkingWithValidUser() {
		WebElement username = driver.findElement(By.id("loginform-username")); // clicking on Username field.
		username.sendKeys("carol"); // text field -using sendKeys

		WebElement password = driver.findElement(By.id("loginform-password")); // clicking on password field
		password.sendKeys("1q2w3e4r");

		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click(); // click method is used to click onthe buttons

//assertion--  comparing the actual results and expected results

		WebElement welcomtext = driver.findElement(By.xpath("//p[text()='Welcome to Payroll Application']"));
		String actualResult = welcomtext.getText();
		String expectedResult = "Welcome to Payroll Application";
		// comparing
		Assert.assertEquals(actualResult, expectedResult, "login feature is not working as expected..");

	}

	@Test

	public void VerifyTheTextOfTheSearchButtonClientPage() {
		WebElement username = driver.findElement(By.id("loginform-username")); // clicking on Username field.
		username.sendKeys("carol"); // text field -using sendKeys

		WebElement password = driver.findElement(By.id("loginform-password")); // clicking on password field
		password.sendKeys("1q2w3e4r");

		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click(); // click method is used to click onthe buttons

		WebElement client = driver.findElement(By.xpath("//a[text()='Clients']"));
		client.click();
		WebElement search = driver.findElement(By.xpath("//button[text()='Search']"));

//comparing 
		String actualresult = search.getText();
		String expectedresult = "Search";
		Assert.assertEquals(actualresult, expectedresult, "working as not expected..");

	}

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // if any pageload, it takes 10 seconds to
																			// wait.

	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
	}

}*/
package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AnnotationEg {
	WebDriver driver;// global variable we need driver for all the methods

	@Test
	public void verifyLoginFeatureWorkingWithValidCredentials()// test object or method should be very neet and clear
	{
		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		WebElement welcometext = driver.findElement(By.xpath("//p[text()='Welcome to Payroll Application']"));
		String actualresult = welcometext.getText();
		String expectresult = "Welcome to Payroll Application";
		Assert.assertEquals(actualresult, expectresult, "Login feature are not working as expected...");// Assretion is comparison of actual and expected result
	}
	@Test
	public void verifyTheTextSearchButtonOfClientPage() {
		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		WebElement client = driver.findElement(By.xpath("//a[text()='Clients']"));
		client.click();
		WebElement searchbtn = driver.findElement(By.xpath("//button[text()='Search']"));
		String actualresult = searchbtn.getText();
		String expectresult = "Search";
		Assert.assertEquals(actualresult, expectresult, "This text not expected...");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
