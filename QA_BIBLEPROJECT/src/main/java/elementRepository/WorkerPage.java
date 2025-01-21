package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class WorkerPage {
	
	WebDriver driver;
	GeneralUtilities utilities=new GeneralUtilities();
	
	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorkerMenu;

	@FindBy(id = "worker-title")
	WebElement titleDropdown;

	WebElement selectedDropdownOption;

	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public String getSelectedValueOfTitleDropdownInCreateWorkerMenu() {
		utilities.clickOnElement(createWorkerMenu);
		return utilities.getDropdownSelectedValue(titleDropdown, 2);
		
	}

}
