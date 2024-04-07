package pageobject;

//Page object class for Homepage

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage
{
      WebDriver driver;
	
	public Homepage(WebDriver driver) // pass the driver
	{
	   super(driver); // super invokes parent class constructor (BasePage)
	}

	
	// capture webelement using page factory approach
	
	@FindBy(css="a.ico-register") WebElement Register;
	
	@FindBy(xpath="//a[@class='ico-login']") WebElement Login;
	
	
	// capture the action methods
	
	public void clickregister()
	{
		Register.click();
	}
	
	public void clicklogin()
	{
		Login.click();
	}











}
