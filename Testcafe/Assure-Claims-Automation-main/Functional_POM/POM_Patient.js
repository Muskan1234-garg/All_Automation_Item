import {Selector} from 'testcafe';

class POM_Patient{
    constructor(){
        this.AssureClaims_MaintPatient_Txt_LastName = Selector('#lookup_patlastname');
        //POM for Last Name Textbox On Maint=>Patient Screen

        this.AssureClaims_PIPatient_Txt_LastName = Selector('#lookup_lastname');
        //POM for Last Name Textbox On PI=>Patient Screen

        this.AssureClaims_MaintPatient_Txt_FirstName = Selector('#patfirstname');
        //POM for First Name Textbox On Maint=>Patient's Screen

        this.AssureClaims_Patient_Txt_FirstName = Selector('#firstname');
        //POM for First Name Field On PI=>Patient Screen

        this.AssureClaims_MaintPatient_Txt_DisabilityType = Selector('#lookup_patdisabilitycode');
        //POM for disability type Textbox On Physician/Diagnosis Info Tab On Patient Screen

        this.AssureClaims_MaintPatient_Btn_DisabilityType = Selector('#btn_patdisabilitycode_openlookup');
        //POM for Disability Type Lookup Button On Physician/Diagnosis Info Tab On Patient Screen

        this.AssureClaims_MaintPatient_Txt_MiddleName = Selector('#patmiddlename');
        //POM for Middle Name Textbox for Maint=>Patient Screen

        this.AssureClaims_Patient_Txt_MiddleName = Selector('#middlename');
        //POM for Midle Name Textbox On PI=>Patient Screen

        this.AssureClaims_MaintPatient_Txt_MedicalRecordNumber = Selector('#patmedicalrcdno');
        //POM for Medical Record Number Textbox On Admission info Tab

        this.AssureClaims_MaintPatient_Txt_PatientWeight = Selector('#patweight');
        //POM for Patient Weight Textbox on Patient/Facility Info Tab

        this.AssureClaims_MaintPatient_Txt_IllnessType = Selector('#lookup_patillnesscode');
        //POM for Illness Type On Physician/Diagnosis Tab

        this.AssureClaims_MaintPatient_Txt_NoOfLiveBirths = Selector('#patnbmlivebirths');
        //POM for Number Of Live Births On NewBorn info Tab

        this.AssureClaims_Patient_Tab_NewbornInfo = Selector('[role="button"]').find('span').withText('Newborn Info');
        //POM for New Born Info Tab

        this.AssureClaims_Patient_Tab_Addresses = Selector('[role="button"]').find('span').withText('Addresses');
        //POM for Addresses Tab

        this.AssureClaims_Patient_Tab_EntityIDType = Selector('[role="button"]').find('span').withText('Entity ID Type');
        //POM for Entity ID Type tab

        this.AssureClaims_Patient_Tab_PhysicianDiagnosisInfo = Selector('[role="button"]').find('span').withText('Physician/Diagnosis Info');
        //POM for Physician/Diagnosis Info Tab

        this.AssureClaims_Patient_Tab_Supplementals = Selector('[role="button"]').find('span').withText('Supplementals');
        //POM for Supplementals Tab

        this.AssureClaims_Patient_Tab_PatientFacilityInfo = Selector('[role="button"]').find('span').withText('Patient/Facility Info');
        //POM for Patient/Facility Info Tab

        this.AssureClaims_Patient_Tab_AdmissionInfo = Selector('[role="button"]').find('span').withText('Admission Info');
        //POM for Admission Info Tab

        this.AssureClaims_Patient_Tab_Patient = Selector('[role="button"]').find('span').withText('Patient').nth(0);
        //POM for Patient Tab

        this.AssureClaims_Patient_Procedure_Txt_DateOfProcedure = Selector('#dateofprocedure').nth(1);
        //POM for Date Of Procedure Textbox On Patient Procedure Screen

        this.AssureClaims_Patient_Btn_PhoneSearch = Selector('[ng-disabled="multiphonereadonly"]').find('i');
        //POM for search Button On Phone Field On Patient screen

        this.AssureClaims_Patient_Lst_PhoneType = Selector('[aria-label="Phone Type"]');
        //POM for Phone Type Drop Down On Phone Type PopUp

        this.AssureClaims_Patient_Txt_PhoneNumber = Selector('#newfoldername');
        //POM for Phone Number Textbox On Phone Type PopUp

        this.AssureClaims_Patient_Img_SavePhone = Selector('#A1');
        //POM for Save Phone type

        this.AssureClaims_Patient_Btn_PhoneTypeClose = Selector('[class="cancel-modal-rm"]').find('span');
        //POM for Close Phone type Popup

        this.AssureClaims_Patient_Procedure_Txt_Procedure = Selector('#lookup_procedurecode');
        //POM for Procedure Textbox on Patient's Procedure Screen

        this.AssureClaims_Patient_Procedure_Btn_Procedure = Selector('#btn_procedurecode_openlookup');
        //POM for Procedure Lookup Button On Patient's Procedure Screen

        this.AssureClaims_Patient_Procedure_Btn_ProcedureType = Selector('#btn_proctypecode');
        //POM for Procedure Type Lookup Button

        this.AssureClaims_Patient_Procedure_Txt_ProcedureType = Selector('#lookup_proctypecode');
        //POM for Procedure Type Textbox On Patient Procedure screen

        this.AssureClaims_Patient_Procedure_Txt_ComplicationDate = Selector('#complicationdate').nth(1);
        //POM for Compilation Date Textbox On Procedure Screen

        this.AssureClaims_Patient_Procedure_Btn_Complication = Selector('[textmltitle="Complication"]').find('button');
        //POM for Compilation Button

        this.AssureClaims_Patient_Procedure_Txt_ComplicationTextArea = Selector('#newTextComments');
        //POM For Text Area on Compilation PopUp

        this.AssureClaims_Patient_Procedure_Btn_ComplicationOK = Selector('#usericon').find('i');
        //POM for Compilation OK On Compilation Popup

        this.AssureClaims_Patient_Procedure_Chk_ComplicationPriorAnes = Selector('#priortoanesflag');
        //POM for Compilation Prior to Anesthesia? Checkbox

        this.AssureClaims_Patient_Procedure_Txt_ICCLevel = Selector('#lookup_icclevelcode');
        //POM for ICC Level Textbox on Procedure screen

        this.AssureClaims_Patient_Procedure_Btn_ICCLevel = Selector('#btn_icclevelcode');
        //POM for ICC Level Lookup Button On Procedure Screen

        this.AssureClaims_MaintPatient_Txt_Address1 = Selector('#pataddr1');
        //POM for Address 1 Textbox On Patient Screen

        this.AssureClaims_MaintPatient_Txt_Address2 = Selector('#pataddr2');
        //POM for Address 2 Textbox on Patient screen

        this.AssureClaims_MaintPatient_Txt_Address3 = Selector('#pataddr3');
        //POM for Address 3 Textbox on Patient Screen

        this.AssureClaims_MaintPatient_Txt_City = Selector('#patcity');
        //POM for City Textbox On Patient screen

        this.AssureClaims_MaintPatient_Btn_AddressEdit = Selector('#Edit');
        //POM for Edit Address Button On Patient screen

        this.AssureClaims_MaintPatient_Chk_PrimaryAddress = Selector('#primaryAddress');
        //POM for Primary Address Checkbox On Patient scree

        this.AssureClaims_MaintPatient_Btn_AddressDelete = Selector('#Delete');
        //POM for Delete Address Button On Patient Screen

        this.AssureClaims_MaintPatient_Btn_AddressDeleteNonPrimary = Selector('#Delete').nth(1);
        //POM for Delete Non-Primary Address Button On Patient Screen

        this.AssureClaims_MaintPatient_Txt_LookupLastName = Selector('[class="ui-grid-filter-input ui-grid-filter-input-0"]').nth(0);
        //POM for Last Name Search Textbox On Lookup window

        this.AssureClaims_MaintPatient_Btn_LookupLastPage = Selector('[class="ui-grid-pager-last"]');
        //POM for Switch To Last Page Button On Patient Lookup window

        this.AssureClaims_Patient_Btn_IllnessType = Selector('#btn_patillnesscode_openlookup');
        //POM for Illness Type Button
        //Diksha's Code :RMA-88775
                //Physician POM
        this.AssureClaims_Physician_Add = Selector('[aria-label="Add New Physician"]').find('i').withText('add');

        this.AssureClaims_PIPhysician_Txt_LastName = Selector('#lookup_lastname')
         // POM for Physician lastname textbox
    }
};export default POM_Patient;
