package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;

	
	//Action
	public void enterEmailId(String emailidStr) {
		emailId.sendKeys(emailidStr);
	}
	
	public void enterPassword(String passwordStr) {
		password.sendKeys(passwordStr);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	
	
	
	
		
	
}
