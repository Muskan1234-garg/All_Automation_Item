package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_PolicyDownlod {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Lst_PolicySystem
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy System Dropdown List On RMA Application Policy Download Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-04-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownload_Lst_PolicySystem(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("sel12 "));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Txt_PolicyNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Number Text Box On RMA Application Policy Download Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownload_Txt_PolicyNumber(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='policyNumber']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Img_Next
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Image On RMA Application Policy Preview And Download Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownload_Img_Next(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Button1']/i"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Img_PolicyDownload
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Checkboxes On RMA Application Policy Download Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownload_Img_PolicyDownload(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@data-ng-click='download()']/i"));
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_PolDownloadModalDialog_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Next Checkboxes On RMA Application Policy Download Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolDownloadModalDialog_Btn_Ok(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnRoll']/i"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Txt_InterestList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Interest List Tab On RMA Application Policy Download Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-30-10-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownload_Txt_InterestList(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Interest List')]"));
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Txt_UnitList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit List Tab On RMA Application Policy Download Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-30-10-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownload_Txt_UnitList(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@id='exTab1']/ul/li[3]/a"));
		Element = driver.findElement(By.linkText("Unit List"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Chk_UnitList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit List Checkbox On RMA Application Unit List Tab Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-30-10-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownload_Tbl_UnitListTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Unit Number')]/ancestor::*[@class = 'table filterPadd']"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyModalDialog_Btn_Select
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Button On RMA Application Property Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyModalDialog_Btn_Select(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='btnselect']/i"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_PropertyModalDialog_Tbl_CoveragesRecordTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which First Record of Coverages On RMA Application Property Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PropertyModalDialog_Tbl_CoveragesRecordTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Product Line')]//ancestor::*[@class = 'table filterPadd']"));
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownloadModalDialog_Tbl_InterestListTable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Interest List On RMA Application Property Popup Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-08-08-2017                                  
	// ============================================================================================
	public static WebElement RMAApp_PolicyDownloadModalDialog_Tbl_InterestListTable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Interest List')]/ancestor::div[1]//*[@class = 'tab-content']//*[@id = 'tab_default_2']//*[@class = 'no-more-tables']/table"));
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_PolicyDownload_Weblink_PolicyOnCarrierGC
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of WebLink Of Policy On Carrier General Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-01-08-2018                                    
	//============================================================================================
	public static WebElement RMAApp_PolicyDownload_Weblink_PolicyOnCarrierGC(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='rList.rel']/div/div[2]/ul/li/a[contains(text(),'test10')]"));
		return Element;
	}

}


