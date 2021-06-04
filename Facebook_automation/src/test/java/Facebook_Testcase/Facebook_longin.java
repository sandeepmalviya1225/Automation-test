package Facebook_Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Facebook_automation.Facebook_automation.Facebook_base;
import Facebook_automation.Facebook_automation.Facebook_home;
import Facebook_automation.Facebook_automation.Login_Facebook;



public class Facebook_longin extends Facebook_base {
	Login_Facebook fblog;
	Facebook_home homepage;
	public Facebook_longin() {
		super();
	} 

	
	@BeforeTest

	public void Runbrowser() throws Exception  {
		Facebook_base.Openbrowser();
		
		}

@Test(priority=1)
public void lonintoapptest() throws IOException {
	homepage = fblog.loginto("Facebook_base.UserName", "Facebook_base.Password");
	
}

@Test(priority=2)
public void logintitletest() {
	String titel = fblog.validateTitle();
	Assert.assertEquals(titel, "Facebook" );
}



}
