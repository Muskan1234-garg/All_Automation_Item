import { Selector, Role, t } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Search from '../Functional_POM/POM_Search';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Search_POM = new POM_Search();
var faker = require('faker');

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109189	
//Description      : Create query designer for Event search
//Create Event
//Search Event with created QD & verify all the QD fields & Event is visible
//Delete created query designer
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITES   : None
//Preferred Server : AutoReg(DSN2)
// *******************************************************************************************************************************

var strQueryDesignerName = 'AutoEvent' + faker.name.firstName();
var strDate;
var strEventNumber;



DataIUT.forEach(data => {

    const ClaimZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000)
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


    fixture`QueryDesigner_EventSearch`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ClaimZoneLogin);
        await t.wait(5000)
    });


    /*
    1) Login Into CM
    2) Creation of QD for claim search & verify QD is created
    */
    test('AssureClaims_QueryDesignerCreation_Test_01', async t => {

        //=========================================Login into CM & Navigate to Claim Search QD page Started Here=============================================================================================
        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Event Search")
        await t.wait(4000)
        //========================================Login into CM & Navigate Claim Search QD Page ended Here=============================================================================================

        //=======================================Creation & Verification of QD Started Here=============================================================================================
        var
            strFieldSelectionArray = {
                "Event Info": [ "Event Number-Event Info","Event Date-Event Info", "Event Category-Event Info", "Event Status-Event Info","Event Type-Event Info","Time of Event-Event Info"]
            };

        var strDisplayFieldArray = {
            "Event Info": [ "Event Number-Event Info","Event Date-Event Info", "Event Category-Event Info", "Event Status-Event Info","Event Type-Event Info","Time of Event-Event Info"]
        };

        await Function_Utility.AssureClaim_QueryDesignerCreation(strQueryDesignerName, "Event Search", "NA", "NA", "NA", "Event Number-Event Info", strFieldSelectionArray, strDisplayFieldArray, data.Username)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Event Search",strQueryDesignerName, "Verify")
        //=======================================Creation & Verification of QD ended Here=============================================================================================


    })

    /*
    1) Creation of Event
    */
    test('AssureClaims_EventCreation_Test_02', async t => {

        strDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
        //==============================================================Event Creation Started Here=============================================================================================
        console.log("AssureClaims_EventCreation Function is Called To Create Event".yellow);
        strEventNumber = await Function_Utility.AssureClaims_EventCreation(strDate, strDate, data.EventStatus, data.EventType, data.Department)
        console.log("New Event  is Created with Event Number: ".green + strEventNumber);
        //==============================================================Event Creation Started Here=============================================================================================

    })
    
    /*
    1)Search created event with created QD
    2)Verify all QD fields are visible before submit query
    3)Verify all display QD fields are visible after submit query
    4)Click on export to pdf & export to excel button,Verify event is visible
    */
    test('AssureClaims_SearchCreatedEventWithCreatedQD_Test_03', async t => {

        //=============================================Search event with created QD & Verify QD fields are visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Event");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_EventIframe);
        var strArray= [ "Event Number","Event Date", "Event Category", "Event Status","Event Type","Time of Event"]
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD,"dropdown to select QD")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD.find("option").withText(strQueryDesignerName),"select create QD")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[0]),"verify event number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[1]),"verify event date")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[2]),"verify event category")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[3]),"verify event status")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[4]),"verify event status")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[5]),"verify time of event")
        //==============================================Search event with created QD & Verify QD fields are visible, ended Here=============================================================================================

        //=============================================After submit query,verify display fields are visible as per QD, Started Here=============================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EventNumber, strEventNumber, "Event Number")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.wait(3000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_EventIframe);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[0]),"verify event number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[1]),"verify event date")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[2]),"verify event category")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[3]),"verify event status")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[4]),"verify event status")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[5]),"verify time of event")
        //==========================================After submit query, verify display fields are visible as per QD, ended Here=============================================================================================
        
        //===================Click on export to pdf & export to excel button & click on event link & verify event is visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToExcel,"export all to excel")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToPdf,"export all to pdf")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(strEventNumber), "Event Number Link")
        console.log("Search is Completed");
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_EventIFrame);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Home_POM.AssureClaims_GenericBtn_Btn_AddPersonInvolved,"verify person involved add button")
        //===================Click on export to pdf & export to excel button & click on event link & verify event is visible,ended Here=============================================================================================


    })

    /*
    1)Delete QD
    */
    test('AssureClaims_DeleteCreatedQueryDesigner_Test_04', async t => {

        //==================================Navigate to CM & Delete QD, Started Here=============================================================================================
        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Event Search")
        await t.wait(4000)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Event Search",strQueryDesignerName,"Delete")
        //==============================Navigate to CM & Delete QD,ended Here=============================================================================================
    
    })






})
