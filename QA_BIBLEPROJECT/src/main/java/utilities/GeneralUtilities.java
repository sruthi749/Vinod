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
package utilities;

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

}
