package basicseleniumcommands;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHtmlTable {//dynamic web element

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		List<WebElement> firstcolumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		String locator = null;
		for(int i=0;i<firstcolumn.size();i++)
		{
			if(firstcolumn.get(i).getText().equals("Ashton Cox"))
			{
				locator = "//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]";
				break;
			}
		}
		WebElement thirdrowvalue=driver.findElement(By.xpath(locator));
		String text = thirdrowvalue.getText();
		System.out.println(text);
		
	}

}
