package gluecode;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 
{
	public Shared sh;
	//Dependency injection via constructor
	public StepDef2(Shared x) 
	{
		sh=x;
	}
	@When ("i entered a value and verfy title")
	public void method4(DataTable dt) throws Exception 
	{
		List<Map<String,String>> l=dt.asMaps();
		for(int i=0; i<l.size(); i++)
		{
	        sh.obj.FillsearchboxAndclickEnter(l.get(i).get("word"));
	        if(sh.obj.verifyTitle(sh.driver, l.get(i).get("word")))
	        {
	        	sh.s.log("test passed");
	        }
	        else
	        {
	        	sh.s.log("test failed");
	        }
	        sh.driver.navigate().back();
		}
	}
	@Then ("close site")
	public void method5()
	{
		
	}

}
