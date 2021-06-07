package Facebook_automation.Facebook_automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_home extends Facebook_base{

	
	@FindBy(xpath= "//*[@class = 'p361ku9c']")
	WebElement logoimage;
	
	@FindBy(xpath= "//div[@class= 'm9osqain a5q79mjw gy2v8mqq jm1wdb64 k4urcfbm qv66sw1b']")
	WebElement Textbox_whatsin_your_mind1 ;
	
	
	 @FindBy(xpath ="//*[@class='_1mf _1mj']") 
	 WebElement   Textbox_whatsin_your_mind2 ;
	 
	 @FindBy(xpath ="(//div//*[(@class ='bp9cbjyn j83agx80 taijpn5t c4xchbtz by2jbhx6 a0jftqn4')])[1]") 
	 WebElement  postbutton  ;
	
	
	 public Facebook_home(){
			PageFactory.initElements(driver,this );
		}
		
		
		public Facebook_friends post() {		
				 
			logoimage.click();
			Textbox_whatsin_your_mind1.click();
			Textbox_whatsin_your_mind2.sendKeys("Hello World");
		        
			postbutton.click();
		
			
			return new Facebook_friends();
}
}