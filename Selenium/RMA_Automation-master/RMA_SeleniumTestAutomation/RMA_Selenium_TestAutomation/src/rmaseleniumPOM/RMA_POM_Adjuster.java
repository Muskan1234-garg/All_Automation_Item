package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_POM_Adjuster {

	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Adjuster Last Name On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-22-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Txt_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("adjlastname")); //Unique Id  Of  Adjuster Last Name On RMA Application Bank Account Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Button On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-22-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Btn_AddNew(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmdKeep4")); //Unique Id  Of AddNew Button On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Btn_RiskMasterLogin
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RiskMasterLogin button On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-22-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Btn_RiskMasterLogin(WebDriver driver)
	{
		Element = driver.findElement(By.id("adjrmsysuser_rmsyslookupbtn")); //Unique Id  Of RiskMasterLogin Button On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Tbl_SystemUsers
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SystemUsers Table On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-22-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Tbl_SystemUsers(WebDriver driver)
	{
		Element = driver.findElement(By.id("gvUserList")); //Unique Id  Of SystemUsers Table On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Btn_SystemUsers_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok on SystemUsers Table On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-22-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Btn_SystemUsers_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOkResrc")); //Unique Id  Of Ok on SystemUsers Table On RMA Application Bank Account Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Img_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-12-22-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("save")); //Unique Id  Of Save On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Lst_UserType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserType List Box On System Users Window On Adjuster Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-08-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Lst_UserType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstUserGroups")); //Unique Id Of UserType List Box On System Users Window On Adjuster Creation Page On Is Fetched
		return Element;
	}
	
//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Txt_SysUsersFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FirstName Text Box On System Users Window On Adjuster Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-08-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Txt_SysUsersFirstName(WebDriver driver)
	{
		Element = driver.findElement(By.id("firstname")); //Unique Id Of FirstName Text Box On System Users Window On Adjuster Creation Page On Is Fetched
		return Element;
	}
	
	
	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Btn_AdjSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Search Button On Adjuster Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-28-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Btn_AdjSearch(WebDriver driver)
	{
		Element = driver.findElement(By.id("adjlastnamebtn")); //Unique Id Of Last Name Search Button On Adjuster Creation Page On Is Fetched
			return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Btn_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Button On RMA Application Bank Account Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-29-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Adjuster_Btn_Edit(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmdEdit2")); //Unique Id  Of Edit Button On RMA Application Bank Account Page Is Fetched
		return Element;
	}
	
	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Lnk_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Link On RMA Application Claim's Adjuster Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Adjuster_Lnk_Supplementals(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSsuppgroup")); //Unique Id Of Supplemental Link On RMA Application Claim's Adjuster Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Adjuster_Lnk_ClaimAdjusterInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Adjuster Information Link On RMA Application Claim's Adjuster Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-18-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Adjuster_Lnk_ClaimAdjusterInfo(WebDriver driver)
	{
		Element = driver.findElement(By.id("LINKTABSadjuster")); //Unique Id Of Claim Adjuster Information Link On RMA Application Claim's Adjuster Page Is Fetched
		return Element;
	}
}
