package rmaseleniumPOM_UX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_DiaryList {
	public static WebElement Element;
	public static List<WebElement> Link;

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Frm_DiariesHome
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diaries Frame On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-27-2017                                      
	//============================================================================================
	public static WebElement RMAApp_Diaries_Frm_DiariesHome(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("DiarieszDiaryListDiaryListDiary ListUI/Diaries/Diary ListFalse")); //Unique Id Of Diaries Frame On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Tbl_DiariesHome
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diaries Table On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-08-27-2017                                      
	//============================================================================================
	public static WebElement RMAApp_Diaries_Tbl_DiariesHome(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("lstDiary_ctl00")); //Unique Id Of Diaries Table On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Txt_TaskName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Name TextBox on Diaries Table On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                      
	//============================================================================================
	public static WebElement RMAApp_Diaries_Txt_TaskName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("taskName")); //Unique Id Of  Task Name TextBox on Diaries Table On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Txt_DueDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Due Date TextBox on Diaries Table On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                      
	//============================================================================================
	public static WebElement RMAApp_Diaries_Txt_DueDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("duedt")); //Unique Id Of Due Date TextBox on Diaries Table On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Btn_TaskNameFilter
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Name Filtet Button on Diaries Table On RMA Application Default View Page Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                      
	//============================================================================================
	public static WebElement RMAApp_Diaries_Btn_TaskNameFilter(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath("(.//*[@class='ui-grid-filter-container ng-scope']/span)[2]")); //Unique Id Of  Task Name Filter Button on Diaries Table On RMA Application Default View Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Create
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Create(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnCreate"));//Unique Id Of Create Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Edit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnEdit"));//Unique Id Of Edit Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Complete Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Complete(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnComplete"));//Unique Id Of Complete Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Route Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Route(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='Route' or @id='btnRoute']/i"));//Unique Id Of Route Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Roll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Roll Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Roll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnRoll"));//Unique Id Of Roll Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Peek
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Peek Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Peek(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnPeek"));//Unique Id Of Peek Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_History
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which History Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_History(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnHistory"));//Unique Id Of History Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Void
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Void(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnVoid"));//Unique Id Of Void Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnPrint"));//Unique Id Of Print Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Reload
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reload Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Reload(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("A1"));//Unique Id Of Reload Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_DropDown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DropDown Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_DropDown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("split-button"));//Unique Id Of DropDown Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Chk_ActiveDiaries
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Active Diaries Checkbox On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Chk_ActiveDiaries(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkActiveDiaries"));//Unique Id Of Active Diaries Checkbox On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Chk_ShowNotes
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show Notes Checkbox On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Chk_ShowNotes(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkShowNotes"));//Unique Id Of Show Notes Checkbox On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Chk_ShowRegarding
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show Regarding CheckBox On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Chk_ShowRegarding(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkShowRegarding"));//Unique Id Of Show Regarding CheckBox On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Chk_RowSelector
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select the Row of Diary On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Chk_RowSelector(WebDriver driver,String DiaryName)
	{
		Element = null;
		String id=driver.findElement(By.xpath(".//*[contains(@title,'"+DiaryName+"')]/parent::div[1]/parent::div[1]")).getAttribute("id");// Find the ID of the Diary Name Cell
		String Rows[]=id.split("-");// Separate the id from "-" and store in the string (e.g 1504241865316-1-uiGrid-0005-cell)
		String RowSelector=Rows[1];// Find the row no from the id(e.g row no. 1 from the id 1504241865316-1-uiGrid-0005-cell)
		Element = driver.findElement(By.xpath(".//*[contains(@id,'-"+RowSelector+"-uiGrid-0005-cell')]//*[@ng-click='selectButtonClick(row, $event)']"));//Unique xpath Of Select the Row of Diary On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesComp_Txt_CompletedOn
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Completed On TextBox of Diary Task Completion On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesComp_Txt_CompletedOn(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtCompleteOn"));//Unique id Of Completed On TextBox of Diary Task Completion On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesComp_Txt_CompletionResponse
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Completion Response TextBox of Diary Task Completion On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesComp_Txt_CompletionResponse(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtCompleteRes"));//Unique id Of Completion Response TextBox of Diary Task Completion On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Done
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Done Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Done(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnDone"));//Unique id Of Done Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Cancel
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Cancel(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnCancel"));//Unique id Of Cancel Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_SelectUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select User Image of Route Diary On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                   
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_SelectUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_selectUsr"));//Unique id Of Select User Image of Route Diary On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesRoute_Img_Route
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Route Image On Route Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesRoute_Img_Route(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pnlDefault']/*[@id='btnRoute']/i"));//Unique xpath Of Route Image On Route Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesRoll_Img_Roll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Roll Image On Roll Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesRoll_Img_Roll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='pnlDefault']/*[@id='btnRoll']/i"));//Unique xpath Of Roll Image On Roll Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesRoll_Txt_RollDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Roll Date TextBox On Roll Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesRoll_Txt_RollDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='txtrollDate' and @placeholder='MM/dd/yyyy']"));//Unique xpath Of Select Roll Date TextBox On Roll Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Home
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Home Image On Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Home(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnHome"));//Unique xpath Of Home Image On Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPrint_Rdb_OpenDiariesbyDueDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Open Diaries by Due Date Radio Option On Print  Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPrint_Rdb_OpenDiariesbyDueDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("rdoOverDue"));//Unique id Of Open Diaries by Due Date Radio Option On Print Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPrint_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date TextBox On Print Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPrint_Txt_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtFromDate"));//Unique id Of From Date TextBox On Print Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPrint_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date TextBox On Print Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPrint_Txt_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtToDate"));//Unique id Of To Date TextBox On Print Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPrint_Chk_FilterbyTaskDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter by Task Description CheckBox On Print Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPrint_Chk_FilterbyTaskDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkUseTaskDesc"));//Unique id Of Filter by Task Description CheckBox On Print Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPrint_Txt_TaskDescription
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter by Task Description CheckBox On Print Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPrint_Txt_TaskDescription(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtNotUseTaskDesc"));//Unique id Of Filter by Task Description CheckBox On Print Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPrint_Img_Print
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Image On Print Diary Page 
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPrint_Img_Print(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='page-head']/*[@id='btnPrint']/i"));//Unique xpath Of Print Image On Print Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesVoid_Img_Void
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Image On Void Diary Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesVoid_Img_Void(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='divVoidDiaries']/*[@id='btnVoid']/i"));//Unique xpath Of Void Image On Void Diary Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_DiariesVoid_Chk_VoidSelectedDiary
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void the Selected Diary CheckBox On Void Diary Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesVoid_Chk_VoidSelectedDiary(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("chkIsvoidByDate"));//Unique id Of Void the Selected Diary CheckBox On Void Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesVoid_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date TextBox On Void Diary Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesVoid_Txt_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtVoidFromDate"));//Unique id Of From Date TextBox On Void Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesVoid_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date TextBox On Void Diary Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesVoid_Txt_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("txtvoidToDate"));//Unique id Of To Date TextBox On Void Diary Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesUXGrid_Chk_SelectAll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Rows OF UX Grid CheckBox On Diary UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesUXGrid_Chk_SelectAll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-if='grid.options.enableSelectAll']"));//Unique Xpath Select All Rows OF UX Grid CheckBox On Diary UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Delete
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Image On Diary UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_Delete(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnDelete"));//Unique id Delete Image On Diary UX Page Is Fetched
		return Element;
	}
	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPeek_Img_AvailableUser
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available User Button Of Peek Diary Popop On On Diary UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPeek_Btn_AvailableUser(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btn_PeekDiary"));//Unique id Available User Button Of Peek Diary Popop On Diary UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesPeek_Btn_Peek
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Peek Image Of Peek Diary Popop On On Diary UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesPeek_Btn_Peek(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnShowDiaries"));//Unique id Peek Image Of Peek Diary Popop On Diary UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Btn_PeekByUserGroup
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Peek By User Group Button Image On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Btn_PeekByUserGroup(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("divPeekByUserGroup"));//Unique id Peek By User Group Button Image On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SelectDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Date TextBox On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SelectDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@type='text' and @id='txtDate']"));//Unique id Select Date TextBox On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Tab_DiaryStyles
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Styles Tab On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Tab_DiaryStyles(WebDriver driver, String StyleType)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='btn-group']/button[contains(text(),'"+StyleType+"')]"));//Unique id Diary Styles Tab On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Btn_RadioPrintPopUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Radio Button On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Btn_RadioPrintPopUp(WebDriver driver, String RadioButton)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@type='radio']//ancestor::div[1]/label[contains(text(),'"+RadioButton+"')]//ancestor::div[1]/input"));//Unique id Radio Button On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SortFirstDropDown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sort First DropDown On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SortFirstDropDown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='sortFirst']"));//Unique id Sort First DropDown On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SortSecondDropDown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sort Second DropDown On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SortSecondDropDown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='sortSecond']"));//Unique id Sort Second DropDown On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SortThirdDropDown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sort Third DropDown On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SortThirdDropDown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@name='sortThird']"));//Unique id Sort Third DropDown On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SortFirstDropDown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sort Order First DropDown On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SortOrderFirstDropDown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("selectSortByFirstOrder"));//Unique id Sort Order First DropDown On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SortSecondDropDown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sort Order Second DropDown On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SortOrderSecondDropDown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("selSortBySecondOrder"));//Unique id Sort Order Second DropDown On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SortOrderThirdDropDown
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Sort Order Third DropDown On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SortOrderThirdDropDown(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("selSortByThirdOrder"));//Unique id Sort Order Third DropDown On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_FromDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date TextBox On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_FromDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@field='printVM.txtFromDate']//input"));//Unique id From Date TextBox On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_ToDate
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date TextBox On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_ToDate(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@field='printVM.txtToDate']//input"));//Unique id To Date TextBox On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SelectMonth
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Month TextBox On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SelectMonth(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='printVM.selMonth']"));//Unique id Select Month TextBox On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_SelectYear
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Year TextBox On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_SelectYear(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-model='printVM.selYear']"));//Unique id Select Year TextBox On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_CentreMonthHeadingOnStyles
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Center Heading For Calendar On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-20-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_CentreMonthHeadingOnStyles(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fc-center']/h2"));//Unique id Center Heading For Calendar On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_CentreDayHeadingOnStyles
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Center Heading For Calendar On Diary Calendar=>Print PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_CentreDayHeadingOnStyles(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fc-row fc-widget-header']//th"));//Unique id Center Heading For Calendar On Diary Calendar=>Print PopUp Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Btn_CancelPrint
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Print Button Image On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Btn_CancelPrint(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnCancel"));//Unique id Cancel Print Button Image On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Img_UserType
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which User Type Image On Diary PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Img_UserType(WebDriver driver)
	{
		Element = null;
		//Element = driver.findElement(By.xpath(".//*[@ng-repeat='lst in list']//img"));//Unique id User Type Image On Diary PopUp UX Page Is Fetched
		Element = driver.findElement(By.xpath(".//*[@ng-repeat='lst in list']//i"));
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Txt_TaskNameDiaryList
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Name On Diary PopUp UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Txt_TaskNameDiaryList(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@ng-repeat='lst in list']//a"));//Unique id Task Name On Diary PopUp UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Btn_CloseDiaryListPopUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Close Diary List PopUp Button On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Btn_CloseDiaryListPopUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("btnClose"));//Unique id Close Diary List PopUp On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Lbl_DateLabelOnPrintPopUp
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Date Label On Diary Print PopUp On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Lbl_DateLabelOnPrintPopUp(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='mdLink' and @align='left']//*[@class='ng-binding']"));//Unique id Date Label On Diary Print PopUp On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_LnkNumber_MoreOnStyle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Number Of More Link On Diary Style On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static int RMAApp_DiariesCalendar_LnkNumber_MoreOnStyle(WebDriver driver)
	{
		Link = null;
		Link = driver.findElements(By.xpath(".//*[@class='fc-more-cell']//a"));//Unique id Number Of More Link On Diary Style On Diary Calendar UX Page Is Fetched
		return Link.size();
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_LnkNumber_MoreOnStyle
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which More Link On Diary Style On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-21-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Lnk_MoreOnStyle(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='fc-more-cell']//a"));//Unique id More Link On Diary Style On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiariesCalendar_Frame_DiaryCreation
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which More Link On Diary Style On Diary Calendar UX Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - ShrutiShruti-05-27-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiariesCalendar_Frame_DiaryCreation(WebDriver driver)
	{
		Element = null;
		try {
			Element = driver.findElement(By.xpath(".//*[contains(@id,'externalapp')]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Unique id More Link On Diary Style On Diary Calendar UX Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiarySearch_Ddl_DiarySearchName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Search Name On Diary Search Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-23-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiarySearch_Ddl_DiarySearchName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@role='heading']//*[@role='combobox']"));//Unique id Of Diary Search Name On Diary Search Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiarySearch_Txt_DiaryTaskName
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diary Task Name On Diary Search Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-23-2019                                     
	//============================================================================================
	public static WebElement RMAApp_DiarySearch_Txt_DiaryTaskName(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='FLD60794' or @id='FLD70067']"));//Unique id Of Diary Task Name On Diary Search Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_DiarySearch_Btn_SubmitQuery
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Submit Query On Diary Search Screen On RMA Application Can Be Identified
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-05-16-2019                                  
	// ============================================================================================
	public static WebElement RMAApp_DiarySearch_Btn_SubmitQuery(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@id='submitquery']/i")); 
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Chk_NotRoutable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Not Routable CheckBox On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-15-2019                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Chk_NotRoutable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("notRoutable"));//Unique Id Of Not Routable CheckBox On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Chk_NotRollable
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Not Rollable CheckBox On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-15-2019                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Chk_NotRollable(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("notRollable"));//Unique Id Of Not Rollable CheckBox On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Txt_NotRoutableMessage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Not Rollable Toast Message On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-15-2019                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Txt_NotRoutableMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='toast-message'][contains(text(),"+"'Can't"+" route the selected diary as it is marked as not Routable.'"+")]"));//Unique Id Of Not Rollable CheckBox On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Txt_NotRollableMessage
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Not Rollable Toast Message On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - NikitaThani-07-15-2019                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Txt_NotRollableMessage(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.xpath(".//*[@class='toast-message'][contains(text(),"+"Can't"+" roll the selected diary as it is marked as Not Rollable."+")]"));//Unique Id Of Not Rollable CheckBox On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_Edit
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_SearchDiaryEdit(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Edit"));//Unique Id Of Edit Image On Diary List Page Is Fetched
		return Element;
	}

	//============================================================================================
	//FunctionName 			: RMAApp_Diaries_Img_SearchDiaryRoll
	//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Roll Image On Diary List Page
	//Input Parameter 		: Driver Variable Of The Type WebDriver		 
	//Revision				: 0.0 - RenuVerma-09-01-2017                                     
	//============================================================================================
	public static WebElement RMAApp_Diaries_Img_SearchDiaryRoll(WebDriver driver)
	{
		Element = null;
		Element = driver.findElement(By.id("Roll"));//Unique Id Of Roll Image On Diary List Page Is Fetched
		return Element;
	}

}
