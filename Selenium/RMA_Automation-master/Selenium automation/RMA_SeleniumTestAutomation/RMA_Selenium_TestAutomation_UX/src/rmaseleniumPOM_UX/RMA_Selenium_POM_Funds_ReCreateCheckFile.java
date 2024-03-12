package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Funds_ReCreateCheckFile {
	public static WebElement Element;

	//============================================================================================
	//FunctionName 			: RMAApp_ReCreateCheckFile_Lst_Bankaccount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Bank Account List On RMA Application Funds--->Re Create Check File Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ReCreateCheckFile_Lst_Bankaccount(WebDriver driver)
	{
		Element = driver.findElement(By.id("bankaccountprint")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReCreateCheckFile_Txt_CheckBatch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Batch text box On RMA Application Funds--->Re Create Check File Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ReCreateCheckFile_Txt_CheckBatch(WebDriver driver)
	{
		Element = driver.findElement(By.id("checkbatchpre")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReCreateCheckFile_Btn_Reprint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reprint Button On RMA Application Funds--->Re Create Check File Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ReCreateCheckFile_Btn_Reprint(WebDriver driver)
	{
		Element = driver.findElement(By.id("printbatch")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReCreateCheckFileMsg_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button On RMA Application Funds--->Re Create Check File Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ReCreateCheckFileMsg_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOk")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReCreateCheckFileMsg_Txt_Msg
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button On RMA Application Funds--->Re Create Check File Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-09-06-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_ReCreateCheckFileMsg_Txt_Msg(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='frmData']/table/tbody/tr[3]/td")); 
		return Element;
	}
}
