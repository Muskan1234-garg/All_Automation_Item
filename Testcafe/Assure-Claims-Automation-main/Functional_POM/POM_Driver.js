import {Selector} from 'testcafe';

class  POM_Driver{
    constructor(){
        this.AssureClaims_Driver_Lst_TypeOfDriver = Selector('#drivertyped');
        //POM for Type of Driver Drop Down on PI=>Driver screen

        this.AssureClaims_MaintDriver_Lst_TypeOfDriver = Selector('#entitytableid');
        //POM for Type of Driver Drop Down on Maint=>Driver Screen

        this.AssureClaims_MaintenanceDriver_Txt_LastName = Selector('#lastname');
        //POM for Last Name Textbox On Maint=>Driver Screen

        this.AssureClaims_Driver_Txt_LastName = Selector('#lookup_lastname');
        //POM for Last Name Textbox On PI=>Driver Screen

        this.AssureClaims_Driver_Txt_Address1 = Selector('#addr1');
        //POM for Address 1 Textbox On Driver Screen

        this.AssureClaims_Driver_Tab_Supplementals = Selector('[role="button"]').find('span').withText('Supplementals');
        //POM for Supplementals Tab

        this.AssureClaims_Driver_Tab_Driver = Selector('[role="button"]').find('span').withText('Driver').nth(0);
        //POM for Driver Tab

        this.AssureClaims_MaintPatient_Txt_LookupLastName = Selector('[class="ui-grid-filter-input ui-grid-filter-input-0"]').nth(0);
        //POM for Last Name Filter Textbox On Lookup Window

        this.AssureClaims_MaintPatient_Btn_LookupLastPage = Selector('[class="ui-grid-pager-last"]');
        //POM for Lookup Last Page Button

        this.AssureClaims_GenericClaim_Btn_Diary = Selector('#Diary');
        //POM for Diary Image Button On Driver Screen

        this.AssureClaims_GenericClaim_Btn_RecordSummary = Selector('[id="Record Summary"]').find('i');
        //POM for Record Summary Image Button On Driver screen

        this.AssureClaims_GenericClaim_Btn_MailMerge = Selector('[id="Mail Merge"]').find('i');
        //POM for Mail Merge Image Button On Driver screen

        this.AssureClaims_Employee_Img_WithHolding = Selector('#Withholding').find('i');
        //POM for Withholding Image Button On Driver screen

        this.AssureClaims_Driver_Txt_Address2 = Selector('#addr2');
        //POM for Address 2 Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_Address3 = Selector('#addr3');
        //POM for Address 3 Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_Address4 = Selector('#addr4');
        //POM for Address 4 Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_MiddleName = Selector('#middlename');
        //POM for Middle Name Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_FirstName = Selector('#firstname');
        //POM for First Name Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_Initials = Selector('#abbreviation');
        //POM for Initials Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_AlsoKnownAs = Selector('#alsoknownas');
        //POM for Also Known As Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_City = Selector('#city');
        //POM for City Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_State = Selector('#lookup_stateid');
        //POM for State Textbox On Driver Screen

        this.AssureClaims_Driver_Btn_State = Selector('#btn_state_openlookup');
        //POM for State Lookup Button On Driver Screen

        this.AssureClaims_Driver_Txt_Country = Selector('#lookup_countrycode');
        //POM for Country Textbox On Driver Screen

        this.AssureClaims_Driver_Btn_Country = Selector('#btn_country_openlookup');
        //POM for Country Lookup Button On Driver Screen

        this.AssureClaims_Driver_Txt_SSN = Selector('#taxid');
        //POM for SSN Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_DateOfBirth = Selector('#birthdate').nth(1);
        //POM for Date Of Birth Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_SearchLastName = Selector('[name="Driver Last Name"]');
        //POM for Driver Last Name Textbox On Search=>Driver Screen

        this.AssureClaims_Driver_Btn_SubmitQuery = Selector('#submitquery');
        //POM for Submit Query Button On Search=>Driver Screen

        this.AssureClaims_Driver_Txt_ZipCode = Selector('#zipCode');
        //POM for Zip code Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_OfficePhone = Selector('[aria-label="Office Phone"]');
        //POM for Office Phone Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_HomePhone = Selector('[aria-label="Home Phone"]');
        //POM for Home Phone Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_Sex = Selector('#lookup_sexcode');
        //POM for Sex Textbox On Driver Screen

        this.AssureClaims_Driver_Txt_MaritalStatus = Selector('#lookup_maritalstatcode');
        //POM for Marital Status Textbox On Driver Screen

        this.AssureClaims_Driver_Btn_Sex = Selector('#btn_sexcode_openlookup');
        //POM for Sex Lookup Button On Driver Screen

        this.AssureClaims_Driver_Btn_MaritalStatus = Selector('#btn_maritalstatcode_openlookup');
        //POM for Marital Status Lookup Button On Driver Screen
        
        //Diksha's Code :RMA-88775
                this.AssureClaims_AddDriver = Selector('[aria-label="Add New Driver"]').find('i').withText('add');

        this.AssureClaims_PIDriver_Txt_DriverType = Selector('#drivertyped');

        this.AssureClaims_PIDriver_Txt_LastName = Selector('#lookup_lastname');
    }
}; export default POM_Driver;
