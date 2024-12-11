package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesButton
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		//checkbox.click();
		boolean a = checkbox.isSelected();//checkbox is selected/not, boolean is used to identify true/false
		System.out.println(a);
		boolean b = checkbox.isDisplayed();//element presence Is this element displayed or not? This method avoids the problem of having to parse anelement's "style" attribute.
		System.out.println(b);
		boolean c = checkbox.isEnabled();//is element enabled or not
		System.out.println(c);
		
		/*WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkbox1.click();
		//boolean d = checkbox1.isSelected();
		//System.out.println(d);
		//boolean e = checkbox1.isDisplayed();
		//System.out.println(e);
		boolean f = checkbox1.isEnabled();
		System.out.println(f);
		WebElement checkbox2 = driver.findElement(By.cssSelector("input#check-box-two"));
		//checkbox2.click();
		//boolean g = checkbox2.isSelected();
		//System.out.println(g);
		//boolean j = checkbox2.isDisplayed();
		//System.out.println(j);
		boolean m = checkbox2.isEnabled();
		System.out.println(m);
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		//checkbox3.click();
		//boolean h = checkbox3.isSelected();
		//System.out.println(h);
		//boolean k = checkbox3.isDisplayed();
		//System.out.println(k);
		boolean n = checkbox3.isEnabled();
		System.out.println(n);
		WebElement checkbox4 = driver.findElement(By.cssSelector("input#check-box-four"));
		//checkbox4.click();
		//boolean i = checkbox4.isSelected();
		//System.out.println(i);
		//boolean l = checkbox4.isDisplayed();
		//System.out.println(l);
		boolean o = checkbox4.isEnabled();
		System.out.println(o);*/
		
		WebElement button = driver.findElement(By.cssSelector("input#button-two"));
		button.click();
		boolean z = button.isSelected();
		System.out.println(z);
		boolean y = button.isDisplayed();
		System.out.println(y);
		boolean x = button.isEnabled();
		System.out.println(x);
		
	
	}
}
	
