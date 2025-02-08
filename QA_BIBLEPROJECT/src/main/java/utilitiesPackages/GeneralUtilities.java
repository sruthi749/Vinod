//package utilities;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//public class GeneralUtilities {
//	
//	public String getElementText(WebElement element) {
//		String text = element.getText();
//		return text;
//	}
//	
//	public String getToolTipValue(WebElement element)
//	{
//		String tooltipValue=element.getDomAttribute("title");
//		return tooltipValue;
//	}
//	
//	public String getDropdownSelectedValue(WebElement element,int valueToSelect)
//	{
//		Select select=new Select(element);
//		select.selectByIndex(valueToSelect);
//		
//		WebElement selectedDropdownValue = select.getFirstSelectedOption();
//		String dropdownText = selectedDropdownValue.getText();
//		return dropdownText;
//		
//	}
//	
//	public boolean isCheckboxSelected(WebElement element) {
//		element.click();
//		boolean checkboxSelection=element.isSelected();
//		return checkboxSelection;
//	}
//	
//	public void clickOnElement(WebElement element)
//	{
//		element.click();
//	}
//	
//	public void scrollThePage(WebDriver driver)
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2500)", "");
//	}
//
//
//}
package utilitiesPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getToolTipValue(WebElement element) {
		String tooltipValue = element.getDomAttribute("title");
		return tooltipValue;
	}

	public String getDropdownSelectedValue(WebElement element, int valueToSelect) {
		Select select = new Select(element);
		select.selectByIndex(valueToSelect);

		WebElement selectedDropdownValue = select.getFirstSelectedOption();
		String dropdownText = selectedDropdownValue.getText();
		return dropdownText;

	}

	public boolean isCheckboxSelected(WebElement element) {
		element.click();
		boolean checkboxSelection = element.isSelected();
		return checkboxSelection;
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void scrollThePage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");
	}

	public void getElementValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public boolean getTableCellValue(WebElement table, int col, String value) {
		// List<WebElement> rows = table.findElements(By.xpath("//tbody//tr"));
		// int rowSize = rows.size();
		int rowSize = table.findElements(By.xpath("//tbody//tr")).size();
		System.out.println("number of rows :" + rowSize);
		boolean flag = false;
		for (int i = 1; i < rowSize; i++) {
			// List<WebElement> rows = table.findElements(By.xpath("//tbody//tr//td"));
			// String name = table.getText();
			String name = table.findElement(By.xpath("//tbody//tr[" + i + "]//td[" + col + "]")).getText();
			if (name.equals(value)) {
				flag = true;
				System.out.println(name);
				break;
			}
		}
		return flag;
	}

}
