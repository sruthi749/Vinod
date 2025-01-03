package basicseleniumcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultibleTabHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize(); 
	
		//parent window to child window(main page to new tab page)
		WebElement newtab = driver.findElement(By.id("tabButton"));
		newtab.click();
		String parentwindow = driver.getWindowHandle();//return parent window id (current window)
		System.out.println(parentwindow);
		Set<String> allwindows = driver.getWindowHandles();//return all windows id(more windows)
		System.out.println(allwindows);
		for(String childwindow:allwindows)
		{
			if(!childwindow.equals(parentwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement child = driver.findElement(By.id("sampleHeading"));
				String text = child.getText();
				System.out.println(text);
			}
		}
			driver.switchTo().window(parentwindow);
			WebElement parent = driver.findElement(By.id("windowButton"));
			String text = parent.getText();
			System.out.println(text);
	}

}
