package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Page object class for Registration page

public class Loginpage extends Basepage
{
	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
	  super(driver);
	}
	
	// capture the Webelements
	
	@FindBy(xpath="//input[@id='Email']") WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']") WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']") WebElement Loginbtn;

	
	// capture action methods
	
	public void SetEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void SetPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void SetLoginbtn()
	{
		Loginbtn.click();
	}
	





}
