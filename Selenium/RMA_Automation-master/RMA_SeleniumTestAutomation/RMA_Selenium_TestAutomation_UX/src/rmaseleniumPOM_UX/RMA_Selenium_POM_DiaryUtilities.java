package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_DiaryUtilities {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Tab_TransferDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Transfer Tab On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                      
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Tab_TransferDiary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lblTransferDiary")); //Unique Id Of Diary Transfer Tab On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Tab_PurgeDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Purge Tab On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Tab_PurgeDiary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lblPurgeDiary']")); //Unique Id Of Diary Purge Tab On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Lst_DiaryOwner
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Owner List On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Lst_DiaryOwner(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lstUsers']")); //Unique Id Of Diary Owner List On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Chk_PurgeOpenDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Purge Open Diary CheckBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Chk_PurgeOpenDiary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='chkPurgeOpen' and @type='checkbox']")); //Unique Id Of Purge Open Diary CheckBox  On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Chk_PurgeCloseDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Purge Close Diary CheckBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Chk_PurgeCloseDiary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='chkPurgeClose' and @type='checkbox']")); //Unique Id Of Purge Close Diary CheckBox On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Chk_TransferOpenDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transfer Open Diary CheckBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Chk_TransferOpenDiary(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='chkTransferOpen' and @type='checkbox']")); //Unique Id Of Transfer Open Diary CheckBox  On RMA Application Diary Utilities Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Chk_TransferCloseDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Transfer Close Diary CheckBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Chk_TransferCloseDiary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='chkTransferClose' and @type='checkbox']")); //Unique Id Of Transfer Close Diary CheckBox On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Lst_FromOwner
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Owner List On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Lst_FromOwner(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='lstFromUsers']")); //Unique Id Of From Owner List On RMA Application Diary Utilities Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Lst_FromOwner
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Owner List On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Lst_FromOwner(WebDriver driver,String Entity)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='lstFromUsers']//*[contains(text(),'"+Entity +"')]")); //Unique Id Of From Owner List On RMA Application Diary Utilities Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Lst_ToOwner
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Owner List On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Lst_ToOwner(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='lstToUsers']")); //Unique Id Of To Owner List On RMA Application Diary Utilities Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Btn_Transfer
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Transfer Button On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Btn_Transfer(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='btnGoTransfer']/i")); //Unique Id Of Transfer Button On RMA Application Diary Utilities Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Btn_Purge
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Purge Button On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Btn_Purge(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnGoPurge']")); //Unique Id Of Purge Button On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Txt_TransferFromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Transfer From Date TextBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Txt_TransferFromDate(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='txtTransferFromDate' and @type='text']")); //Unique Id Of Transfer From Date TextBox On RMA Application Diary Utilities Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Txt_TransferToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Transfer To Date TextBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Txt_TransferToDate(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='txtTransferToDate' and @type='text']")); //Unique Id Of Transfer To Date TextBox On RMA Application Diary Utilities Page Is Fetched
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Txt_PurgeFromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Purge From Date TextBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Txt_PurgeFromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtPurgeFromDate' and @type='text']")); //Unique Id Of Purge From Date TextBox On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiaryUtilities_Txt_PurgeToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Purge To Date TextBox On RMA Application Diary Utilities Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-25-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiaryUtilities_Txt_PurgeToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtPurgeToDate' and @type='text']")); //Unique Id Of Purge To Date TextBox On RMA Application Diary Utilities Page Is Fetched
		return Element;
	}


}
