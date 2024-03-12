import {Selector,t} from 'testcafe';
import POM_Employee from '../Functional_POM/POM_Employee'
import POM_MedicalStaff from '../Functional_POM/POM_MedicalStaff'
import POM_Patient from '../Functional_POM/POM_Patient'
import POM_Driver from '../Functional_POM/POM_Driver'
import POM_Entity from '../Functional_POM/POM_Entity'
import POM_Home from '../Functional_POM/POM_Home'
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage'
import Input_Utility from './Input_Utility'
import GenericUsages_Utility from './GenericUsages_Utility'
import Navigation_Utility from './Navigation_Utility'
import Verification_Utility from './Verification_Utility'
import POM_Vehicle from '../Functional_POM/POM_Vehicle'
import POM_ClientProgram from '../Functional_POM/POM_ClientProgram'
import POM_DisabilityPlanManagement from '../Functional_POM/POM_DisabilityPlanManagement'
import POM_PolicyTracking from '../Functional_POM/POM_PolicyTracking';
import POM_People from '../Functional_POM/POM_People';
import POM_AddressMaintenance from '../Functional_POM/POM_AddressMaintenance';
import POM_OrgHierarchy from '../Functional_POM/POM_OrgHierarchy';
import { ClientFunction } from 'testcafe';
import POM_Search from '../Functional_POM/POM_Search';
var faker = require('faker');
const People_POM = new POM_People();
const Search_POM = new POM_Search();
const Vehicle_POM = new POM_Vehicle();
const Employee_POM = new POM_Employee();
const MedStaff_POM = new POM_MedicalStaff();
const PatTrack_POM = new POM_Patient();
const Driver_POM = new POM_Driver();
const Entity_POM = new POM_Entity();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const ClientProgram_POM = new POM_ClientProgram();
const DisabilityPlan_Utility = new POM_DisabilityPlanManagement();
const PolicyTracking = new POM_PolicyTracking();
const MaintAddress_POM = new POM_AddressMaintenance();
const OrgHierarchy_POM = new POM_OrgHierarchy();
class AssureClaims_Maintenance_Functionality_Utility_Sec_Exh{
    constructor(){}
        async AssureClaims_MaintenanceAddNewEntity_Utility(EntityType, ReqParam, ReqParam1, ReqParam2){
            switch(EntityType){
                case "Employee":
                var EmployeeNumber = faker.random.number({min:1000000, max:9999999});
                var EmployeeLastName = faker.name.lastName();
                var Address1 = faker.address.streetName();
                var Address2 = faker.address.streetAddress();
                var Address3 = faker.address.cityPrefix();
                var County = faker.address.cityPrefix();
                var Zip = faker.random.number({min:10000, max:99999});
                var SSN = faker.random.number({min: 100000000, max: 999999999});
                var City = faker.address.city();
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Employee");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EmployeeFrame);
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_EmployeeMaintenance_Txt_LastName,EmployeeLastName,"Employee Last Name Textbox On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_EmployeeNumber,EmployeeNumber.toString(),"Employee Number Textbox On Employee Creation Screen");
                await t.pressKey('tab')
              //===================================================================================Scrolling Starts Here===================================================================================
                const setStyle = ClientFunction((selector, value) =>{document.querySelector(selector).style.overflowY = value; })
await setStyle('.rightPanEx', 'auto');
//=================================================================Scrolling Ends Here=====================================================================================
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_Employee_Tab_EmploymentInfo,"Employment Info Tab On Employee Creation Screen");
                //await t.click(Employee_POM.AssureClaims_Employee_Tab_EmploymentInfo);
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_Department,ReqParam,"Department Textbox On Employee Creation Screen");
                await t.pressKey('tab');
                //==============================================================Scrolling Starts Here============================================================================================================
                const setStyle1 = ClientFunction((selector, value) =>{document.querySelector(selector).style.overflowY = value; })
await setStyle1('.rightPanEx', 'auto');
//==============================================================Scrolling Starts Here===========================================================================
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_Employee_Tab_Addresses,"Addresses Tab On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_Employee_Btn_AddNewAddress,"Add New Address Button On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_AddrType,"HADDR","Address type Textbox on Employee Creation Screen ");
                await t.pressKey('tab');
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_Addr1,Address1,"Address 1 Textbox On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_Addr2,Address2,"Address 2 Textbox On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_Addr3,Address3,"Address 3 Textbox On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_City,City,"City Textbox On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_MaintEmployee_Btn_Country,"Country Lookup Button On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam1,"Description Search Textbox On Employee Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[role="button"]').withText(ReqParam1),ReqParam1+" on Lookup Window");
                              
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_MaintEmployee_Btn_State,"State Lookup  Button On Employee Creation Screen");
                 await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam2,"Description Search Textbox On Employee Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[role="button"]').withText(ReqParam2),ReqParam2+" on Lookup Window");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_County,County,"County Textbox On employee creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_MaintEmployee_Txt_ZipCode,Zip.toString(),"Zip Code Textbox On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Button On Address PopUp");
                const setStyle2 = ClientFunction((selector, value) =>{document.querySelector(selector).style.overflowY = value; })
                await setStyle2('.rightPanEx', 'auto');
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_Employee_Tab_Employee,"Employee Tab On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_SocialSecurityNumber,SSN.toString(),"SSN Textbox On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Employee creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Employee Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Employee_POM.AssureClaims_EmployeeMaintenance_Txt_LastName, EmployeeLastName, "Last Name Textbox On Employee Creation Screen");
                return EmployeeNumber;
                break;
			    
			     
                    case "People":
                var EntityName = faker.name.lastName();
                var FirstName =  faker.name.firstName();
                var SSN = faker.random.number({min: 100000000, max: 999999999});
                var Address1 = faker.address.streetName();
                var Address2 = faker.address.streetAddress();
                var Address3 = faker.address.cityPrefix();
                var County = faker.address.cityPrefix();
                var Zip = faker.random.number({min:10000, max:99999});
                var SSN = faker.random.number({min: 100000000, max: 999999999});
                var City = faker.address.city();
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:People");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PeopleFrame)
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Name, EntityName, "Last Name Textbox On Entity Creation Screen");
                await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_TypeOfPerson, ReqParam, "Type Of Entity Drop Down On Entity Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_FirstName, FirstName, "First Name Textbox On Entity Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_SSN, SSN.toString(), "First Name Textbox On Entity Creation Screen");
                await In_Utility.AssureClaims_ElementWebListSelect_Utility(People_POM.AssureClaims_People_Lst_IDType, "SSN", "ID Type DropDown On Entity Creation Screen");
               ////////
                await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Tab_Addresses,"Addresses Tab On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_People_Btn_AddNewAddress,"Add New Address Button On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_AddrType,"HADDR","Address type Textbox on Employee Creation Screen ");
                await t.pressKey('tab');
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Addr1,Address1,"Address 1 Textbox On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Addr2,Address2,"Address 2 Textbox On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_Addr3,Address3,"Address 3 Textbox On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_City,City,"City Textbox On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_MaintPeople_Btn_Country,"Country Lookup Button On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam1,"Description Search Textbox On Employee Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[role="button"]').withText(ReqParam1),ReqParam1+" on Lookup Window");
                              
                await Nav_Utility.AssureClaims_ElementClick_Utility(People_POM.AssureClaims_MaintPeople_Btn_State,"State Lookup  Button On Employee Creation Screen");
                 await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam2,"Description Search Textbox On Employee Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[role="button"]').withText(ReqParam2),ReqParam2+" on Lookup Window");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_People_Txt_County,County,"County Textbox On employee creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(People_POM.AssureClaims_MaintPeople_Txt_ZipCode,Zip.toString(),"Zip Code Textbox On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Button On Address PopUp");
               
               
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Entity Creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(People_POM.AssureClaims_People_Txt_Name, EntityName, "Name Textbox On Entity Creation Screen");
                return EntityName;

                                				//Added for Client program //

				case "ClientProgram":
                    var ClientProgramNumber = faker.random.number({min:1000000, max:9999999});
                    var ClientProgramName = faker.name.findName();
                    
                
                    var EffExpirationDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
    
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Client Program");
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_ClientProgram_Frame);
                    await t.wait(8000)
                    await In_Utility.AssureClaims_SetValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_ClientProgramName,ClientProgramName,"Program Name Textbox On ClientProgram Creation Screen");
                   
                    await Nav_Utility.AssureClaims_ElementClick_Utility(ClientProgram_POM.AssureClaims_ClientProgram_Btn_Status,"ClientProgram Status Lookup")
                    const ele1 = ClientProgram_POM.AssureClaims_ClientProgram_Lnk_SelectStatus.withText(ReqParam).with({ visibilityCheck: true })
                    await t.expect(ele1.exists).ok('', { timeout: 20000 })
                    await Nav_Utility.AssureClaims_ElementClick_Utility(ele1,"ClientProgram Status Option")
    
    
                    await In_Utility.AssureClaims_SetValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_EffectiveDate,EffExpirationDate,"Effective Date Textbox On ClientProgram Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_ExpirationDate,EffExpirationDate,"Expiration Date Textbox On ClientProgram Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_ClientProgramNumber,ClientProgramNumber.toString(),"Program Number Textbox On ClientProgram Creation Screen");
    
                    await Nav_Utility.AssureClaims_ElementClick_Utility(ClientProgram_POM.AssureClaims_ClientProgram_Btn_ProgramType,"ClientProgram Type Lookup")
                    const ele2 = ClientProgram_POM.AssureClaims_ClientProgram_Lnk_SelectProgramType.withText(ReqParam1).with({ visibilityCheck: true })
                    await t.expect(ele2.exists).ok('', { timeout: 20000 })
                    await Nav_Utility.AssureClaims_ElementClick_Utility(ele2,"ClientProgram Type Option")
    
                    await Nav_Utility.AssureClaims_ElementClick_Utility(ClientProgram_POM.AssureClaims_ClientProgram_Btn_RevenueType,"ClientProgram Revenue Type Lookup")
                    const ele3 = ClientProgram_POM.AssureClaims_ClientProgram_Lnk_SelectRevenueType.withText(ReqParam2).with({ visibilityCheck: true })
                    await t.expect(ele3.exists).ok('', { timeout: 20000 })
                    await Nav_Utility.AssureClaims_ElementClick_Utility(ele3,"ClientProgram Revenue Type Option")
           
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On ClientProgram creation Screen");
                    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "ClientProgram Creation Screen");
                    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_ClientProgramNumber, ClientProgramNumber.toString(), "Program Number Textbox On ClientProgram Creation Screen");
                    return ClientProgramNumber;
                    break;
    
                    //Added for Client program //

                case "Medical Staff":
                var MedStaffLastName = faker.name.lastName();
                var MedStaffFirstName = faker.name.firstName();
                var MedStaffNumber = faker.random.number({min:10000,max:99999});
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Medical Staff");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_MedStaffFrame);
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MaintenanceMedicalStaff_Txt_LastName,MedStaffLastName,"Medical Staff Last Name Textbox On Medical Staff Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MedicalStaff_Txt_FirstName,MedStaffFirstName,"Medical Staff First Name Textbox On Medical Staff Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MedicalStaff_Txt_StaffNumber,MedStaffNumber.toString(),"Staff Number Textbox On Medical Staff Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Medical Staff creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(MedStaff_POM.AssureClaims_MaintenanceMedicalStaff_Txt_LastName, MedStaffLastName, "Last Name Textbox On Medical Staff Creation Screen");
                return MedStaffLastName;
                break;

                case "Patient":
                var PatLastName = faker.name.lastName();
                var PatMiddleName = faker.name.firstName();
                var PatFirstName = faker.name.firstName();
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Patient Tracking");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PatientFrame);
                await In_Utility.AssureClaims_SetValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_FirstName,PatFirstName,"First Name Textbox On Patient Tracking Screen");
                await t.pressKey('tab')
                await In_Utility.AssureClaims_SetValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_LastName,PatLastName,"Last Name Textbox On Patient Tracking Creation Screen");
                await t.pressKey('tab')
                await In_Utility.AssureClaims_SetValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_MiddleName,PatMiddleName,"Middle Name Textbox On Patient Tracking Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Patient Tracking Creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Patient Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_LastName, PatLastName, "Last Name Textbox On Patient Tracking Creation Screen");
                return PatLastName;
                break;

                case "Driver":
                var DriverLastName = faker.name.lastName();
                var DriverFirstName = faker.name.firstName();
                var DriverMidName = faker.name.firstName();
                var AlsoKnownAs = faker.name.firstName();
                var Address1 = faker.address.streetName();
                var Address2 = faker.address.streetAddress();
                var Address3 = faker.address.cityPrefix();
                var County = faker.address.cityPrefix();
                var Zip = faker.random.number({min:10000, max:99999});
                var SSN = faker.random.number({min: 100000000, max: 999999999});
                var PhNumber = faker.random.number({min: 1000000000, max: 9999999999});
                var City = faker.address.city();
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Driver");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_DriverFrame);
                await In_Utility.AssureClaims_ElementWebListSelectInteger_Utility(Driver_POM.AssureClaims_MaintDriver_Lst_TypeOfDriver, ReqParam, "Type Of Driver DropDown On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_MaintenanceDriver_Txt_LastName, DriverLastName, "Last Name Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_MiddleName, DriverMidName, "Middle Name Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_FirstName, DriverFirstName, "First Name Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_AlsoKnownAs, AlsoKnownAs, "Also Known As Textbox On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_Employee_Tab_Addresses,"Addresses Tab On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_Employee_Btn_AddNewAddress,"Add New Address Button On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_AddrType,"HADDR","Address type Textbox on Driver Creation Screen ");
                await t.pressKey('tab');
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_Address1,Address1,"Address 1 Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_Address2,Address2,"Address 2 Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_Address3,Address3,"Address 3 Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_City,City,"City Textbox On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Driver_POM.AssureClaims_Driver_Btn_Country,"Country Lookup Button On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam1,"Description Search Textbox On Driver Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[role="button"]').withText(ReqParam1),ReqParam1+" on Lookup Window");
                              
                await Nav_Utility.AssureClaims_ElementClick_Utility(Driver_POM.AssureClaims_Driver_Btn_State,"State Lookup  Button On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam2,"Description Search Textbox On Driver Creation Page");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[role="button"]').withText(ReqParam2),ReqParam2+" on Lookup Window");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_County,County,"County Textbox On Driver creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_ZipCode,Zip.toString(),"Zip Code Textbox On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Button On Address PopUp");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Driver_POM.AssureClaims_Driver_Tab_Driver,"Driver Tab On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_SSN, SSN.toString(), "SSN Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_OfficePhone, PhNumber.toString(), "Office Phone Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_HomePhone, PhNumber.toString(), "Home Phone Textbox On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Driver Creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Driver Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Driver_POM.AssureClaims_MaintenanceDriver_Txt_LastName, DriverLastName, "Last Name Textbox On Driver Creation Screen");
                return DriverLastName;
                break;

                case "Entity":
                var EntityName = faker.name.lastName();
                var Title = faker.name.title();
                var NatureOfBusiness = faker.name.jobTitle();
                await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Entity");
                await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame)
                await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntityName, "Last Name Textbox On Entity Creation Screen");
                await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_TypeOfEntity, ReqParam, "Type Of Entity Drop Down On Entity Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_NatureOfBusiness, NatureOfBusiness, "Nature Of Business Textbox On Entity Creation screen");
                await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Title, Title, "Title Textbox On Entity Creation Screen");
                await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_IDType, ReqParam1, "ID Type DropDown On Entity Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Entity Creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntityName, "Name Textbox On Entity Creation Screen");
                return EntityName;
                break;

                case "Vehicle":
                    var VehicleID = faker.random.number({min: 1000, max: 9999});
                    var VehicleMake = faker.name.findName();
                    var VehicleWeight = faker.random.number({min: 1000, max: 9999});
                    //var VehicleWeight = faker.random.number();
                    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Vehicle");
                    await t.wait(3000)
                    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_VehicleFrame);
                    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Vehicle_ID,VehicleID.toString(),"Vehicle ID Textbox On Vehicle Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Vehicle_Make,VehicleMake,"VehicleMake Textbox On Vehicle Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Vehicle_Model,VehicleWeight.toString(),"VehicleModel Textbox On Vehicle Creation Screen");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_POM.AssureClaims_Vehicle_Tab_Vehicle_Detail,"Vehicle_Detail On Vehicle Creation Screen");
                    await t.wait(3000)
                    await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Weight,VehicleWeight.toString(),"Vehicle weight Textbox On Vehicle Creation Screen");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_POM.AssureClaims_Vehicle_Tab_Supplementals,"Supplementals Tab On Vehicle Creation Screen");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Employee creation Screen");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Vehicle_POM.AssureClaims_Vehicle_Tab_Vehicle_Info,"Vehicle info On Vehicle Creation Screen");
                    return VehicleID;
                    break;
			    
	//Sai's Code : RMA-96163 started here
	case "Address":
                
                        var Address1 = faker.address.streetName();
                        var Address2 = faker.address.streetAddress();
                        var Address3 = faker.address.cityPrefix();
                        var Zip = faker.random.number({min:10000, max:99999});
                        var City = faker.address.city();
                        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Address");
                        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_AddressFrame);
                        
                    await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr1,Address1,"Address 1 Textbox On Address Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr2,Address2,"Address 2 Textbox On Address Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_Addr3,Address3,"Address 3 Textbox On Address Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_City,City,"City Textbox On Address Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(MaintAddress_POM.AssureClaims_Address_Txt_ZipCode,Zip.toString(),"Zip Code Textbox On Address Creation Screen");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Address_Btn_Country,"Country Lookup")
                    await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam,"Description Search Textbox On Address Creation Page");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Address Creation Screen");
                    const AddressCountry = MaintAddress_POM.AssureClaims_Address_Lnk_SelectCountry.withText(ReqParam).with({ visibilityCheck: true })
                    await t.expect(AddressCountry.exists).ok('', { timeout: 20000 })
                    await Nav_Utility.AssureClaims_ElementClick_Utility(AddressCountry,"Country Option")
        
                    await Nav_Utility.AssureClaims_ElementClick_Utility(MaintAddress_POM.AssureClaims_Address_Btn_State,"State Lookup")
                    await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,ReqParam1,"Description Search Textbox On Address Creation Page");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On Address Creation Screen");
                    const AddressState = MaintAddress_POM.AssureClaims_Address_Lnk_SelectState.withText(ReqParam1).with({ visibilityCheck: true })
                    await t.expect(AddressState.exists).ok('', { timeout: 20000 })
                    await Nav_Utility.AssureClaims_ElementClick_Utility(AddressState,"State Option")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Driver Creation Screen");
                    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Driver Creation Screen");
           	    break;
          //Sai's Code : RMA-96163 ended here
			    
			      //Sai's Code : RMA-97799 Starts here
          case "Org. Hierarchy":
            var AccountNo = faker.random.number({min:10000, max:99999});
            var BankName = "Bank_" + faker.name.lastName();
            var TransitRoutingNumber =faker.random.number({min:100000000, max:999999999});
            var ClientName = faker.name.findName();
            var Abbreviation = faker.name.findName();
          
            await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Org. Hierarchy");
            await t.wait(6000)
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_OrgHierarchyMainPageFrame);
            await t.wait(6000);
            await Nav_Utility.AssureClaims_ElementClick_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Btn_New,"Add Button On OrgHierarchy Creation Screen");
            await t.switchToMainWindow()
            await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_OrgHierarchyAfterMainPageFrame);
            await t.wait(6000);
            await In_Utility.AssureClaims_SetValue_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Txt_LastName,ClientName,"Client Name Textbox On OrgHierarchy Creation Screen");
            await In_Utility.AssureClaims_SetValue_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Txt_Abbreviation,Abbreviation,"Abbreviation Textbox On OrgHierarchy Creation Screen");
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On OrgHierarchy creation Screen");
            await Nav_Utility.AssureClaims_ElementClick_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Btn_AddBankAccount,"Add BankAccount On OrgHierarchy Creation Screen");
            await t.wait(3000)
            await In_Utility.AssureClaims_SetValue_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Txt_BankName,BankName,"BankName weight Textbox On OrgHierarchy Creation Screen");
            await In_Utility.AssureClaims_SetValue_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Txt_AccountNumber,AccountNo.toString(),"AccountNo weight Textbox On OrgHierarchy Creation Screen");
            await In_Utility.AssureClaims_SetValue_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Txt_TransitRoutingNumber,TransitRoutingNumber.toString(),"TransitRoutingNumber weight Textbox On OrgHierarchy Creation Screen");
            await Nav_Utility.AssureClaims_ElementClick_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Btn_AccountType, "Account Type Lookup")
            const AccountType = OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Lnk_SelectAccountType.withText(ReqParam).with({ visibilityCheck: true })
            await t.expect(AccountType.exists).ok('', { timeout: 20000 })
            await Nav_Utility.AssureClaims_ElementClick_Utility(AccountType, "Account Type Option")
            await Nav_Utility.AssureClaims_ElementClick_Utility(OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Btn_BankingStatus, "Banking Status Lookup")
            const BankingStatus = OrgHierarchy_POM.AssureClaims_MaintOrgHierarchy_Lnk_SelectBankingStatus.withText(ReqParam1).with({ visibilityCheck: true })
            await t.expect(BankingStatus.exists).ok('', { timeout: 20000 })
            await Nav_Utility.AssureClaims_ElementClick_Utility(BankingStatus, "Banking Status Option")
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On OrgHierarchy creation Screen");
            break;
                      //Sai's Code : RMA-97799 Ended here
                default: console.log("This Case is Not Defined In the Function of Maint entity creation")
            }
        }

        async AssureClaims_MaintenanceEditEntity_Utility(EntityType, ReqParam, ReqParam1, ReqParam2){
            switch(EntityType){
                case "Employee":
                var EmployeeName = faker.name.lastName();
                var EmployeeFirstName = faker.name.firstName();
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_EmployeeMaintenance_Txt_LastName,EmployeeName,"Employee Last Name Textbox On employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_FirstName,EmployeeFirstName,"Employee First Name Textbox On Employee Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image On Employee Creation Page");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Employee Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Employee_POM.AssureClaims_EmployeeMaintenance_Txt_LastName, EmployeeName, "Last Name Textbox On Employee Creation Screen");
                return EmployeeName;
                break;
				
				 case "ClientProgram":
                    var ClientProgramNumber = faker.random.number({min:1000000, max:9999999});
                    var ClientProgramName = faker.name.findName();
                
                    await In_Utility.AssureClaims_SetValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_ClientProgramName,ClientProgramName,"Program Name Textbox On ClientProgram Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_ClientProgramNumber,ClientProgramNumber.toString(),"Program Number Textbox On ClientProgram Creation Screen");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image On ClientProgram Creation Page");
                    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "ClientProgram Creation Screen");
                    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(ClientProgram_POM.AssureClaims_CP_Txt_ClientProgramName,ClientProgramName, "Program Name Textbox On ClientProgram Creation Screen");
                    return ClientProgramName;
                    break;

                case "Medical Staff":
                var MedStaffLastName = faker.name.lastName();
                var MedStaffFirstName = faker.name.firstName();
                var MedStaffNumber = faker.random.number({min:10000,max:99999});
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MaintenanceMedicalStaff_Txt_LastName,MedStaffLastName,"Medical Staff Last Name Textbox On Medical Staff Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MedicalStaff_Txt_FirstName,MedStaffFirstName,"Medical Staff First Name Textbox On Medical Staff Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MedicalStaff_Txt_StaffNumber,MedStaffNumber.toString(),"Staff Number Textbox On Medical Staff Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Employee creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(MedStaff_POM.AssureClaims_MaintenanceMedicalStaff_Txt_LastName, MedStaffLastName, "Last Name Textbox On Medical Staff Creation Screen");
                return MedStaffLastName;
                break;

                case "Patient":
                var PatLastName = faker.name.lastName();
                var PatFirstName = faker.name.firstName();
                await In_Utility.AssureClaims_SetValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_FirstName,PatFirstName,"First Name Textbox On Patient Tracking Screen");
                await In_Utility.AssureClaims_SetValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_LastName,PatLastName,"Last Name Textbox On Patient Tracking Creation Screen");
                await t.pressKey('tab')
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Patient Tracking creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Patient Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_LastName, PatLastName, "Last Name Textbox On Patient Tracking Screen");
                return PatLastName;
                break;

                case "Driver":
                var DriverLastName = faker.name.lastName();
                var DriverFirstName = faker.name.firstName();
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_MaintenanceDriver_Txt_LastName, DriverLastName, "Last Name Textbox On Driver Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_Driver_Txt_FirstName, DriverFirstName, "First Name Textbox On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Driver Creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Driver Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Driver_POM.AssureClaims_MaintenanceDriver_Txt_LastName, DriverLastName, "Last Name Textbox On Driver Creation Screen");
                return DriverLastName;
                break;

                case "Entity":
                var EntLastName = faker.name.lastName();
                var EntNatureOfBus = faker.name.jobTitle();
                await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntLastName, "Last Name Textbox On Entity Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_NatureOfBusiness, EntNatureOfBus, "Nature Of Business Textbox On Entity Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Entity Creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, EntLastName, "Last Name Textbox On Entity Creation Screen");
                return EntLastName;
                break;

                case "Vehicle":
                var LicenseNumber = faker.random.number({min:10000,max:99999});
                await In_Utility.AssureClaims_SetValue_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_License_Number,LicenseNumber.toString(),"License Number Textbox On Vehicle Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image On Vehicle Creation Page");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Vehicle Creation Screen");
                return LicenseNumber;
                break;

                default: console.log("This Case is Not Defined In the Function of Maint Entity creation")
            }
        }
 async AssureClaims_PersonInvolvedAddNewEntity_Utility(EntityType, ReqParam, ReqParam1, ReqParam2){
        
            switch (EntityType) {
                case "Medical Staff":
                    var MedStaffLastName = faker.name.lastName();
                    var MedStaffFirstName = faker.name.firstName();
                    var MedStaffNumber = faker.random.number({ min: 10000, max: 99999 });

                    await Nav_Utility.AssureClaims_ElementClick_Utility(MedStaff_POM.AssureClaims_AddPersonInvolved, "Add Person Involved Button on WC Page")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(MedStaff_POM.AssureClaims_AddMedicalStuff, "Add Medical Stuff Button on WC Page")
                    // await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_MedStaffFrame);
                    await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_PIMedicalStaff_Txt_LastName, MedStaffLastName, "Medical Staff Last Name Textbox On Medical Staff Creation Screen");
                    //await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MedicalStaff_Txt_FirstName,MedStaffFirstName,"Medical Staff First Name Textbox On Medical Staff Creation Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MedicalStaff_Txt_StaffNumber, ReqParam1.toString(), "Staff Number Textbox On Medical Staff Creation Screen");
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Medical Staff creation Screen");
                    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");
                    //await Verify_Utility.AssureClaims_VerifyElementValue_Utility(MedStaff_POM.AssureClaims_PIMedicalStaff_Txt_LastName, MedStaffLastName, "Last Name Textbox On Medical Staff Creation Screen");
                    return MedStaffLastName;
                    break;

                case "Driver":
                    await Nav_Utility.AssureClaims_ElementClick_Utility(MedStaff_POM.AssureClaims_AddPersonInvolved, "Add Person Involved Button on WC Page")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Driver_POM.AssureClaims_AddDriver, "AddDriver Button on WC Page")
                    await In_Utility.AssureClaims_ElementWebListSelect_Utility(Driver_POM.AssureClaims_PIDriver_Txt_DriverType, ReqParam, "Driver type")

                    await In_Utility.AssureClaims_SetValue_Utility(Driver_POM.AssureClaims_PIDriver_Txt_LastName, ReqParam1, "Text CheckNumberA")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On physician creation Screen");
                    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");

                    break;

                case "Physician":
                    await Nav_Utility.AssureClaims_ElementClick_Utility(MedStaff_POM.AssureClaims_AddPersonInvolved, "Add Person Involved Button on WC Page")
                    await Nav_Utility.AssureClaims_ElementClick_Utility(PatTrack_POM.AssureClaims_Physician_Add, "AddPhysician Button on WC Page")
                    await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Txt_PhysicianNumber, ReqParam1.toString(), "Physician Textbox OnPhysician entity Screen");
                    await In_Utility.AssureClaims_SetValue_Utility(PatTrack_POM.AssureClaims_PIPhysician_Txt_LastName, ReqParam, "Medical Staff Last Name Textbox On Medical Staff Creation Screen");

                    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On physician creation Screen");
                    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");
                    break;
            

}
}
    async AssureClaims_Maintenance_DisabilityPlanCreation_Utility(Insured, Country, PlanStatus, Premium ,BankAccount, PayPeriodStartDate, PreferredPaymentSchedule, MonthlyPaymentType,PreferredPrintDate, PreferredMonthlyDay, PreferredDayOfWeekforPayments)
        {
            var PlanNumber = faker.random.number({min:1000000, max:9999999});
            var PlanName =faker.name.lastName();
            var PlanDescription =faker.commerce.productDescription();
            var EffectiveDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(-1,0,-1, "MM/DD/YYYY")
            var ExpirationDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(1,0,-1, "MM/DD/YYYY")
            var IssueDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,0,0, "MM/DD/YYYY")
            var ReviewDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,0,0, "MM/DD/YYYY")
            var RenewalDate= await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,0,0, "MM/DD/YYYY")
            var CancelDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,0,0, "MM/DD/YYYY")
await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Disability Plan Management");
await t.wait(2000)
await t.switchToMainWindow();
await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_DisabilityPlanManagementIframe);
await t.wait(4000)
await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_PlanNumber,PlanNumber.toString(),"Plan Number Text Box on Maintenance -> Disability Plan Management Page");
await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_PlanName,PlanName,"Plan Name Text Box on Maintenance -> Disability Plan Management Page");
await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_PlanDescription,PlanDescription,"Plan Description Text Box on Maintenance -> Disability Plan Management Page");
await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_Insured,Insured,"Insured is entered");
await t.wait(2000)
await t.pressKey('tab');
await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_Country,Country,"Country Text Box on Maintenance -> Disability Plan Management Page");
await t.wait(2000)
await t.pressKey('tab');
await Nav_Utility.AssureClaims_ElementClick_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Btn_PlanStatus,"Claim Type Lookup")
const ele2 = DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Lnk_PlanStatus.withText(PlanStatus).with({ visibilityCheck: true })
await t.expect(ele2.exists).ok('', { timeout: 20000 })
await Nav_Utility.AssureClaims_ElementClick_Utility(ele2,"Claim Type Option")

await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_Premium,Premium,"Premium Text Box on Maintenance -> Disability Plan Management Page");
await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Lst_BankAccount,BankAccount,"Bankaccount Text Box on Maintenance -> Disability Plan Management Page");
//await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_PayPeriodStartDate,PayPeriodStartDate,"PayPeriodStartDateText Box on Maintenance -> Disability Plan Management Page");
await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_EffectiveDate,EffectiveDate,"EffectiveDate Text Box on Maintenance -> Disability Plan Management Page");
await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_ExpirationDate,ExpirationDate,"ExpirationDate Text Box on Maintenance -> Disability Plan Management Page");
//await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_IssueDate,IssueDate,"IssueDate Text Box on Maintenance -> Disability Plan Management Page");
//await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_ReviewDate,ReviewDate,"ReviewDate Text Box on Maintenance -> Disability Plan Management Page");
//await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_RenewalDate,RenewalDate,"RenewalDate Text Box on Maintenance -> Disability Plan Management Page");
//await In_Utility.AssureClaims_SetValue_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Txt_CancelDate,CancelDate,"CancelDate Entered");
//await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_CheckBox_CheckPrintsBeforeEndOfPayPeriod,'check',"Check Box enabled");    
await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Lst_PreferredPaymentSchedule,PreferredPaymentSchedule,"Preferredpayment is entered");
await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Lst_MonthlyPaymentType,MonthlyPaymentType,"MonthlyPayment Type Entered");
//await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Lst_PreferredMonthlyDay,PreferredMonthlyDay,"PreferredMonthlyday entered");
await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_PrintPreferredDate,PreferredPrintDate,"PrintDate");
//await In_Utility.AssureClaims_ElementWebListSelect_Utility(DisabilityPlan_Utility.AssureClaims_DisabilityPlanManagement_Lst_PreferredDayOfWeekForPayments,PreferredDayOfWeekforPayments,"PreferredDayOfWeekforPayments Entered");
await t.wait(1000);
await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Disability Claim creation Screen");
await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " General Claim Creation Screen");
await t.wait(2000);
return PlanName;        
}
async AssureClaims_SearchClaim(PolicyName) {
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Policy");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_PolicyIframe);
    await t.wait(3000)
    await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_PolicyName,PolicyName,"Policy Name")
    console.log("AssureClaims_Search Function is Called To Search Policy ");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery,"SubmitQuery")
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_PolicyLnkIframe);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_ClaimNumber.withText(PolicyName),"PolicyName link")
    console.log("Search is Completed");
   await t.switchToMainWindow();
    await t.wait(4000)
}

async AssureClaims_PolicyTrackingCreation(Premium,InternalPolicyStatus,InternalPolicyLOB,InternalInsurer,InternalInsured,InternalInsured1,InternalCoverageType,InternalPolicyLimit,InternalPolicyMco) 
{
    var PolicyNumber = faker.random.number({min: 100, max: 999});
    var PolicyName = faker.name.findName();
    var EffectiveDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,0,0, "MM/DD/YYYY")
    var ExpirationDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,1,0, "MM/DD/YYYY")
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Policy Tracking");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
    await t.wait(5000)
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyName,PolicyName,"Policy Name Text is Entered")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyNumber,PolicyNumber.toString(),"PolicyNumber Text is Entered")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_Premium,Premium," Premium Is Entered")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyStatus,"Policy Status Lookup Button clicked")
    const PolicyStatus = PolicyTracking.AssureClaims_Policy_Lnk_SelectPolicyStatus.withText(InternalPolicyStatus).with({ visibilityCheck: true })
    await t.expect(PolicyStatus.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyStatus,"Policy Status Option")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyLOB,"Policy LOB Lookup Button ")
    const PolicyLOB = PolicyTracking.AssureClaims_Policy_Lnk_SelectPolicyLOB.withText(InternalPolicyLOB).with({ visibilityCheck: true })
    await t.expect(PolicyLOB.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyLOB,"Policy LOB Option")
    //commented above code as Policy LOB is mandatery on other envirnoment
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_EffectiveDate,EffectiveDate,"EffectiveDate Entered")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_ExpirationDate,ExpirationDate,"ExpirationDate Entered")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(PolicyTracking.AssureClaims_Policy_chk_PrimaryPolicy,'Check',"PrimaryPolicy CheckBox");
    //Verification Of PrimaryPolicy Check Box
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(PolicyTracking.AssureClaims_Policy_chk_ClaimsMadeCoverage,'Check',"ClaimsMadeCoverage CheckBox Checked");
    //Verification Of ClaimsMadeCoverage Check Box
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_PolicyInfo, "PolicyInfo Tab On Policy Tracting Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_InsurerInfo, "InsurerInfo  Tab On Policy Tracting Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_Insured1,"Insurer Look Up Button")

    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_Insurer,"Insurer Look Up Button")
  
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingSearchIFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_SubmitQuery,"Search Image On Policy Tracking Search Window")
    await t.wait(5000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Link_Insurer.withText(InternalInsurer), "Insurer Link On Policy Tracking Selection Window")
    await t.wait(2000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);

    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Btn_Insured,InternalInsured,"Insured")
    await t.wait(3000)
    await t.pressKey('tab')
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Btn_Insured,InternalInsured1,"Insured1")
    await t.wait(3000)
    await t.pressKey('tab')

    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_PolicyInfo, "PolicyInfo Tab On Policy Tracting Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");

    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_BrokerInfo, "BrokerInfo Tab On Policy Tracting Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_Supplementals, "Supplementals Tab On Policy Tracting Creation Screen")
    //Tab Verification Completed
    //-------------------------------PolicyCoverage Creation----------------------------------------------------------------
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_AddBtn_PolicyCoverge,"Add Policy Coverage Button on PolicyTracking Page")
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_CoverageType,"Policy Status Lookup")
    await In_Utility.AssureClaims_SetValue_Utility(Home_POM.AssureClaims_Generic_DescriptionTextboxOnLookup,InternalCoverageType,"Description Search Textbox On PolicyTracking Page");
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_DescriptionSearchIconOnLookup,"Description Search Icon On PolicyTracking Page");
    const CoverageType = PolicyTracking.AssureClaims_Policy_Lnk_SelectCoverageType.withText(InternalCoverageType).with({ visibilityCheck: true })
    await t.expect(CoverageType.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(CoverageType,"Coverage Type Option")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyLimit,InternalPolicyLimit," PolicyLimit")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
    await t.switchToMainWindow();
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back btn pressed");
    await t.wait(3000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
//-----------------------------------------------------Policy MCO Creation--------------------------------------------------------------------------------------
   /* await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_AddBtn_PolicyMCO,"Add Policy MCO Button on PolicyTracking Page")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_PolicyMCO,"PolicyMco Look Up Button")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingSearchIFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_SubmitQuery,"Search Image On Policy Tracking Search Window")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Link_PolicyMco.withText(InternalPolicyMco), "Insurer Link On Policy Tracking Selection Window")
    await t.wait(2000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
    await t.switchToMainWindow();
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back btn pressed");
    await t.wait(3000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
    */
   //await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_PolicyInfo, "PolicyInfo Tab On Policy Tracting Creation Screen")
    PolicyName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyName,"value");
    console.log(PolicyName.yellow);
    //------------------------------------------Edit EffectiveDate & ExpirationDate-------------------------------------------------------
    var EffectiveDateEdit = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,-1,0, "MM/DD/YYYY")
    var ExpirationDateEdit = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(1,0,0, "MM/DD/YYYY")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_EffectiveDate,EffectiveDateEdit,"EffectiveDate")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_ExpirationDate,ExpirationDateEdit,"ExpirationDate")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");

return PolicyName;
}


//NITIKA'S CODE 
async AssureClaims_PolicyTrackingCreation_ClientProgram(Premium,InternalPolicyStatus,InternalPolicyLOB,InternalInsurer,InternalInsured,InternalInsured1,InternalCoverageType,InternalPolicyLimit,InternalPolicyMco,ClientProgramName,SyndicateName,UMRNumber) 
{
    var PolicyNumber = faker.random.number({min: 100, max: 999});
    var PolicyName = faker.name.findName();
    var EffectiveDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,0,0, "MM/DD/YYYY")
    var ExpirationDate = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,1,0, "MM/DD/YYYY")
	await t.wait(5000)
    await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Policy Tracking");
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
    await t.wait(5000)
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyName,PolicyName,"Policy Name Text is Entered")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyNumber,PolicyNumber.toString(),"PolicyNumber Text is Entered")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_Premium,Premium," Premium Is Entered")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyStatus,"Policy Status Lookup Button clicked")
    const PolicyStatus = PolicyTracking.AssureClaims_Policy_Lnk_SelectPolicyStatus.withText(InternalPolicyStatus).with({ visibilityCheck: true })
    await t.expect(PolicyStatus.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyStatus,"Policy Status Option")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyLOB,"Policy LOB Lookup Button ")
    const PolicyLOB = PolicyTracking.AssureClaims_Policy_Lnk_SelectPolicyLOB.withText(InternalPolicyLOB).with({ visibilityCheck: true })
    await t.expect(PolicyLOB.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyLOB,"Policy LOB Option")
    //commented above code as Policy LOB is mandatery on other envirnoment
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_EffectiveDate,EffectiveDate,"EffectiveDate Entered")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_ExpirationDate,ExpirationDate,"ExpirationDate Entered")
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(PolicyTracking.AssureClaims_Policy_chk_PrimaryPolicy,'Check',"PrimaryPolicy CheckBox");
    //Verification Of PrimaryPolicy Check Box
    await Nav_Utility.AssureClaims_WebCheckBoxSelect_Utility(PolicyTracking.AssureClaims_Policy_chk_ClaimsMadeCoverage,'Check',"ClaimsMadeCoverage CheckBox Checked");
    //Verification Of ClaimsMadeCoverage Check Box

    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_ClientProgram,"Client Program Lookup Button clicked")
	await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingSearchIFrame);
    await t.wait(5000)
	await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_ClientProgram_SubmitQuery,"Submit Button Clicked on Client Program Search Screen")
	await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Link_Clientprogram.withText(ClientProgramName), "ClientProgram Link On Search Selection Window")
    await t.wait(2000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
	
	
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_PolicyInfo, "PolicyInfo Tab On Policy Tracking Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_InsurerInfo, "InsurerInfo  Tab On Policy Tracking Creation Screen")
    
	await t.wait(3000)
	
	await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_Insurer_LookUp,"Insurer Look Up Button")
	await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_Insurer_LookUp_Link,"Link Insurer Look Up Button")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Link_Clientprogram_Insurer.withText(SyndicateName), "Insurer Name Selected")
    
	await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_UMR_Number_LookUp,"UMR Look Up Button Clicked")
	await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Link_Clientprogram_Insurer_UMR_Number.withText(UMRNumber.toString()), "UMR Number Selected")
	await t.wait(3000)
	
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_PolicyInfo, "PolicyInfo Tab On Policy Tracking Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");

    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_InsurerInfo, "InsurerInfo  Tab On Policy Tracking Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_BrokerInfo, "BrokerInfo Tab On Policy Tracting Creation Screen")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_Supplementals, "Supplementals Tab On Policy Tracting Creation Screen")
    //Tab Verification Completed
    //-------------------------------PolicyCoverage Creation----------------------------------------------------------------
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_AddBtn_PolicyCoverge,"Add Policy Coverage Button on PolicyTracking Page")
    
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_CoverageType,"Policy Status Lookup")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_coverageDiscriptionSearch,InternalCoverageType,"Client ProgramName Search")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Payment_Btn_FilterSerach.nth(1), "Search button")
    const CoverageType = PolicyTracking.AssureClaims_Policy_Lnk_SelectCoverageType.withText(InternalCoverageType).with({ visibilityCheck: true })
    await t.expect(CoverageType.exists).ok('', { timeout: 20000 })
    await Nav_Utility.AssureClaims_ElementClick_Utility(CoverageType,"Coverage Type Option")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyLimit,InternalPolicyLimit," PolicyLimit")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
    await t.switchToMainWindow();
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back btn pressed");
    await t.wait(3000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
//-----------------------------------------------------Policy MCO Creation--------------------------------------------------------------------------------------
   /* await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_AddBtn_PolicyMCO,"Add Policy MCO Button on PolicyTracking Page")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_PolicyMCO,"PolicyMco Look Up Button")
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingSearchIFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Btn_SubmitQuery,"Search Image On Policy Tracking Search Window")
    await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Link_PolicyMco.withText(InternalPolicyMco), "Insurer Link On Policy Tracking Selection Window")
    await t.wait(2000);
    await t.switchToMainWindow();
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");
    await t.switchToMainWindow();
    await t.wait(2000);
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back,"Back btn pressed");
    await t.wait(3000)
    await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_PolicyTrackingIFrame);
    */
   //await Nav_Utility.AssureClaims_ElementClick_Utility(PolicyTracking.AssureClaims_Policy_Tab_PolicyInfo, "PolicyInfo Tab On Policy Tracting Creation Screen")
    PolicyName = await Verify_Utility.AssureClaims_AttributeFetch_Utility(PolicyTracking.AssureClaims_Policy_Txt_PolicyName,"value");
    console.log(PolicyName.yellow);
    //------------------------------------------Edit EffectiveDate & ExpirationDate-------------------------------------------------------
    var EffectiveDateEdit = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(0,-1,0, "MM/DD/YYYY")
    var ExpirationDateEdit = await Generic_Utility.AssureClaims_FuturePastDateInfo_Utility(1,0,0, "MM/DD/YYYY")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_EffectiveDate,EffectiveDateEdit,"EffectiveDate")
    await In_Utility.AssureClaims_SetValue_Utility(PolicyTracking.AssureClaims_Policy_Txt_ExpirationDate,ExpirationDateEdit,"ExpirationDate")
    await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On PolicyTracking creation Screen");
    await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " PolicyTracking Creation Screen");

return PolicyName;
}
	
	//Diksha's code : RMA-88774
	    async AssureClaims_MaintenanceAddNewEntity_Eron_Utility(EntityType, ReqParam, ReqParam1, ReqParam2) {
        switch (EntityType) {
            case "Employee":

                var EmployeeNumber = faker.random.number({ min: 1000000, max: 9999999 });
		await t.wait(4000)
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_EmployeeNumber, EmployeeNumber.toString(), "Employee Number Textbox On Employee Creation Screen");
                await t.pressKey('tab')
                await Nav_Utility.AssureClaims_ElementClick_Utility(Employee_POM.AssureClaims_Employee_Tab_EmploymentInfo, "Employment Info Tab On Employee Creation Screen");
                await In_Utility.AssureClaims_SetValue_Utility(Employee_POM.AssureClaims_Employee_Txt_Department, ReqParam, "Department Textbox On Employee Creation Screen");
                await t.pressKey('tab');
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Employee creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Employee Creation Screen");
                return EmployeeNumber;
                break;


            case "Driver":

                await In_Utility.AssureClaims_ElementWebListSelect_Utility(Driver_POM.AssureClaims_MaintDriver_Lst_TypeOfDriver, ReqParam, "Type Of Driver DropDown On Driver Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Driver Creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Driver Creation Screen");
                break;

            case "Medical Staff":
                var MedStaffNumber = faker.random.number({ min: 10000, max: 99999 });
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_MedicalStaff_Txt_StaffNumber, MedStaffNumber.toString(), "Staff Number Textbox On Medical Staff Creation Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Employee creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");
                return MedStaffNumber;
		break;

          case "Patient":
               
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Patient Tracking creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Patient Creation Screen");
                await Verify_Utility.AssureClaims_VerifyElementValue_Utility(PatTrack_POM.AssureClaims_MaintPatient_Txt_LastName, PatLastName, "Last Name Textbox On Patient Tracking Screen");
                return PatLastName;
                break;

            case "Physician":
                var PhysicianNumber = faker.random.number({ min: 10000, max: 99999 });
                await In_Utility.AssureClaims_SetValue_Utility(MedStaff_POM.AssureClaims_Txt_PhysicianNumber, PhysicianNumber.toString(), "Physician Textbox OnPhysician entity Screen");
                await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On physician creation Screen");
                await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Medical Staff Creation Screen");
                return PhysicianNumber;
		break;

 }
    }
    async AssureClaims_SearchEntityEron(FetchLastName, FetchSSN) {
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenanceERON_SearchEntityFrame);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Entity_lastName, FetchLastName, "ssn of entity Name")
        console.log("AssureClaims_Search Function is Called To Search EntityEron ");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_MaintenenceERON_LinkSelectFrame);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_SSNNumber.withText(FetchSSN), "EnityName link")
        console.log("Search is Completed");
        await t.switchToMainWindow();
        await t.wait(4000)
    }    




   
};
export default AssureClaims_Maintenance_Functionality_Utility_Sec_Exh;
