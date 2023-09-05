package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

import utilities.DataProviders;

public class TC_003_Login_DDT extends BaseClass {
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_loginDDT(String email, String password, String exp) {
	logger.info("******Starting TC_003_Login_DDT******" );	
	try {
	HomePage hp=new HomePage(driver);
	hp.clickOnMyAccountLink();
	hp.clickOnLoginLink();
	
	LoginPage lp=new LoginPage(driver);
	lp.enterEmailId(email);
	lp.enterPassword(password);
	lp.clickOnLoginButton();
	
	MyAccountPage ma=new MyAccountPage(driver);
	boolean a=ma.checkGetText();
	
	
	if (exp.equals("Valid")) {
		if (a == true) {
			ma.clickLogout();
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	if (exp.equals("Invalid")) {
		if (a == true) {
			ma.clickLogout();
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
		}
	}
	}
catch (Exception e) {
	Assert.fail();
}

logger.info(" Finished TC_003_LoginDataDrivenTest");

}
}	
	


