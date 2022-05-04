package gluecode;

import java.util.List;

import io.cucumber.java.en.Then;
import utility.LinksUtilityClass;


public class StepDef3  
{
   public Shared sh; 
    //Dependency injection via constructor
    public StepDef3(Shared x)
   {
	   sh=x;
    }

	@Then ("identify broken links and display")
	public void method1() throws Exception
	{
		
			 sh.lu=new LinksUtilityClass(sh.driver);
			sh.s.log("count of all links is "+sh.lu.getLinksCount());
			List<String> rs=sh.lu.getBrokenLinks();
			sh.s.log("count of broken links is "+rs.size());
			for(String r:rs)
			{
				sh.s.log(r);
			}
		
	}

}
