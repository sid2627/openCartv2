package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Element
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myAccountLink;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	//Action
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	
	public void clickOnRegisterLink() {
		register.click();
	}
	
	public void clickOnLoginLink() {
		login.click();
	}
	
	
	
}
