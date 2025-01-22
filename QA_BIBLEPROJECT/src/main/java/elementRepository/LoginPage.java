package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class LoginPage {

	WebDriver driver;
	GeneralUtilities utilities=new GeneralUtilities();
	
	WaitUtility wait = new WaitUtility(); 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement userName;

	@FindBy(id = "loginform-password")
	WebElement passWord;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='reset it']")
	WebElement resetItLink;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement sendButton;

	public void inputUserName(String name) {
		userName.sendKeys(name);
	}

	public void inputPassword(String password) {
		passWord.sendKeys(password);
	}

	public void clickLoginButton() {
		utilities.clickOnElement(loginButton);
		
	}
	
	public void navigateToResetItLink() {
		utilities.clickOnElement(resetItLink);
	}

	public String getTextOfSendButtonInsideResetItLink() {
		String sendButtonText = sendButton.getText();
		return sendButtonText;
	}

	public String getFontTypeOfSendButtonInsideResetItLink() {
		String sendButtonFontType = sendButton.getCssValue("font-family");
		return sendButtonFontType;
	}
	
	public DashboardPage performLogin(String uname,String password)
	{
		inputUserName(uname);
		inputPassword(password);
		wait.presenceOfElementLocate(driver, "//button[@class='btn btn-default']");
		clickLoginButton();
		return new DashboardPage(driver);
	}
}
