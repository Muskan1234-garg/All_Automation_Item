import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Search from '../Functional_POM/POM_Search';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Search_POM = new POM_Search();
var faker = require('faker');

const DataIUT = require('../DataFiles/DataAutoRegDSN_3_LC.json');

var strQueryDesignerName = 'LifeClaim' + faker.name.firstName();
var strDate;
var strClaimNumber;

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109560
//Description      : Create query designer for claim search
//Create Claim
//Search claim with created QueryDesigner & verify all the QueryDesigner fields & claim is visible
//Delete created query designer
//AUTHOR           : Kiran Nandurkar
//DEPENDANCY       : None
//PRE-REQUISITES   : Query designer must be visible in  the listview
//Preferred Server : AutoReg(DSN3)
// *******************************************************************************************************************************

DataIUT.forEach(data => {

    const ClaimZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(6000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    const CMLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );

    fixture`QueryDesigner_LCSearch`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        await t.wait(5000)
    });


    /*
    1) Login Into CM
    2) Creation of QueryDesigner for claim search & verify QueryDesigner is created
    */
    test('AssureClaims_QueryDesignerCreation_Test_01', async t => {
        await t.wait(10000)

        //=========================================Login into CM & Navigate to Claim Search QueryDesigner page Started Here=============================================================================================
        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(1000);

        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(40000);
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(1000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Claim Search")
        await t.wait(1000)
        //========================================Login into CM & Navigate Claim Search QueryDesigner Page ended Here=============================================================================================

        //=======================================Creation & Verification of QueryDesigner Started Here=============================================================================================
        var strFieldSelectionArray = {
            "Claim Info": [ "Claim Number-Claim Info"],
            "Policy Coverages (Only For Life Claim)": [ "Claim Number-Claim Info","Face Amount-Policy Coverages (Only For Life Claim)","Annuity As Of Date-Policy Coverages (Only For Life Claim)","Annuity Date Of Death-Policy Coverages (Only For Life Claim)", "As Of Value-Policy Coverages (Only For Life Claim)"],
        };

        var strDisplayFieldArray = {
            "Policy Coverages (Only For Life Claim)":[ "Claim Number-Claim Info","Face Amount-Policy Coverages (Only For Life Claim)","Annuity As Of Date-Policy Coverages (Only For Life Claim)","Annuity Date Of Death-Policy Coverages (Only For Life Claim)", "As Of Value-Policy Coverages (Only For Life Claim)"],
            "Claimant": ["Claimant AKA-Claimant", "Claimant Birth Date-Claimant"]
        };

        await Function_Utility.AssureClaim_QueryDesignerCreation(strQueryDesignerName, "Claim Search", "NA", "NA", "NA", "Claim Number-Claim Info", strFieldSelectionArray, strDisplayFieldArray, data.Username)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Claim Search",strQueryDesignerName, "Verify")
        //=======================================Creation & Verification of QueryDesigner ended Here=============================================================================================
    });

    /*
    1) Creation of claim
    */
    test('AssureClaims_LifeClaimCreation_Test_02', async t => {
        await t.wait(10000)

        strDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        //==============================================================Claim Creation Started Here=============================================================================================
        console.log("AssureClaims_LifeClaimCreation Function is Called To Create Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_LifeClaimCreation(strDate, strDate, data.ClaimStatus, data.LCClaimType, data.Department, data.LCPolicyLOB , data.LCMannerOfDeath ,data.LCCauseOfDeath , data.EstateProbated , data.DeceasedMaritalStatus , data.SpouseLiving ,data.PolicySystem,data.LifePolicyName)
        console.log("New Life Claim is Created with Claim Number: ".green + strClaimNumber);
        //==============================================================Claim Creation Completed Here============================================================================================
    });

      /*
    1)Search created claim with created QueryDesigner
    2)Verify all QueryDesigner fields are visible before submit query
    3)Verify all display QueryDesigner fields are visible after submit query
    4)Click on export to pdf & export to excel button,Verify claim is visible
    */
    test('AssureClaims_SearchCreatedClaimWithCreatedQueryDesigner_Test_03', async t => {
        await t.wait(30000)
        //=============================================Search claim with created QueryDesigner & Verify QueryDesigner fields are visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Claim");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe);
        await t.wait(3000)

        var strArray=["Claim Number","Face Amount","Annuity As Of Date", "Annuity Date Of Death", "As Of Value"];

        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD,"dropdown to select QueryDesigner")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD.find("option").withText(strQueryDesignerName),"select create QueryDesigner")
        await t.wait(1000)
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[0]),"verify Claim Number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[1]),"verify Face Amount")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[2]),"verify Annuity As Of Date")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[3]),"verify Annuity Date Of Death")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[4]),"verify As Of Value")

        //==============================================Search claim with created QueryDesigner & Verify QueryDesigner fields are visible, ended Here=============================================================================================
        //=============================================After submit query,verify display fields are visible as per QueryDesigner, Started Here=============================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_ClaimNumber, strClaimNumber, "Claim Number")
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_ClaimNumber_Amount, data.FaceAmount, "Face Amount" )
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.wait(10000)
        await t.switchToMainWindow();
        await t.wait(10000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_ClaimIframe1);
        await t.wait(5000)
        console.log("Frame SWitched");
         await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[0]),"verify Claim Number")
         await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[1]),"verify Face Amount")
         await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[2]),"verify Annuity As Of Date")
         await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[3]),"verify Annuity Date Of Death")
         await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[4]),"verify As Of Value")
         await t.wait(5000)
        //==========================================After submit query, verify display fields are visible as per QueryDesigner, ended Here=============================================================================================

        //===================Click on export to pdf & export to excel button & click on claim link & verify claim is visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToExcel,"export all to excel")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToPdf,"export all to pdf")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(strClaimNumber), "ClaimNumber link")
        console.log("Search is Completed");
        await t.switchToMainWindow()
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_LifeClaim_ClaimLCIframe)
        await t.wait(3000)
        //===================Click on export to pdf & export to excel button & click on claim link & verify claim is visible,ended Here=============================================================================================

    });

    /*
    1) Login Into CM
    2) Creation of QueryDesigner for claim search & verify QueryDesigner is created
    3) Delete QueryDesigner
    */
    test('AssureClaims_DeleteCreatedQueryDesigner_Test_04', async t => {

        //==================================Navigate to CM & Delete QueryDesigner, Started Here=============================================================================================
        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);

        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(5000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Claim Search")
        await t.wait(4000)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Claim Search",strQueryDesignerName,"Delete")
        //==============================Navigate to CM & Delete QueryDesigner,ended Here=============================================================================================

    })
});
