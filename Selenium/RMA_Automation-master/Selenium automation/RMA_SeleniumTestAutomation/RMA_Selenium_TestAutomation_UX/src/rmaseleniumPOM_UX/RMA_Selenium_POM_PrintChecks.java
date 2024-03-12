package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_PrintChecks {
	public static WebElement Element;


	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_BankAccount
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Bank Account Text Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_BankAccount(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("ddlpreBankAcc")); //Unique Id Of Bank Account ListBox On Print Checks Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_PreCheckRegister_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image On Pre Check Register Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PreCheckRegister_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnPrePrint']/i")); //Unique Id Of Print Image On Pre Check Register Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Txt_CheckBatch
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Check Batch Text Box On Print Check Batch Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Txt_CheckBatch(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtprintCheckBatch")); //Unique Id Of Print Image On Print Check Batch Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image On Print Check Batch Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='aprintIcon']/i")); //Unique Id Of Print Image On Print Check Batch Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Txt_AlertMsg
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Alert Message On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Txt_AlertMsg(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='modal-body modaldataHeight ng-scope']/p"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Btn_PrintCheckOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Button On Alert Message On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Btn_PrintCheckOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnRoll']/i")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_PreCheckRegister_Img_ChecksAndEOBReportsOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Image On Checks And EOB Reports Of Print Check Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PreCheckRegister_Img_ChecksAndEOBReportsOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chcekBatchMsgInfoSaveIcon")); //Unique Id Of Print Image On Pre Check Register Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Lst_DistributionType
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Distribution Type List Box On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-04-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Lst_DistributionType(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("dllprepredistributionType")); //Unique Id Of Bank Account ListBox On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which From Date On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-04-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkpreFromdate")); //Unique Id Of From Date On Print Checks Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Chk_CombinedPayments
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Combined Payment On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-09-04-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Chk_CombinedPayments(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chk_CombinedPayment")); //Unique Id Of Combined Payment On Print Checks Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PrintChecks_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Print Image On Print Checks Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-16-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintChecks_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnPrePrint']")); //Unique Id Of Print Image On Print Checks Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Img_ChecksAndEOBReportsOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Image On Checks And EOB Reports Of Print Check Batch Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Img_ChecksAndEOBReportsOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("I6")); //Ok Image On Checks And EOB Reports Of Print Check Batch Tab Is Identified
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PrintCheckBatch_Img_PrintChecksOk
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Ok Image On Print Check Batch Tab Is Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - AnubhutiVyas-10-03-2017                                   
	//============================================================================================
	public static WebElement RMAApp_PrintCheckBatch_Img_PrintChecksOk(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("I1")); //Ok Image On Print Check Batch Tab Is Identified
		return Element;
	}
}
