package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Loginpage;
import pageobject.Logoutpage;
import pageobject.Myaccountpage;
import testbases.Baseclass;

public class TC_02LoginTest extends Baseclass
{
	@Test(groups= {"sanity", "master"}) // grouping test cases/add test cases into group
	public void Verify_account_login()
	{
	    logger.info("**** starting TC_02RegistrationTest  *****");
		logger.debug("capturing application debug logs....");
		
		try
		{
		   // Home page
	  Homepage hp=new Homepage(driver);
	  hp.clicklogin();
	 logger.info("Clicked on login link");
	 
	 // Login page
	 
	 logger.info("Entering valid email and password ..");
	 	  
	  Loginpage LP=new Loginpage(driver);
	    
     // LP.SetEmail("henrea2000@gmail.com");
        LP.SetEmail(p.getProperty("email"));
        LP.SetPassword(p.getProperty("password"));
     // LP.SetPassword("test123");
	    LP.SetLoginbtn();
	
      logger.info("clicked on login button..");
	  
      // My account page
	  
	  Myaccountpage macct = new Myaccountpage(driver);
	  
	  logger.info("checking if my account is displayed..");
	  
	  macct.Setmyaccount();
	  
	  boolean targetpage = macct.isMyAccountPageExist();
		
	//	Assert.assertEquals(targetpage, true,"Login failed");
	  
	  if(targetpage==true)
	  {
		  logger.info("Login test passed...");
		  Assert.assertTrue(true);
	  }
	  
	  else
	  {
		  logger.info("Login test failed...");
		  Assert.fail();
	  }
	  
	  // Logout page
	  
	  Logoutpage LO = new Logoutpage(driver);
	  LO.Setlogout();
	  
	  logger.info("clicked on logout button..");
	
	 }
		
	catch(Exception e)
		{
			logger.error("test failure..");
		//	Assert.fail();
		}
		
	    logger.debug("Application debug logs ends...");
		logger.info("**** Finished TC_02_LoginTest  ****");
	  
	
	
	}
	


}
