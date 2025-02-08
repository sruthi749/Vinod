package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utilitiesPackages.GeneralUtilities;
import utilitiesPackages.WaitUtility;

public class ClientPage {

	WebDriver driver;
	GeneralUtilities utilities = new GeneralUtilities();
	
	WaitUtility wait = new WaitUtility();


	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody//tr[1]//a[2]")
	WebElement updateIconToolTip;

	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createClientMenu;

	@FindBy(id = "client-require_po")
	WebElement createClientCheckBox;

	@FindBy(id ="clientsearch-client_name")
	WebElement clientName;
	
	@FindBy(id = "clientsearch-id")
	WebElement clientId;
	
	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchButton;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr//td")
	WebElement clientTtable;
	
	public String getTooltipValueOfUpdateIcon() {
		return utilities.getToolTipValue(updateIconToolTip);
	}

	public boolean isCheckBoxSelectedInCreateClientMenu() {
		utilities.clickOnElement(createClientMenu);
		utilities.scrollThePage(driver);
		return utilities.isCheckboxSelected(createClientCheckBox);
	}
	
	public boolean clickOnClientSearchButton(int col,String value) {
		//wait.visibilityOfElement(driver, clientName);
		utilities.getElementValue(clientName, value);
		wait.elementToBeClickable(driver, searchButton);
		utilities.clickOnElement(searchButton);
		wait.visibilityOfElement(driver, clientTtable);
		return utilities.getTableCellValue(clientTtable, col, value);
		
	}
	
	

}
