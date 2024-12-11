package basicseleniumcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver = new ChromeDriver();//creating an object for webdriver,chromedrive is one of the implementation of class
	 //webdriver commands
	 driver.get("https://www.google.com");//Load a new web page in the current browser window. 
	 driver.manage().window().maximize();//maximize window
	 //driver.manage().window().fullscreen();//fullscreen window
	 //driver.manage().window().minimize();//minimize window
	 String a = driver.getTitle();//Get the title of the current page.
	 System.out.println(a);
	 String b = driver.getCurrentUrl();//Current page URL can fetch,Get a string representing the current URL that the browser is looking at.
	 System.out.println(b);
	 String c = driver.getPageSource();//html code can fetch,Get the source of the last loaded page
	 System.out.println(c);
	 //Thread.sleep(10000);//timer setting (optional)
	 driver.navigate().back();//backbutton of browser
	 //Thread.sleep(10000);
	 driver.navigate().forward();//forwordbutton of browser
	 driver.navigate().refresh();//for refresh of browser
	 driver.close();//to Close current browser
	 //driver.quit();//to Close all browser
	 driver.manage().deleteAllCookies();//to delete all cookies
	 
	}
	

}
