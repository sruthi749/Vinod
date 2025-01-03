package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseEvents {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize(); 
		
		//Action - class usedto handle keyboard and mouse,need to create an object action class,along with action class we should parmeterise
		//To automate double click button
		//Mouse actions
		Actions mouse = new Actions(driver);//we use driver
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		mouse.doubleClick(doubleclick).perform();//method overloading same methodname different parameter
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		mouse.contextClick(rightclick).perform();//right click//perform used to a convenience method for performing the actions without calling build() first.
		mouse.moveToElement(rightclick).perform();//mouse over
		
		//Keyboard actions
		mouse.sendKeys(Keys.ARROW_DOWN).perform();	
		mouse.sendKeys(Keys.F5).perform();
	
		}

}
