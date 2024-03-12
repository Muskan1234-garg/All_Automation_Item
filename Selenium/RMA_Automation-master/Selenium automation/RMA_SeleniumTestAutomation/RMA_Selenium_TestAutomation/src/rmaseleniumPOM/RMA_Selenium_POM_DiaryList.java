package rmaseleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Default Package Import Completed

public class RMA_Selenium_POM_DiaryList {
 public static WebElement Element = null;
 
//============================================================================================
//FunctionName 			: RMAApp_Diaries_Frm_DiariesHome
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diaries Frame On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-05-2015                                 
//============================================================================================
public static WebElement RMAApp_Diaries_Frm_DiariesHome(WebDriver driver)
{
	Element = driver.findElement(By.id("DiarieszDiaryListDiaryListDiary ListUI/Diaries/Diary ListFalse")); //Unique Id Of Diaries Frame On RMA Application Default View Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Tbl_DiariesHome
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Diaries Table On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-01-05-2015                                 
//============================================================================================
public static WebElement RMAApp_Diaries_Tbl_DiariesHome(WebDriver driver)
{
	Element = driver.findElement(By.id("lstDiary_ctl00")); //Unique Id Of Diaries Table On RMA Application Default View Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Txt_TaskName
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Name TextBox on Diaries Table On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-01-14-2015                                 
//============================================================================================
public static WebElement RMAApp_Diaries_Txt_TaskName(WebDriver driver)
{
	Element = driver.findElement(By.xpath("(.//*[@class='ui-grid-filter-container ng-scope']/input)[2]")); //Unique Id Of  Task Name TextBox on Diaries Table On RMA Application Default View Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_Diaries_Btn_TaskNameFilter
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Task Name Filtet Button on Diaries Table On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-01-14-2015                                 
//============================================================================================
public static WebElement RMAApp_Diaries_Btn_TaskNameFilter(WebDriver driver)
{
	Element = driver.findElement(By.xpath("(.//*[@class='ui-grid-filter-container ng-scope']/span)[2]")); //Unique Id Of  Task Name Filter Button on Diaries Table On RMA Application Default View Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_Diaries_Lnk_EqualTo
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which EqualTo Link on Diaries Table On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - ImteyazAhmad-02-12-2016                                
//============================================================================================
public static WebElement RMAApp_Diaries_Lnk_EqualTo(WebDriver driver)
{
	Element = driver.findElement(By.partialLinkText("EqualTo"));
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Img_GridColumnSelector
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Column Selector Image On Diary UX Grid On RMA Application Default View Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-09-12-2016                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_GridColumnSelector(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='diaryListGrid']/div[2]/div[1]/div[1]/div[1]/i")); //Unique Id Of Column Selector Image On Diary UX Grid On RMA Application Default View Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Btn_ColToDisplay
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Columns To Be Displayed (Class Buttons) On Diary List UX Grid Can Be Identified/Selected
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-09-12-2016                                
//============================================================================================
public static WebElement RMAApp_Diaries_Btn_ColToDisplay(WebDriver driver, String colname)
{
	Element = driver.findElement(By.xpath(".//*[contains(@class, 'ui-grid-menu-item ng-binding')and normalize-space(text()) = '"+colname+"']"));//Unique Id Of Columns To Be Displayed (Class Buttons) On Diary List UX Grid Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Img_ColumnSelectorRestore
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Restore Image On Column Selector Of Diary UX Grid On Diary List UX Grid Can Be Identified/Selected
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-12-07-2016                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_ColumnSelectorRestore(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='diaryListGrid']/div[2]/div[1]/div[1]/div[2]/div/div/div/ul/div/span[4]"));//Unique Id Of Restore Image On Column Selector Of Diary UX Grid Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Create
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Create Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Create(WebDriver driver)
{
	Element = driver.findElement(By.id("btnCreate"));//Unique Id Of Create Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Edit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Edit Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Edit(WebDriver driver)
{
	Element = driver.findElement(By.id("btnEdit"));//Unique Id Of Edit Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Edit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Complete Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Complete(WebDriver driver)
{
	Element = driver.findElement(By.id("btnComplete"));//Unique Id Of Complete Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Edit
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Route Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Route(WebDriver driver)
{
	Element = driver.findElement(By.id("btnRoute"));//Unique Id Of Route Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Roll
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Roll Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Roll(WebDriver driver)
{
	Element = driver.findElement(By.id("btnRoll"));//Unique Id Of Roll Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Peek
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Peek Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Peek(WebDriver driver)
{
	Element = driver.findElement(By.id("btnPeek"));//Unique Id Of Peek Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_History
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which History Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_History(WebDriver driver)
{
	Element = driver.findElement(By.id("btnHistory"));//Unique Id Of History Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Void
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Void(WebDriver driver)
{
	Element = driver.findElement(By.id("btnVoid"));//Unique Id Of Void Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Print
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Print(WebDriver driver)
{
	Element = driver.findElement(By.id("btnPrint"));//Unique Id Of Print Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Img_Reload
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Reload Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Reload(WebDriver driver)
{
	Element = driver.findElement(By.id("A1"));//Unique Id Of Reload Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Img_DropDown
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which DropDown Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_DropDown(WebDriver driver)
{
	Element = driver.findElement(By.id("single-button"));//Unique Id Of DropDown Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Chk_ActiveDiaries
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Active Diaries Checkbox On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Chk_ActiveDiaries(WebDriver driver)
{
	Element = driver.findElement(By.id("chkActiveDiaries"));//Unique Id Of Active Diaries Checkbox On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Chk_ShowNotes
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show Notes Checkbox On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Chk_ShowNotes(WebDriver driver)
{
	Element = driver.findElement(By.id("chkShowNotes"));//Unique Id Of Show Notes Checkbox On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Chk_ShowRegarding
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Show Regarding CheckBox On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-20-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Chk_ShowRegarding(WebDriver driver)
{
	Element = driver.findElement(By.id("chkShowRegarding"));//Unique Id Of Show Regarding CheckBox On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Chk_RowSelector
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select the Row of Diary On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-23-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Chk_RowSelector(WebDriver driver,String DiaryName)
{
	String id=driver.findElement(By.xpath(".//*[contains(@title,'"+DiaryName+"')]/parent::div[1]/parent::div[1]")).getAttribute("id");// Find the ID of the Diary Name Cell
	String Rows[]=id.split("-");// Separate the id from "-" and store in the string
	String RowSelector=Rows[1];// Find the row no of from the id
	Element = driver.findElement(By.xpath(".//*[contains(@id,'-"+RowSelector+"-uiGrid-0005-cell')]/div/div/div"));//Unique xpath Of Select the Row of Diary On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DiariesComp_Txt_CompletedOn
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Completed On TextBox of Diary Task Completion On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-23-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesComp_Txt_CompletedOn(WebDriver driver)
{
	Element = driver.findElement(By.id("txtCompleteOn"));//Unique id Of Completed On TextBox of Diary Task Completion On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_DiariesComp_Txt_CompletionResponse
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Completion Response TextBox of Diary Task Completion On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-23-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesComp_Txt_CompletionResponse(WebDriver driver)
{
	Element = driver.findElement(By.id("txtCompleteRes"));//Unique id Of Completion Response TextBox of Diary Task Completion On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Img_Done
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Done Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-23-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Done(WebDriver driver)
{
	Element = driver.findElement(By.id("btnDone"));//Unique id Of Done Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Img_Cancel
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Cancel Image On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-23-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Cancel(WebDriver driver)
{
	Element = driver.findElement(By.id("btnCancel"));//Unique id Of Cancel Image On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_Diaries_Img_SelectUser
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select User Image of Route Diary On Diary List Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-24-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_SelectUser(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_selectUsr"));//Unique id Of Select User Image of Route Diary On Diary List Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesRoute_Img_Route
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Route Image On Route Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-27-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesRoute_Img_Route(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='pnlDefault']/*[@id='btnRoute']/i"));//Unique xpath Of Route Image On Route Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesRoll_Img_Roll
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Roll Image On Roll Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesRoll_Img_Roll(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='pnlDefault']/*[@id='btnRoll']/i"));//Unique xpath Of Roll Image On Roll Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesRoll_Txt_RollDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select Roll Date TextBox On Roll Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesRoll_Txt_RollDate(WebDriver driver)
{
	Element = driver.findElement(By.id("txtrollDate"));//Unique xpath Of Select Roll Date TextBox On Roll Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPrint_Rdb_OpenDiariesbyDueDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Open Diaries by Due Date Radio Option On Print  Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPrint_Rdb_OpenDiariesbyDueDate(WebDriver driver)
{
	Element = driver.findElement(By.id("rdoOverDue"));//Unique id Of Open Diaries by Due Date Radio Option On Print Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPrint_Txt_FromDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date TextBox On Print Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPrint_Txt_FromDate(WebDriver driver)
{
	Element = driver.findElement(By.id("txtFromDate"));//Unique id Of From Date TextBox On Print Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPrint_Txt_ToDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date TextBox On Print Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPrint_Txt_ToDate(WebDriver driver)
{
	Element = driver.findElement(By.id("txtToDate"));//Unique id Of To Date TextBox On Print Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPrint_Chk_FilterbyTaskDescription
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter by Task Description CheckBox On Print Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPrint_Chk_FilterbyTaskDescription(WebDriver driver)
{
	Element = driver.findElement(By.id("chkUseTaskDesc"));//Unique id Of Filter by Task Description CheckBox On Print Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPrint_Txt_TaskDescription
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Filter by Task Description CheckBox On Print Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPrint_Txt_TaskDescription(WebDriver driver)
{
	Element = driver.findElement(By.id("txtNotUseTaskDesc"));//Unique id Of Filter by Task Description CheckBox On Print Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPrint_Img_Print
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Print Image On Print Diary Page 
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-02-28-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPrint_Img_Print(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='page-head']/*[@id='btnPrint']/i"));//Unique xpath Of Print Image On Print Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesVoid_Img_Void
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void Image On Void Diary Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesVoid_Img_Void(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='divVoidDiaries']/*[@id='btnVoid']/i"));//Unique xpath Of Void Image On Void Diary Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesVoid_Chk_VoidSelectedDiary
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Void the Selected Diary CheckBox On Void Diary Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesVoid_Chk_VoidSelectedDiary(WebDriver driver)
{
	Element = driver.findElement(By.id("chkIsvoidByDate"));//Unique id Of Void the Selected Diary CheckBox On Void Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesVoid_Txt_FromDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which From Date TextBox On Void Diary Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesVoid_Txt_FromDate(WebDriver driver)
{
	Element = driver.findElement(By.id("txtVoidFromDate"));//Unique id Of From Date TextBox On Void Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesVoid_Txt_ToDate
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which To Date TextBox On Void Diary Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-01-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesVoid_Txt_ToDate(WebDriver driver)
{
	Element = driver.findElement(By.id("txtvoidToDate"));//Unique id Of To Date TextBox On Void Diary Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesUXGrid_Chk_SelectAll
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Select All Rows OF UX Grid CheckBox On Diary UX Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesUXGrid_Chk_SelectAll(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@ng-if='grid.options.enableSelectAll']"));//Unique Xpath Select All Rows OF UX Grid CheckBox On Diary UX Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_Diaries_Img_Delete
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Delete Image On Diary UX Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                                
//============================================================================================
public static WebElement RMAApp_Diaries_Img_Delete(WebDriver driver)
{
	Element = driver.findElement(By.id("btnDelete"));//Unique id Delete Image On Diary UX Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPeek_Img_AvailableUser
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Available User Button Of Peek Diary Popop On On Diary UX Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPeek_Btn_AvailableUser(WebDriver driver)
{
	Element = driver.findElement(By.id("btn_PeekDiary"));//Unique id Available User Button Of Peek Diary Popop On Diary UX Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: WebElement RMAApp_DiariesPeek_Btn_Peek
//Description  			: To Fetch Unique Property (Such As Id, Xpath, Name ) On The Basis Of Which Peek Image Of Peek Diary Popop On On Diary UX Page
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-03-03-2017                                
//============================================================================================
public static WebElement RMAApp_DiariesPeek_Btn_Peek(WebDriver driver)
{
	Element = driver.findElement(By.id("btnShowDiaries"));//Unique id Peek Image Of Peek Diary Popop On Diary UX Page Is Fetched
	return Element;
}
}
