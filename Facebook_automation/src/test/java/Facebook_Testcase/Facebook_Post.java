package Facebook_Testcase;

import org.testng.annotations.BeforeTest;

import Facebook_automation.Facebook_automation.Facebook_base;

public class Facebook_Post extends Facebook_base  {

	public Facebook_Post() {
		super();
	} 
	
	@BeforeTest

	public void Runbrowser() throws Exception  {
		Facebook_base.Openbrowser();
		
		}
	
	

}
