package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logoutpage extends Basepage
{
    WebDriver driver;
	
	public Logoutpage(WebDriver driver)
	{
	  super(driver);
	}

	
	@FindBy(xpath="//a[@class='ico-logout']") WebElement logoutbtn;
	
	public void Setlogout()
	{
		logoutbtn.click();
	}

	
	
	
	
	
}
