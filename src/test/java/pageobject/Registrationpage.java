package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

// Page object class for Registration page

public class Registrationpage extends Basepage
{
	  WebDriver driver;
		
		public Registrationpage(WebDriver driver)
		{
		  super(driver);
		}
		
	
// capture the Webelements
		
	@FindBy(id="gender-male") WebElement gender;
	
	@FindBy(xpath="//input[@id='FirstName']") WebElement Firstname;
	
	@FindBy(xpath="//input[@id='LastName']") WebElement Lastname;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']") WebElement Dateofbirthday;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']") WebElement Dateofbirthmonth;

	@FindBy(xpath="//select[@name='DateOfBirthYear']") WebElement Dateofbirthyear;
	
	@FindBy(xpath="//input[@id='Email']") WebElement Email;
	
	@FindBy(xpath="//input[@id='Company']") WebElement Company;
	
	@FindBy(xpath="//input[@id='Password']") WebElement Password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']") WebElement Confirmpassword;
	
	@FindBy(xpath="//button[@id='register-button']") WebElement Regbtn;
	
	@FindBy(xpath="//div[@class='result']") WebElement Confirmationmsg;
	
	
	// capture action methods
	
	public void SetGender()
	{
		gender.click();
	}
	
	public void SetFirstname(String fname)
	{
		Firstname.sendKeys(fname);
	}
	
	public void SetLastname(String lname)
	{
		Lastname.sendKeys(lname);
	}
	
	public void SetDateofbirthday()
	{
		Select drpobj=new Select(Dateofbirthday);
		drpobj.selectByValue("20");
	}
	
	public void SetDateofbirthmonth()
	{
		Select drpobj=new Select(Dateofbirthmonth);
		drpobj.selectByVisibleText("October");
	}
	
	public void SetDateofbirthyear()
	{
		Select drpobj=new Select(Dateofbirthyear);
		drpobj.selectByValue("1980");
	}
	
	public void SetEmail(String email) 
	{
		Email.sendKeys(email);
	}

	public void Setcompany(String company) 
	{
		Company.sendKeys(company);
	}

	public void Setpassword(String password) 
	{
		Password.sendKeys(password);
	}
	
	public void SetConfirmpassword(String pswd) 
	{
		Confirmpassword.sendKeys(pswd);
	}
	
	public void SetRegbtn()
	{
		Regbtn.click();
	}
	

    public String SetConfirmationmsg() 
{
	try {
		return (Confirmationmsg.getText()); // capture the message
	    } 
	
	catch (Exception e) 
	{
		return (e.getMessage());

	}
	
}	






}
