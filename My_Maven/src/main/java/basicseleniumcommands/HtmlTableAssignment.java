package basicseleniumcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTableAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		//footer row print
		List<WebElement> footerrow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tfoot//tr//th"));
		System.out.println("The table footer names:");
		for(int i=0;i<footerrow.size();i++)
		{
			String footerrowvalue = footerrow.get(i).getText();
			System.out.println(footerrowvalue);
		}
		System.out.println();
		
		//3rd column print
		List<WebElement> thirdrow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
		System.out.println("The table 3rd column names:");
		for(int i=0;i<thirdrow.size();i++)
		{
			String thirdrowvalue = thirdrow.get(i).getText();
			System.out.println(thirdrowvalue);
		}
		System.out.println();
		
		//4th row print
		List<WebElement> fourthrow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		System.out.println("The fourth row names:");
		for(int i=0;i<fourthrow.size();i++)
		{
			String fourthrowvalue = fourthrow.get(i).getText();
			System.out.println(fourthrowvalue);
		}
	}

}
