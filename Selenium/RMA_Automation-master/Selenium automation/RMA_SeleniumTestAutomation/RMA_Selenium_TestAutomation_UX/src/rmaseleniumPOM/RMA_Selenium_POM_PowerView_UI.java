package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_PowerView_UI {
	public static WebElement Element = null;


	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lbl_PowerViewName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which PowerView Name On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Lbl_PowerViewName(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='grdPowerViewList_pViewTitle_0']/b/u")); //Unique Id Of PowerView Name On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lst_PageName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which List Of Page Name On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Lst_PageName(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lstFormList']")); //Unique Id Of List Of Page Name On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Img_EditPage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Page Image Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Img_EditPage(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='imgEdit1']")); //Unique Id Of Edit Page Image Button On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Lst_ToolBarFields
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which List Of ToolBar Fields On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Lst_ToolBarFields(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='lstToolBarList']")); //Unique Id Of List Of ToolBar Fields On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Img_EditToolBarField
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Field Image Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Img_EditToolBarField(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='edit3']")); //Unique Id Of Edit Field Image Button On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Txt_Caption
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Caption TextBox On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Txt_Caption(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='txtCaption']")); //Unique Id Of Caption TextBox On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_CaptionOK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Caption Button On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Btn_CaptionOK(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='button' and @onclick='Save();']")); //Unique Id Of OK Caption Button On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Chk_UpdateUX
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Update UX CheckBox On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Chk_UpdateUX(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='chkUpdateUXView']")); //Unique Id Of Update UX CheckBox On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_SavePageChanges
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On Editor Page On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Btn_SavePageChanges(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='button' and @value='Save']")); //Unique Id Of Save Button On Editor Page On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PowerView_Btn_SavePowerView
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On PowerView Editor Page On RMA Application Power View Editor Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-03-06-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PowerView_Btn_SavePowerView(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@class='button' and @value='Save']")); //Unique Id Of Save Button On PowerView Editor Page On RMA Application PowerView Editor Page Is Fetched
		return Element;	
	}
}
