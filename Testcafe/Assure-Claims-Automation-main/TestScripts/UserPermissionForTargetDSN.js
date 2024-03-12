import { Selector,Role } from 'testcafe';

import Colors from 'colors';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Functionality_Utility from '../Functional_Utilities/Functionality_Utility';
import GenericUsages_Utility from '../Functional_Utilities/GenericUsages_Utility';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';
import POM_SMS from '../Functional_POM/POM_SMS';

const DataIUT = require('../DataFiles/DataPlatform.json');

const Function_Utility = new Functionality_Utility();
const Nav_Utility=new Navigation_Utility();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();
const SMS_POM = new POM_SMS();       
let TargetDSNName = "PST_CARRIER_DATA213";
let users = ['csc csc', 'p1 p1', 'p2 p2', 'p3 p3', 'p4 p4', 'p5 p5', 'p6 p6', 'p7 p7', 'p8 p8', 'p9 p9', 'p10 p10', 'p11 p11', 'p12 p12', 'p13 p13', 'p14 p14', 'p15 p15', 'p16 p16', 'p17 p17', 'p18 p18', 'p19 p19', 'p20 p20', 'p21 p21', 'p22 p22', 'p23 p23', 'p24 p24', 'p25 p25', 'p26 p26', 'p27 p27', 'p28 p28', 'p29 p29', 'p30 p30', 'p31 p31', 'p32 p32', 'p33 p33', 'p34 p34', 'p35 p35', 'p36 p36', 'p37 p37', 'p38 p38', 'p39 p39', 'p40 p40', 'p41 p41', 'p42 p42', 'p43 p43', 'p44 p44', 'p45 p45', 'p46 p46', 'p47 p47', 'p48 p48', 'p49 p49', 'p50 p50', 'p51 p51', 'p52 p52', 'p53 p53', 'p54 p54', 'p55 p55', 'p56 p56', 'p57 p57', 'p58 p58', 'p59 p59', 'p60 p60', 'p61 p61', 'p62 p62', 'p63 p63', 'p64 p64', 'p65 p65', 'p66 p66', 'p67 p67', 'p68 p68', 'p69 p69', 'p70 p70', 'p71 p71', 'p72 p72', 'p73 p73', 'p74 p74', 'p75 p75', 'p76 p76', 'p77 p77', 'p78 p78', 'p79 p79', 'p80 p80', 'p81 p81', 'p82 p82', 'p83 p83', 'p84 p84', 'p85 p85', 'p86 p86', 'p87 p87', 'p88 p88', 'p89 p89', 'p90 p90', 'p91 p91', 'p92 p92', 'p93 p93', 'p94 p94', 'p95 p95', 'p96 p96', 'p97 p97', 'p98 p98', 'p99 p99', 'p100 p100']


DataIUT.forEach(data => {
  fixture `UserPermission`.beforeEach(async t => {
        await t.wait(5000)
        await t.navigateTo(data.URL);
        await t.maximizeWindow();
      });
       test('AssureClaims_ProvidingUserPermission_Test_01', async t => {
        await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username,data.Password,data.DSN,'Security')
        console.log("Login Into Application!!".green)
        await Nav_Utility.AssureClaims_MenuOptionClick_Utility("Security:Security Management System");
        await Generic_Utility.AssureClaims_DynamicFrameSwitching(Verification_Msg.AssureClaims_SMSIframe)
        for(let i = 0; i <= 100; i++){
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector('[class="tree-branch-head c-iCollapsed"]'), "Expand Users");
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector("[id=" + "'" + users[i] + "'"+ "]"), "Select" + " " + users[i]);
            await Nav_Utility.AssureClaims_ElementClick_Utility(Selector("#btn_edit_user"), "Edit");
            await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_Generic_AssureClaimsText.withText('Allowed/Assigned Data-Sources to Login'),"Click on Allowed/Assigned Data-Sources to Login Button")
            const DSNCheckedAlready = await SMS_POM.AssureClaims_SMSUser_Rdo_DSNSelection.withText(TargetDSNName).innerText; 
            if(!DSNCheckedAlready.includes("done")){
              await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Rdo_DSNSelection.withText(TargetDSNName).child('input'),"Select Radio Button of DSNName")
              await Nav_Utility.AssureClaims_ElementClick_Utility(SMS_POM.AssureClaims_SMSUser_Btn_Save,"Save Image Button On User Setting Screen");
              await t.wait(2000)
            }else{
              console.log(`User ${users[i]} already has permission`);
            }
        }

});

});