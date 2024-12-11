package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelementsCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("loginform-username"));//findElement();-->method -- Find the first WebElement using the given method.By is a class
		username.sendKeys("hello");//add input /set it String values
		//WebElement username = driver.findElement(By.id("loginform-username")).sendKeys("hi");
		WebElement password =driver.findElement(By.id("loginform-password"));
		password.sendKeys("1234");
		
		//xpath:
		//1st syntax:
		//tagName[@attributeType='attributeValue']
		////input[@id='loginform-username']
		//2nd syntax:
		//tagName[text()='visibleText']
		//button[text()='Login']
		WebElement login =driver.findElement(By.xpath("//button[text()='Login']"));
		//login.click();//click on button
		username.clear();//clear data in text field
		
		//to automate style properties (font color,background color etc..)
		String backgroundcolour = login.getCssValue("background-color");//background color
		System.out.println(backgroundcolour);
		
		//getAttributetype
		String attributevalue = login.getDomAttribute("class");//.getAttribute("class");-->deprecated//@SuppressWarnings("deprecation")
		System.out.println(attributevalue);
		
		//to fetch the tagname of the element - getTagname
		String tagname = login.getTagName();
		System.out.println(tagname);
		
		//cssSelector:
		//syntax 1 : tagName#idValue
		//syntax 2 : tagName.classAttributeValue
		//syntax 3 : tagName[attributeType=attributeValue]
		//getText --
		String text = login.getText();
		System.out.println(text);// get text value
		}

}
