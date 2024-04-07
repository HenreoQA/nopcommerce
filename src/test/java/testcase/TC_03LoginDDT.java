package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Loginpage;
import pageobject.Myaccountpage;
import testbases.Baseclass;
import utility.DataProviders;

/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC_03LoginDDT extends Baseclass
{
    @Test(dataProvider="dpp", dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password)
//	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_03_LoginDDT *****");
		
		try {
	
		//Home page
			
			Homepage hp=new Homepage(driver);
			hp.clicklogin(); //Login link
			
			logger.info("clicked login link...");
				
			//Login page
			
			logger.info("entering login details...");
			
			Loginpage LP=new Loginpage(driver);
			LP.SetEmail(email);
			LP.SetPassword(password);
			LP.SetLoginbtn(); //Login button
			
			logger.info("clicked login button...");
				
			//My Account Page
			
		/*	logger.info("clicking on myaccount link and validating login credentials...");
			
			Myaccountpage macct = new Myaccountpage(driver);
			macct.Setmyaccount();
			boolean targetpage=macct.isMyAccountPageExist();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetpage==true)
				{
					macct.Clicklogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				     
				}
		//	}
				
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetpage==true)
				{
					macct.Clicklogout();
					Assert.assertTrue(false);
					
				}
				else
				{
					Assert.assertTrue(true);
				}
			} */
		
		}
		
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
			//logger.error("test failure..");
		}
			
		logger.info("**** Finished TC_03_LoginDDT *****");
	}
	


}









