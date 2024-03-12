package rmaseleniumPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMA_Selenium_POM_Maintenance {
	public static WebElement Element = null;
	public static List<WebElement> ElementList = null;
//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name TextBox On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
// ============================================================================================
public static WebElement RMAApp_MaintEmp_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("lastname")); //Unique Id Of Claim Type TextBox On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Txt_SocSecNum
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which SocSecNum TextBox On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintEmp_Txt_SocSecNum(WebDriver driver)
{
	Element = driver.findElement(By.id("taxid")); //Unique Id Of SocSecNum TextBox On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Tab_Employee
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Tab On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintEmp_Tab_EmploymentInfo(WebDriver driver)
{
	Element = driver.findElement(By.id("LINKTABSemploymentinfo")); //Unique Id Of Employee Tab On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Tab_EmploymentInfo
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EmploymentInfo Tab On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintEmp_Tab_Employee(WebDriver driver)
{
	Element = driver.findElement(By.id("TABSemployee")); //Unique Id Of EmploymentInfo Tab On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Txt_Department
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Department Text Box On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintEmp_Txt_Department(WebDriver driver)
{
	Element = driver.findElement(By.id("deptassignedeid")); //Unique Id Of Department Text Box On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Txt_EmployeeNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Employee Number Text Box On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintEmp_Txt_EmployeeNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("employeenumber")); //Unique Id Of Employee Number Text Box On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Txt_TaxID
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Social Security Number Text Box On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintEmp_Txt_TaxID(WebDriver driver)
{
	Element = driver.findElement(By.id("taxid")); //Unique Id Of Social Security Number Text Box On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEmp_Frm_Employee
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Frame Of The Employee Screen Controls On RMA Application Maintenance-->Employee Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintEmp_Frm_Employee(WebDriver driver)
{
	Element = driver.findElement(By.id("Maintenance-1employeeEmployeeUI/FDM/?recordID=(NODERECORDID)EmployeeFalseFalse")); //Unique Id Of Frame Of The Employee Screen Controls On RMA Application Maintenance-->Employee Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintMedStaff_Txt_LstName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name Text Box On RMA Application Maintenance-->Medical Staff Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintMedStaff_Txt_LstName(WebDriver driver)
{
	Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name Text Box On RMA Application Maintenance-->Medical Staff Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintMedStaff_Frm_Medical
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Frame Of The Medical Staff Screen Controls On RMA Application Maintenance-->Medical Staff Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement  RMAApp_MaintMedStaff_Frm_Medical(WebDriver driver)
{
	Element = driver.findElement(By.id("Maintenance-2staffMedical StaffUI/FDM/?recordID=(NODERECORDID)Medical StaffFalseFalse")); //Unique Id Of Frame Of The Medical Staff Screen Controls On RMA Application Maintenance-->Medical Staff Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintMedStaff_Txt_StaffNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Staff Number Text Box On RMA Application Maintenance-->Medical Staff Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintMedStaff_Txt_StaffNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("medstaffnumber")); //Unique Id Of Staff Number Text Box On RMA Application Maintenance-->Medical Staff Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintDriver_Lst_DriverType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Driver Type List Box On RMA Application Maintenance-->Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintDiver_Lst_DriverType(WebDriver driver)
{
	Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Driver Type List Box On RMA Application Maintenance-->Medical Driver Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintDriver_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name Text Box On RMA Application Maintenance-->Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintDriver_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name Text Box On RMA Application Maintenance-->Driver Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintDriver_Frm_Driver
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Frame Of The Driver Screen Controls On RMA Application Maintenance-->Driver Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintDriver_Frm_Driver(WebDriver driver)
{
	Element = driver.findElement(By.id("Maintenance-3driverDriverUI/FDM/?recordID=(NODERECORDID)DriverFalseFalse")); //Unique Id Of Frame Of The Driver Screen Controls On RMA Application Maintenance-->Driver Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name Text Box On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintPatient_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("patlastname")); //Unique Id Of Last Name Text Box On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Btn_AddNew
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Add New Button On The Last Name Window On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015    
//Modified By		:0.0-RenuVerma-12-30-2015-- Modified as xpath
//============================================================================================
public static WebElement RMAApp_MaintPatient_Btn_AddNew(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@value='Add New']")); //Unique xpath Of Add New Button On The Last Name Window On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Frm_Patient
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Frame Of The Patient Screen Controls On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintPatient_Frm_Patient(WebDriver driver)
{
	Element = driver.findElement(By.id("Maintenance-5patientPatient TrackingUI/FDM/?recordID=(NODERECORDID)Patient TrackingFalseFalse")); //Unique Id Of Frame Of The Patient Screen Controls On RMA Application Maintenance-->Patient Tacking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name Text Box On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("lastname")); //Unique Id Of Last Name Text Box On RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_LastName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Physician Number Text Box On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_PhysicianNum(WebDriver driver)
{
	Element = driver.findElement(By.id("physiciannumber")); //Unique Id Of Physician Number Text Box On RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Frm_Physician
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Frame Of The Physician Screen Controls On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Frm_Physician(WebDriver driver)
{
	Element = driver.findElement(By.id("Maintenance-4physicianPhysicianUI/FDM/?recordID=(NODERECORDID)PhysicianFalseFalse")); //Unique Id Of Frame Of The Physician Screen Controls On RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPeople_Lst_PeopleType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of People List Box On RMA Application Maintenance-->People Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-09-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPeople_Lst_PeopleType(WebDriver driver)
{
	Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Type Of People List Box On RMA Application Maintenance-->People Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPeople_Lst_PeopleType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Name Text Box On RMA Application Maintenance-->People Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-09-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPeople_Txt_LastName(WebDriver driver)
{
	Element = driver.findElement(By.id("lastname")); //Unique Id Of Type Of Last Name Text Box On RMA Application Maintenance-->People Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintEnt_Lst_EntityType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Entity List Box On RMA Application Maintenance-->People Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-03-2016                                
//============================================================================================
public static WebElement RMAApp_MaintEnt_Lst_EntityType(WebDriver driver)
{
	Element = driver.findElement(By.id("entitytableid")); //Unique Id Of Type Of Entity List Box On RMA Application Maintenance-->Entity Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintCatastrophe_Lst_LossStartDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Loss Start Date Text Box On RMA Application Maintenance-->Catastrophe Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                
//============================================================================================
public static WebElement RMAApp_MaintCatastrophe_Lst_LossStartDate(WebDriver driver)
{
	Element = driver.findElement(By.id("lossstartdate")); //Unique Id Of Type Of Loss Start Date Text Box On RMA Application Maintenance-->Catastrophe Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintCatastrophe_Lst_CatType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Catastrophe Type Text Box On RMA Application Maintenance-->Catastrophe Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                
//============================================================================================
public static WebElement RMAApp_MaintCatastrophe_Lst_CatType(WebDriver driver)
{
	Element = driver.findElement(By.id("typeofcat_codelookup")); //Unique Id Of Type Of Catastrophe Type TextBox On RMA Application Maintenance-->Catastrophe Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintCatastrophe_Lst_CatNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type Of Catastrophe Number Text Box On RMA Application Maintenance-->Catastrophe Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-05-2016                                
//============================================================================================
public static WebElement RMAApp_MaintCatastrophe_Lst_CatNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("catastrophenumber")); //Unique Id Of Type Of Catastrophe Number TextBox On RMA Application Maintenance-->Catastrophe Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Txt_Sex
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Sex Text Box On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-19-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPatient_Txt_Sex(WebDriver driver)
{
	Element = driver.findElement(By.id("patsexcode_codelookup")); //Unique Id Of Sex TextBox On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Txt_Addr1
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Address 1 Text Box On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-19-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPatient_Txt_Addr1(WebDriver driver)
{
	Element = driver.findElement(By.id("pataddr1")); //Unique Id Of Address 1 TextBox On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Txt_Phone1
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Phone Number1 Text Box On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-19-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPatient_Txt_Phone1(WebDriver driver)
{
	Element = driver.findElement(By.id("phonenumber1")); //Unique Id Of Phone Number1 TextBox On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Txt_PatientType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Patient Type Text Box On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-19-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPatient_Txt_PatientType(WebDriver driver)
{
	Element = driver.findElement(By.id("patpatienttypecode_codelookup")); //Unique Id Of Patient Type TextBox On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Txt_PrimaryPayCode
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Primary Pay Code Text Box On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-19-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPatient_Txt_PrimaryPayCode(WebDriver driver)
{
	Element = driver.findElement(By.id("patprimarypaycode_codelookup")); //Unique Id Of Primary Pay Code TextBox On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Img_Procedures
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Procedures Image On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-20-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPatient_Img_Procedures(WebDriver driver)
{
	Element = driver.findElement(By.id("btnProcedures")); //Unique Id Of Procedures Image On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Txt_DateofProcedure
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Date of Procedure On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-20-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPatient_Txt_DateofProcedure(WebDriver driver)
{
	Element = driver.findElement(By.id("dateofprocedure")); //Unique Id Of Date Of Procedure On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_Birthdate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Primary Pay Code Text Box On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-21-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_Birthdate(WebDriver driver)
{
	Element = driver.findElement(By.id("birthdate")); //Unique Id Of Birthdate TextBox On RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_EmergencyContact
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Primary Pay Code Text Box On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-21-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_EmergencyContact(WebDriver driver)
{
	Element = driver.findElement(By.id("emergencycontact")); //Unique Id Of EmergencyContact TextBox On RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_Contracts
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Contract Image On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-21-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Img_Contracts(WebDriver driver)
{
	Element = driver.findElement(By.id("btnProviderContracts")); //Unique Id Of Contract Image On RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_ContractsStartDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which StartDate TextBox On RMA Application Maintenance-->Physician Page-->Contract Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-21-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_StartDate(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@id='startdate' or @id='intdate']")); //Unique Id Of StartDate TextBox On RMA Application Maintenance-->Physician Page-->Contract,Privileges,Certification,PrevHospital Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_ContractsEndDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which EndDate TextBox On RMA Application Maintenance-->Physician Page-->Contract,Privileges,Certification,PrevHospital Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-21-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_EndDate(WebDriver driver)
{
	Element = driver.findElement(By.id("enddate")); //Unique Id Of EndDate TextBox RMA Application Maintenance-->Physician Page-->Contract Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_Status
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Status TextBox On RMA Application Maintenance-->Physician-->Privileges,Certification,PrevHospital Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_Status(WebDriver driver)
{
	Element = driver.findElement(By.id("statuscode_codelookup")); //Unique Id Of Status TextBox RMA Application Maintenance-->Physician -->Certification Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_ContractsFirstRate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which First Rate TextBox On RMA Application Maintenance-->Physician Page-->Contract Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-21-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_ContractsFirstRate(WebDriver driver)
{
	Element = driver.findElement(By.id("firstrate")); //Unique Id Of First Rate TextBox RMA Application Maintenance-->Physician Page-->Contract Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_ContractsAmount
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Amount TextBox On RMA Application Maintenance-->Physician Page-->Contract Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-21-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_ContractsAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("amount")); //Unique Id Of Amount TextBox RMA Application Maintenance-->Physician Page-->Contract Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_ContractsComments
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Comments TextBox On RMA Application Maintenance-->Physician Page-->Contract Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-24-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_ContractsComments(WebDriver driver)
{
	Element = driver.findElement(By.id("comments")); //Unique Id Of Comments TextBox RMA Application Maintenance-->Physician Page-->Contract Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Chk_ContractsApplyDiscount
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Apply Discount CheckBox On RMA Application Maintenance-->Physician Page-->Contract Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-24-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Chk_ContractsApplyDiscount(WebDriver driver)
{
	Element = driver.findElement(By.id("discschd")); //Unique Id Of Apply Discount CheckBox RMA Application Maintenance-->Physician Page-->Contract Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Lst_ContractsState
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which State WebList On RMA Application Maintenance-->Physician Page-->Contract Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-24-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Lst_ContractsState(WebDriver driver)
{
	Element = driver.findElement(By.id("statefee")); //Unique Id Of State WebList RMA Application Maintenance-->Physician Page-->Contract Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Lst_PrivilegesCategory
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Category TextBox On RMA Application Maintenance-->Physician Page-->Privileges Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-24-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_PrivilegesCategory(WebDriver driver)
{
	Element = driver.findElement(By.id("categorycode_codelookup")); //Unique Id Of State TextBox RMA Application Maintenance-->Physician Page-->Privileges Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Lst_PrivilegesType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type TextBox On RMA Application Maintenance-->Physician Page-->Privileges Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-24-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_PrivilegesType(WebDriver driver)
{
	Element = driver.findElement(By.id("typecode_codelookup")); //Unique Id Of Type TextBox RMA Application Maintenance-->Physician Page-->Privileges Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_Privileges
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which End Date TextBox On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-24-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Img_Privileges(WebDriver driver)
{
	Element = driver.findElement(By.id("btnPrivileges")); //Unique Id Of Privileges Image RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_CertificationName
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Name TextBox On RMA Application Maintenance-->Physician-->Certification Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_CertificationName(WebDriver driver)
{
	Element = driver.findElement(By.id("namecode_codelookup")); //Unique Id Of Name TextBox RMA Application Maintenance-->Physician -->Certification Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_CertificationBoard
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Board TextBox On RMA Application Maintenance-->Physician-->Certification Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_CertificationBoard(WebDriver driver)
{
	Element = driver.findElement(By.id("boardcode_codelookup")); //Unique Id Of Board TextBox RMA Application Maintenance-->Physician -->Certification Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_EducationType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Type TextBox On RMA Application Maintenance-->Physician-->Education Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_EducationType(WebDriver driver)
{
	Element = driver.findElement(By.id("eductypecode_codelookup")); //Unique Id Of Type TextBox RMA Application Maintenance-->Physician -->Education Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_EducationInstitutionId
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Institution Id TextBox On RMA Application Maintenance-->Physician-->Education Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_EducationInstitutionId(WebDriver driver)
{
	Element = driver.findElement(By.id("institutioneid")); //Unique Id Of Institution Id TextBox RMA Application Maintenance-->Physician -->Education Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_EducationInstitutionDegreeType
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Degree Type TextBox On RMA Application Maintenance-->Physician-->Education Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_EducationInstitutionDegreeType(WebDriver driver)
{
	Element = driver.findElement(By.id("degreetype_codelookup")); //Unique Id Of Degree Type TextBox RMA Application Maintenance-->Physician -->Education Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_EducationDegreeDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Degree Date TextBox On RMA Application Maintenance-->Physician-->Education Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_EducationDegreeDate(WebDriver driver)
{
	Element = driver.findElement(By.id("degreedate")); //Unique Id Of Degree Date TextBox RMA Application Maintenance-->Physician -->Education Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_PrevHospitalHos
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PrevHospital TextBox On RMA Application Maintenance-->Physician-->PrevHospital Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_PrevHospitalHos(WebDriver driver)
{
	Element = driver.findElement(By.id("PrevHospitaleid")); //Unique Id Of PrevHospital TextBox RMA Application Maintenance-->Physician -->PrevHospital Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Txt_PrevHospitalInstitutionDegreeDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Privileges TextBox On RMA Application Maintenance-->Physician-->PrevHospital Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Txt_PrevHospitalPrivileges(WebDriver driver)
{
	Element = driver.findElement(By.id("privcode_codelookup")); //Unique Id Of Privileges TextBox RMA Application Maintenance-->Physician -->PrevHospital Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_Certification
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Certification Image On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Img_Certification(WebDriver driver)
{
	Element = driver.findElement(By.id("btnCertifications")); //Unique Id Of Certification Image RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_Education
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Education Image On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Img_Education(WebDriver driver)
{
	Element = driver.findElement(By.id("btnEducation")); //Unique Id Of Education Image RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintPhysician_Img_PrevHospital
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which PrevHospital Image On RMA Application Maintenance-->Physician Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-10-25-2016                                
//============================================================================================
public static WebElement RMAApp_MaintPhysician_Img_PrevHospital(WebDriver driver)
{
	Element = driver.findElement(By.id("btnPrevHospitals")); //Unique Id Of PrevHospital Image RMA Application Maintenance-->Physician Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_VehicleID
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Vehicle ID TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_VehicleID(WebDriver driver)
{
	Element = driver.findElement(By.id("vin")); //Unique Id Of Vehicle ID TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_VehicleMake
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Vehicle Make TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_VehicleMake(WebDriver driver)
{
	Element = driver.findElement(By.id("vehiclemake")); //Unique Id Of Vehicle Make TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_VehicleModel
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Vehicle Model TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_VehicleModel(WebDriver driver)
{
	Element = driver.findElement(By.id("vehiclemodel")); //Unique Id Of Vehicle Model TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_VehicleYear
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Vehicle Year TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_VehicleYear(WebDriver driver)
{
	Element = driver.findElement(By.id("vehicleyear")); //Unique Id Of Vehicle Year TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_LicenseNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which License Number TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_LicenseNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("licensenumber")); //Unique Id Of License Number TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_RenewalDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Renewal Date TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_RenewalDate(WebDriver driver)
{
	Element = driver.findElement(By.id("licensernwldate")); //Unique Id Of Renewal Date TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_PurchaseDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Purchase Date TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_PurchaseDate(WebDriver driver)
{
	Element = driver.findElement(By.id("purchasedate")); //Unique Id Of Purchase Date TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_LeaseNumber
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lease Number TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_LeaseNumber(WebDriver driver)
{
	Element = driver.findElement(By.id("leasenumber")); //Unique Id Of Lease Number TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_LeaseTerm 
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lease Term TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_LeaseTerm (WebDriver driver)
{
	Element = driver.findElement(By.id("leaseterm")); //Unique Id Of Lease Term TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_LeaseExpiration
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lease Expiration TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_LeaseExpiration(WebDriver driver)
{
	Element = driver.findElement(By.id("leaseexpiredate")); //Unique Id Of Lease Expiration TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_LeaseAmount
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lease Amount TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_LeaseAmount(WebDriver driver)
{
	Element = driver.findElement(By.id("leaseamount")); //Unique Id Of Lease Amount TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Chk_Lease
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Lease CheckBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Chk_Lease(WebDriver driver)
{
	Element = driver.findElement(By.id("leaseflag")); //Unique Id Of Lease CheckBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_OriginalCost
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Original Cost TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_OriginalCost(WebDriver driver)
{
	Element = driver.findElement(By.id("originalcost")); //Unique Id Of Original Cost TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_OriginalCost
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Original Cost TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_UnitType(WebDriver driver)
{
	Element = driver.findElement(By.id("unittypecode_codelookup")); //Unique Id Of Unit Type TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_DisposalDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Disposal Date TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_DisposalDate(WebDriver driver)
{
	Element = driver.findElement(By.id("disposaldate")); //Unique Id Of Disposal Date TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_LastServiceDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Last Service Date TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_LastServiceDate(WebDriver driver)
{
	Element = driver.findElement(By.id("lastservicedate")); //Unique Id Of Last Service Date TextBox RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Img_Inspections
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Inspections Image On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Img_Inspections(WebDriver driver)
{
	Element = driver.findElement(By.id("btnInspections")); //Unique Id Of Inspections Image RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Btn_InspectionResult
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Inspection Result Button On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Btn_InspectionResult(WebDriver driver)
{
	Element = driver.findElement(By.id("inspectionresultbtnMemo")); //Unique Id Of Inspection Result Button RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Txt_ContentMemo
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Inspections Memo TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_ContentMemo(WebDriver driver)
{
	Element = driver.findElement(By.id("txtMemo")); //Unique Id Of Inspections Memo TextBOx RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Btn_InspectionsDate
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Inspections Date TextBox On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Txt_InspectionsDate(WebDriver driver)
{
	Element = driver.findElement(By.id("inspectiondate")); //Unique Id Of Inspections Date RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}

//============================================================================================
//FunctionName 			: RMAApp_MaintVehicle_Btn_GenericMemoPage
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Memo Page Button On RMA Application Maintenance-->Vehicle Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - RenuVerma-12-23-2016                                
//============================================================================================
public static WebElement RMAApp_MaintVehicle_Btn_GenericMemoPage(WebDriver driver,String ButtonName)
{
	Element = driver.findElement(By.xpath((".//*[@value='"+ButtonName+"']"))); //Unique xpath Of Inspections Memo Page Button  RMA Application Maintenance-->Vehicle Page Is Fetched
	return Element;
}
//============================================================================================
//FunctionName 			: RMAApp_MaintPatient_Btn_Edit
//Description  			: To Fetch Unique Property (Such As Id, X-path, Name ) On The Basis Of Which Edit Button On The Last Name Window On RMA Application Maintenance-->Patient Tracking Page Can Be Identified
//Input Parameter 		: Driver Variable Of The Type WebDriver		 
//Revision				: 0.0 - KumudNaithani-05-02-2015                                 
//============================================================================================
public static WebElement RMAApp_MaintPatient_Btn_Edit(WebDriver driver)
{
	Element = driver.findElement(By.xpath(".//*[@value='Edit']")); //Unique xpath Of Edit Button On The Last Name Window On RMA Application Maintenance-->Patient Tracking Page Is Fetched
	return Element;
}
}
