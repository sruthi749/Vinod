package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize(); 
		
		WebElement source = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));//source drag from starting point and ending point drop to target
		WebElement target = driver.findElement(By.id("mydropzone"));//classname.methodname();-->By.id,By.xpath etc -- static method
		Actions	draganddrop = new Actions(driver);
		draganddrop.dragAndDrop(source, target).perform();//classname.methodname();-->draganddrop.dragAndDrop(source, target)static method
		}

}
