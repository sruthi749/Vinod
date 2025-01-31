//package base;
//
//import org.testng.annotations.Test;
//
//import utilities.ScreenshotUtility;
//
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.ITestAnnotation;
//import org.testng.annotations.Parameters;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//
//public class BaseClass {
//	
//	public WebDriver driver;
//	
//	public static Properties prop;//prop is the ref variable of class Properties
//	public static void testBasic() throws IOException {
//		prop = new Properties(); //create object for Properties class
//		FileInputStream ip = new FileInputStream(
//		System.getProperty("user.dir") + "//src//test//resources//Config.properties");
//		prop.load(ip); // it will load the file to the framework
//	}
//
//	@BeforeMethod(alwaysRun = true)
//	@Parameters("browser")
//	public void beforeMethod(String browser) throws IOException {
//		if(browser.equals("Chrome"))
//		  {
//		  driver=new ChromeDriver();
//		  }else if(browser.equals("Edge"))
//		  {
//			  driver=new EdgeDriver();
//		  }
//		testBasic();
//		driver = new ChromeDriver();
//		//driver.get("https://www.qabible.in/payrollapp/site/login");
//		driver.get(prop.getProperty("baseurl"));//hard code data u can fetch url using properties
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//	}
//
//	@AfterMethod(alwaysRun = true)
//	public void afterMethod(ITestResult iTestResult) throws IOException {
//		
//		if(iTestResult.getStatus() == ITestResult.FAILURE) {
//			ScreenshotUtility screenshot = new ScreenshotUtility();
//			screenshot.captureScreenShotForFailedTestcase(driver, iTestResult.getName());
//		}
//		driver.close();
//	}
//
//}
package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenshotUtility;

public class BaseClass {

	public WebDriver driver;

	public static Properties prop;// prop is the ref variable of class Properties

	public static void testBasic() throws IOException {
		prop = new Properties(); // create object for Properties class
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//Config.properties");
		prop.load(ip); // it will load the file to the framework
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String browser) throws IOException {
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Fire")) {
			driver = new FirefoxDriver();
		}
		driver = new ChromeDriver();
		testBasic();
		// driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.get(prop.getProperty("baseurl"));// hard code data u can fetch url using properties
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility screenshot = new ScreenshotUtility();
			screenshot.captureScreenShotForFailedTestcase(driver, iTestResult.getName());
		}
		driver.close();
	}
}
