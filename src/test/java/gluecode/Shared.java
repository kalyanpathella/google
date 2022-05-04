package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.GooglePage;
import utility.LinksUtilityClass;

public class Shared 
{
	public RemoteWebDriver driver;
	public GooglePage obj;
	public Scenario s;
	public LinksUtilityClass lu;
	
	@Before
	public void mathod(Scenario x)
	{
		s=x;
	}
}
