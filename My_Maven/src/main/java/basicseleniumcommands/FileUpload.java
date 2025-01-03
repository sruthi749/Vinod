package basicseleniumcommands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();

		// Robot class used to file upload
		Robot robot = new Robot();
		// robot.keyPress(KeyEvent.VK_CONTROL);
		// robot.keyRelease(KeyEvent.VK_CONTROL);//
		WebElement uploadbutton = driver.findElement(By.id("uploadfile_0"));
		//uploadbutton.click();//tagname is input not button so it can add
		Actions action =new Actions(driver);
		action.moveToElement(uploadbutton).click().perform();//tag name is a input so we need to mouse over here
		
		// copy any keyword to system clipboard - Java class StringSelection and
		// getSystemClipboard method.
		StringSelection ss = new StringSelection("\"C:\\Users\\hp\\Desktop\\Sql.docx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}


}
