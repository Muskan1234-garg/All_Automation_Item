package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_Home {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Frm_MenuOptionFrame
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of DefaultFrame (containing menu options) On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_DefaultView_Frm_MenuOptionFrame(WebDriver driver)
	{
		Element = driver.findElement(By.id("cphMainBody_uwtPortal_frame0")); //Unique Id  Of DefaultFrame (containing menu options) On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Mnu_Options
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Menu Option On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	//===========================================================================================
	public static WebElement RMAApp_DefaultView_Mnu_Options(WebDriver driver, int x, int y)
	{
		Element = driver.findElement(By.xpath(".//*[@id='MDIMenu_"+x+"_"+y+"']"+"/tbody/tr/td[2]/nobr")); //Unique Id  Of SubMenu Options On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_FrmEventCreation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Event Creation Frame On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_DefaultView_FrmEventCreation(WebDriver driver)
	{
		Element = driver.findElement(By.id("Document-1eventEventEvent (New)FalseFalse")); //Unique Id  Of Event Creation Frame On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Mnu_GeneralClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Document Menu Option On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_DefaultView_Mnu_Options(WebDriver driver, int x)
	{
		Element = driver.findElement(By.xpath(".//*[@id='MDIMenu_"+x+"']/tbody/tr/td[2]/nobr")); //Unique Id  Of Menu Options On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Mnu_Options
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Menu Options (Third Sub Menu Option) On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Mnu_Options(WebDriver driver, int x, int y, int z)
	{
		Element = driver.findElement(By.xpath(".//*[@id='MDIMenu_"+x+"_"+y+"_"+z+"']"+"/tbody/tr/td[2]/nobr")); //Unique Id Of Menu Options (Third Sub Menu Option) On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Frm_GeneralClaim
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which General Claim Frame On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_DefaultView_Frm_GeneralClaim(WebDriver driver)
	{
		Element = driver.findElement(By.id("Document-2-1claimgcGeneral ClaimGeneral Claim (New)FalseFalse")); //Unique Id  Of General Claim Frame On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Frm_LineOfBusinessParameterSetUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Line Of Business Parameter SetUp Frame On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-19-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_DefaultView_Frm_LineOfBusinessParameterSetUp(WebDriver driver)
	{
		Element = driver.findElement(By.id("UtilitieszLOBParametersLOBParametersLine Of Business Parameter SetupUI/Utilities/Manager/Line Of Business Parameter SetupFalseFalse")); //Unique Id  Of Line Of Business Parameter SetUp Frame On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Lnk_LogOut
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which LogOut Link On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-20-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_DefaultView_Lnk_LogOut(WebDriver driver)
	{
		Element = driver.findElement(By.id("cphMainBody_Loginstatus1")); //Unique Id Of LogOut Link On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Img_GCExpander
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which GC Expander On Left Hand Navigation Tree Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Img_GCExpander(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='navTree']/table[6]/tbody/tr[2]/td[3]/a/img")); // Unique Id Of Expander On Left Hand Navigation Tree Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_FinancialReserves
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Financial/Reserves Link On Left Hand Navigation Tree Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-24-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_FinancialReserves(WebDriver driver)
	{
		//Element = driver.findElement(By.xpath(".//*[@id='navTreet10']/span")); // Unique Id Of Financial/ Reserves Link On Left Hand Navigation Tree Is Fetched
		Element = driver.findElement(By.linkText("Financials/Reserves"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Frm_Address
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Maintenance-->Address Frame On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Frm_Maint_Address(WebDriver driver)
	{
		Element = driver.findElement(By.id("MaintenancezAddressAddressAddressUI/FDM/?recordID=(NODERECORDID)AddressFalseFalse")); //Unique Id  Of Maintenance-->Address Frame On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			:RMAApp_DefaultView_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Button On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Btn_Close(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@uib-tooltip='Close']")); //Unique Id Of Close Button On RMA Application Default View Page Is Fetched
		
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Err_StaticErrorText
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generic Static Error Message On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-16-2015         
	//Note						:0.1- RenuVerma-02-20-2017 Another POM RMAApp_ErrorMessage_Heading Can Used as This is General For All Screen Error Message
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Err_StaticErrorText(WebDriver driver)
	{
		WebElement ErrElement = null;
		try {
			ErrElement = driver.findElement(By.xpath(".//*[@id='lblError']/font")); //Unique Id Of Generic Static Error Message On RMA Application Is Fetched	
		} catch (Exception|Error e) {	
		}
		return ErrElement;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_TestNGGridLinkIterator
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TestNG Grid Iterator On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-12-08-2015                                 
	//============================================================================================
	public static WebElement RMAApp_TestNGGridLinkIterator(WebDriver driver,int y, int x, String tagname, String idvalue)
	{
		Element = driver.findElement(By.xpath(".//*[@id='"+idvalue+"']div/div[2]/div/div["+y+"]/div["+x+"]/div[2]/div/"+tagname)); //Unique Id Of Address Grid Link Iterator On RMA Application's Maintenance-->Address-->AddressSearch Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_Adjuster
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Adjustor Link On Left Hand Navigation Tree Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-24-2015                                 
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_Adjuster(WebDriver driver)
	{
		Element = driver.findElement(By.partialLinkText("Adjuster")); // Unique Id Of Adjustor Link On Left Hand Navigation Tree Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_AdjustorAddnew
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Link For Adjustor On Left Hand Navigation Tree On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-01-08-2016                                 
	// ============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_AdjustorAddNew(WebDriver driver)
	{
		Element = driver.findElement(By.xpath("//div[@id='Add New ']/span")); //Unique Id  Of Add New Link For Adjustor On Left Hand Navigation Tree On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_LoginUserName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Login User Name Link On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-01-11-2016                               
	//============================================================================================
	public static WebElement RMAApp_DefaultView_LoginUserName(WebDriver driver)
	{
		Element = driver.findElement(By.id("cphMainBody_LoginName1")); //Unique Id  Of Login User Name Link On RMA Application Default View Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Img_Reload
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reload Image On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-01-11-2016                                 
	//============================================================================================
	public static WebElement RMAApp_DefaultView_Img_Reload(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='reloadButton']/img"));//Unique Id  Of Reload Image On RMA Application Default View Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GenericErrMsg1
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Error Messages On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-01-11-2016      
	//Note						:0.1- RenuVerma-02-20-2017 Another POM RMAApp_ErrorMessage_Heading Can Used as This is General For All Screen Error Message
	//============================================================================================
	public static WebElement RMAApp_Err_GenericErrMsg1(WebDriver driver)
	{   WebElement ErrElement_01 = null;
	try{
		ErrElement_01 = driver.findElement(By.xpath(".//*[@id='ErrorControl1_lblError']/table/tbody/tr/td[2]/ul/li"));//Unique Id Of Error Messages On RMA Application Is Fetched
	} catch (Exception|Error e) {	
	}
	return ErrElement_01;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Err_GenericErrMsg2
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Static Error Text (Like: Following Error Occurred) On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-04-13-2015     
	//Note						:0.1- RenuVerma-02-20-2017 Another POM RMAApp_ErrorMessage_Heading Can Used as This is General For All Screen Error Message
	//============================================================================================
	public static WebElement RMAApp_Err_GenericErrMsg2(WebDriver driver)
	{
		WebElement ErrElement_02 = null;
		try {
			ErrElement_02 = driver.findElement(By.xpath(".//*[@id='ErrorControl1_lblError']/font")); //Unique Id Of Static Error Text (Like: Following Error Occurred) On RMA Application Default View Page Is Fetched	
		} catch (Exception|Error e) {	
		}
		return ErrElement_02;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_Delete
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Generic Delete Icon Image On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-02-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Delete(WebDriver driver)
	{
		Element = driver.findElement(By.id("delete")); //Unique Id Generic Delete Icon Image On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add New Link On Left Hand Navigation Tree On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-02-2016                                
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_AddNew(WebDriver driver)
	{

		Element = driver.findElement(By.xpath("//div[@id='Add New ']/span")); //Unique Id Of Add New Link On Left Hand Navigation Tree On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandTreeRightClick_Lnk_EntName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Names Such As Employee, General Claim Displayed On Right Clicking On Any Of The Displayed Links On Left Hand Navigation Tree On RMA Application Can Be Identified (Except Few Which Are Displayed Separately Like: Add New Entities Displayed For Person Involved) 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-02-2016                                
	//============================================================================================
	public static WebElement RMAApp_LeftHandTreeRightClick_Lnk_EntName(WebDriver driver, String Entity)
	{

		Element = driver.findElement(By.xpath("//div[@id='       "+Entity+"']/span")); //Unique Id Of Entity Names Such As Employee, General Claim Displayed On Right Clicking On Any Of The Displayed Links On Left Hand Navigation Tree On RMA Application Is Fetched (Except Few Which Are Displayed Separately Like: Add New Entities Displayed For Person Involved) 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandTreeRightClick_Lnk_NewEntName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Names Such As Employee, General Claim Displayed On Right Clicking On Any Of The Displayed Links On Left Hand Navigation Tree For New Entity Addition Such As On Person Involved Screen On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-10-2016                                
	//============================================================================================
	public static WebElement RMAApp_LeftHandTreeRightClick_Lnk_NewEntName(WebDriver driver, String Entity)
	{

		Element = driver.findElement(By.xpath("(//div[@id='       "+Entity+"']/span)[2]")); //Unique Id Of Entity Names Such As Employee, General Claim Displayed On Right Clicking On Any Of The Displayed Links On Left Hand Navigation Tree For New Entity Addition Such As On Person Involved Screen On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Maint_Generic_Save
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Save Image On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-02-2015  
	//ModifiedBy			: 0.1 - RenuVerma-09-15-2016 Save ID for Utility Pages
	//ModifiedBy			: 0.2 - RenuVerma-03-16-2017 Save ID for SMS UX Pages
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Save(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[contains(@id,'save') or contains(@id,'Save')]")); //Unique Id Of Save Image On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_EntName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Names Such As "Litigation (0)", Financial Reserves Displayed On Left Hand Navigation Tree On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-02-2016                                
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_EntName(WebDriver driver, String Entity)
	{

		Element = driver.findElement(By.xpath(".//*[text()='"+Entity+"']")); //Unique Id Of Entity Names Such As "Litigation (0)", Financial Reserves Displayed On Left Hand Navigation Tree On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Names Such As Such As Person Involved Displayed Under Added Litigation, Dated Text Displayed Under Added Adjustor (Sub-Links Of Added Entities) Displayed On Left Hand Navigation Tree On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-02-2016                                
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_LitPersonsInvolved(WebDriver driver, String Entity)
	{

		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/following::table[3]/tbody/tr[2]/td[7]/a")); //Unique Id Of Entity Names Such As Such As Person Involved Displayed Under Added Litigation, Dated Text Displayed Under Added Adjustor (Sub-Links Of Added Entities) Displayed On Left Hand Navigation Tree On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Img_ExpandCollapse
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Unique Id Of Expand/ Collapse Image Displayed On The Main Links/Entities Displayed On Left Hand Navigation Tree On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-02-2016                                
	//Modify By			: 0.1 - RenuVerma-01-31-2017 Modify As Previous POM is identifiy two image links on the page
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Img_ExpandCollapse(WebDriver driver, String Entity)
	{

		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/preceding::td[1]/a[1]")); //Unique Id Of Expand/ Collapse Image Displayed On The Main Links/Entities Displayed On Left Hand Navigation Tree On RMA Application Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_LastName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Unique Id Of LastName Text Box Displayed On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmd-05-03-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_LastName(WebDriver driver)
	{
		Element = driver.findElement(By.id("lastname")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_Attach
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Attach Image On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-06-23-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Attach(WebDriver driver)
	{
		Element = driver.findElement(By.id("attach")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_EntNamePartially
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Entity Names Such As "Litigation (0)", Financial Reserves Displayed On Left Hand Navigation Tree On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-08-2016                                
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_EntNamePartially(WebDriver driver, String Entity)
	{

		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]")); //Unique Id Of Entity Names Such As "Litigation (0)", Financial Reserves Displayed On Left Hand Navigation Tree On RMA Application Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ErrorMessage_Heading
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Error Heading Of RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-012-2016                                
	//============================================================================================
	public static WebElement RMAApp_ErrorMessage_Heading(WebDriver driver)
	{
		WebElement Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'Following Errors have been reported:')]"));
		} catch (Exception|Error e) {	
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_Claim_PI
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Claim Person Involved Of RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-07-013-2016  
	//Modified By           : 0.1 - KumudNaithani-07-014-2016 // Instead Of Full Name Of The Claim Variable Added Intials Only So That Only Captured Claim Number Is Sufficient To Indentiy The Claim
	//Modify By			: 0.1 - RenuVerma-01-31-2017 Modify As POM works now text based identification not based on table based which was getting failed in some condition
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_Claim_PI(WebDriver driver, String Entity)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+Entity+"')]/following::tbody//td[5]//*[contains(text(),'Persons Involved')]")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_Event_PI
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Person Involved Under Event Of RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-18-2016         
	//Modify By			: 0.1 - RenuVerma-03-08-2017 Modify As POM works now text based identification not based on table based which was getting failed in some condition
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_Event_PI(WebDriver driver, String ClaimNumber)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+ClaimNumber+"')]/following::tbody//td[4]//*[contains(text(),'Persons Involved')]")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_Diary
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Diary Image On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-26-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Diary(WebDriver driver)
	{
		Element = driver.findElement(By.id("diary")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_ViewRecordDiaries
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which View Record Diaries Image On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-26-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_ViewRecordDiaries(WebDriver driver)
	{
		Element = driver.findElement(By.id("filtereddiary")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneralClaim_Img_ExecSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Executive Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-12-21-2015                                 
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_ExecSummary(WebDriver driver)
	{
		Element = driver.findElement(By.id("esumm")); //Unique Id Of Executive Summary Image On RMA Application  Claim Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_GeneralClaim_Img_EnhancedNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EnhancedNotes Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-26-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_EnhancedNotes(WebDriver driver)
	{
		Element = driver.findElement(By.id("enhancednotes")); //Unique Id Of EnhancedNotes Image On RMA Application  Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GeneralClaim_Img_QuickSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Quick Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-26-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_QuickSummary(WebDriver driver)
	{
		Element = driver.findElement(By.id("eventexplorer")); //Unique Id Of Quick Summary Image On RMA ApplicationClaim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_Comments
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Comments Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-08-01-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Comments(WebDriver driver)
	{
		Element = driver.findElement(By.id("comments")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_ClaimCommentsSummary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claim Comments Summary Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				:  0.0 - ImteyazAhmad-08-01-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_ClaimCommentsSummary(WebDriver driver)
	{
		Element = driver.findElement(By.id("commentsummary")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_ToastMessage
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Toast Message On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-07-27-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_ToastMessage(WebDriver driver)
	{
		Element = driver.findElement(By.className("toast-message")); //Unique Id Of Toast Message On RMA Application Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandNavTree_Lnk_Policy_PI
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Person Involved Under Policy Of RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-12-2016                                
	//============================================================================================
	public static WebElement RMAApp_LeftHandNavTree_Lnk_Policy_PI(WebDriver driver, String PolicyNumber)
	{
		Element = driver.findElement(By.xpath(".//*[contains(text(),'"+PolicyNumber+"')]/following::table[1]/tbody[1]/tr[2]/td[7]/a")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_SendMail
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Send Mail Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-28-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_SendMail(WebDriver driver)
	{
		Element = driver.findElement(By.id("sendmail")); //Unique Id Of Send Mail Image On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_ISO
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which ISO Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-28-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_ISO(WebDriver driver)
	{
		Element = driver.findElement(By.id("iso")); //Unique Id Of ISO Image On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_ClaimActLog
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Claim Activity Log Image On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-08-28-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_ClaimActLog(WebDriver driver)
	{
		Element = driver.findElement(By.id("claimActLog")); //Unique Id Of Claim Activity Log Image On RMA Application Claim Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 		: RMAApp_RMAApp_PolicyTrakCov_Img_Lookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lookup Image On RMA Application  Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision					: 0.0 - RenuVerma-09-30-2016                                    
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_Lookup(WebDriver driver)
	{
		Element = driver.findElement(By.id("lookup"));
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_Generic_Table_Lookup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Lookup Table On RMA Application  Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision					: 0.0 - RenuVerma-10-03-2016                                    
	//============================================================================================
	public static WebElement RMAApp_Generic_Table_Lookup(WebDriver driver)
	{
		Element = driver.findElement(By.id("grdLookUp"));
		return Element;
	}

	//============================================================================================
	//FunctionName 		: RMAApp_Generic_Img_BackToParent
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Back To Parent Button On RMA Application  Can Be Identified
	//Input Parameter 	: Driver Variable Of The Type WebDriver		 
	//Revision					: 0.0 - RenuVerma-10-03-2016                                    
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_BackToParent(WebDriver driver)
	{
		Element = driver.findElement(By.id("BackToParent"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_NoRecordToShow
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis No Records In The Table Of RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-04-2016                                
	//============================================================================================
	public static WebElement RMAApp_Generic_NoRecordToShow(WebDriver driver)
	{
		WebElement Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[contains(text(),'There are no records to show.')]"));
		} catch (Exception|Error e) {	
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_LinkExistance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link Not Exist On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-10-07-2015                                 
	//============================================================================================
	public static WebElement RMAApp_Generic_RMAAppLink(WebDriver driver, String LinkText)
	{
		WebElement Element = null;
		try{
			Element = driver.findElement(By.linkText(LinkText));
		} catch (Exception|Error e) {	
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Lnk_LeftNavLink
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Left Navigation Tree Link On RMA Application Claim Window Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-04-2016                                    
	//============================================================================================
	public static WebElement RMAApp_Lnk_LeftNavLink(WebDriver driver, String LeftNavLink)
	{
		Element = driver.findElement(By.xpath(".//span[(@oncontextmenu and contains(text(),'"+LeftNavLink+"'))]"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_LeftHandTreeRightClick_LnkName
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Link Name On Right Clicking On Any Of The Displayed Links On Left Hand Navigation Tree On RMA Application Can Be Identified  
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-04-2016                                  
	//============================================================================================
	public static WebElement RMAApp_LeftHandTreeRightClick_LnkName(WebDriver driver, String Entity)
	{

		Element = driver.findElement(By.xpath(".//*[contains(@id,'"+Entity+"')]/span")); //Unique xpath Of Link Name Names On Right Clicking On Any Of The Displayed Links On Left Hand Navigation Tree On RMA Application Is Fetched 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QuickLookup_Generic_Btn_AddNew
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add New Button On Quick Lookup Result Page On RMA Application Is Fetched 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-17-2016                                
	//============================================================================================
	public static WebElement RMAApp_QuickLookup_Generic_Btn_AddNew(WebDriver driver)
	{
		WebElement Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[@value='Add New']")); 
		}catch (Exception|Error e) {	
		}
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_QuickLookup_Generic_Btn_Close
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Close Button On Quick Lookup Result Page On RMA Application Is Fetched 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-17-2016                            
	//============================================================================================
	public static WebElement RMAApp_QuickLookup_Generic_Btn_Close(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmdClose")); //Unique Id Of Close Button On Quick Lookup Result Page On RMA Application Is Fetched 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_QuickLookup_Generic_Btn_Edit
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Edit Button On Quick Lookup Result Page On RMA Application Is Fetched 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-17-2016                            
	//============================================================================================
	public static WebElement RMAApp_QuickLookup_Generic_Btn_Edit(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmdEdit2")); //Unique Id Of Edit Button On Quick Lookup Result Page On RMA Application Is Fetched 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Img_New
	//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which New Image On RMA Application Is Fetched 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-10-20-2016                            
	//============================================================================================
	public static WebElement RMAApp_Generic_Img_New(WebDriver driver)
	{
		Element = driver.findElement(By.id("new")); //Unique Id Of  Which New Image On RMA Application Is Fetched 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_TextExistance
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Link Not Exist On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-10-07-2015                                 
	//============================================================================================
	public static WebElement RMAApp_Generic_RMAAppText(WebDriver driver, String Text)
	{
		WebElement Element = null;
		try{
			Element = driver.findElement(By.xpath(".//*[text()='"+Text+"']"));
		} catch (Exception|Error e) {	
		}
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_FormTitle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Form Title On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 -RenuVerma-10-07-2015                                 
	//============================================================================================
	public static WebElement RMAApp_Generic_FormTitle(WebDriver driver)
	{
		Element = driver.findElement(By.id("formtitle"));
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Btn_Ok
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Ok Button On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-11-17-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Generic_Btn_Ok(WebDriver driver)
	{
		Element = driver.findElement(By.id(".//*[@value='Ok']")); //Unique xpath Of Ok Button On RMA Application Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Generic_Btn_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Button On RMA Application Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-11-17-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Generic_Btn_Cancel(WebDriver driver)
	{
		Element = driver.findElement(By.id(".//*[@value='Cancel']")); //Unique xpath Of Cancel Button On RMA Application Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Genereic_Txt_ClaimNum
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ClaimNumber TextBox On RMA Application Claim Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-05-11-2016                                 
	//============================================================================================
	public static WebElement RMAApp_Genereic_Txt_ClaimNum(WebDriver driver)
	{
		Element = driver.findElement(By.id("claimnumber")); //Unique Id  Of  ClaimNumber TextBox On RMA Application Claim Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Genereic_UX_ToastMessage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which  Toast  Message On RMA Application UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, Message	 
	//Revision				: 0.0 - RenuVerma-03-01-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Genereic_UX_ToastMessage(WebDriver driver,String Message)
	{
		WebElement Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='toast-message'][contains(text(),'"+Message+"')]")); //Unique className Of Toast Message On RMA Application UX Page Is Fetched
		} catch (Exception|Error e) {	
		}
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericInjury_Btn_PreExistCond
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Pre-Existing Condition Look Up Button On Generic Injury/Illness Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericInjury_Btn_PreExistCond(WebDriver driver)
	{
		Element = driver.findElement(By.id("preexistingcondition_codelookupbtn")); //Unique Property Of Pre-Existing Condition Look Up Button On Generic Injury/Illness Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericInjury_Txt_CauseOfInjury
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CauseOfInjury Text Box On Generic Injury/Illness Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericInjury_Txt_CauseOfInjury(WebDriver driver)
	{
		Element = driver.findElement(By.id("injurycausecode_codelookup")); //Unique Property Of CauseOfInjury Text Box On Generic Injury/Illness Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericInjury_Btn_CauseOfInjury
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CauseOfInjury Look Up Button On Generic Injury/Illness Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericInjury_Btn_CauseOfInjury(WebDriver driver)
	{
		Element = driver.findElement(By.id("injurycausecode_codelookupbtn")); //Unique Property Of CauseOfInjury Look Up Button On Generic Injury/Illness Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericCaseManagement_Txt_DisabilityType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Type Text Box On Generic Case Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericCaseManagement_Txt_DisabilityType(WebDriver driver)
	{
		Element = driver.findElement(By.id("empdisabilitycode2_codelookup")); //Unique Property Of Disability Type Text Box On Generic Case Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericCaseManagement_Txt_IllnessType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Illness Type Text Box On Generic Case Management System Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericCaseManagement_Txt_IllnessType(WebDriver driver)
	{
		Element = driver.findElement(By.id("illnesscode2_codelookup")); //Unique Property Of Illness Type Text Box On Generic Case Management System Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericCaseManager_Txt_CaseManager
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Case Manager Text Box On Generic Case Manager Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericCaseManager_Txt_CaseManager(WebDriver driver)
	{
		Element = driver.findElement(By.id("casemanagerlist")); //Unique Property Of Case Manager Type Text Box On Generic Case Manager Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericAccomadation_Txt_AccomScope
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accommodation Scope Text Box On Generic Accommodation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericAccomadation_Txt_AccomScope(WebDriver driver)
	{
		Element = driver.findElement(By.id("accommscope_codelookup")); //Unique Property Of Accommodation Scope Text Box On Generic Accommodation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericAccomadation_Btn_AccomStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Accommodation Status button On Generic Accommodation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericAccomadation_Btn_AccomStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("accommstatus_codelookupbtn")); //Unique Property Of Accommodation Status button On Generic Accommodation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericVocRehab_Txt_RehabStatus
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rehab Status Text Box On Generic Vocational Rehabilitation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericVocRehab_Txt_RehabStatus(WebDriver driver)
	{
		Element = driver.findElement(By.id("rehabstatus_codelookup")); //Unique Property Of Rehab Status Text Box On Generic Vocational Rehabilitation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericVocRehab_Txt_RehabType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rehab Type Text Box On Generic Vocational Rehabilitation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericVocRehab_Txt_RehabType(WebDriver driver)
	{
		Element = driver.findElement(By.id("rehabtype_codelookup")); //Unique Property Of Rehab Tye Text Box On Generic Vocational Rehabilitation Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_GenericVocRehab_Btn_RehabType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Rehab Type Search Button  On Generic Vocational Rehabilitation Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-03-16-2017                                 
	//============================================================================================
	public static WebElement RMAApp_GenericVocRehab_Btn_RehabType(WebDriver driver)
	{
		Element = driver.findElement(By.id("rehabtype_codelookupbtn")); //Unique Property Of Rehab Type Search Button On Generic Vocational Rehabilitation Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_Genereic_UX_ToastCloseButton
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Toast Error Close Button On RMA Application UX Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-04-17-2017                                 
	//============================================================================================
	public static WebElement RMAApp_Genereic_UX_ToastCloseButton(WebDriver driver)
	{
		WebElement Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[@class='toast-close-button ng-scope']")); //Unique className Of Toast Error Close Button Message On RMA Application UX Page Is Fetched	
		} catch (Exception|Error e) {	
		}
		return Element;	
	}
	//============================================================================================
	//FunctionName 			: RMAApp_DefaultView_Lbl_BreadcrumbName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which breadcrumbName On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,String breadcrumbName		 
	//Revision				: 0.0 - RenuVerma-06-07-2017                                 
	//============================================================================================ 
	public static WebElement RMAApp_DefaultView_Lbl_BreadcrumbName(WebDriver driver,String breadcrumbName)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='dvbreadcrumb']//*[contains(text(),'"+breadcrumbName+"')]"));//Unique X-Path Of breadcrumbName On RMA Application Default View Page Is Fetched
		return Element;
	} 

	//============================================================================================
	//FunctionName 			: RMAApp_SetUp_Tab_FundsSettings
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Funds Settings Tab On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,String breadcrumbName		 
	//Revision				: 0.0 - ShrutiShruti-03-26-2018                                 
	//============================================================================================ 
	public static WebElement RMAApp_SetUp_Tab_FundsSettings(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='LINKTABSFundSettings']"));//Unique X-Path Of Funds Settings Tab On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_SetUp_Chk_AddPI
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add PI In Payee Type CheckBox On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver,String breadcrumbName		 
	//Revision				: 0.0 - ShrutiShruti-03-26-2018                                
	//============================================================================================ 
	public static WebElement RMAApp_SetUp_Chk_AddPI(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='AddPersonInvolvedAsPayeeType']"));//Unique X-Path Of Add PI In Payee Type CheckBox On RMA Application Default View Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_GenericToast_ErrorMessage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Generic Static Error Message On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-02-26-2018                                 
	//============================================================================================ 
	public static WebElement RMAApp_GenericToast_ErrorMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='ng-binding toast-message']"));//Unique X-Path Of Of Generic Static Error Message On RMA Application Is Fetched	
		return Element;
	} 
}


