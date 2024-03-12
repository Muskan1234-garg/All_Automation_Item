import {Selector} from 'testcafe';

class POM_Employee{
    constructor(){
        this.AssureClaims_Employee_Txt_EmployeeNumber = Selector('#employeenumber');
        //POM for Employee Number on Employee Creation Page

        this.AssureClaims_Employee_Txt_LastName = Selector('#lookup_lastname');
        //POM for Employee Last Name on Employee Creation Page

        this.AssureClaims_EmployeeMaintenance_Txt_LastName = Selector('#lastname');
        //POM for Employee Last Name on Maint=>Employee Creation Page

        this.AssureClaims_MaintEmployee_Btn_Country = Selector('#btn_country_openlookup');
        //POM for Maint=>Employee Country Lookup Button

        this.AssureClaims_Employee_Btn_Country = Selector('#btn_countrycode_openlookup');
        //POM for Employee Country Lookup Button

        this.AssureClaims_Employee_Txt_Department = Selector('#lookup_deptassignedeid');
        //POM for Employee Department Textbox 

        this.AssureClaims_Employee_Txt_SocialSecurityNumber = Selector('#taxid');
        //POM for SSN Textbox

        this.AssureClaims_Employee_Tab_EmploymentInfo = Selector('[role="button"]').find('span').withText('Employment Info');
        //POM For Employment info Tab

        this.AssureClaims_Employee_Tab_Employee = Selector('[role="button"]').find('span').withText('Employee');
        //POM for Employee Tab

        this.AssureClaims_Employee_Txt_FirstName = Selector('#firstname');
        //POM for Employee First Name textbox

        this.AssureClaims_Employee_Tab_EmployeeInfo = Selector('[role="button"]').find('span').withText('Employee Info');
        //POM for Employee info tab

        this.AssureClaims_Employee_Tab_Addresses = Selector('[role="button"]').find('span').withText('Addresses');
        //POM for Addresses tab

        this.AssureClaims_Employee_Tab_EntityIDType = Selector('[role="button"]').find('span').withText('Entity ID Type');
        //POM for Entity ID Type Tab

        this.AssureClaims_Employee_Tab_Supplementals = Selector('[role="button"]').find('span').withText('Supplementals');
        //POM for Supplementals Tab

        this.AssureClaims_Employee_Txt_NumberOfViolations = Selector('#numofviolations');
        //POM for Number Of Violations Textbox

        this.AssureClaims_Employee_Btn_AddNewAddress = Selector('#cruduiGridAddBtn');
        //POM for Add New Address Button

        this.AssureClaims_Employee_Txt_AddrType = Selector('#lookup_addressType');
        //POM for Address Type Textbox 

        this.AssureClaims_Employee_Txt_Addr1 = Selector('#lookup_addr1');
        //POM for Address1 Textbox

        this.AssureClaims_Employee_Txt_Addr2 = Selector('#addr2');
        //POM for Address2 Textbox

        this.AssureClaims_Employee_Txt_Addr3 = Selector('#addr3');
        //POM For Address3 Textbox

        this.AssureClaims_Employee_Txt_Addr4 = Selector('#addr4');
        //POM for Address4 Textbox

        this.AssureClaims_Employee_Txt_City = Selector('#city');
        //POM for City Textbox

        this.AssureClaims_Employee_Txt_State = Selector('#lookup_state');
        //POM for State Lookup Textbox

        this.AssureClaims_MaintEmployee_Btn_State = Selector('#btn_state_openlookup');
        //POM for State Lookup Button on Maint=>Employee

        this.AssureClaims_Employee_Btn_State = Selector('#btn_stateid_openlookup');
        //POM for State Button Lookup On PI Employee Page

        this.AssureClaims_MaintEmployee_Txt_ZipCode = Selector('#zipCode');
        //POM for Zip Code Textbox on Maint=>Employee Page

        this.AssureClaims_Employee_Txt_ZipCode = Selector('#zipcode');
        //POM For Zip Code Textbox on PI Employee screen

        this.AssureClaims_Employee_Txt_Country = Selector('#lookup_country');
        //POM for Country Textbox On Employee Screen

        this.AssureClaims_Employee_Txt_County = Selector('#county');
        //POM for County Textbox

        this.AssureClaims_Employee_Txt_HiredDate = Selector('#datehired').nth(1);
        //POM for Hired Date Textbox

        this.AssureClaims_Employee_Txt_TerminationDate = Selector('#termdate').nth(1);
        //POM for Termination Date Textbox

        this.AssureClaims_Employee_Txt_ExpirationDateOnEmployeeInfo = Selector('#datedriverslicexp').nth(1);
        //POM for Expiration Date Textbox On Employee Info Tab

        this.AssureClaims_Employee_Txt_DateOfDeath = Selector('#dateofdeath').nth(1);
        //POM for Date Of Death Textbox

        this.AssureClaims_Employee_Txt_EffectiveDate = Selector('#effectivedate').nth(1);
        //POM for Effective Date Textbox

        this.AssureClaims_Employee_Txt_BirthDate = Selector('#birthdate').nth(1);
        //POM for Date of Birth Textbox

        this.AssureClaims_Employee_Txt_ExpirationDateOnEmployee = Selector('#expirationdate').nth(1);
        //POM for Expiration Date Textbox On Employee Tab

        this.AssureClaims_Employee_Txt_DateLastVerified = Selector('#lastverifieddate').nth(1);
        //POM for Date Last Verified Textbox

        this.AssureClaims_Employee_Txt_WorkPermitDate = Selector('#workpermitdate').nth(1);
        //POM for Work Permit Date Textbox

        this.AssureClaims_EntityIdType_Txt_EntityIdType = Selector('#lookup_idType');
        //POM for Entity ID Type Textbox

        this.AssureClaims_EntityIdType_Btn_EntityIdType = Selector('#btn_idType');
        //POM for Entity ID Type Lookup Button

        this.AssureClaims_EntityIdType_Txt_EntityIDNumber = Selector('#idNum');
        //POM for Entity ID Number Textbox

        this.AssureClaims_EntityIdType_Txt_EffectiveDate = Selector('#effStartDate').nth(1);
        //POM for Effective Date On Entity ID Tab

        this.AssureClaims_EntityIdType_Txt_ExpirationDate = Selector('#effEndDate').nth(1);
        //POM for Expiration Date on Entity ID Tab

        this.AssureClaims_Address_Img_AddressLookup = Selector('#Address Lookup').find('i');
        //POM for Address Lookup Image On Addresses Tab

        this.AssureClaims_EmployeeInfo_Txt_LicenseNo = Selector('#driverslicno');
        //POM of License Number Textbox On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Txt_LicenseType = Selector('#lookup_driverslictypecode');
        //POM for License Type Textbox On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Btn_LicenseType = Selector('#btn_driverslictypecode_openlookup');
        //POM for License Type Lookup Button On Employee info Tab

        this.AssureClaims_EmployeeInfo_Btn_LicenseJurisdiction = Selector('#btn_drivlicstate');
        //POM for License Jurisdiction Button on Employee Info Tab

        this.AssureClaims_EmployeeInfo_Txt_LicenseJurisdiction = Selector('#lookup_drivlicstate');
        //POM for License Jurisdiction Textbox On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Txt_Restrictions = Selector('#lookup_drivlicrstrctcode');
        //POM for Restrictions Textbox On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Btn_Restrictions = Selector('#btn_drivlicrstrctcode_openlookup');
        //POM For Restrictions Lookup Button On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Btn_NCCIClass = Selector('#btn_ncciclasscode');
        //POM for NCCI Class Lookup Button On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Txt_NCCIClass = Selector('#lookup_ncciclasscode');
        //POM For NCCI Class Textbox On Employee info Tab

        this.AssureClaims_EmployeeInfo_Flag_Insurable = Selector('#insurableflag');
        //POM For Insurable Checkbox On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Txt_EmailType = Selector('#lookup_emailtypecode');
        //POM for Email type Textbox On Employee info Tab

        this.AssureClaims_EmployeeInfo_Btn_EmailType = Selector('#btn_emailtypecode_openlookup');
        //POM for Email Type Lookup Button On Employee Info Tab

        this.AssureClaims_EmployeeInfo_Txt_EmailAddress = Selector('#emailaddress');
        //POM for Email Address Textbox On Employee Info Tab
       
        //================================Muskan's Code : RMA-97293 started here================================================================

        this.AssureClaims_PersonInv_Btn_SearchEmployee=Selector('[aria-label="Search Employee"]').find('i')
        //POM for search employee over personInvolved screen
        
        //================================Muskan's Code : RMA-97293 ended here==================================================================
    }
};export default POM_Employee;
