package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitiesPackages.GeneralUtilities;
import utilitiesPackages.WaitUtility;

public class WorkerPage {

	WebDriver driver;
	GeneralUtilities utilities = new GeneralUtilities();

	WaitUtility wait = new WaitUtility();

	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorkerMenu;

	@FindBy(id = "worker-title")
	WebElement titleDropdown;

	WebElement selectedDropdownOption;
	
	@FindBy(id = "workersearch-first_name")
	WebElement workerFirstTextBoxName;
	
	@FindBy(id = "workersearch-last_name")
	WebElement workerLastTextBoxName;
	
	@FindBy(id = "workersearch-postcode")
	WebElement workerPostCodeBoxNumber;
	
	@FindBy(id = "workersearch-ni_number")
	WebElement workerNiNumber;
	
	@FindBy(xpath = "//button[text()='Search']")
	WebElement workerSearchButton;
	
	@FindBy(xpath="//table")
	WebElement workTtable;

	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getSelectedValueOfTitleDropdownInCreateWorkerMenu() {
		utilities.clickOnElement(createWorkerMenu);
		return utilities.getDropdownSelectedValue(titleDropdown, 2);

	}
	public boolean clickOnWorkerSearchButton(int col,String value) {
		utilities.getElementValue(workerFirstTextBoxName,value);
		wait.elementToBeClickable(driver, workerSearchButton);
		utilities.clickOnElement(workerSearchButton);
		return utilities.getTableCellValue(workTtable, col, value);
		
	}
}
