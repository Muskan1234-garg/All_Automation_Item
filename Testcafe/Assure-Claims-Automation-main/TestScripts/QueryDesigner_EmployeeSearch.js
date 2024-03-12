import { Selector, Role, t } from 'testcafe';
import Colors from 'colors'

import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Maintenance_Functionality_Utility from '../Functional_Utilities/Maintenance_Functionality_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_Search from '../Functional_POM/POM_Search';
import POM_Employee from '../Functional_POM/POM_Employee'

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Maint_Utility = new Maintenance_Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Search_POM = new POM_Search();
const Employee_POM = new POM_Employee();

var faker = require('faker');

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109194
//Description      : Create query designer for Employee search
//Create Employee
//Search Employee with created QD & verify all the QD fields & Employee is visible
//Delete created query designer
//AUTHOR           : Yashaswi Mendhekar
//DEPENDANCY       : None
//PRE-REQUISITES   : None
//Preferred Server : AutoReg(DSN2)
// *******************************************************************************************************************************

var strQueryDesignerName = 'AutoEmployee_' + faker.name.firstName();
var EmployeeNumber 
var strLastName

DataIUT.forEach(data => {

    const MaintenanceZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await t.wait(5000)
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Maintenance')
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


    fixture`QueryDesigner_EmployeeSearch`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZoneLogin);
        await t.wait(5000)
    });

    /*
    1) Login Into CM
    2) Creation of QD for Employee search & verify QD is created
    */
    test('AssureClaims_QueryDesignerCreation_Test_01', async t => {

        //=========================================Login into CM & Navigate to Employee Search QD page Started Here=============================================================================================
        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Employee Search")
        await t.wait(4000)
        //========================================Login into CM & Navigate Employee Search QD Page ended Here=============================================================================================

        //=======================================Creation & Verification of QD Started Here=============================================================================================

        var
            strFieldSelectionArray = {
                "Employee Info": [ "Last Name-Employee Info","Employee Number-Employee Info","SSN/Tax ID-Employee Info", "Employee Dept.-Employee Info", "Address 1-Employee Info"],
                "Employee":["FEIN-Employee"],
                      
            };

        var strDisplayFieldArray = {
            "Employee Info":["Last Name-Employee Info","Employee Number-Employee Info","SSN/Tax ID-Employee Info", "Employee Dept.-Employee Info","FEIN-Employee" ],
        };

        await Function_Utility.AssureClaim_QueryDesignerCreation(strQueryDesignerName, "Employee Search", "NA", "NA", "NA", "Last Name-Employee Info", strFieldSelectionArray, strDisplayFieldArray, data.Username)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Employee Search",strQueryDesignerName, "Verify")
        //=======================================Creation & Verification of QD ended Here=============================================================================================

    })

    /*
    1) Creation of Employee
    */
    test('AssureClaims_EmployeeCreation_Test_02', async t => {

        //==============================================================Employee Creation Started Here=============================================================================================
        EmployeeNumber = await Maint_Utility.AssureClaims_MaintenanceAddNewEntity_Utility("Employee",data.Department, data.Country,data.State);
        console.log("New Employee is Created with Employee Number: ".green+EmployeeNumber);
        strLastName=await Verify_Utility.AssureClaims_AttributeFetch_Utility(Employee_POM.AssureClaims_EmployeeMaintenance_Txt_LastName,"LastName Value")
        //==============================================================Employee Creation ended Here=============================================================================================

    })
    
        
    /*
    1)Search created Employee with created QD
    2)Verify all QD fields are visible before submit query
    3)Verify all display QD fields are visible after submit query
    4)Click on export to pdf & export to excel button,Verify Employee is visible
    */
    test('AssureClaims_SearchCreatedEmployeeWithCreatedQD_Test_03', async t => {

        
        //=============================================Search Employee with created QD & Verify QD fields are visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Employee");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_Search_EmployessIframe);
        var strArray=["Last Name","Employee Number","SSN/Tax ID","Employee Dept.","Address 1","FEIN"]
        // var strArray=["Employee Number","Last Name","SSN/Tax ID","Employee Dept.","Address 1","FEIN"]
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD,"dropdown to select QD")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD.find("option").withText(strQueryDesignerName),"select create QD")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[0]),"verify lastname")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[1]),"verify Employee Number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[2]),"verify SSN/Tax ID")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[3]),"verify Employee Dept.")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[4]),"verify Address 1")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[5]),"verify FEIN")
        //=============================================Search Employee with created QD & Verify QD fields are visible, ended Here=============================================================================================


        //=============================================After submit query,verify display fields are visible as per QD, Started Here=============================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strLastName, "Employee LastName")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")  
        await t.wait(3000)
        await t.switchToMainWindow();
        await t.wait(3000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaim_SearchResult_EmployeeIframe);
        await t.wait(3000)

        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[0]),"verify lastname")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[1]),"verify Employee Number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[2]),"verify SSN/Tax ID")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[3]),"verify Employee Dept.")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[4]),"verify Address 1")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[5]),"verify FEIN")
       //=============================================After submit query,verify display fields are visible as per QD, ended Here=============================================================================================

        //===================Click on export to pdf & export to excel button & click on Employee link & verify Employee is visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToExcel,"export all to excel")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToPdf,"export all to pdf")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(strLastName), "Employee Number Link")
        console.log("Search is Completed");
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssuereClaims_SearchResult_EmployeeIframe);
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Employee Creation Screen", "", "");
        //===================Click on export to pdf & export to excel button & click on Employee link & verify Employee is visible, ended Here=============================================================================================
        


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
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("Employee Search")
        await t.wait(4000)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("Employee Search",strQueryDesignerName,"Delete")
        //==================================Navigate to CM & Delete QD, ended Here=============================================================================================
    
    })

})
