package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	@Test(groups= {"Sanity","Master"})
	//@Test
	public void test_login() {
		logger.info("**** Starting TC_002_LoginTest****");
		try
		{				
			HomePage hp=new HomePage(driver);
			
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount");
			
			hp.clickLogin();
			logger.info("Clicked on Login link");
			
			LoginPage lp=new LoginPage(driver);	
			logger.info("Providing Login Details");
			
			lp.setEmail(rb.getString("email1")); // valid email, get it from properties file
			lp.setPassword(rb.getString("password1")); // valid password, get it from properties file
			lp.clickLogin();
			logger.info("Clicked on Login Button");
			
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetpage=macc.isMyAccountPageExists();	
			Assert.assertEquals(targetpage, true,"Invalid Login data");
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC_002_LoginTest");
	}
}
