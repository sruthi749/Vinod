package utilitiesPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public void presenceOfElementLocator(WebDriver driver, String locator) {
		
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofMillis(10000));
		explicitwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
		
		
	}
	
	public void elementToBeClickable(WebDriver driver, WebElement locator) {
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofMillis(10000));
		explicitwait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void visibilityOfElement(WebDriver driver,WebElement element) {
		
		WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofMillis(10000));
		explicitwait.until(ExpectedConditions.visibilityOf(element));
	}
}
