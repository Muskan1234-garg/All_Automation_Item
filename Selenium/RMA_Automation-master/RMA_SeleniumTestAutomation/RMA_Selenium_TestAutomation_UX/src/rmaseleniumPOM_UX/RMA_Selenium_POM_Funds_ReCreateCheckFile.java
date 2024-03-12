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
		Element = driver.findElement(By.id("ddlprintBankAccount")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReCreateCheckFile_Txt_CheckBatch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Check Batch text box On RMA Application Funds--->Re Create Check File Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ReCreateCheckFile_Txt_CheckBatch(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtprintCheckBatch")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReCreateCheckFile_Btn_Reprint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reprint Button On RMA Application Funds--->Re Create Check File Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AbhishekRai-05-22-2018                                 
	// ============================================================================================
	public static WebElement RMAApp_ReCreateCheckFile_Btn_Reprint(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='aprintIcon']/i")); 
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
		Element = driver.findElement(By.xpath(".//*[@id='Div5']/i")); 
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
		Element = driver.findElement(By.xpath(".//*[@id='div1']/div[2]/div/div")); 
		return Element;
	}
}
