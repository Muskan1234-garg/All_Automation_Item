import { Selector, Role, t } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Search from '../Functional_POM/POM_Search';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Search_POM = new POM_Search();
const Payment_POM = new POM_PaymentsCollections();

var faker = require('faker');

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109197
//Description      : Create query designer for Funds search
//Create Transaction
//Search Transaction with created QD & verify all the QD fields & Transaction is visible
//Delete created query designer
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITES   : None
//Preferred Server : AutoReg(DSN2)
// *******************************************************************************************************************************

var strQueryDesignerName = 'AutoFunds_' + faker.name.firstName();
var strDate;
var strClaimNumber;



    DataIUT.forEach(data => {
        fixture`QueryDesigner_FundsSearch`.beforeEach(async t => {
            await t.wait(4000)
            await t.navigateTo(data.URL)
            await t.maximizeWindow()
        });

    /*
    1) Login Into CM
    2) Creation of QD for entity search & verify QD is created
    */
    test('AssureClaims_QueryDesignerCreation_Test_01', async t => {

        //=========================================Login into CM & Navigate to Entity Search QD page Started Here=============================================================================================
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Payment Search")
        await t.wait(4000)
        //=========================================Login into CM & Navigate to Entity Search QD page ended Here=============================================================================================

        //=======================================Creation & Verification of QD Started Here=============================================================================================
        var
            strFieldSelectionArray = {
                "Claim Info":["Claim Number-Claim Info","Line of Business-Claim Info","Claimant Entity ID Number-Claim Info"],
                "Funds Detail": [ "Invoiced By-Funds Detail","Invoice Date-Funds Detail"]
                
            };

        var strDisplayFieldArray = {
            "Claim Info":["Claim Number-Claim Info","Line of Business-Claim Info","Claimant Entity ID Number-Claim Info"],
            "Funds Detail": [ "Invoiced By-Funds Detail","Invoice Date-Funds Detail","Amount-Funds Detail","GL Account-Funds Detail"]
        };

        await Function_Utility.AssureClaim_QueryDesignerCreation(strQueryDesignerName, "Payment Search", "NA", "Invoiced By-Funds Detail", "NA", "Claim Number-Claim Info", strFieldSelectionArray, strDisplayFieldArray, data.Username)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Payment Search",strQueryDesignerName, "Verify")
        //=======================================Creation & Verification of QD ended Here=============================================================================================



    })

    /*
    1) Creation of Claim
    2) Create reserve
    3) Create transaction
    */
    test('AssureClaims_ClaimTransactionCreation_Test_02', async t => {

        //=========================================Login into Claim zone & create claim,reserve,transaction Started Here=============================================================================================
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
        await t.wait(5000);
        strDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY")
        console.log("AssureClaims_GeneralClaimCreation Function is Called To Create Claim".yellow);
        strClaimNumber = await Function_Utility.AssureClaims_GeneralClaimCreation(strDate, strDate, data.ClaimStatus, data.GCClaimType, data.Department, data.GCPolicyLOB)
        console.log("New General Claim is Created with Claim Number: ".green + strClaimNumber);
        await Function_Utility.AssureClaims_Reserve_Utility(data.ReserveType, data.ReserveAmount, data.ReserveStatus)
        await t.switchToMainWindow();
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_Back, "Back Button ")
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_GenericClaim_ClaimGCIframe)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Payment_POM.gridwindow, "Grid Window")
        await Function_Utility.AssureClaims_PaymentCorpAddition_Utility(data.BankAccount, data.PayeeType, data.LastName, data.TransactionType, data.PaymentAmount);
        //=========================================Login into Claim zone & create claim,reserve,transaction ended Here=============================================================================================

    })
    
    /*
    1)Search created entity with created QD
    2)Verify all QD fields are visible before submit query
    3)Verify all display QD fields are visible after submit query
    4)Click on export to pdf & export to excel button,Verify transaction is visible
    */
    test('AssureClaims_SearchCreatedTransactionWithCreatedQD_Test_03', async t => {

        //=============================================Search transaction with created QD & Verify QD fields are visible, started Here=============================================================================================
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
        await t.wait(8000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Claim_Lnk_Search.withText('Search'))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Claim_Lnk_Funds.withText('Funds'))
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Search_FundsIframe);
        var strArray= ["Claim Number","Line of Business","Claimant Entity ID Number", "Invoiced By","Invoice Date","Amount","GL Account"]
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD,"dropdown to select QD")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD.find("option").withText(strQueryDesignerName),"select create QD")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[0]),"verify claim number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[1]),"verify Line of business")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[2]),"verify claimant entity id number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[3]),"verify invoiced by")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[4]),"verify invoiced date")
        //=============================================Search transaction with created QD & Verify QD fields are visible, ended Here=============================================================================================

        //=============================================After submit query,verify display fields are visible as per QD, Started Here=============================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_ClaimNumber, strClaimNumber, "Claim Number")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_FundsIframe);
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[0]),"verify claim number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[1]),"verify Line of business")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[2]),"verify claimant entity id number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[3]),"verify invoiced by")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[4]),"verify invoiced date")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[5]),"verify amount")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[6]),"verify GL account")
        //=============================================After submit query,verify display fields are visible as per QD, Started Here=============================================================================================
        
        //===================Click on export to pdf & export to excel button & click on transaction link & verify entity is visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToExcel,"export all to excel")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToPdf,"export all to pdf")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(strClaimNumber), "Claim Number Link")
        console.log("Search is Completed");
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_TransactionSearchFrame)
        await Verify_Utility.AssureClaims_ElementExist_Utility(Payment_POM.AssureClaims_Payment_Txt_ControlNumber,"control number link")
        //===================Click on export to pdf & export to excel button & click on transaction link & verify entity is visible, ended Here=============================================================================================
        


    })

    /*
    1)Delete QD
    */
    test('AssureClaims_DeleteCreatedQueryDesigner_Test_04', async t => {

        //==================================Navigate to CM & Delete QD, Started Here=============================================================================================
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Payment Search")
        await t.wait(4000)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Payment Search",strQueryDesignerName,"Delete")
        //==================================Navigate to CM & Delete QD, ended Here=============================================================================================
    
    })

})
