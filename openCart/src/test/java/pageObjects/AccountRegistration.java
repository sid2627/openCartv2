package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration  extends BasePage {
	
	

		public AccountRegistration(WebDriver driver) {
			super(driver);
			
		}
		
		//Element
		@FindBy(xpath="//input[@id='input-firstname']")
		WebElement firstName;
		
		@FindBy(xpath="//input[@id='input-lastname']")
		WebElement lastName;
		
		@FindBy(xpath="//input[@id='input-email']")
		WebElement email;
		
		@FindBy(xpath="//input[@id='input-telephone']")
		WebElement telephoneNumber;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='input-confirm']")
		WebElement confirmPassword;
		
		@FindBy(xpath="//input[@name='agree']")
		WebElement agree;
		
		@FindBy(xpath="//input[@value='Continue']")
		WebElement continueButton;
		
		@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
		WebElement confirmationMessage;
		//Actions
		public void enterFirstName(String firstNameStr) {
			firstName.sendKeys(firstNameStr);
		}
		
		public void enterLastName(String lastNameStr) {
			lastName.sendKeys(lastNameStr);
		}
		
		public void enterEmail(String emailIdStr) {
			email.sendKeys(emailIdStr);
		}
		
		public void enterTelphoneNumber(String telephoneNumberStr) {
			telephoneNumber.sendKeys(telephoneNumberStr);
		}
		
		public void enterPassword(String passwordStr) {
			password.sendKeys(passwordStr);
		}
		
		public void enterConfirmPassword(String confirmPasswordStr) {
			confirmPassword.sendKeys(confirmPasswordStr);
		}
		
		public void clickAgreeButton() {
			agree.click();;
		}
		
		public void clickContinueButton() {
			continueButton.click();;
		}
		
		public String getConfirmationMsg() {
			try {
				return(confirmationMessage.getText());
			}catch(Exception e) {
					return(e.getMessage());
		}
		}
		
		
		
		
		
		
		
		
	

}
