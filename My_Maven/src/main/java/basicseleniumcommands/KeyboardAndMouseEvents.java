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
		Actions keyboard = new Actions(driver);//we use driver
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		keyboard.doubleClick(doubleclick).perform();//method overriding same method name different parameter
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		keyboard.contextClick(rightclick).perform();//right click
		keyboard.moveToElement(rightclick).perform();//mouse over
		
		//keyboard actions
		keyboard.sendKeys(Keys.ARROW_DOWN).perform();	
	
		}

}
