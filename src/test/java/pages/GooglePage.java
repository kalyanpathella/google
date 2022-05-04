package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
	@FindBy(name="q") private WebElement scearchbox;
	
	public GooglePage (RemoteWebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void FillsearchboxAndclickEnter(String data) throws Exception
	{
		scearchbox.clear();
		Thread.sleep(3000);
		scearchbox.sendKeys(data,Keys.ENTER);
		Thread.sleep(3000);
	}
	public boolean verifyTitle(RemoteWebDriver driver, String expected)
	{
		if(driver.getTitle().contains(expected))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	

}
