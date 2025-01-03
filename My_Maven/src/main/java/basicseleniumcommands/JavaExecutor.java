package basicseleniumcommands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// to execute java script command using selenium, we use JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");// window.scrollBy(0,2500)--> this is javascript command. here 0 is horrizondal scroll and 2500 is vertical
		js.executeScript("window.scrollBy(0,-2500)", ""); // for bottom to top scrolling

	}

}
