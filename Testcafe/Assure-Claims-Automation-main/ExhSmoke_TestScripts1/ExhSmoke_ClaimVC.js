import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors';
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import Functionality_Utility_Sec_Exh from '../Functional_Utilities/Functionality_Utility_Sec_Exh';
import Input_Utility from '../Functional_Utilities/Input_Utility'
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility'
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_Vehicle from '../Functional_POM/POM_Vehicle'
import POM_unit from '../Functional_POM/POM_unit';

const Vehicle_POM = new POM_Vehicle();
const Maint_Utility = new Maintenance_Functionality_Utility();
const DataIUT = require('../DataFiles/DataIUTSQL_ExhSmoke.json');
const unit_POM = new POM_unit();
const Function_Utility = new Functionality_Utility_Sec_Exh();
const Home_POM = new POM_Home();
const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();


var StrClaimNumber;
var VehicleID;
var VehicleMake;
//Global Variable Declaration

//***********************************************************************************
//JIRA ID OF STORY : RMA-97883
//Description      : ExhSmoke_ClaimVC
//AUTHOR           : Saikrishan,Maddula
//DEPENDANCY       : No
// PRE-REQUISITES  : No
//Preferred Server : IUTSQL
//***********************************************************************************

DataIUT.forEach(data => {
    const LoggedInUser = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`ExhSmoke_ClaimVC`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
    });
    //=====================================================Vehicle Claim Creation Started Here====================================================================
    test('AssureClaims_Vehicle_Claim_Test_01', async t => {
        var d = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        console.log("AssureClaims_VehicleAccidentClaimCreation Function is Called To Create Vehicle Claim".yellow);
        StrClaimNumber = await Function_Utility.AssureClaims_VehicleAccidentClaimCreation(d, d, data.ClaimStatus, data.VAClaimType, data.Department, data.VAPolicyLOB)
        console.log("New Vehicle Claim is Created with Claim Number: ".green + StrClaimNumber);
    });
    //=====================================================Vehicle Claim Creation Completed Here====================================================================
    //Zone Switching to Maintenance
    //Vehicle Creation From Entity Maintenance Starts Here
    test('AssureClaims_Maintenance_Vehicle_Test_02', async t => {
        //================================================================Zone Switched to Maintenance Starts Here================================================================================
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(10000);
        //====================================================================Zone Switched to Maintenance Ends Here==================================================================================
        //=========================================================================New Vehicle Creation From Entity Maintenance Starts Here=========================================================================
        console.log("AssureClaims_MaintenanceAddNewEntity_Utility Function is Called To Create Vehicle".yellow);
        VehicleID = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Vehicle", "NA", "NA", "NA");

        VehicleMake = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Vehicle_POM.AssureClaims_Vehicle_Txt_Vehicle_Make, "value");
        console.log("New Vehicle is Created with ID: ".green + VehicleID);
        console.log("New vehicle is Created with Make: ".green + VehicleMake);
        //=========================================================================New Vehicle Creation From Entity Maintenance Ends Here=====================================================================
    });
    //Searching Exsisted Claim 
    //Creating Unit With Vehicle From Entity Maintenance 
    test('Vehicle_AttachUnit_Test_03', async t => {
        //==============================================Search the created VA claim Starts Here========================================================================
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('ClaimZone', 'Claim', StrClaimNumber, "NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================

        //==============================================Search the created VA claim Ends Here========================================================================
        //==================================================Unit Creation In VA Claim Starts Here==========================================================================
        await t.switchToMainWindow();
        await t.wait(3000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(unit_POM.AssureClaims_Unit_Btn_AddUnit, "Add Unit Button")
        await Nav_Utility.AssureClaims_ElementClick_Utility(unit_POM.AssureClaims_Unit_Btn_UnitID_Lookup, "Vehicle ID Lookup Button")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccidentClaimIframe);
        await t.wait(3000)
        await In_Utility.AssureClaims_SetValue_Utility(unit_POM.AssureClaims_Unit_Txt_UnitID, VehicleID.toString(), "Type Vehicle ID")
        await Nav_Utility.AssureClaims_ElementClick_Utility(unit_POM.AssureClaims_Unit_Btn_SubmitQuery, "SubmitQuery")
        //==================================================================Vehicle Created in Above TestCase is Searched =============================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(unit_POM.AssureClaims_Unit_Lnk_UnitID.withText(VehicleID.toString()), "click link")
        await t.wait(2000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save, "Save Image Button On Property Claim creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, " Property Claim Creation Screen");
        //==================================================Unit Creation In VA Claim Ends Here==========================================================================
    });
    //Zone Switching To Maintenance 
    //Searching Vehicle In Maintenance Zone
    //Clicking On Vehicle Claim Number
    //Clicking on Unit Number
    //Verifying Vehicle Id Exsist
    test('Verification_Of_Unit_Test_04', async t => {
        //================================================================Zone Switched to Maintenance Starts Here================================================================================
        await Generic_Utility.AssureClaims_Generic_ZoneSwitching("Maintenance");
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        await t.wait(10000);
        //================================================================Zone Switched to Maintenance Ends Here================================================================================
        
        //================================================================Search For Vehicle From MainTenance starts Here========================================================================
        //======================================================Muskan's Code :RMA-97695 Claim search started here===================================================================================================================
        await Function_Utility.AssureClaims_GenericSearch_Utility('MaintenanceZone','Vehicle', VehicleID.toString(),"NA");
        //======================================================Muskan's Code :RMA-97695 Claim search started completed here=========================================================================================================
        //================================================================Search For Vehicle From MainTenance Ends Here========================================================================
        
        await t.wait(6000);
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Btn_CloseFromLeft.nth(1), "Close Button on Left Hand Side Of Screen")
        await t.wait(4000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_VehicleFrameAfterLinkClicked);
        //=========================================================================Vehicle Claim Number Child Link is Clicked===========================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(unit_POM.AssureClaims_Search_Child_On_Vehicle.withText(StrClaimNumber), "click link")
        await t.wait(7000);
        await t.switchToMainWindow();
        await t.wait(5000);
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_VehicleAccident_ClaimVCIframe);
        await t.wait(5000);
        //==========================================================================Unit Link is Clicked on Vehicle Claim====================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(unit_POM.AssureClaims_Lnk_Child_UnIt.withText(VehicleMake.toString()), "click link")
        //===========================================================================Verification of Vehicle ID=================================================================================================
        var StrVehicleIDVerification = await Verify_Utility.AssureClaims_AttributeFetch_Utility(unit_POM.AssureClaims_Vehicle_Txt_Vehicle_Id_Verification, "value");
        console.log("Verification of Vehicle : ".green + StrVehicleIDVerification);
    });
    //===============================================================Logout From Application Starts Here======================================================================================================
    test.after(async t => {
        await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
        console.log("AssureClaims_LogoutFromApplication_Utility Function Is Called To LogOut From Application!!".yellow);
        await Function_Utility.AssureClaims_LogoutFromApplication_Utility()
    });
    //===============================================================Logout From Application Ends Here======================================================================================================
});
