package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Registrationpage;

import testbases.Baseclass;

public class TC_01RegistrationTest extends Baseclass
{
	@Test(groups= {"regression", "master"}) // grouping test cases/add test cases into group
	public void Verify_account_registration()
	{
	  logger.info("**** starting TC_01RegistrationTest  *****");
	  logger.debug("capturing application debug logs....");
	  
	  try
	  {
	 
	  Homepage hp=new Homepage(driver); // create object for homepage and pass driver
	  hp.clickregister(); // call the methods from homepage object class
	  logger.info("Clicked on register link"); // add the info after clicking on register link
	 
	 logger.info("Entering customer details.. ");
	 
	 Registrationpage Regpage=new Registrationpage(driver); // create object for registration page and pass the driver instance
		Regpage.SetGender(); // call the methods from registration page
		
	//	Regpage.SetFirstname(randomString().toUpperCase()); // call the methods from registration page and convert the names to uppercase (uppercase is optional)
		Regpage.SetFirstname("Henry"); // use this if you want to pass a specific name directly without passing it randomly
	//	Regpage.SetLastname(randomString().toLowerCase());
		Regpage.SetLastname("Ogu");
		
		Regpage.SetDateofbirthday();
		Regpage.SetDateofbirthmonth();
		Regpage.SetDateofbirthyear();
		 
	//	Regpage.SetEmail(randomString()+"@gmail.com"); // randomly generated the email
		Regpage.SetEmail("guy@gmail.com"); // use this if you want to pass a specific email directly without passing it randomly
		
	//	Regpage.Setcompany(randomString());
		Regpage.Setcompany("xyz"); // use this if you want to pass a specific company name directly without passing it randomly
		
		
	//	String password=randomAlphaNumeric(); // generate password and store in a variable
	//	Regpage.Setpassword(password);
	//	Regpage.SetConfirmpassword(password);
		
		Regpage.Setpassword("test123"); // pass the password directly
    	Regpage.SetConfirmpassword("test123");
	
		Regpage.SetRegbtn();
		
		logger.info("clicked on register button..");
		
		String confmsg=Regpage.SetConfirmationmsg();
		
		logger.info("Validating expected message..");
		
		if(confmsg.equals("Your registration completed"))
		{
			logger.info("Test passed...");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed...");
			Assert.fail();
		}
	  
	  }
	
	  catch(Exception e)
	  {
		  logger.error("test failure..");
		   Assert.fail();
	  }
		
	    logger.debug("Application debug logs ends...");
	    logger.info("**** finished TC_01_AccountRegistrationTest  *****");
		
	}

}
