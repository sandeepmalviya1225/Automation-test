package Facebook_automation.Facebook_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utill.req.XlsReader;

public class Facebook_base {

	
		public static WebDriver driver;
		public static Properties prop;
		public static XlsReader reader;
		public static String UserName;
		public static String Password;
		public Facebook_base()
		{
			
		 try {
					prop = new Properties();
					FileInputStream ip = new FileInputStream("D:\\sandeep\\Devoint_selenium\\.metadata\\request2\\src\\main\\java\\Config\\pro\\Config.properties");
					prop.load(ip);
				} catch (FileNotFoundException e) 
		 {
					e.printStackTrace();
				} catch (IOException e) 
		 {
					e.printStackTrace(); 
				}
				}	
		
		
		
		public static void Openbrowser() throws IOException {
		
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","D:\\sandeep\\Devoint_selenium\\chromeDriver.exe");
	    	 driver = new ChromeDriver();
	    	
			
	 driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	    	  
	    	   driver.manage().timeouts().implicitlyWait(Utill.req.Utill.imptime, TimeUnit.SECONDS);
	    	    
	    	   driver.get(prop.getProperty("URl"));
			}
			
		
			
			}  

		public static void Useexclefiel() {
			
			reader = new XlsReader("D:\\sandeep\\Devoint_selenium\\.metadata\\Facebook_automation\\src\\main\\java\\Datafile\\facebookfile.xlsx");
			
				 UserName = reader.getCellData("Sheet1", "User_name" , 2);
				Password = reader.getCellData("Sheet1", "Password" , 2);
				
		}		
		}

	

