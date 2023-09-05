package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {
	
	
	@Test(groups= {"Regression","Master"})
	void test_registration() {
		logger.debug("*******Application Started******");
		logger.info("******TC_001_AccountRegistration Started******");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccountLink();
		logger.info("Clicked on account link.");
		hp.clickOnRegisterLink();
		logger.info("Clicked on register link.");
		
		logger.info("Entering customer data.");
		AccountRegistration reg=new AccountRegistration(driver);
		reg.enterFirstName(randomString());
		reg.enterLastName(randomString());
		reg.enterEmail(randomString()+"@gmail.com");
		reg.enterTelphoneNumber(randomNumber());
		String pass=randomAlphaNumeric();
		reg.enterPassword(pass);
		reg.enterConfirmPassword(pass);
		reg.clickAgreeButton();
		logger.info("Clicked on continue button");
		reg.clickContinueButton();
		String cnfMssg=reg.getConfirmationMsg();
		logger.info("Validating expected message");
		Assert.assertEquals(cnfMssg, "Your Account Has Been Created!","Expected result didn't match.");
		}
		catch(Exception e) {
			Assert.fail();
			logger.error("TC_001_AccountRegistration Failed");
		}
		
	}

}
