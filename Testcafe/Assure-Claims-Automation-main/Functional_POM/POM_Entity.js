import {Selector} from 'testcafe';

class POM_Entity{
    constructor(){
        this.AssureClaims_Entity_Lst_TypeOfEntity = Selector('#entitytableid');
        //POM for Type Of Entity Dropdown On Maint=>Entity Screen

        this.AssureClaims_Entity_Txt_Name = Selector('#lastname');
        //POM for Last Name Textbox On Maint=>Entity Screen

        this.AssureClaims_Entity_Lst_IDType = Selector('#typeid');
        //POM for ID Type Dropdown On Maint=>Entity Screen

        this.AssureClaims_Entity_Txt_NatureOfBusiness = Selector('#natureofbusiness');
        //POM For Nature Of Business Textbox On Maint=>Entity Screen

        this.AssureClaims_Entity_Txt_Title = Selector('#title');
        //POM for Title Textbox On Maint=>Entity Screen

        this.AssureClaims_Entity_Tab_ContactInfo = Selector('[role="button"]').find('span').withText('Contact Info');
        //POM for Contact Info Tab On Maint=>Entity Screen

        this.AssureClaims_Entity_Tab_OperatingAs = Selector('[role="button"]').find('span').withText('Operating As');
        //POM For Operating As Tab On Maint=>Entity Screen

        this.AssureClaims_Entity_Tab_Addresses = Selector('[role="button"]').find('span').withText('Addresses');
        //POM for Addresses Tab On Maint=>Entity Screen

        this.AssureClaims_Entity_Tab_EntityIDType = Selector('[role="button"]').find('span').withText('Entity ID Type');
        //POM For Entity ID Type Tab On Maint=>Entity Screen

        this.AssureClaims_Entity_Tab_Supplementals = Selector('[role="button"]').find('span').withText('Supplementals');
        //POM for Supplementals Tab On Maint=>Entity Screen

        this.AssureClaims_Entity_Tab_Entity = Selector('[role="button"]').find('span').withText('Entity').nth(0);
        //POM for Entity Tab On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_Addr1 = Selector('#addr1');
        //POM for Addresses 1 Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_Addr2 = Selector('#addr2');
        //POM for Addresses 2 Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_Addr3 = Selector('#addr3');
        //POM for Addresses 3 Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_Addr4 = Selector('#addr4');
        //POM for Addresses 4 Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_City = Selector('#city');
        //POM for City Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_State = Selector('#lookup_state');
        //POM for State Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Btn_State = Selector('#btn_state_openlookup');
        //POM for State Lookup Button On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Btn_Country = Selector('#btn_country_openlookup');
        //POM for Country Lookup Button On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_ZipCode = Selector('[aria-label="Zip/Postal Code"]');
        //POM for Zip Code Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_Country = Selector('#lookup_country');
        //POM for Country Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_County = Selector('#county');
        //POM For County Textbox On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Btn_AddNewAddress = Selector('#cruduiGridAddBtn');
        //POM For Add New Addresses Button On Maint=>Entity Screen

        this.AssureClaims_EntityAddresses_Txt_AddrType = Selector('#lookup_addressType');
        //POM for Add New Address Button On Maint=>Entity Screen

        this.AssureClaims_Entity_BankingInfoSetup_Txt_BankName = Selector('#bankname');
        //POM for Bank Name Textbox On Banking Info Screen

        this.AssureClaims_Entity_BankingInfoSetup_Txt_AccountNo = Selector('#accountnumber');
        //POM for Account Number Textbox On Banking Info Screen

        this.AssureClaims_Entity_BankingInfoSetup_Btn_BankingStatus = Selector('#btn_bankingstatus_openlookup');
        //POM for Banking Status Lookup Button On Banking Info Screen

        this.AssureClaims_Entity_BankingInfoSetup_Btn_AccountType = Selector('#btn_accttypecode_openlookup');
        //POM for Account Type Lookup Button On Banking Info Screen

        this.AssureClaims_Entity_BankingInfoSetup_Txt_TransitNo = Selector('#transit');
        //POM for Transit Number Textbox On Banking Info Screen

        this.AssureClaims_Entity_Btn_DriverInfo = Selector('[id="Driver Info"]');
        //POM For Driver info Toolbar Button Maint=>Entity Screen

        this.AssureClaims_Entity_Img_ViewPaymentHistory = Selector('[id="View Payment History"]');
        //POM for View Payment History Toolbar Button On Maint=>Entity Screen

        this.AssureClaims_Entity_Txt_ApprovalStatus = Selector('#lookup_entityapprovalstatuscode');
        //POM For Approval Status Textbox On Maint=>Entity Screen

        this.AssureClaims_Entity_Btn_ApprovalStatusLookup = Selector('#btn_entityapprovalstatuscode_openlookup');
        //POM for Approval Status Lookup Button On Maint=>Entity Screen

        this.AssureClaims_EntitySearch_Txt_LastName = Selector('[name="Last Name"]');
        //POM for Last Name Textbox On Search=>Entity Screen
        
        //Diksha's Code :RMA-88774
         //Entity POM For ERON-----------------------------------------------------------------------------------------------------------------------------
        var ele1 = String[0];
        this.AsssureClaims_MaintenenceERON = Selector('[role="menuitem"]').withExactText('Maintenance');
        //Pom For Maintenence Option 

        this.AsssureClaims_DriverERON = Selector('a[aria-label=' + ele1 + ']').sibling('ul').child('li').find('a').withAttribute('role', 'menuitem').withExactText('Driver ');
        //Pom For DriverERON

        this.AsssureClaims_EmployeeERON = Selector('a[aria-label=' + ele1 + ']').sibling('ul').child('li').find('a').withAttribute('role', 'menuitem').withExactText('Employee ');
        //Pom For EmployeeERON

        this.AsssureClaims_PhysicanERON = Selector('a[aria-label=' + ele1 + ']').sibling('ul').child('li').find('a').withAttribute('role', 'menuitem').withExactText('Physician ');
        //POM For Physician ERON

        this.AsssureClaims_PatientERON = Selector('a[aria-label=' + ele1 + ']').sibling('ul').child('li').find('a').withAttribute('role', 'menuitem').withExactText('Patient Tracking ');
        //Pom For Pateinet ERON

        this.AsssureClaims_MedStaffERON = Selector('a[aria-label=' + ele1 + ']').sibling('ul').child('li').find('a').withAttribute('role', 'menuitem').withExactText('Medical Staff ');
        //POM for MEDStaff ERON

        this.AssureClaims_EntityEron_Txt_EntityType = Selector('#entitytypecode').withText('Individual');
        //Pom For Entity Type


        this.AssureClaims_EntityEron_Txt_LastName = Selector('#erlastname');
        //POM for Entity LastName ERON

        this.AssureClaims_EntityEron_Txt_SSN = Selector('#taxid')
        //POM for Entity SSN Eron

        this.AssureClaims_EntityEron_Txt_Abbreviation = Selector('#abbreviation')
        //POM For Entity Abbreviation Eron

        this.AssureClaims_EnityCategory_Lkp = Selector('#btn_entitycategory');

        this.AssureClaims_EntityCategory_Lnk_SelectAdjuster = (Selector('[class="ui-grid-cell-contents ng-scope"]').find('span'));
        //POm for LINK Adj


        this.AssureClaims_EntityDescription_Txt_Filter = Selector('[class="ui-select-search input-xs ng-valid ng-dirty ng-touched ng-empty"]').find('input')
        //POM for Description TextBox

        this.AssureClaims_Entity_Btn_FilterSearch = Selector('[class="ui-grid-header-cell ui-grid-clearfix ng-scope ng-isolate-scope ui-grid-coluiGrid-000G"]').find('[ng-click="grid.appScope.toggleFiltering()"]')

        //POM for enity from toolbar

        this.AssureClaims_Enity_Employee_Btn = Selector('[aria-label= "Employee Info"]').find('[class="material-icons mdi mdi-account-location"]');
        //pom for employee Enity ToolbarButton

        this.AssureClaims_Entity_Driver_Btn = Selector('[role="toolbar"]').withText('drive_eta')
        //POm for Driver entity

        this.AssureClaims_Enity_MedStaff_Btn = Selector('[aria-label= "Med Staff Info"]').find('[class="material-icons mdi mdi-medical-bag"]');
        //POm for Driver entity
        

        this.AssureClaims_Lst_Entity = (Selector('[class="dropdown"]'))
        //pom for list drop down  of toolbar entity screen 

        this.AssureClaims_Btn_PatientInfo = (Selector('[role="menuitem"]').withText('Patient Info'));
        //POm for Patient entity

        this.AssureClaims_Btn_PhysicianInfo = (Selector('[role="menuitem"]').withText('Physician Info'));

        //POm for Physicisn entity
        this.AssureClaims_Txt_PhysicianNumber = Selector('#physiciannumber')

        //Entity POm for ERON Completed here---------------------------------------------------------------------------------------------------------------------

        //Sai'S Code : RMA-91982
         this.AssureClaims_Txt_Entity_Payment_Approval_Status = Selector('#lookup_entityapprovalstatuscode')
        
        //Sai's Code : RMA-96163
        this.AssureClaims_Entity_Btn_AddNewAddress = Selector('#cruduiGridAddBtn');
        //POM For Add New Address Button
     
        this.AssureClaims_Search_Entity_MenuOption = Selector('[id="menu_SearchRoot"]').find('a');
        //POM For Clicking Entity From Menu List On Search Entity Screen
        
        //Sai's code : RMA-96164
        this.AssureClaims_Entity_Btn_EditAddress = Selector('#Edit');
        //POM For Edit  Address Button
        
        //================================Muskan's Code : RMA-99702 started here================================================================

    this.AssureClaims_Maintenance_Lnk_MaintenanceLnk = Selector('[aria-label="Maintenance"]')
    //POM for maintenance lnk over maintenance page

    this.AssureClaims_Maintenance_Lnk_DriverLnk = Selector('[aria-label="Maintenance"]').parent('li').find('li').find('a').withAttribute("aria-label", "Driver")
    //POM for driver lnk over maintenance page

    this.AssureClaims_Maintenance_Lnk_EmployeeLnk = Selector('[aria-label="Maintenance"]').parent('li').find('li').find('a').withAttribute("aria-label", "Employee")
    //POM for employee lnk over maintenance page

    this.AssureClaims_Maintenance_Lnk_EntityLnk = Selector('[aria-label="Maintenance"]').parent('li').find('li').find('a').withAttribute("aria-label", "Entity")
    //POM for enriry lnk over maintenance page

    this.AssureClaims_Maintenance_Lnk_MedStaffLnk = Selector('[aria-label="Maintenance"]').parent('li').find('li').find('a').withAttribute("aria-label", "Medical Staff")
    //POM for medical staff lnk over maintenance page

    this.AssureClaims_Maintenance_Lnk_PhysicianLnk = Selector('[aria-label="Maintenance"]').parent('li').find('li').find('a').withAttribute("aria-label", "Physician")
    //POM for physician lnk over maintenance page

    this.AssureClaims_Maintenance_Lnk_PatientLnk = Selector('[aria-label="Maintenance"]').parent('li').find('li').find('a').withAttribute("aria-label", "Patient")
    //POM for patient lnk over maintenance page

    this.AssureClaims_Maintenance_Lnk_PeopleLnk = Selector('[aria-label="Maintenance"]').parent('li').find('li').find('a').withAttribute("aria-label", "People")
    //POM for people lnk over maintenance page

    this.AsssureClaims_Maintenence_Lst_EntityType = Selector('#entitytypecode')
    //Pom for entity type dropdown over entity creation page

    this.AsssureClaims_EntityCreation_Lnk_RightHandChild = Selector('a');
    //POM for banking information over Entity creation page

    this.AsssureClaims_EntityCreation_Btn_DriverInfo = Selector('[uib-tooltip="Driver Info"]');
    //POM for driver info Entity creation page

    this.AsssureClaims_EntityCreation_Btn_EmployeeInfo = Selector('[aria-label="Employee Info"]');
    //POM for Employee info over Entity creation page

    this.AsssureClaims_EntityCreation_Btn_MedStaffInfo = Selector('[aria-label="Med Staff Info"]');
    //POM for Med Staff Info over Entity creation page

    this.AsssureClaims_EntityCreation_Btn_PatientInfo = Selector('[aria-label="Patient Info"]');
    //POM for Patient Info over Entity creation page

    this.AsssureClaims_EntityCreation_Btn_PhysicianInfo = Selector('[aria-label="Physician Info"]');
    //POM for Physician Info over Entity creation page

    this.AsssureClaims_EntityCreation_Txt_EntityLastname = Selector('#erlastname')
    //POM for entity lastname over Entity creation page

    this.AsssureClaims_MedStaffCreation_Txt_StaffNumber = Selector('#medstaffnumber')
    //PONM for medical staff creation over medical staff page

    //================================Muskan's Code : RMA-99702 ended here================================================================
        
    //================================Muskan's Code : RMA-97293 started here================================================================

    this.AsssureClaims_EmployeeManitenance_Txt_EmployeenumberTxt=Selector('#employeenumber')
    //POM for Employee Number txt screen over Employee Manitenance screen, maintenance zone

    this.AsssureClaims_EmployeeManitenance_Txt_DepartmentTxt=Selector('#lookup_deptassignedeid')
    //POM for Department txt screen over Employee Manitenance screen, maintenance zone
    
    this.AsssureClaims_Manitenance_Lst_IDType=Selector('#typeid')
    //POM for type id over Entity creation screen, maintenance zone

    this.AsssureClaims_Manitenance_Txt_SSNTxt=Selector('#taxid')
    //POM for SSN over Entity creation screen, maintenance zone
    
    this.AsssureClaims_Manitenance_Lst_List=Selector('[role="listitem"]').find('i')
    //POM for list over Entity creation screen, maintenance zone

    this.AsssureClaims_PhysicianManitenance_Txt_PhyscianNumber=Selector('#physiciannumber')
    //POM for Physician number over physician Manitenance screen, maintenance zone

    this.AsssureClaims_DriverManitenance_Lst_TypeOfDriver=Selector('#entitytableid')
    //POM for Type of driver over driver Manitenance screen, maintenance zone

    this.AsssureClaims_PatientManitenance_Btn_MaritalStatusLookup=Selector('#btn_patmaritalstatcode_openlookup')
    //POM for Marital status lookup button over patient Manitenance screen, maintenance zone

    this.AsssureClaims_Manitenance_Btn_CategoryLookUp=Selector('#btn_entitycategory').find('i');
    //POM for entity category lookup button over Entity creation screen, maintenance zone
    
    this.AsssureClaims_PersonInv_Btn_SearchPhysician=Selector('[aria-label="Search Physician"]')
    //POM for search physician 

    this.AsssureClaims_PersonInv_Btn_SearchDriver=Selector('[aria-label="Search Driver"]')
    //POM for search driver 
    
    this.AsssureClaims_PersonInv_Btn_SearchMedStaff=Selector('[aria-label="Search Medical Staff"]')
    //POM for search Medical staff

    this.AssureClaims_RightChild_Lnk_AddedChild=Selector('[role="link"]')
    //POM for added right child

    this.AsssureClaims_ClaimCreation_Btn_PersonInvolved=Selector('[aria-label=" Persons Inv."]')
    //POM for person involved over claim creation screen
    
    this.AsssureClaims_PersonInv_Btn_SearchWitness = Selector('[aria-label="Search Witness"]')
    //POM for search witness 

    this.AsssureClaims_PersonInv_Btn_SearchPatient = Selector('[aria-label="Search Patient"]')
    //POM for search Patient 

    this.AsssureClaims_ClaimCreation_Btn_PolicyPopUp=Selector('[title="Open"]')
    //POM for policy popup button

    //================================Muskan's Code : RMA-97293 ended here================================================================
    //================================Yashaswi's Code : RMA-99703 Starts here================================================================

    this.AsssureClaims_Manitenance_Txt_PaymentApprovalRejectedReason = Selector('#lblmemo_rejectReasonText')
    //  POM for Payment / Reject reason label

    this.AsssureClaims_Manitenance_Tab_GenericAccordian = Selector('[class="ng-scope panel-heading tabFocusWd ng-binding"]')
    //  POM for generic accordian over entity screen

    //================================Yashaswi's Code : RMA-99703 ended here================================================================

      }
};export default POM_Entity;
