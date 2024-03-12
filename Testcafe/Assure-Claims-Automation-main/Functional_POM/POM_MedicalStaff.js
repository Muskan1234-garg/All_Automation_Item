import { Selector } from 'testcafe';

class POM_MedicalStaff{
    constructor(){
        this.AssureClaims_AddPersonInvolved = Selector('#associated-pi i').nth(2).withText('add');
        //POM for Add Person Involved Button on Claim Page

        this.AssureClaims_AddMedicalStuff = Selector('[aria-label="Add New Medical Staff"]').find('i').withText('add');
     //POM for Add MedicalStuff Button on Claim Page

        this.AssureClaims_MedicalStaff_Txt_StaffNumber = Selector('#medstaffnumber');
        //POM For Medical Staff Number Textbox On Maint=>Medical Staff Screen

        this.AssureClaims_PIMedicalStaff_Txt_LastName = Selector('#lookup_lastname');
        //POM for Medical Staff Last Name Textbox On PI=>Medical Staff Screen

        this.AssureClaims_MaintenanceMedicalStaff_Txt_LastName = Selector('#lastname');
        //POM for Medical Staff Last Name Textbox On Maint=>Medical Staff Screen

        this.AssureClaims_MedicalStaff_Txt_FirstName = Selector('#firstname');
        //POM For Medical Staff First Name Textbox

        this.AssureClaims_MedicalStaff_Tab_Staff = Selector('[role="button"]').find('span').withText('Staff');
        //POM for Staff Tab

        this.AssureClaims_MedicalStaff_Tab_StaffInfo = Selector('[role="button"]').find('span').withText('Staff Info');
        //POM for Staff Info Tab 

        this.AssureClaims_MedicalStaff_Tab_FacilityInfo = Selector('[role="button"]').find('span').withText('Facility Info');
        //POM for Facility Info Tab

        this.AssureClaims_MedicalStaff_Tab_Addresses = Selector('[role="button"]').find('span').withText('Addresses');
        //POM for Addresses Tab 

        this.AssureClaims_MedicalStaff_Tab_EntityIDType = Selector('[role="button"]').find('span').withText('Entity ID Type');
        //POM for Entity ID Type Tab

        this.AssureClaims_MedicalStaff_Txt_AlsoKnownAs = Selector('#alsoknownas');
        //POM For Also Known As Textbox

        this.AssureClaims_MedicalStaff_Txt_StaffStatus = Selector('#lookup_staffstatuscode');
        //POM for Staff status Textbox

        this.AssureClaims_MedicalStaff_Tab_Supplementals = Selector('[role="button"]').find('span').withText('Supplementals');
        //POM For Supplementals Tab

        this.AssureClaims_MedicalStaff_Img_Lookup = Selector('[uib-tooltip="Lookup"]').find('i');
        //POM for Lookup Image Button On Toolbar

        this.AssureClaims_MedicalStaff_Txt_LookupLastName = Selector('[class="ui-grid-filter-input ui-grid-filter-input-0"]').nth(0);
        //POM for Last Name Search Textbox On Lookup window

        this.AssureClaims_MedicalStaff_Btn_AddNewAddress = Selector('#cruduiGridAddBtn');
        //POM for Add New Button For Addreses Tab

        this.AssureClaims_MedicalStaff_Txt_AddrType = Selector('#lookup_addressType');
        //POM For Address Type Lookup Button

        this.AssureClaims_MedicalStaff_Txt_Addr1 = Selector('#lookup_addr1');
        //POM for Address 1 Textbox

        this.AssureClaims_MedicalStaffSearch_Txt_LastName = Selector('[name="Med. Staff Last Name"]');
        //POM for Medical Staff Last Name Textbox On Serach=>Medical Staff Screen
        
        this.AssureClaims_Txt_PhysicianNumber = Selector('#physiciannumber')
        //POM for Physician entity
    }
};export default POM_MedicalStaff;
