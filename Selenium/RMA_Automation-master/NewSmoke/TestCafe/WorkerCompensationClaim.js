import { Selector } from 'testcafe';
import {Crypto} from 'testcafe';
var faker = require('faker');
import colors from 'colors';

function numberGen(len) {       //Function to Generate random number; length of number = value specified in 'len'
	 //  var genNum= Math.floor(Math.pow(10, len)*Math.random()).toString()
	  var text = "";
		var charset = "0123456789";
		for( var i=0; i < len; i++ ) {
		text += charset.charAt(Math.floor(Math.random() * charset.length));}
		return text;
};

const crt = require('crypto')
const dataSet = require('./dataIUT.json');

var EmpNumber = numberGen(9);
var EmpName = "EmployeeName_"+faker.random.alphaNumeric(3).toUpperCase();
var SSN = numberGen(9); 
var DriverName = "DvName_"+faker.random.alphaNumeric(5).toUpperCase();
var TaskName = "TaskName_"+faker.random.alphaNumeric(5).toUpperCase();
var NotesText = "NotesText_"+faker.random.alphaNumeric(5).toUpperCase();
 
fixture `Smoke_WC`
    .page `https://rmabaselbl.dxc-rmcl.com/RiskmasterUX/#/login?clientId=3f28130450c00018`;

dataSet.forEach(data => {
test('Smoke_WC', async t => {
    await t
         await t.maximizeWindow()
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Claims'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
        //Login Into Application

        .click(Selector('#menuBar').find('a').withText('Document').nth(0))
        .click(Selector('#menu_DocumentRoot').find('a').withText('Workers’ Comp'))
        .switchToIframe(Selector('[id^="claimwc"]'))
        .click(Selector('#lookup_empemployeenumber'))
        await t.typeText(Selector('#lookup_empemployeenumber'), EmpNumber).setTestSpeed(0.6)
        .pressKey('tab')
        .typeText(Selector('#lookup_ev_depteid'), data.Department).setTestSpeed(0.6)
        .pressKey('enter')
        .click(Selector('#btn_claimtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.WCClaimType))
        .wait(2000)
        .click(Selector('#btn_policyLOBCode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.WCPolicyLOB))
        .click(Selector('#btn_claimstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.ClaimStatus))
        .click(Selector('#btn_ev_timeofevent'))
        .click(Selector('#ev_dateofevent').nth(1))
        var date = new Date();
        var d = (date.getMonth()+1)+'/'+(date.getDate()-1)+'/'+date.getFullYear();
        await t.typeText(Selector('#ev_dateofevent').nth(1), d).setTestSpeed(0.6)
        .typeText(Selector('#dateofclaim').nth(1), d).setTestSpeed(0.6)
        .click(Selector('#btn_timeofclaim').find('.glyphicon.glyphicon-time'))
        .click(Selector('#btn_filingstateid_openlookup'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText('Alberta'))
        .click(Selector('[role="button"]').find('span').withText('Employee Info').nth(1))
        .typeText(Selector('#emptaxid'), SSN).setTestSpeed(0.6)
        .click(Selector('#emplastname'))
        await t.typeText(Selector('#emplastname'), EmpName).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('[role="button"]').find('span').withText('Employment Info').nth(1))
        .typeText(Selector('#lookup_empdeptassignedeid1'), data.Department).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('[role="button"]').find('span').withText('Claim Info').nth(1))
        .click(Selector('#Save').find('i').withText('save'))
		console.log("WC Saved!".green);
        //WC Saved
    
        await t.click(Selector('#associated-pi').find('i').withText('add'))
        .click(Selector('#frmList').find('i').withText('add').nth(1))
        .click(Selector('#drivertyped'))
        .click(Selector('#drivertyped').find('option').withText(data.DriverType))
        await t.typeText(Selector('#lookup_lastname'), DriverName).setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .wait(1000)
        .click(Selector('#lookup_lastname')).pressKey('ctrl+a delete')
        .typeText(Selector('#lookup_lastname'), "Edited"+DriverName).setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        .wait(1000)
        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="claimwc"]'))
        .click(Selector('#associated-pi').find('span').nth(1))
        .click(Selector('#Delete\\ Record').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .wait(2000)
		console.log("WC-Driver Verified!".green);
        //PI On Event Created
		await t.switchToMainWindow()       // Click to Crosss button over blue toaster
	    .click(Selector('#toast-container').find('button').withText('×')) 
	    .switchToIframe(Selector('[id^="claimwc"]'))

        //.click(Selector('#associated-litigation').find('i').withText('add'))
        //.click(Selector('#docketnumber'))
        //var LitNumber = randomString(4).toUpperCase()
        //await t.typeText(Selector('#docketnumber'), LitNumber)
        //.click(Selector('#btn_littypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        //.click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.LitType))
        //.click(Selector('#Save').find('i').withText('save'))
        //.switchToMainWindow()
        //.click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        //.switchToIframe(Selector('[id^="claimwc"]'))
        //.click(Selector('#associated-litigation').find('span').nth(1))
        //.click(Selector('#docketnumber')).pressKey('ctrl+a delete')
        //.typeText(Selector('#docketnumber'), LitNumber+randomString(2).toUpperCase())
        //.click(Selector('#Save').find('i').withText('save'))
        //.click(Selector('#Delete\\ Record').find('i').withText('delete'))
        //.click(Selector('#btnRoll').find('i').withText('done'))
        //Litigation Verified

        .click(Selector('#Case\\ Management').find('.material-icons.mdi.mdi-briefcase'))
        .click(Selector('#btn_empdisabilitycode2_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.DisabilityType))
        .click(Selector('#btn_illnesscode2_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.IllnessType))
        .click(Selector('#Save').find('i').withText('save'))
        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="claimwc"]'))
        .click(Selector('#Case\\ Management').find('.material-icons.mdi.mdi-briefcase'))
        .click(Selector('#Delete\\ Record').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .wait(2000)
		console.log("WC-Case Management Verified!".green);
        //Case Management Verified

		//commneted for now
        // .click(Selector('#Diary').find('.material-icons.mdi.mdi-book-open-page-variant'))
        // .switchToIframe(Selector('#externalapp'))
        // .click(Selector("#entryName"))
        // .pressKey('ctrl+a delete')
        // .wait(1000)
        // await t.typeText(Selector('#entryName'), TaskName)
        // .pressKey('tab')
        // var NotesText = "NotesText_"+randomString(5).toUpperCase()
        // await t.typeText(Selector('#entryNotes'), NotesText)
        // .click(Selector('#Save').find('i').withText('save'))
        // .wait(2000)
        //Diary Verification

        /*.switchToMainWindow()
        .switchToIframe('[id^="claimwc"]')
        .click(Selector('#Executive\\ Summary').find('.commonIcomoon.icon-brankic.icon-coins'))
        .wait(10000)
        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))*/

        await t.switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
        //Logout From Application
});});