package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement entermsg = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermsg.sendKeys("welcome");//entermsg
		WebElement showmsg = driver.findElement(By.cssSelector("button#button-one"));
		showmsg.click();
		//WebElement showmsg = driver.findElement(By.xpath("//button[text()='Show Message']"));
		//showmsg.click();//click on show message
		String text = showmsg.getText();
		System.out.println(text);//get text "show message"
		String style = showmsg.getCssValue("background-color");
		System.out.println(style);//get style properties
		String tagname = showmsg.getTagName();
		System.out.println(tagname);//fetch tagname
		String attributevalue = showmsg.getDomAttribute("class");//.getAttribute("class");--deprecated
		System.out.println(attributevalue);//fetch attributevalue
		
		WebElement entera = driver.findElement(By.cssSelector("input#value-a"));
		entera.sendKeys("200");//enter A value
		WebElement enterb = driver.findElement(By.cssSelector("input#value-b"));
		enterb.sendKeys("300");//enter B value
		WebElement gettotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
		gettotal.click();//click on get total
		String text1 = gettotal.getText();
		System.out.println(text1);//get text "get total"
		String style1 = showmsg.getCssValue("background-color");
		System.out.println(style1);//get style properties
		String tagname1 = showmsg.getTagName();
		System.out.println(tagname1);//fetch tagname
		String attributevalue1 = showmsg.getDomAttribute("class");//.getAttribute("class");----deprecated
		System.out.println(attributevalue1);//fetch attributevalue
	}

}
