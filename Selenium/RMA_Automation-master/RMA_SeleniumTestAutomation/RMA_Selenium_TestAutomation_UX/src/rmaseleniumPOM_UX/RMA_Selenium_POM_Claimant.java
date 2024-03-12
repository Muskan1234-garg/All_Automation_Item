package rmaseleniumPOM_UX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Claimant {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp__Txt_LastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant Last Name On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Txt_LastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='lookup_clmntlastname']")); //Unique Id  Of  Claimant Last Name On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Txt_FirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant First Name On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Claimant_Txt_FirstName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("clmntfirstname")); //Unique Id  Of Claimant First Name On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Txt_AttorneyTitle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant Attorney Title On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-28-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Claimant_Txt_AttorneyTitle(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("clmtatttitle")); //Unique Id  Of Claimant Attorney Title On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Txt_SocSecNo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Soc. Sec. No Text Box On RMA Application Claim's Claimant Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NidhiJha-07-24-2017                                
	//============================================================================================
	public static WebElement RMAApp_Claimant_Txt_SocSecNo(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@id='clmnttaxid']")); //Unique X-path Of Soc. Sec. No Text Box On RMA Application Claim's Claimant Page Is Fetched
		} catch (Exception e) {
		}
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Txt_MiddleName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant Middle Name On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Claimant_Txt_MiddleName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("clmntmiddlename")); //Unique Id  Of Claimant Middle Name On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Tab_Supplementals
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Supplemental Link On RMA Application Claim's Claimant Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                
	//============================================================================================
	public static WebElement RMAApp_Claimant_Tab_Supplementals(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Supplementals')]/i")); //Unique X-path Of Supplemental Link On RMA Application Claim's Claimant Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Tab_ClaimantAttorney
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Claimant Information Link On RMA Application Claim's Claimant Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017 
	//ModifiedBy:			: 0.1 - KumudNaithani-06-12-2017
	//============================================================================================
	public static WebElement RMAApp_Claimant_Tab_ClaimantAttorney(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Claimant Attorney')]/i")); //Unique X-path Of Claim Claimant Information Link On RMA Application Claim's Claimant Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Tab_ClaimantInfo
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Claimant Information Link On RMA Application Claim's Claimant Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision:			: 0.1 - KumudNaithani-06-12-2017
	//============================================================================================
	public static WebElement RMAApp_Claimant_Tab_ClaimantInfo(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[contains(text(),'Claimant Info')]/i")); //Unique X-path Of Claim Claimant Information Link On RMA Application Claim's Claimant Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Txt_AttorneyLastName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Attorney Last Name TextBox On RMA Application Claim's Claimant Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017 
	//ModifiedBy:			: 0.1 - KumudNaithani-06-12-2017
	//============================================================================================
	public static WebElement RMAApp_Claimant_Txt_AttorneyLastName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lookup_clmtattlastname")); //Unique ID Of Attorney Last Name TextBox On RMA Application Claim's Claimant Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Lnk_ClaimRightHandTree
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Claimant Information Link On RMA Application Claim's Claimant Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                
	//============================================================================================
	public static WebElement RMAApp_Claimant_Lnk_ClaimRightHandTree(WebDriver driver, String ClmntName)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ClmntName+"')and @class='rightPanel-alink ng-binding']")); //Unique X-path Of Claim Claimant Information Link On RMA Application Claim's Claimant Page Is Fetched
		} catch (Exception e) {
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Btn_Country
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Country LookUp Button On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Claimant_Btn_Country(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_clmntcountrycode_openlookup")); //Unique Id  Of Country LookUp Button On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Chk_PrimaryClaimant
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Primary Claimant Check Box On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-02-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Claimant_Chk_PrimaryClaimant(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("clmntprimaryclmntflag")); //Unique Id  Of Primary Claimant Check Box On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

}
/*//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Btn_RiskMasterLogin
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which RiskMasterLogin button On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Btn_RiskMasterLogin(WebDriver driver)
	{
		Element = driver.findElement(By.id("adjrmsysuser_rmsyslookupbtn")); //Unique Id  Of RiskMasterLogin Button On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Tbl_SystemUsers
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which SystemUsers Table On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Tbl_SystemUsers(WebDriver driver)
	{
		Element = driver.findElement(By.id("gvUserList")); //Unique Id  Of SystemUsers Table On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Btn_SystemUsers_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok on SystemUsers Table On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-02-2017                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Btn_SystemUsers_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOkResrc")); //Unique Id  Of Ok on SystemUsers Table On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Lst_UserType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which UserType List Box On System Users Window On Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Lst_UserType(WebDriver driver)
	{
		Element = driver.findElement(By.id("lstUserGroups")); //Unique Id Of UserType List Box On System Users Window On Claimant Creation Page On Is Fetched
		return Element;
	}

//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Txt_SysUsersFirstName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FirstName Text Box On System Users Window On Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-08-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Txt_SysUsersFirstName(WebDriver driver)
	{
		Element = driver.findElement(By.id("firstname")); //Unique Id Of FirstName Text Box On System Users Window On Claimant Creation Page On Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Btn_AdjSearch
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Last Name Search Button On Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-28-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Btn_AdjSearch(WebDriver driver)
	{
		Element = driver.findElement(By.id("adjlastnamebtn")); //Unique Id Of Last Name Search Button On Claimant Creation Page On Is Fetched
			return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Claimant_Btn_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Button On RMA Application Claimant Creation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-06-29-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_Claimant_Btn_Edit(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmdEdit2")); //Unique Id  Of Edit Button On RMA Application Claimant Creation Page Is Fetched
		return Element;
	}


}*/
