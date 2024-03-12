import { Selector,Role } from 'testcafe';
import Colors from 'colors';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Input_Utility from '../Functional_Utilities/Input_Utility';
import POM_OSHA from '../Functional_POM/POM_OSHA';
import Claims_OSHA_Utility from '../Functional_Utilities/Claims_OSHA_Utility';

const DataIUT = require('../DataFiles/DataIUT.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const Inpt_Utility = new Input_Utility();
const POM_OSHAcsv = new POM_OSHA();
const Claims_Osha = new Claims_OSHA_Utility();

//var faker = require('faker');

DataIUT.forEach(data => {
    fixture`POST OSHA 301`.beforeEach(async t => {  
        await t.wait(4000)
        await t.navigateTo(data.URL)
        await t.maximizeWindow()
});

var User = data.FirstName+" "+data.LastName+"("+data.Username+")";

test('AssureClaims_Create_PostOsha301', async t => {
    //======================================Login Into Application with User started==================================================================
    await t.setPageLoadTimeout(10000)
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(10000)
    console.log(`Login Into Application with ${data.Username}`)
    
    //======================================To Create POST OSHA 301 Reports ==========================================================================
    await t.wait(1000)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports"), "Osha Reports")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReports.withText("Post OSHA 301"), "Post OSHA 301")
    await Claims_Osha.AssureClaims_FrameSwitch_OSHAQueue("postosha301")
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_Post_OSHA_ReportName, data.OSHA_301_ReportName, "Report Name")//Change Report name in DataFiles as per requirement
    await Inpt_Utility.AssureClaims_SetValue_Utility(POM_OSHAcsv.AssureClaimsApp_Post_OSHA_ReportDescription, data.Report_Description, "Report Description")//Change Report Description in DataFiles as per requirement
    await Claims_Osha.AssureClaims_User_Search(User)
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_Save_Btn.withText("save"), "Save Button")
    await t.wait(2000)
    //===================================To View Newly Created Report=====================================================
    await t.switchToMainWindow()
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_Reports.withText("Reports"), "Reports Tab")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_ReportDetails_Lst_DropDownSelection.withText("Osha Reports Queue"), "Osha Reports Queue")
    await Nav_Utility.AssureClaims_ElementClick_Utility(POM_OSHAcsv.AssureClaimsApp_OSHA_OshaReportsQueue.withText("Available Reports"), "Available Reports")
    await Claims_Osha.AssureClaims_FrameSwitch_OSHAQueue("smreportsel")
    await Nav_Utility.AssureClaims_VerifyAndClick_Utility(data.Report_Description,Selector('[class="code-table-list ng-scope"]').withText(data.OSHA_301_ReportName), "Newly created OSHA 301 Report")//change report name & report description as per requirement
    await t.wait(5000)   
});

})