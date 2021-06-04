package Facebook_automation.Facebook_automation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Facebook extends Facebook_base {

			//Page Factory
		
		@FindBy(xpath= "//*[@id ='email']")
		WebElement loginuserid;
		
		@FindBy(xpath= "//*[@id ='pass']")
		WebElement Password ;
		
		
		 @FindBy(xpath ="//*[@id ='u_0_d_Uu']") 
		 WebElement loginbutton ;
		  
		
		 
	// Initializing the page objects 
		public Login_Facebook(){
			PageFactory.initElements(driver,this );
		}
		
		
		public Facebook_home loginto(String un, String pwd) {		
				 
			loginuserid.sendKeys(un); 
			Password.sendKeys(pwd);
				loginbutton.click(); 
		        
				return new Facebook_home();
			
		}
			public String validateTitle()
			{
				
				return driver.getTitle();
			}
			
		}

		

