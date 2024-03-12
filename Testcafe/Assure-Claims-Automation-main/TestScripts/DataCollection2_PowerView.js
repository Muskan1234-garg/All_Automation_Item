import { Selector, Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import POM_Home from '../Functional_POM/POM_Home';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_PowerView from '../Functional_POM/POM_PowerView';

const Home_POM = new POM_Home();
const DataIUT = require('../DataFiles/DataIUT2.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const In_Utility = new Input_Utility();
const Verify_Utility = new Verification_Utility();
const Verification_Msg = new POM_VerificationMessage();
const PowerView_POM = new POM_PowerView();
const fs = require('fs');

var faker = require('faker');
var ReporterPowerView_Name = "Auto " + faker.name.lastName();
var ReporterPowerView_Description = ReporterPowerView_Name + "Description";
//Global Variable Declaration
fs.writeFile('Datacollection_Exported_variable.js', 'export var ReporterPowerView_Name = ' + "'" + ReporterPowerView_Name + "';" + "module.exports.ReporterPowerView_Name=ReporterPowerView_Name;", (err) => console.log("Users copied"))

//**********************************************************************************************
	//JIRA ID OF STORY : RMA-100012
	//Description      : Data Collection PowerView Creation TestScript
	//AUTHOR 		       : 0.0 Parul Sharma 01/12/2023
	//DEPENDANCY 	     : Need to Run License ,Power View ,DataCollection Testcase In Bat File.
	//PRE-REQUISITES   : None
	//Preferred Server : Any Server
  //Revision         : 1.0 Parul Sharma 04/13/2023
	// **********************************************************************************************

DataIUT.forEach(data => {
  fixture`AssureClaims_DataCollection_Power_View_TC`.beforeEach(async t => {
    await t.wait(5000)
    await t.navigateTo(data.URL);
    await t.maximizeWindow();
  });
  test('AssureClaims_PowerViewCreation_Test_01', async t => {
    await t.wait(5000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
    console.log("Login Into Application!!".green)
    await t.wait(9000);
    console.log("test1")
    /*==============Utility Setting for Power View Creation And Edit Of Power View Started Here ==============*/

    await Nav_Utility.AssureClaims_ConfigManagerSearchSettingPage_Utility("Powerview Editor");
    await t.wait(5000);
    await t.switchToIframe(Selector("#" + Verification_Msg.AssureClaims_PowerviewIframe + ""))
    await t.wait(5000)
    await Function_Utility.AssureClaims_PowerViewCreation(ReporterPowerView_Name, ReporterPowerView_Description, "Add");
    await Nav_Utility.AssureClaims_ElementClick_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Search_Filter, "Search Filter Field Is Clicked")
    await In_Utility.AssureClaims_SetValue_Utility(PowerView_POM.AssureClaimsApp_Lnk_Power_View_Add_Popup_Search_Filter, ReporterPowerView_Name, "ReporterPowerView_Name Entered in Search Filter Field")
    const ColName = ["View Name", "View Description", "Data Collection View"]
    const ColVal = [ReporterPowerView_Name, ReporterPowerView_Description, "true"]
    await Verify_Utility.AssureClaims_VerifyUXGrid_Utility(ReporterPowerView_Name, "Power Views Setup", ColName, ColVal);
    await t.wait(4000);
    const Power_View_Name = await Selector('[row-render-index="rowRenderIndex"]>div:nth-child(2)>div>a');
    await Nav_Utility.AssureClaims_ElementClick_Utility(Power_View_Name, "Search Filter Field Is Clicked")
    await t.wait(4000);
    await Function_Utility.AssureClaims_PowerViewCreation(ReporterPowerView_Name, ReporterPowerView_Description, "Edit");
    /*==============Utility Setting for Power View Creation And Edit Of Power View Ended Here ==============*/

  });


});
