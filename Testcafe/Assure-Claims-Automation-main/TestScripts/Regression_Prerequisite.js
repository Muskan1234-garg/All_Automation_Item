import { Selector, Role } from 'testcafe';
import { createTestCafe } from 'testcafe';
import Colors from 'colors'
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import POM_Config_Manager from '../Functional_POM/POM_Config_Manager';

const DataSTG = require('../DataFiles/DataAutoRegDSN_2.json');
const Function_Utility = new Functionality_Utility();
const Nav_Utility = new Navigation_Utility();
const ConfigMgr_POM = new POM_Config_Manager();


var faker = require('faker');




// *******************************************************************************************************************************
//JIRA ID OF STORY : 
//Description      : 
//AUTHOR           : Muskan Garg
//DEPENDANCY       :
//PRE-REQUISITE    : 
//Preferred Server : 
// *******************************************************************************************************************************

DataSTG.forEach(data => {
    const ConfigurationZone = Role(data.URL, async t => {
        await t.maximizeWindow()
        console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Configuration Manager')
        await t.wait(5000)
        console.log("Login Into Application!!".green)
    }, { preserveUrl: true }
    );


    fixture`a`.beforeEach(async t => {
        await t.setNativeDialogHandler(() => true).useRole(ConfigurationZone);
    });


    test('AssureClaims_TurnOnSettingFromConfigurationManager_Test_01', async t => {

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General System Parameters", "systemparameter", "Claims Module", "Case Management")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useCaseMgmt-input'),"UnCheck","Case Mgmt");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.wait(2000)
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Client Program"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useClientProgram-input'),"Check","Client program");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.wait(2000)
        await t.click(Selector('[class="dxc-tab-label"]').find('span').withExactText("Diaries / Text Fields"));
        await t.wait(2000)
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Diary"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#currentDateForDiaries-input'),"UnCheck","Use Current Date for Completed Diaries");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#defAssignedTo-input'),"Check","Default Assigned to in Create Diary to Current User");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)

        await t.wait(2000)
        await t.switchToMainWindow()
        await t.click(Selector('[aria-label="Close"]'))
        await t.click(Selector('[aria-label="Menu"]'))
        await t.wait(2000)

        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Claim", "Duplicate Criteria")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#checkDuplicateClaim-input'),"UnCheck","Allow Check For Possible Duplicate Claims");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")

        await t.wait(2000)
        await t.click(Selector('[class="dxc-tab-label"]').find('span').withExactText("Reserve"));
        await t.wait(2000)
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("More Configurations"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#checkInsufficientReserve-input'),"UnCheck","Check for Insufficient Reserve Funds");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)
        
        // await t.wait(2000)
        // await t.click(Selector('[class="dxc-tab-label"]').find('span').withExactText("Third Party Module"));
        // await t.wait(2000)
        // await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Policy Management"))
        // await t.wait(2000)
        // await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useEnhPol-input'),"Check","Use Policy Management System");
        // await t.wait(2000)
        // await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        // await t.wait(2000)
        
        await t.switchToMainWindow()
        await t.click(Selector('[aria-label="Close"]'))
        await t.click(Selector('[aria-label="Menu"]'))
        await t.wait(2000)

        await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("Payment Parameters", "paymentparameter", "Reserves", "More Configurations")
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#fnolReserve-input'),"UnCheck","FNOL Reserve");
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)

        //start
        await t.click(Selector('[class="dxc-tab-label"]').find('span').withExactText("Check"));
        await t.wait(2000)
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Roll Up"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#rollUpChecks-input'),"UnCheck","Roll Up Checks to the same payee");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)

        await t.click(Selector('[class="dxc-tab-label"]').find('span').withExactText("Reserves"));
        await t.wait(2000)
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Supervisory Approval"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useSupAppReserves-input'),"UnCheck","Use Supervisory Approval");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#notifySupReserves-input'),"UnCheck","Notify The Immediate Supervisor");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useHoldReserve-input'),"UnCheck","Reserve Limits Are Exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useHoldIncurredLimits-input'),"UnCheck","Incurred Limits are exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)

        await t.click(Selector('[class="dxc-tab-label"]').find('span').withExactText("Payment"));
        await t.wait(2000)
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Supervisory Approval"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#supervisoryApproval-input'),"UnCheck","Use Supervisory Approval");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#queuePayment-input'),"UnCheck","Queue Payments instead of Hold");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#pmtNotifyImmSup-input'),"UnCheck","Notify The Immediate Supervisor");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#payLimitExceed-input'),"UnCheck","Payment Limits Are Exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#perClaimPayLimitsExceeded-input'),"UnCheck","Per Claim Pay Limits Exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#perClaimPerPolicyPayLimitsExceeded-input'),"UnCheck","Per Claim Per Policy Pay Limits Exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#perClaimPerCoveragePayLimitsExceeded-input'),"UnCheck","Per Claim Per Coverage Pay Limits Exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#perReserveMaximumPayLimitsExceeded-input'),"UnCheck","Per Financial Key Pay Limits Exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#payDetailLimitExceed-input'),"UnCheck","Payment Detail Limits Are Exceeded");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#payNotExist-input'),"UnCheck","Payee does Not Exist in System");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useEntityApproval-input'),"UnCheck","Use Entity Payment Approval");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)
        //end

        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Bank Account"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#subBankAcc-input'),"UnCheck","Use Sub bankaccount");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)

        await t.wait(2000)
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("More Configurations"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#useResFilter-input'),"Check","Use Reserve Type to Filter Transaction Type");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)


        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Void"))
        await t.wait(2000)
        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#enableVoidReasonComment-input'),"UnCheck","Check Void Reason");
        await t.wait(2000)
        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")
        await t.wait(2000)


        await t.click(Selector('[class="dxc-tab-label"]').find('span').withExactText("Funds Dormancy Setup"));
        await t.wait(2000)
        

        await t.click(Selector('[mattooltip="Search"]').nth(1))
        await t.wait(2000)
        await t.typeText(Selector('[type="search"]').nth(1),"Alabama");
        await t.wait(2000)

        if(Selector('a').withAttribute('role','checkbox').exists)
        { 
            await t.click(Selector('a').withAttribute('role','checkbox'))

            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[aria-label="Delete Grid Row"]'), "delete row") 
            await t.click(Selector('[class="btn btn-confirm"]'))
            await t.wait(2000)
        } 
        else {
             console.log(`Option not Present`); 
        }



    });


    test('AssureClaims_TurnOnSettingFromConfigurationManager_Test_02', async t => {


         await t.wait(2000)
        await Function_Utility.AssureClaims_ConfigManagerNavigation_Utility("General Claim Parameters", "gc", "Deductible", "More Configurations")

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#calculateDeductiblePayments-input'),"Check","Calculate Deductible on Payments");
        await t.wait(2000)

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#preventPrintZeroCheck-input'),"UnCheck","Prevent Printing Zero or Negative Amount Checks and Set to Printed");
        await t.wait(2000)

        await Nav_Utility.AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Selector('#showRecoveryReserveRowWhenDeductibleIsOn-input'),"Check","Show Recovery Reserve Row When Deductible Is On");
        await t.wait(2000)

        await t.click(Selector('[aria-labelledby="lbl_dedRecoveryIdentifierChar"]'))
        await t.pressKey('ctrl+a delete')
        await t.typeText(Selector('[aria-labelledby="lbl_dedRecoveryIdentifierChar"]'),'D')
        
        await t.wait(2000)
        await t.click(Selector('[aria-labelledby="lbl_manualDedRecoveryIdentifierChar"]'))
        await t.pressKey('ctrl+a delete')
        await t.typeText(Selector('[aria-labelledby="lbl_manualDedRecoveryIdentifierChar"]'),'MD')

        await Nav_Utility.AssureClaims_ElementClick_Utility(ConfigMgr_POM.AssureClaims_POM_Save, "Save")


        await t.wait(2000) 
        await t.click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Deductible Reserve Mapping"))
        await t.wait(2000)       
        
        await t.click(Selector('[aria-label="Add"]'))

        await t.click(Selector('#mat-select-2'));
        await t.click(Selector('[class="mat-option-text"]').find('span').withExactText('E Expense'))
        await t.wait(2000)

        await t.click(Selector('[aria-label="Deductible Reserve Type"]').find('div').withAttribute("class","mat-select-arrow mat-select-padding"))
        await t.click(Selector('a').withExactText('Deductible Expense'))
        await t.wait(2000)

        await t.click(Selector('[aria-label="Deductible Transaction Type"]').find('div').withAttribute("class","mat-select-arrow mat-select-padding"))
        await t.click(Selector('a').withExactText('Transaction Deductible Expense'))
        await t.wait(2000)
        await t.click(Selector('[aria-label="Save"]').nth(1))

        await t.wait(2000)    
        await t.click(Selector('[aria-label="Add"]'))

        await t.click(Selector('#mat-select-2'));
        await t.click(Selector('[class="mat-option-text"]').find('span').withExactText('I Indemnity'))
        await t.wait(2000)

        await t.click(Selector('[aria-label="Deductible Reserve Type"]').find('div').withAttribute("class","mat-select-arrow mat-select-padding"))
        await t.click(Selector('a').withExactText('Deductible Indemnity'))
        await t.wait(2000)

        await t.click(Selector('[aria-label="Deductible Transaction Type"]').find('div').withAttribute("class","mat-select-arrow mat-select-padding"))
        await t.click(Selector('a').withExactText('Transaction Deductible Indemnity'))
        await t.wait(2000)
        await t.click(Selector('[aria-label="Save"]').nth(1))
    });

});


