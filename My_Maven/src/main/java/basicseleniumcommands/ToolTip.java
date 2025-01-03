package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		
		//how to tooltip automate in browser
		WebElement alldropdown = driver.findElement(By.id("searchDropdownBox"));
		String tooltipvalue=alldropdown.getDomAttribute("title");
		System.out.println(tooltipvalue);
	}

}
