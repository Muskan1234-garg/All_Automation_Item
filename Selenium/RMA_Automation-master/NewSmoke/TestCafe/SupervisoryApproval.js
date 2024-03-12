import { Selector } from 'testcafe';
import { Crypto } from 'testcafe';
import { colors } from 'colors';

const dataSet = require('./dataIUT.json');
const crt   = require('crypto')

fixture `SupervisoryApproval`
    .page `https://rmabaselbl.dxc-rmcl.com/RiskmasterUX/#/login?clientId=3f28130450c00018`
	.beforeEach(t => t.resizeWindow(1200, 1100));
   

dataSet.forEach(data => {
test('SupervisoryApproval', async t => {
    //==================Login Code With JASON Starts================================       
        await t
        .maximizeWindow()
       // .wait(30000)
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Claims'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
       // .wait(30000)
    //==================Login Code With JSON Ends================================    

    //==================Reserve Approval Code Begins ==============================
        .click(Selector('#menuBar').find('a').withText('Funds').nth(0))
        .click(Selector('#menu_FundsRoot').find('a').withText('Supervisory Approval'))
        .switchToIframe(Selector('#trans'))
        .click(Selector('#resa1').find('i').withText('autorenew'))
        .click(Selector('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]').nth(1))
        .click(Selector('#resaApprove'))
        .typeText(Selector('#txtarReservesapprovalreason'), 'Reserve Approved')
        .click(Selector('#btnSaveComment'))
        .wait(2000)
		console.log("Reserve Approved!".green)
    //==================Reserve Approval Code Ends ==============================

    //==================Payment Approval Code Begins ==============================
		await t.click(Selector('#aPaymentTab').nth(0))

        var cN = await Selector('[class^="ngCellText ui-grid-cell-contents ng-scope"]').find('span').nth(1).innerText; // Control Number of 1st row is captured
        var ControlNum = cN.toString()
        console.log("Selected Control Number is "+ControlNum.green);     
		 
        await t.click(Selector('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]').nth(1))
        .click(Selector('#payaApprove'))
        .typeText(Selector('#txtPaymentapprovalreason'), 'Transaction Approved')
        await t.click(Selector('#btnSaveComment'))
       
    //==================Payment Approval Code Ends ============================== 


    //================Verify approved transaction is not in the Grid Starts================
        await t.typeText(Selector('[class^="ui-grid-filter-input ui-grid-filter-"]').nth(2), ControlNum)
		.pressKey('tab')

        const e1e2 = Selector('[class^="ngCellText ui-grid-cell-contents ng-scope"]').find('span').nth(1).withText(ControlNum)
        await t.expect(e1e2.exists).notOk('', { timeout: 20000 })
        console.log(ControlNum.green+" Is not available in the Grid After Approved".red);
    //================Verify approved transaction is not in the Grid Starts================
    
    //===========================Logout Code Starts==========================================
        await t.switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
    //===========================Logout Code Ends==========================================        
});});