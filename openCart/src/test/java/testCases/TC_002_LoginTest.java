package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;

import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	@Test(groups= {"Master","Sanity"})
	void test_Login(){
		
		logger.debug("*******Application Started******");
		logger.info("******TC_002_LoginTest Started******");
		try {
			
			
			HomePage hp=new HomePage(driver);
			hp.clickOnMyAccountLink();
			hp.clickOnLoginLink();
			
			LoginPage lp=new LoginPage(driver);
			lp.enterEmailId(rb.getString("emailId"));
			lp.enterPassword(rb.getString("password"));
			lp.clickOnLoginButton();
			
			MyAccountPage ma=new MyAccountPage(driver);
			boolean a=ma.checkGetText();
			Assert.assertEquals(a, true);
			
			
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("******TC_002_LoginTest Completed******");
	}

}
