package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main (String argst[]) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/javascript-alert.php");
	driver.manage().window().maximize(); 
	
	WebElement clickme = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	clickme.click();
	
	driver.switchTo().alert().accept();
	
	WebElement button2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	button2.click();
	
	driver.switchTo().alert().dismiss();
	
	WebElement button3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	button3.click();
	
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	
	driver.switchTo().alert().sendKeys("hi");//not working
	
	}
}