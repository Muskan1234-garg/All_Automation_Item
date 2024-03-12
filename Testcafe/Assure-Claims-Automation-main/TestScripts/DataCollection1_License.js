import { Selector, Role } from 'testcafe';
import Colors from 'colors'
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_DC from '../Functional_POM/POM_DataCollection';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataIUT1 = require('../DataFiles/DataIUT2.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const In_Utility = new Input_Utility();
const ConfigMgr_POM = new POM_Config_Manager();
const POM_DataCollection = new POM_DC();
DataIUT1.forEach(data => {

	const LoggedInUser = Role(data.URL, async t => {
		await t.maximizeWindow()
		await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
		await t.wait(1000)
		console.log("Login Into Application!!".green)
	}, { preserveUrl: true }
	);
	//**********************************************************************************************
	//JIRA ID OF STORY : RMA-100012
	//Description      : Data Collection License TestScript
	//AUTHOR 		   : 0.0 Parul Sharma 01/12/2023
	//DEPENDANCY 	   : Need to Run License ,Power View ,DataCollection Testcase In Bat File.
	//PRE-REQUISITES   : None
	//Preferred Server : Any Server
	//Revision         : 1.0 Parul Sharma 04/13/2023
	// **********************************************************************************************

	fixture`AssureClaims_DataCollection_License_TC`

	test('AssureClaims_Data_CollectionActivation_Test_01', async t => {
		await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
		console.log("On Menu Page!!".green)
		await t.wait(10000);
		await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General system Parameters", "systemparameter", "Claims Module", "Data Collection")
		var Data_Collection_Key_Current_Value = await POM_DataCollection.AssureClaims_DataCollection_Enable_Dropdown.innerText;
		console.log("Data_Collection_Key_Current_Value is" + Data_Collection_Key_Current_Value);
		
		//*****************************Code For IF Statement Verify If Currently Data Collection Is Enabled For License Mode Or Not Started Here****************************************************************
		if (Data_Collection_Key_Current_Value === "Licensed") {
			console.log("Data collection is enabled");
		}
		//*****************************Code For IF Statement Verify If Currently Data Collection Is Enabled For License Mode Or Not Ended Here****************************************************************

		//********************************Else Block is Executed If Data Collection Feature Is OFF Or Enabled In Evaluation Mode Started Here*************************************************************************
		else {
			await Nav_Utility.AssureClaims_ElementClick_Utility(POM_DataCollection.AssureClaims_DataCollection_Enable_Dropdown, "Data Collection	Dropdown Is Clicked");
			await Nav_Utility.AssureClaims_ElementClick_Utility(POM_DataCollection.AssureClaims_DataCollection_Enable_Dropdown_Option, "Data Collection Dropdown Option Is Selected");
			await t.wait(12000);
			console.log("DataIUT1.DataCollection_Activation_Code is " + data.DataCollection_Activation_Code);
			await Function_Utility.AssureClaims_ActivationCode("Data Collection Activation Text Field",POM_DataCollection.AssureClaims_DataCollection_Activation_Code, data.DataCollection_Activation_Code);
			await t.wait(12000);
			await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
			Data_Collection_Key_Current_Value = await POM_DataCollection.AssureClaims_DataCollection_Enable_Dropdown.innerText;
			console.log("Data_Collection_Key_Current_Value is" + Data_Collection_Key_Current_Value);
			await t.expect(POM_DataCollection.AssureClaims_DataCollection_Enable_Dropdown.innerText).contains('Licensed', 'Licensed [ Ending ');
			await t.wait(12000);
			await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(POM_DataCollection.AssureClaims_DataCollection_Template_Checkbox, 'Check', "Data Collection Template Checkbox is Checked")
			await t.wait(12000);
			await Function_Utility.AssureClaims_ActivationCode("Data Collection Activation Text Field",POM_DataCollection.AssureClaims_DataCollection_Activation_Code, data.DataCollection_Template_Code);
			await t.wait(2000);
			await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save Image On General System Parameters Screen");
		}
		//********************************Else Block is Executed If Data Collection Feature Is OFF Or Enabled In Evaluation Mode Ended Here*************************************************************************

	});

});
