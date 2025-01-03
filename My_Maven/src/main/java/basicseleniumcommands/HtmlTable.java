package basicseleniumcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize(); 
		
		//findelement -- it will return single element
		//findelements -- it will find all elements based on the locators value to a list
		List<WebElement> firstrow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));//body 1st row
		//List<WebElement> firstrow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[text()='Tiger Nixon'or text()= 'Garrett Winters']"));//mentioned values
		//List<WebElement> firstrow = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr//th"));//head row
		for(int i=0;i<firstrow.size();i++)
		{
			String firstrowvalues = firstrow.get(i).getText();
			System.out.println(firstrowvalues);
		}
	}

}
