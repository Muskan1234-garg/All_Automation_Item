package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Configuration_Manager {
	public static WebElement Element = null;
	public static WebElement Element2 = null;

	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: RMAApp_GSP_SearchList_Number
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Data Source Name Will Be Identified On GSP System Setting Tab Screen Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-18-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement Assure_Configuration_Manager_Lbl_DataSource(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='top-bar footer']//*[contains(@aria-label,'Current Data Source Name')]//div[@class='cs-top-left-text']")); //Unique Id Of DataSource Label On Configuration Manager Default View Page Is Fetched 
		return Element;
	}
	
	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: Assure_Configuration_Manager_Save_Button
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Button Will Be Identified On General System Parameter Screen
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-08-18-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement Assure_Configuration_Manager_Save_Button(WebDriver driver)
	{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='SAVE']")); //Unique Id Of Save Button Will Be Identified On General System Parameter Screen
	return Element;
	}
	
	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName 			: Assure_Configuration_Manager_Logout_Button
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Logout Button Will Be Identified On General System Parameter Screen
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ParulSharma-09-20-2020                                 
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement Assure_Configuration_Manager_Logout_Button(WebDriver driver)
	{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@id='notificationButton' and @aria-label='Logout']")); //Unique Id Of Logout Button Will Be Identified On General System Parameter Screen
	return Element;
	}
				
	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName           : Assure_Configuration_Manager_Btn_LogoutConfirm
	//Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Logout Confirm Button On RMA Application Default View Page Can Be Identified
	//Input Parameter        : Driver Variable Of The Type WebDriver                
	//Revision               : 0.0 - ParulSharma-09-20-2020                                       
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement Assure_Configuration_Manager_Btn_LogoutConfirm(WebDriver driver)
	{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@class='btn btn-confirm']")); //Unique xpath Of Logout Confirm Button On RMA Application Default View Page Can Be Identified
	return Element;
	}
	
	//==================================================================================================================================================================================================================================================================================================================================
	//FunctionName           : Assure_Configuration_Manager_Btn_LogoutCancel
	//Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Logout Cancel Button On RMA Application Default View Page Can Be Identified
	//Input Parameter        : Driver Variable Of The Type WebDriver                
	//Revision               : 0.0 - RenuVerma-09-04-2017                                      
	//==================================================================================================================================================================================================================================================================================================================================
	public static WebElement Assure_Configuration_Manager_Btn_LogoutCancel(WebDriver driver)
	{
	Element = null;
	Element = driver.findElement(By.xpath(".//*[@class='btn btn-cancel']")); //Unique xpath Of Logout Cancel Button On RMA Application Default View Page Can Be Identified
	return Element;
	}
	
	//==================================================================================================================================================================================================================================================================================================================================
    //FunctionName           : RMAApp_Config_Manager_ScreenName
    //Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Screens Links Can Be Identified On Configuration Manager Menu Page
    //Input Parameter        : Driver Variable Of The Type WebDriver                
    //Revision               : 0.0 - ParulSharma-09-04-2020                                      
	//==================================================================================================================================================================================================================================================================================================================================
    public static WebElement RMAApp_Config_Manager_ScreenName(WebDriver driver,String text)
    {
           Element = null;
           try {
                  Element = driver.findElement(By.xpath(".//*[@id='all-services']//descendant::span[contains(text(),'"+text+"')]"));//Unique xpath Of Screen Name On Menu Page Can Be Identified
           } catch (Exception e) {
                  e.printStackTrace();
           }
           return Element;
    }
    
	//==================================================================================================================================================================================================================================================================================================================================
    //FunctionName           : RMAApp_Config_Manager_TabName
    //Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Tab Name Can Be Identified On Screens (Eg Employee Tab on General System Parameters )
    //Input Parameter        : Driver Variable Of The Type WebDriver                
    //Revision               : 0.0 - ParulSharma-09-04-2020                                      
	//==================================================================================================================================================================================================================================================================================================================================
    public static WebElement RMAApp_Config_Manager_TabName(WebDriver driver,String text)
    {
           Element = null;
           try {
                  Element = driver.findElement(By.xpath(".//*[@id='frmData']//descendant::div[@class='mat-tab-label-container']//descendant::div[@class='mat-tab-label-content' and contains(text(),'"+text+"')]")); //Unique xpath Of Tab Name On Screen Page Can Be Identified
           } catch (Exception e) {
                  e.printStackTrace();
           }
           return Element;
    }
    
	//==================================================================================================================================================================================================================================================================================================================================
    //FunctionName           : RMAApp_Config_Manager_Sub_Section_Name
    //Description            : To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sub Sections Can Be Identified On Screens (Eg Work Days Sub Section on Employees Tab Of General System Parameter )
    //Input Parameter        : Driver Variable Of The Type WebDriver                
    //Revision               : 0.0 - ParulSharma-09-04-2020                                      
	//==================================================================================================================================================================================================================================================================================================================================
    public static WebElement RMAApp_Config_Manager_Sub_Section_Name(WebDriver driver,String text)
    {
           Element = null;
           try {
        	   Element = driver.findElement(By.xpath(".//*[@class='card-body p-1']//ul//ancestor::li//a[contains(text(),'"+text+"')]")); //Unique xpath Of Section Name On Screen Page Can Be Identified
           } catch (Exception e) {
                  e.printStackTrace();
           }
           return Element;
    }
  //============================================================================================
  	//FunctionName 			: RMAApp_Generic_Msg_ToastMessage
  	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SelectRowMark Image  On Attachment Document Properties Page Can Be Identified
  	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
  	//Revision				: 0.0 - RenuVerma-06-15-2017                                        
  	// ============================================================================================
  	public static WebElement RMAApp_Generic_Msg_ToastMessage(WebDriver driver,String Message)
  	{
  		Element=null;
  //		Element = driver.findElement(By.xpath(".//*[@class='toast-message']//*[contains(text(),'"+Message+"')]")); //Unique className Of Toast Message On RMA Application UX Page Is Fetched; 
  		Element = driver.findElement(By.xpath(".//*[@id='toast-container']//descendant::div[contains(text(),'"+Message+"')]")); //Unique className Of Toast Message On RMA Application UX Page Is Fetched; 
  		return Element;
  	}
  //============================================================================================
  	//FunctionName 			: RMAApp_GenericBtn_ErrorToastMsgClose
  	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Error Toast Message On RMA Application Page Can Be Identified
  	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
  	//Revision				: 0.0 - KumudNaithani-05-22-2017                                
  	//============================================================================================
  	public static WebElement RMAApp_GenericBtn_ErrorToastMsgClose(WebDriver driver)
  	{
  		Element = null;
  		try{
  			Element = driver.findElement(By.xpath("//*[@id='toast-container']//div")); //Unique Id Of Close Button On Error Toast Message On RMA Application Page Is Fetched
  		}catch (Exception|Error e){	 
  		}
  		return Element;
  	}
    }

	