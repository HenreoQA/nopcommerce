package pageobject;


//My account page object class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Myaccountpage extends Basepage
{
     WebDriver driver;
	
	public Myaccountpage(WebDriver driver)
	{
	  super(driver);
	}

	// capture webelement
	
	@FindBy(xpath="//a[@class='ico-account']") WebElement myacct;
	
	@FindBy(xpath="//div[@class='block block-account-navigation']//strong[contains(text(),'My account')]")
	WebElement myaccountheading;
	
	@FindBy(xpath="//a[@class='ico-logout']") WebElement logoutbtn;
	
	
	// capture action methods
	
	public void Setmyaccount()
	{
		myacct.click();
	}
	
	public boolean isMyAccountPageExist() // MyAccount Page heading display status
	{
		try 
		{
			return (myaccountheading.isDisplayed());
		} 
		
		catch (Exception e) 
		{
			return (false);
		}
		
	}
	
	public void Clicklogout()
	{
		logoutbtn.click();
	}



}
