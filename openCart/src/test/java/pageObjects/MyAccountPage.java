package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Element
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement MyAccountText;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	//Action
	
		public boolean checkGetText() {
			try {
			return (MyAccountText.isDisplayed());
			}
	
	catch(Exception e) {
		
		return(false);
	}
		}
		
		public void clickLogout() {
			lnkLogout.click();

		}
}
