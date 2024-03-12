package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_FinancialReserves {
	public static WebElement Element = null;

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Txt_ReserveAmount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Amount TextBox On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_ReserveCreation_Txt_ReserveAmount(WebDriver driver)
	{
		Element = driver.findElement(By.id("txtAmount")); //Unique Id  Of Reserve Amount TextBox On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Btn_Modify
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Modify Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_ReserveCreation_Btn_Modify(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnModify")); //Unique Id  Of Modify Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_Status
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveStatus DropDown On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lst_Status (WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='cmbStatusAdd']")); //Unique Id  Of Reserve Status DropDown On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_AddPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Payment Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_FinReserves_Btn_AddPayment(WebDriver driver)
	{
		Element = driver.findElement(By.id("MakePayment")); //Unique Id  Of Add Payment Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Payment_Txt_ControlNumber
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Control Number TextBox On RMA Application Payments Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-21-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Payment_Txt_ControlNumber(WebDriver driver)
	{
		Element = driver.findElement(By.id("ctlnumber")); //Unique Id  Of Control Number TextBox  On RMA Application Payments Page Is Fetched
		return Element;

	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Lnk_M_Medical
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Medical Link On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_FinReserves_Lnk_M_Medical(WebDriver driver)
	{
		Element = driver.findElement(By.linkText("M Medical")); //Unique Id  Of Medical Link On RMA Application Financial Reserves Page
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Lst_TransactionType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which TransactionType DropDown On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Lst_TransactionType (WebDriver driver)
	{
		Element = driver.findElement(By.id("TransTypeCode_codelookup")); //Unique Id  Of TransactionType DropDown On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_Amount
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Amount TextBox On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_Amount(WebDriver driver)
	{
		Element = driver.findElement(By.id("Amount")); //Unique Id  Of Amount TextBox On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RMAApp_FundsSplitDetails_Btn_OK
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which OK Button On RMA Application FundsSplitDetails Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Btn_OK(WebDriver driver)
	{
		Element = driver.findElement(By.id("btnOk")); //Unique Id  Of OK Button On RMA Application FundsSplitDetails Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			:RRMAApp_Payment_Btn_Save
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Save Button On RMA Application FinancialReserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-26-2015                                 
	// ============================================================================================
	public static WebElement RMAApp_Payment_Btn_Save(WebDriver driver)
	{
		Element = driver.findElement(By.id("save")); //Unique Id  Of Save Button On RMA Application FinancialReserves Page Is Fetched
		return Element;	
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_Reserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Table On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-11-03-2015                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_Reserve(WebDriver driver)
	{
		Element = driver.findElement(By.id("grdReserve")); //Unique Id  Of Reserve Table On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}


	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Lnk_L_Litigation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Litigation Link On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Lnk_L_Litigation(WebDriver driver)
	{
		Element = driver.findElement(By.linkText("L Litigation")); //Unique Id  Of Litigation Link On RMA Application Financial Reserves Page
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Lnk_I_Indemnity
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Indemnity Link On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Lnk_I_Indemnity(WebDriver driver)
	{
		Element = driver.findElement(By.linkText("I Indemnity")); //Unique Id  Of Indemnity Link On RMA Application Financial Reserves Page
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Lnk_E_Expense
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Expense Link On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Lnk_E_Expense(WebDriver driver)
	{
		Element = driver.findElement(By.linkText("E Expense")); //Unique Id  Of Expense Link On RMA Application Financial Reserves Page
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Lnk_RC_REC_Recovery
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Recovery Link On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Lnk_RC_REC_Recovery(WebDriver driver)
	{
		Element = driver.findElement(By.linkText("RC REC Recovery")); //Unique Id Of Recovery Link On RMA Application Financial Reserves Page
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Lnk_BI_Bodily_Injury
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Recovery Link On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-10-25-2015                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Lnk_BI_Bodily_Injury(WebDriver driver)
	{
		Element = driver.findElement(By.linkText("BI Bodily Injury")); //Unique Id Of Recovery Link On RMA Application Financial Reserves Page
		return Element;
	}

	//===========================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Img_AddNewRsv
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add New Reserve Image On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-07-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Img_AddNewRsv(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddReserve")); //Unique Id Of Add New Reserve Image On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lst_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type List Box On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - KumudNaithani-06-07-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lst_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbReserveType")); //Unique Id Of Reserve Type List Box On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGrid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserves NG Grid Table On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, Col Of The Type Integer Signifying The Column Of NG Grid To Which The WebElement Refers To, Tag-Name Of The Type String Referring To The Tag Name Of The Web Element	 
	//Revision				: 0.0 - KumudNaithani-06-10-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGrid(WebDriver driver, int col, String tagname)
	{
		Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']/div/div[2]/div/div[1]/div["+col+"]/div[2]/div/"+tagname)); //Unique Id Of Reserves NG Grid Table On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGridHeader
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, Col Of The Type Integer Signifying The Column Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - KumudNaithani-06-10-2016                                 
	//============================================================================================
	//Note : This POM is based on index value on ReserveGrid. You can use another POM RMAApp_ReserveCreation_Tbl_ReserveNGGrid POM For Column Heading Name instead of index.
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGridHeader(WebDriver driver, int col)
	{
		Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']/div/div[1]/div[2]/div/div["+col+"]/div[2]/input")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, Col Of The Type Integer Signifying The Column Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - KumudNaithani-07-08-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGridColumnHeader(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']/div/div[1]/div[3]/div[1]/div")); //Unique Id Of Column Header of Reserves NG Grid Table  On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGridSortClmNames
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, Col Of The Type Integer Signifying The Column Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - KumudNaithani-07-08-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGridSortClmNames(WebDriver driver, int col)
	{
		Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']/div/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li["+col+"]/div[1]/label/input")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_AddPayment
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Add Collection Image On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-07-14-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Img_AddCollection(WebDriver driver)
	{
		Element = driver.findElement(By.id("AddCollection")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Img_EditReserve
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Reserve Image On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ImteyazAhmad-09-14-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Img_EditReserve(WebDriver driver)
	{
		Element = driver.findElement(By.id("EditReserve")); 
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves__Txt_Claimant
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant TextBox On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves__Txt_Claimant(WebDriver driver)
	{
		Element = driver.findElement(By.id("clm_lastname")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_Claimant
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Claimant Button On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Btn_Claimant(WebDriver driver)
	{
		Element = driver.findElement(By.id("clm_lastnamebtn")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_List_PolicyName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Name From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_List_PolicyName(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbPolicy")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_List_Unit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                    
	//============================================================================================
	public static WebElement RMAApp_FinReserves_List_Unit(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbUnit")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_List_CoverageType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which CoverageType From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_FinReserves_List_CoverageType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbCoverageType")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_List_LossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Type From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_FinReserves_List_LossType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbCoverageLossType")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_List_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_FinReserves_List_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("cmbReserveType")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Text_DateEntered
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DateEntered Text On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Text_DateEntered(WebDriver driver)
	{
		Element = driver.findElement(By.id("dateentered")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, ColName Of The Type String Signifying The Column Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGridCheck_UncheckClmNames(WebDriver driver, String colName)
	{
		Element = driver.findElement(By.xpath(".//*[(text()='"+colName+"')]/input[@type='checkbox']")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which FilterBox Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, FilterBoxName Of The Type String Signifying The FilterBox Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGrid_FilterTextBox(WebDriver driver, String FilterBoxName)
	{
		Element = driver.findElement(By.xpath(".//*[text()='"+FilterBoxName+"']/following::*[@placeholder='Filter...'][1]")); //Unique Id Of Column Names In Column Selection List of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGrid
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Header of Reserves NG Grid Table First Row Value of The Table On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, colHeadingName Of The Type String Signifying The ColumnHeading and ColVal Of The Type String Signifying The Column Value Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGrid(WebDriver driver, String colHeadingName)
	{
		String ClassOfColNos=driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[2]/div[1]/*[text()='"+colHeadingName+"']")).getAttribute("class"); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		String ColNos[]=ClassOfColNos.split("colt");
		String ColNo=ColNos[1];	
		Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[1]/div[1]//*[@class='ngCellText ng-scope col"+ColNo+" colt"+ColNo+"']")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Lst_PolicyName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Policy Name On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Lst_PolicyName(WebDriver driver)
	{
		Element = driver.findElement(By.id("Policy")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Lst_Unit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Unit On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Lst_Unit(WebDriver driver)
	{
		Element = driver.findElement(By.id("Unit")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_Coverage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Coverage Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_Coverage(WebDriver driver)
	{
		Element = driver.findElement(By.id("Coverage_codelookup")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_LossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Loss Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_LossType(WebDriver driver)
	{
		Element = driver.findElement(By.id("LossType_codelookup")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_ReserveType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reserve Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_ReserveType(WebDriver driver)
	{
		Element = driver.findElement(By.id("ReserveTypeCode_codelookup")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver, colHeadingName Of The Type String Signifying The ColumnHeading Of NG Grid To Which The WebElement Refers To		 
	//Revision				: 0.0 - RenuVerma-09-20-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Tbl_ReserveNGGridClmValue(WebDriver driver, String colHeadingName)
	{
		String ClassOfColNos=driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[2]/div[1]/*[text()='"+colHeadingName+"']")).getAttribute("class"); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		String ColNos[]=ClassOfColNos.split("colt");
		String ColNo=ColNos[1];	
		Element = driver.findElement(By.xpath(".//*[@id='gridReserveListing']//div[2]/*[@class='ngCellText ng-scope col"+ColNo+" colt"+ColNo+"']")); //Unique Id Of Header of Reserves NG Grid Table (Containing Search Text Boxes) On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Lbl_HeaderCaption
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Label Header of Reserves (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	 
	//Revision				: 0.0 - RenuVerma-09-28-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Lbl_HeaderCaption(WebDriver driver)
	{
		Element=driver.findElement(By.id("lblcaption"));

		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_List_DisabilityCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Category of Reserves (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	 
	//Revision				: 0.0 - RenuVerma-09-28-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_List_DisabilityCategory(WebDriver driver)
	{
		Element=driver.findElement(By.id("cmbdisablitycat"));

		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_ReserveCreation_Txt_DisabilityLossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Loss Type (Containing Search Text Boxes) On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver	 
	//Revision				: 0.0 - RenuVerma-09-28-2016                                 
	//============================================================================================
	public static WebElement RMAApp_ReserveCreation_Txt_DisabilityLossType(WebDriver driver)
	{
		Element=driver.findElement(By.id("disabilitytype_codelookup"));

		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_DisabilityLossType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Loss Type On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-09-28-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_DisabilityLossType(WebDriver driver)
	{
		Element = driver.findElement(By.id("DisabilityLossType_codelookup")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FundsSplitDetails_Txt_DisabilityCategory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Disability Category On RMA Application Financial Reserves-->Funds Split Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver
	//Revision				: 0.0 - RenuVerma-09-28-2016                                 
	//============================================================================================
	public static WebElement RMAApp_FundsSplitDetails_Txt_DisabilityCategory(WebDriver driver)
	{
		Element = driver.findElement(By.id("DisabilityCat_codelookup")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_Btn_FinancialDetailHistory
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Financial Detail Historyt Button On RMA Application Financial Reserves Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-01-09-2017                                 
	//============================================================================================
	public static WebElement RMAApp_FinReserves_Btn_FinancialDetailHistory(WebDriver driver)
	{
		Element = driver.findElement(By.id("FinancialDetailHistory")); //Unique Id  Of Financial Detail History Button On RMA Application Financial Reserves Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_FinReserves_List_ReserveTypeOption
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which ReserveType From List On RMA Application Financial Reserves Add Reserve Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-16-2016                                   
	//============================================================================================
	public static WebElement RMAApp_FinReserves_List_ReserveTypeOption(WebDriver driver)
	{
		Element = driver.findElement(By.xpath(".//*[@id='cmbReserveType']/option[2]")); 
		return Element;
	}

}

