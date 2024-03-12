package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_State {
	
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;

	//============================================================================================
	//FunctionName 			: RMAApp_State_Btn_Add
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Button On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Btn_Add(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("idnodeadd"));//Unique Id Of Add Button On State Maintenance Page Is Fetched
			return Element;
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Btn_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Button On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Btn_Edit(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("idnodeedit"));//Unique Id Of Edit Button On State Maintenance Page Is Fetched
			return Element;
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Btn_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Button On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Btn_Delete(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("idprint"));//Unique Id Of Delete Button On State Maintenance Page Is Fetched
			return Element;
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Txt_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Textbox On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Txt_Country(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("lookup_country"));//Unique Id Of Country Textbox On State Maintenance Page Is Fetched
			return Element;	
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Button On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Btn_Country(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("btn_country_openlookup"));//Unique Id Of Country Button On State Maintenance Page Is Fetched
			return Element;	
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Txt_StateAbbrv
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Abbrv Textbox On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Txt_StateAbbrv(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("stateAb"));//Unique Id Of State Abbrv Textbox On State Maintenance Page Is Fetched
			return Element;	
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Txt_StateName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which State Name Textbox On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Txt_StateName(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("stateName"));//Unique Id Of State Name Textbox On State Maintenance Page Is Fetched
			return Element;	
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country Button On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Btn_Save(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Save']"));//Unique Id Of Country Button On State Maintenance Page Is Fetched
			return Element;	
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Lst_WorkLossCalc
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Work Loss Calc Textbox On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Lst_WorkLossCalc(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("LastWrkLoss"));//Unique Id Of Work Loss Calc Textbox On State Maintenance Page Is Fetched
			return Element;	
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_Txt_FROI
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FROI Textbox On State Maintenance Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-03-28-2018                                
	//============================================================================================
		public static WebElement RMAApp_State_Txt_FROI(WebDriver driver)
		{
			Element = null;
			Element = driver.findElement(By.id("froi"));//Unique Id Of FROI Textbox On State Maintenance Page Is Fetched
			return Element;	
		}
		
	//============================================================================================
	//FunctionName 			: RMAApp_State_RdBtn_Table
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RadioButton For A Row On State Maintenance Page Is Fetched
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - FaizaSheikh-04-11-2018                               
	//============================================================================================
	   public static WebElement RMAApp_State_RdBtn_Table(WebDriver driver,String StAbbrv)
	   {   Element = null;
	       Element = driver.findElement(By.xpath(".//*[contains(text(),'"+StAbbrv+"')]/ancestor:: tbody[1]/tr/td[1]/input")); 
	       return Element;
	   }

}
