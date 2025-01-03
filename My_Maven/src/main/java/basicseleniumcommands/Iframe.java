package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize(); 
		
		//webside inside another website
		//iframe is an inside another frame 
		//switch driver to frame
		driver.switchTo().frame("frame1");//using switch topassing name/id value of frame tag as string for switching driver to frame
		
		//fetching the webelement in the specific frame //Declare webelemtn and usual scripting
		WebElement frametext = driver.findElement(By.id("sampleHeading"));
		String text = frametext.getText();
		System.out.println(text);
		
		//revert control to main webpage from frame
		driver.switchTo().defaultContent();
		
		//1.Navigate to the webpage containing iframes.
		//2.Switch WebDriver to a specific iframe using its name, ID, or index.
		//3.Perform actions within the iframe, such as finding and interacting with elements.
		//4.Switch back to the main page using defaultContent().
	}

}
