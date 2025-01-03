package basicseleniumcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize(); 
		
		//declare the webelement of dropdown
		WebElement dropdown = driver.findElement(By.id("single-input-field"));
		//dropdown related Select class
		Select selectdrop =new Select(dropdown);//Select class we use an object//we use element
		selectdrop.selectByValue("Yellow");//
		//selectdrop.selectByIndex(1);
		//selectdrop.selectByVisibleText("Green");//atrribute value--><option value ="Red">
		WebElement firstselectedOption = selectdrop.getFirstSelectedOption();//will return the webelement of the selected value
		String text = firstselectedOption.getText();
		System.out.println(text);
		
		
		//multidropdown
		WebElement dropdown1 = driver.findElement(By.id("multi-select-field"));
		Select multiselectdrop =new Select(dropdown1);
		multiselectdrop.selectByVisibleText("Red");
		multiselectdrop.selectByVisibleText("Green");
		//multiselectdrop.deselectByVisibleText("Green");//deselect dropdown
		List<WebElement> multidrop =multiselectdrop.getAllSelectedOptions();
		for(int i=0;i<multidrop.size();i++)
			{
				String s =multidrop.get(i).getText();//get is iterate each index
				System.out.println(s);
			}
	}

}
