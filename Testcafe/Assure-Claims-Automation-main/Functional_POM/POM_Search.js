import { Selector, t } from 'testcafe';
class POM_Search {
    constructor() {

        this.AssureClaims_Search_Txt_ClaimNumber = Selector('[name="Claim Number"]');
        //POM For ClaimNumber On Search Claim Page

        this.AssureClaims_Search_Btn_SubmitQuery = Selector('#submitquery').find('i');
        //POM For SubmitQuery Button On Search Claim Page

        this.AssureClaims_Search_Lnk_ClaimNumber = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
        //POM For ClaimNumber Link On Search Claim Page

        this.AssureClaims_Search_Funds_Txt_CheckControlnumber = Selector('[name="Check Control Number"]');
        //POM For ClaimNumber On Search Claim Page

        this.AssureClaims_Search_Funds_Label_MenuOption = Selector('[id="menu_SearchRoot"]').find('a').withText('Funds');

        this.AssureClaims_Search_Txt_PolicyName = Selector('[name="Policy Name"]');
        //POM For ClaimNumber On Search Claim Page

        //Sai's Code : RMA-87954
        this.AssureClaims_Search_BankAccount_Label_MenuOption = Selector('[id="menu_SearchRoot"]').find('a').withText('Bank Account');

        this.AssureClaims_Search_Txt_BankAccountName = Selector('[name="Account Name"]');
        //POM For BankAccountName On Search Claim Page

        this.AssureClaims_Search_Lnk_BankAccountName = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
        //POM For ClaimNumber Link On Search Claim Page


        //Diksha Entity -RMA -88774Serach pom-------
        this.AssureClaims_Search_Entity_lastName = Selector('[name="Last Name"]');
        //POm for eron SSN Number txt field

        this.AssureClaims_Search_Lnk_SSNNumber = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
        //POm for ssn link eron

        //Muskan's Code : RMA-94580
        this.AssureClaims_Search_Btn_ClaimStatusLookup = Selector('#btn_FLD104_openlookup')
        // POM for Claim status Lookup from search screen

        this.AssureClaims_Search_Txt_ClaimStartDate = Selector('#FLD101_start')
        //POM for Claim Start Date over Claim Search screen

        this.AssureClaims_Search_Txt_ClaimEndDate = Selector('#FLD101_end')
        //POM for Claim End Date over Claim Search screen

        this.AssureClaims_Search_Txt_EventStartDate = Selector('#FLD317_start')
        //POM for Event Start Date over Claim Search screen

        this.AssureClaims_Search_Txt_EventEndDate = Selector('#FLD317_end')
        //POM for Event End Start Date over Claim Search screen

        this.AssureClaims_Search_Lnk_ClaimNumberWithoutText = Selector('[ng-enter="grid.appScope.columnClick(row.entity,ClaimSBLANKNumber)"]')
        //POM For ClaimNumber Link On Search Claim Page
        
        //Sai's Code : RMA-96163
        this.AssureClaims_Search_Txt_Address1 = Selector('[name="Address 1"]');
        //POM For Address1 On Search Claim Page

        this.AssureClaims_Search_Lnk_Generic = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
        //POm for Address1

        this.AssureClaims_Maintenance_Search_Address_Btn_CancleFromLeftPanel = Selector('[id="divworkinprogress"]').find('table').find('tbody').find('tr').nth(1).find('td').find('i').nth(1); 
        //POM for Cancle Result From Left Panel In Maintenance Screen

        this.AssureClaims_Maintenance_Search_Entity_Btn_CancleFromLeftPanel = Selector('[id="divworkinprogress"]').find('table').find('tbody').find('tr').nth(4).find('td').find('i').nth(1); 
        //POM for Cancle Result From Left Panel In Maintenance Screen
        
        this.AssureClaims_Search_Address_MenuOption = Selector('[id="menu_SearchRoot"]').find('a');
        //POM for Select Address Entity Over Search On Menu Dropdown In Maintenance Screen
        
        //Sai's Code : RMA-96706
        this.AssureClaims_Search_Txt_BankAccountNumber = Selector('[name="Account#"]');
        //POM For BankAccountNumber On Search Claim Page

          //=======================================RMA-97663 : Muskan's Code Starts Here=======================================================================
       this.AssureClaims_Search_Txt_DiaryTaskName= Selector('[name="Task Name"]')
       //POM for Diary TaskName over search Screen

       this.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen=Selector('[class="ui-grid-cell-contents ng-scope"]').find('span')
       //POM for Link over search screen 

       this.AssureClaims_Search_Txt_EntityLastName=Selector('[name="Last Name"]')
       //POM for Entity LastName over search Screen

       this.AssureClaims_Search_Txt_EntityFirstName=Selector('[name="First Name"]')
       //POM for Entity FirstName over search Screen

       this.AssureClaims_Search_Txt_EventNumber= Selector('[name="Event Number"]')
       //POM for Event Number over search Screen

       this.AssureClaims_Search_Txt_FundsControlnumber = Selector('[name="Check Control Number"]');
       //POM For Funds Control number over search Screen

       this.AssureClaims_Search_Txt_OrgHierarchyName= Selector('[name="Name"]')
       //POM for OrgHierarchy Name over search Screen

       this.AssureClaims_Search_Txt_PolicyNumber= Selector('[name="Policy Number"]')
       //POM for Policy Number over search Screen

       this.AssureClaims_Search_Txt_PropertyId= Selector('[name="Property ID"]')
       //POM for PropertyId over search Screen

       this.AssureClaims_Search_Txt_VehicleId= Selector('[name="Vehicle ID"]')
       //POM for VehicleId over search Screen

       this.AssureClaims_Claim_Lnk_Search= Selector('[id="menuBar"]').find('a')
       //POM for Serach link over claim zone

       this.AssureClaims_Claim_Lnk_Funds= Selector('[id="menu_SearchRoot"]').find('a')
       //POM for Funds link over claim zone

       //=======================================RMA-97663 : Muskan's Code Ends Here=======================================================================
        
       //================================Muskan's Code : RMA-99702 started here================================================================
       
        this.AssureClaims_EntitySearch_Lnk_EntityLnk=Selector('[class="ui-grid-row ng-scope"]').find('span').withAttribute('role','button')
       //POM for Entity lnk over entity search result page

       this.AssureClaims_MedicalStaffSearch_Txt_StaffNumber=Selector('[name="Med. Staff Med. Staff Number"]')
       //POM for medical staff number over medical staff search page

       //================================Muskan's Code : RMA-99702 ended here================================================================
        
       //================================Muskan's Code : RMA-97293 started here================================================================

        this.AssureClaims_Search_Txt_DriverLastName = Selector('input').withAttribute('aria-label','Driver Last Name')
        //POM for Driver LastName over search Screen

        this.AssureClaims_Search_Txt_MedStaffLastName = Selector('input').withAttribute('aria-label','Med. Staff Last Name')
        //POM for MedicalStaff LastName over search Screen

        this.AssureClaims_Search_Txt_PatientLastName =Selector('input').withAttribute('aria-label','Patient Last Name')
        //POM for Patient LastName over search Screen

        this.AssureClaims_Search_Txt_PhysicianLastName = Selector('input').withAttribute('aria-label','Physician Last Name')
        //POM for Physician LastName over search Screen
        
       //================================Muskan's Code : RMA-97293 ended here================================================================
        
        //Muskan's Code : RMA-97688
        this.AssureClaims_Search_Txt_LitAttorneyLastName = Selector('input').withAttribute('aria-label', 'Lit. Attorney Last Name')
        //POM for Lit. Attorney Last Name textbox
        
        
        //Muskan's Code : RMA-102184
        this.AssureClaims_Search_Txt_EmployeeNumber=Selector('[name="Employee Number"]')
        //POM for Employee Number textbox over search screen

        //Muskan's Code : RMA-109184
        this.AssureClaims_Search_Lst_SelectQD=Selector('[ng-readonly="disableViewDd"]')
        //POM for select query designer over Search Claim Criteria screen

        this.AssureClaims_Search_Label_VerifyLabel=Selector('label')
        //POM for verify label text over Search Claim Criteria screen

        this.AssureClaims_Search_Label_VerifyTextOverGrid=Selector('span')
        //POM for verify label text over grid over Result Search Claim Criteria screen

        this.AssureClaims_Search_Btn_Export=Selector('#export_btn')
        //POM for download btn over Result Search  Criteria screen

        this.AssureClaims_Search_Btn_ExportToExcel=Selector('#A2')
        //POM for Export to excel btn over Result Search Criteria screen

        this.AssureClaims_Search_Btn_ExportToPdf=Selector('#A3')
        //POM for Export to pdf over Result Search Criteria screen
        
        //================================Kiran's Code : RMA-109560 started here================================================================
        this.AssureClaims_Search_ClaimNumber_Amount = Selector('#FLD72573_start')
        //POM for Search Number_Amount over Result Search Criteria screen
       //================================Kiran's Code : RMA-109560 ended here================================================================

    }
};
export default POM_Search;
