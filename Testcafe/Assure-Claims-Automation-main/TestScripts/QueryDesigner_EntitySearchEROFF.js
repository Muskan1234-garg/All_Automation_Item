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
import POM_Entity from '../Functional_POM/POM_Entity'

const Verify_Utility = new Verification_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Function_Utility = new Functionality_Utility();
const Verification_Msg = new POM_VerificationMessage();
const Home_POM = new POM_Home();
const Search_POM = new POM_Search();
const Entity_POM = new POM_Entity();

var faker = require('faker');

const DataIUT = require('../DataFiles/DataAutoRegDSN_2.json');

// *******************************************************************************************************************************
//JIRA ID OF STORY : RMA-109193
//Description      : Create query designer for Entity(ER-OFF) search
//Create Entity
//Search Entity with created QD & verify all the QD fields & Entity is visible
//Delete created query designer
//AUTHOR           : Muskan Garg
//DEPENDANCY       : None
//PRE-REQUISITES   : None
//Preferred Server : AutoReg(DSN2)
// *******************************************************************************************************************************

var strQueryDesignerName = 'AutoEntity_' + faker.name.firstName();
var strEntityName = "AutoUnique_"+faker.name.lastName();
var strTitle ="Auto_"+ faker.name.title();
var strNatureOfBusiness = "Auto_"+faker.name.jobTitle();




DataIUT.forEach(data => {

    const MaintenanceZoneLogin = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
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


    fixture`QueryDesigner_EntitySearch`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(MaintenanceZoneLogin);
        await t.wait(5000)
    });

    /*
    1) Login Into CM
    2) Creation of QD for entity search & verify QD is created
    */
    test('AssureClaims_QueryDesignerCreation_Test_01', async t => {

        //=========================================Login into CM & Navigate to Entity Search QD page Started Here=============================================================================================
        await t.setNativeDialogHandler(() => true).useRole(CMLogin);
        console.log("Login Into Application!!".green)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Query Designer");
        await t.wait(2000)
        await Generic_Utility.AssureClaims_DynamicFrameSwitchingWithId(Verification_Msg.AssuereClaims_QueryDesignerIframe)
        await t.wait(5000);
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("People/Entity Search")
        await t.wait(4000)
        //========================================Login into CM & Navigate Entity Search QD Page ended Here=============================================================================================

        //=======================================Creation & Verification of QD Started Here=============================================================================================

        var
            strFieldSelectionArray = {
                "Entity/People Info":["Last Name-Entity/People Info","ID Type-Entity/People Info","Phone Number-Entity/People Info"],
                "Contact Info": [ "Email Type-Contact Info","Contact Name-Contact Info", "Contact City-Contact Info", "Country-Contact Info"]
                
            };

        var strDisplayFieldArray = {
            "Entity/People Info":["Entity ID Type-Entity/People Info","Entity ID Number-Entity/People Info"],
        };

        await Function_Utility.AssureClaim_QueryDesignerCreation(strQueryDesignerName, "People/Entity Search", "NA", "NA", "NA", "Last Name-Entity/People Info", strFieldSelectionArray, strDisplayFieldArray, data.Username)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("People/Entity Search",strQueryDesignerName, "Verify")
        //=======================================Creation & Verification of QD ended Here=============================================================================================


    })

    /*
    1) Creation of Entity
    */
    test('AssureClaims_EntityCreation_Test_02', async t => {

        //==============================================================Entity Creation Started Here=============================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Maintenance:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFrame)
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, strEntityName, "Last Name Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_TypeOfEntity, data.EntityType, "Type Of Entity Drop Down On Entity Creation Screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_NatureOfBusiness, strNatureOfBusiness, "Nature Of Business Textbox On Entity Creation screen");
        await In_Utility.AssureClaims_SetValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Title, strTitle, "Title Textbox On Entity Creation Screen");
        await In_Utility.AssureClaims_ElementWebListSelect_Utility(Entity_POM.AssureClaims_Entity_Lst_IDType, "SSN", "ID Type DropDown On Entity Creation Screen");
        await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Entity Creation Screen");
        await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Entity_POM.AssureClaims_Entity_Txt_Name, strEntityName, "Name Textbox On Entity Creation Screen");
        //==============================================================Entity Creation ended Here=============================================================================================

    })
    
        
    /*
    1)Search created entity with created QD
    2)Verify all QD fields are visible before submit query
    3)Verify all display QD fields are visible after submit query
    4)Click on export to pdf & export to excel button,Verify entity is visible
    */
    test('AssureClaims_SearchCreatedEntityWithCreatedQD_Test_03', async t => {

        
        //=============================================Search entity with created QD & Verify QD fields are visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Search:Entity");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntitySearchFrame);
        var strArray=["Last Name","ID Type","Phone Number","Email Type","Contact Name", "Contact City", "Country","Entity ID Type","Entity ID Number"]
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD,"dropdown to select QD")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lst_SelectQD.find("option").withText(strQueryDesignerName),"select create QD")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[0]),"verify lastname")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[1]),"verify ID type")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[2]),"verify phone number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[3]),"verify email type")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[4]),"verify contact name")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[5]),"verify contact city")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyLabel.withText(strArray[6]),"verify country")
        //=============================================Search entity with created QD & Verify QD fields are visible, ended Here=============================================================================================

        //=============================================After submit query,verify display fields are visible as per QD, Started Here=============================================================================================
        await In_Utility.AssureClaims_SetValue_Utility(Search_POM.AssureClaims_Search_Txt_EntityLastName, strEntityName, "Entity LastName")
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_SubmitQuery, "SubmitQuery")  
        await t.wait(3000)
        await t.switchToMainWindow();
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SearchResult_EntityIframe);

        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[0]),"verify lastname")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[1]),"verify ID type")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[2]),"verify phone number")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[3]),"verify email type")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[4]),"verify contact name")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[5]),"verify contact city")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[6]),"verify country")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[7]),"verify contact city")
        await Verify_Utility.AssureClaims_ElementExist_Utility(Search_POM.AssureClaims_Search_Label_VerifyTextOverGrid.withText(strArray[8]),"verify country")
        //=============================================After submit query,verify display fields are visible as per QD, ended Here=============================================================================================

        //===================Click on export to pdf & export to excel button & click on entity link & verify entity is visible, started Here=============================================================================================
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToExcel,"export all to excel")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_Export,"export button")
        await t.wait(1000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Btn_ExportToPdf,"export all to pdf")
        await t.wait(3000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(Search_POM.AssureClaims_Search_Lnk_GenericLinkOverSearchScreen.withText(strEntityName), "Entity Number Link")
        console.log("Search is Completed");
        await t.switchToMainWindow()
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_Generic_EntityFROMPaymentFrame);
        await Function_Utility.AssureClaims_GenericDelete_Utility("True", "Entity Creation Screen", "", "");
        //===================Click on export to pdf & export to excel button & click on entity link & verify entity is visible, ended Here=============================================================================================
        


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
        await Nav_Utility.AssureClaims_ConfigManagerLeftTab("People/Entity Search")
        await t.wait(4000)
        await Function_Utility.AssureClaim_OperationOnExistingQueryDesigner("People/Entity Search",strQueryDesignerName,"Delete")
        //==================================Navigate to CM & Delete QD, ended Here=============================================================================================
    
    })

})
