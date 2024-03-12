import { Selector,Crypto } from 'testcafe';
import Colors from 'colors';
var faker = require('faker');

const crt = require('crypto')
const dataSet = require('./dataIUT.json');

var AdjLastName = "AdjLastName_"+faker.random.alphaNumeric(4).toUpperCase();
var AdjFirstName = "AdjFirstName_"+faker.random.alphaNumeric(4).toUpperCase();
var ClmLastName = "ClmntLastName_"+faker.random.alphaNumeric(4).toUpperCase();
var ClmFirstName = "ClmntFirstName_"+faker.random.alphaNumeric(4).toUpperCase();
var CreateNote = "CreateNote_"+faker.random.alphaNumeric(4).toUpperCase();
var TaskName = "TaskName_"+faker.random.alphaNumeric(4).toUpperCase();
var NotesText = "NotesText_"+faker.random.alphaNumeric(4).toUpperCase();

fixture `Smoke_GC`
    .page `https://rmabaselbl.dxc-rmcl.com/RiskmasterUX/#/login?clientId=3f28130450c00018`
    .beforeEach(t => t.resizeWindow(1200, 1100));

dataSet.forEach(data => {
test('GCCreationWithPaymentReserve', async t => {
    await t
        .maximizeWindow()
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Claims'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
        //console.log("Logged In!".green);  
        //Login Into Application
    await t    
        .click(Selector('#menuBar').find('a').withText('Document').nth(0))
        .click(Selector('#menu_DocumentRoot').find('a').withText('General Claim'))
        .switchToIframe(Selector('#claimgc_-1'))
        var date = new Date();
        var d = (date.getMonth()+1)+'/'+(date.getDate()-1)+'/'+date.getFullYear();
        await t.typeText(Selector('#ev_dateofevent').nth(1), d).setTestSpeed(0.6)
        .wait(1000)
        .typeText(Selector('#dateofclaim').nth(1), d).setTestSpeed(0.6)
        .click(Selector('#btn_ev_timeofevent').find('.glyphicon.glyphicon-time'))
        .click(Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'))
        .click(Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))

        const ele1 = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        .click(ele1)

        .click(Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        const ele2 = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.GCClaimType).with({ visibilityCheck: true })
        await t.expect(ele2.exists).ok('', { timeout: 20000 })
        .click(ele2)
        .click(Selector('#lookup_ev_depteid'))
        .typeText(Selector('#lookup_ev_depteid'), data.Department).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))

        const ele3 = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.GCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3.exists).ok('', { timeout: 20000 })
        .click(ele3)
        .click(Selector('#Save').find('i').withText('save'))
        console.log("GC saved!".green); 
        //GC Claim Save
    await t
        .click(Selector('#Financials\\/Reserves').find('.commonIcomoon.icomoon-safe.icon-safe'))
        .wait(1000)
        .click(Selector('#AddReserve').find('i').withText('add'))
        .click(Selector('#cmbReserveType'))
        .click(Selector('#cmbReserveType').find('option').withText(data.ReserveType))
        .typeText(Selector('#txtAmount').nth(1), '123').setTestSpeed(0.6)
        .click(Selector('#cmbStatusAdd'))
        .click(Selector('#cmbStatusAdd').find('option').withText(data.ReserveStatus))
        .click(Selector('#Save').find('i').withText('save'))
        console.log("GC-Reserves Created!".green); 
        //Reserve Creation Done

    await t    
        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="claimgc"]'))
        

        .click(Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        .click(Selector('#MakePayment').find('[class^="commonIcomoon material-icons-clr icon-payment icon"]'))
        .click(Selector('#cbopayeetype'))
        .click(Selector('#cbopayeetype').find('option').withText(data.PayeeType))
        .typeText(Selector('#lookup_rmalookupfinanciallastname2_lastName'), data.LastName).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('[role="button"]').find('span').withText('Transaction Detail'))
        .click(Selector('#cruduiGridAddBtn'))
        .click(Selector('#cmbTransactionType'))
        .click(Selector('#cmbTransactionType').find('option').withText(data.TransactionType))
        .typeText(Selector('#amount').nth(1), '12').setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .click(Selector('[role="button"]').find('span').withText('Transaction'))
        .click(Selector('#Save').find('i').withText('save'))
        .wait(2000)
        console.log("GC-Payment Created!".green);
        //Payment Creation
    await t
        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="claimgc"]'))
        .click(Selector('#PaymentHistory').find('i').withText('history'))
        .switchToIframe(Selector('#externalapp'))
        const ele4 = Selector('[role="gridcell"]').find('span').with({ visibilityCheck: true })
        await t.expect(ele4.exists).ok('', { timeout: 20000 })
        const ele5 = Selector('[role="gridcell"]').find('span').withText("Payment").with({ visibilityCheck: true })
        await t.expect(ele5.exists).ok('', { timeout: 20000 })
        console.log("GC-Payment History!".green);
        //Transaction History Verifications
    await t
        .switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
        //console.log("Logged out!".green);  
        //Logout From Application
});});

dataSet.forEach(data => {
test('GCCreationWithOtherEntities', async t => {
    await t
        .maximizeWindow()
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Claims'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
        //console.log("Logged In!".green);  
        //Login Into Application
    
    await t    
        .click(Selector('#menuBar').find('a').withText('Document').nth(0))
        .click(Selector('#menu_DocumentRoot').find('a').withText('General Claim'))
        .switchToIframe(Selector('#claimgc_-1'))
        var date = new Date();
        var d = (date.getMonth()+1)+'/'+(date.getDate()-1)+'/'+date.getFullYear();
        await t.typeText(Selector('#ev_dateofevent').nth(1), d).setTestSpeed(0.6)
        .wait(1000)
        .typeText(Selector('#dateofclaim').nth(1), d).setTestSpeed(0.6)
        .click(Selector('#btn_ev_timeofevent').find('.glyphicon.glyphicon-time'))
        .click(Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'))
        .click(Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        
        const ele1 = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.ClaimStatus).with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        .click(ele1)
        .click(Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))

        const ele2 = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.GCClaimType).with({ visibilityCheck: true })
        await t.expect(ele2.exists).ok('', { timeout: 20000 })
        .click(ele2)
        .click(Selector('#lookup_ev_depteid'))
        .typeText(Selector('#lookup_ev_depteid'), data.Department).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))

        const ele3 = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.GCPolicyLOB).with({ visibilityCheck: true })
        await t.expect(ele3.exists).ok('', { timeout: 20000 })
        .click(ele3)
        .click(Selector('#Save').find('i').withText('save'))
        console.log("GC saved!".green);  
        //GC Claim Save
    await t
        .click(Selector('#associated-adjuster').find('i').withText('add'))
        //var AdjLastName = "AdjLastName_"+randomString(5).toUpperCase()
        await t.typeText(Selector('#lookup_adjlastname'), AdjLastName).setTestSpeed(0.6)
        .pressKey('tab')
        .pressKey('tab')
        .pressKey('tab')
        .click(Selector("#adjfirstname"))
        .pressKey('ctrl+a delete')
        //var AdjFirstName = "AdjFirstName_"+randomString(5).toUpperCase()
        await t.typeText(Selector('#adjfirstname'), AdjFirstName).setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .click(Selector("#adjfirstname"))
        .pressKey('ctrl+a delete')
        .typeText(Selector('#adjfirstname'), "Edited"+AdjFirstName).setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        //todo
        //.click(Selector('[class^="toast-close-button ng-scope"]'))  
		.click(Selector('#toast-container').find('button').withText('×'))
        //todo      
        .switchToIframe(Selector('[id^="claimgc"]'))
        .click(Selector('#associated-adjuster').find('span').nth(1))
        .click(Selector('#Delete\\ Record').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .wait(2000)
        console.log("Adjuster verfied!".green);  
        //Adjuster Verification
    await t
        .click(Selector('#associated-claimant').find('i').withText('add'))
        .click(Selector('#lookup_clmntlastname'))
        //var ClmLastName = "ClmntLastName_"+randomString(5).toUpperCase()
        await t.typeText(Selector('#lookup_clmntlastname'), ClmLastName).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector("#clmntfirstname")).pressKey('ctrl+a delete')
        //var ClmFirstName = "ClmntFirstName_"+randomString(5).toUpperCase()
        await t.typeText(Selector('#clmntfirstname'), ClmFirstName).setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .click(Selector("#clmntfirstname")).pressKey('ctrl+a delete')
        .typeText(Selector('#clmntfirstname'), "Edited"+ClmFirstName).setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="claimgc"]'))
        .click(Selector('#associated-claimant').find('span').nth(1))
        .click(Selector('#Delete\\ Record').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .wait(2000)
        console.log("Claimant verfied!".green);  
        //Claimant Verification
    
    // await t
    //     .click(Selector('#associated-defendant').find('i').withText('add'))
    //     var DefLastName = "DefLastName_"+randomString(5).toUpperCase()
    //     await t.typeText(Selector('#lookup_deflastname'), DefLastName)
    //     .pressKey('tab')
    //     .click(Selector('#deffirstname')).pressKey('ctrl+a delete')
    //     .click(Selector('#Save').find('i').withText('save'))
    //     .click(Selector('#deffirstname')).pressKey('ctrl+a delete')
    //     var DeffirstName = "DefFirstName_"+randomString(5).toUpperCase()
    //     await t.typeText(Selector('#deffirstname'), DeffirstName)
    //     .pressKey('tab')
    //     .click(Selector('#Save').find('i').withText('save'))
    //     .switchToMainWindow()
    //     .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
    //     .switchToIframe(Selector('[id^="claimgc"]'))
    //     .click(Selector('#associated-defendant').find('span').nth(1))
    //     .click(Selector('#Delete\\ Record').find('i').withText('delete'))
    //     .click(Selector('#btnRoll').find('i').withText('done'))
    //     .wait(2000)
    //     console.log("Defendant verfied!".green); 
        //Defendant Verification
    await t
        .click(Selector('#Enhanced\\ Notes').find('i').withText('library_books'))
        .switchToIframe(Selector('#externalapp'))
        .click(Selector('#btnCreateNote').find('i').withText('assignment'))
        //var CreateNote = "CreateNote_"+randomString(5).toUpperCase()
        await t.typeText(Selector('#editor').find('.fr-element.fr-view'), CreateNote).setTestSpeed(0.6)
        .click(Selector('#btn_noteslookup_openlookup'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.EnhNotesType))
        .click(Selector('#btnSave').find('i').withText('save'))
        .click(Selector('#btnBackToNotes').find('i').withText('arrow_back'))
        console.log("Enhanced Notes Created!".green); 
        //Enhanced Notes Created
    
    await t
        .typeText(Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Note Text').parent('[role="columnheader"]').find('input'),CreateNote).setTestSpeed(0.6)
        .click(Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        .click(Selector('#btnEditNote').find('i').withText('edit'))
        .pressKey('ctrl+a delete')
        .typeText(Selector('#editor').find('.fr-element.fr-view'), "Edited"+CreateNote).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#btnSave').find('i').withText('save'))
        .click(Selector('#btnBackToNotes').find('i').withText('arrow_back'))
        //Enhnaced Notes Edited

        .typeText(Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Note Text').parent('[role="columnheader"]').find('input'),"Edited"+CreateNote).setTestSpeed(0.6)
        .click(Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
        .click(Selector('#btnDeleteNotes').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .switchToMainWindow()
        .switchToIframe(Selector('[id^="claim"'))
        .click(Selector('#P1').nth(1))
        //Enhanced Notes Deleted and Screen Closed

        .click(Selector('#Diary').find('.material-icons.mdi.mdi-book-open-page-variant'))
        .switchToIframe(Selector('#externalapp'))
        .click(Selector("#entryName"))
        .pressKey('ctrl+a delete')
        .wait(1000)
        //var TaskName = "TaskName_"+randomString(5).toUpperCase()
        await t.typeText(Selector('#entryName'), TaskName).setTestSpeed(0.6)
        .pressKey('tab')
        //var NotesText = "NotesText_"+randomString(5).toUpperCase()
        await t.typeText(Selector('#entryNotes'), NotesText).setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .wait(2000)
        //Diary Verification

        .switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
        //console.log("Logged out!".green);  
        //Logout From Application
});});