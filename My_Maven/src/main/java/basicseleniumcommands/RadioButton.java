package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		//radiobutton1.click();
		boolean a = radiobutton1.isSelected();//select/not
		System.out.println(a);
		WebElement radiobutton2 = driver.findElement(By.cssSelector("input#inlineRadio2"));
		radiobutton2.click();
		boolean b = radiobutton2.isSelected();//select/not
		System.out.println(b);
		
		WebElement showselectbtn = driver.findElement(By.id("button-one"));
		//showselectbtn.click();
		boolean c = showselectbtn.isDisplayed();//presence of button
		System.out.println(c);
		
		boolean d = showselectbtn.isEnabled();//enable/not
		System.out.println(d);
	}

}
