package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ClientPage {

	WebDriver driver;
	GeneralUtilities utilities = new GeneralUtilities();

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
	
	@FindBy(className = "btn btn-default")
	WebElement resetClient;
	
	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//thead//tr//th[2]//a")
	WebElement clientNameHeading;
	public String getTooltipValueOfUpdateIcon() {
		return utilities.getToolTipValue(updateIconToolTip);
	}

	public boolean isCheckBoxSelectedInCreateClientMenu() {
		utilities.clickOnElement(createClientMenu);
		utilities.scrollThePage(driver);
		return utilities.isCheckboxSelected(createClientCheckBox);
	}
	
	public void resetTheClientDetails() {
		clientName.sendKeys("Sam");
		clientId.sendKeys("3");
		utilities.clickOnElement(resetClient);
	}

}
