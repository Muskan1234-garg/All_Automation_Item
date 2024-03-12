import { Selector } from 'testcafe';
import { Crypto } from 'testcafe';
import colors from 'colors';
var faker = require('faker');

function numberGen(len) {       //Function to Generate random number; length of number = value specified in 'len'
	 //  var genNum= Math.floor(Math.pow(10, len)*Math.random()).toString()
	  var text = "";
		var charset = "0123456789";
		for( var i=0; i < len; i++ ) {
		text += charset.charAt(Math.floor(Math.random() * charset.length));}
		return text;
};

const dataSet = require('./dataIUT.json');
const crt = require('crypto')

var Code = "Code_"+faker.random.alphaNumeric(4).toUpperCase();
var Desc = "Desc_"+faker.random.alphaNumeric(4).toUpperCase();
var EntityName = "EntityName_"+faker.random.alphaNumeric(4).toUpperCase();
var EntAbb = "EntAbb_"+faker.random.alphaNumeric(2).toUpperCase();
var BankName = "BA_"+faker.random.alphaNumeric(4).toUpperCase();
var AccNumber = faker.random.alphaNumeric(9).toUpperCase();
var DriverName = "DvName_"+faker.random.alphaNumeric(4).toUpperCase();
var EmpName = "Emp_"+faker.random.alphaNumeric(5).toUpperCase();
var EmpNumber = numberGen(9);
var SSN = numberGen(9);
var PeopleName = "PeoName_"+faker.random.alphaNumeric(4).toUpperCase();       
var OrgName = "OrgName_"+faker.random.alphaNumeric(5).toUpperCase();
var Abb = "OrgAbb_"+faker.random.alphaNumeric(5).toUpperCase();
         
fixture `Smoke_Maintenance`
    .page `https://rmabaselbl.dxc-rmcl.com/RiskmasterUX/#/login?clientId=3f28130450c00018`;

//commneted for now
// dataSet.forEach(data => {
//      await t
//         .maximizeWindow()
//         .typeText(Selector('#username'), data.Username)
//         .pressKey('tab')
//         .typeText(Selector('#login-password'), data.Password)
//         .pressKey('enter')
//         .click(Selector('[ng-model="dsnSelected"]'))
//         .click(Selector('[role="option"]').find('span').withText(data.DSN))
//         .click(Selector('[ng-model="zoneSelected"]'))
//         .click(Selector('[role="option"]').find('a').withText('Maintenance'))
//         .click(Selector('#loginbox').find('button').withText('Continue'))
//         //Login Into Application

//         .click(Selector('#menuBar').find('a').withText('Maintenance').nth(0))
//         .click(Selector('#menu_MaintenanceRoot').find('a').withText('Table Maintenance'))
//         .switchToIframe(Selector('#tablemaintenance'))
//         .click(Selector('[class="ng-scope select-code-table-list"]').find("span"))
//         .click(Selector('[uib-tooltip="Add Code"]'))
//         await t.typeText(Selector('#txt_Code'), Code).setTestSpeed(0.6)u
//         .pressKey('tab')
//         await t.typeText(Selector('#txt_Description'), Desc).setTestSpeed(0.6)
//         .click(Selector('#btn_del'))
//         .typeText(Selector('[class="ui-grid-header-cell-label ng-binding"]').withText('Code').parent('[role="columnheader"]').find('input'),Code).setTestSpeed(0.6)
//         .click(Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'))
//         .click(Selector('#I6'))
//         .click(Selector('#btnRoll').find('i').withText('done'))
//			console.log("Table Maintenance Verified!".green);
//         //Creation And Deletion Of Table Maint code
       
//         await t.switchToMainWindow()
//         .click(Selector('#morebtn').find('i').withText('more_vert'))
//         .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
//         .click(Selector('#btnRoll').find('i').withText('done'));
//         //Logout Of Application
// });});

dataSet.forEach(data => {
test('EntityCreation', async t => {
    await t
         .maximizeWindow()
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Maintenance'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
        //Login Into Application

        .click(Selector('#menuBar').find('a').withText('Maintenance').nth(0))
        .click(Selector('#menu_MaintenanceRoot').find('a').withText('Entity'))
        .switchToIframe(Selector('[id^="entities_"]'))
        .click(Selector('#entitytableid'))
        .click(Selector('#entitytableid').find('option').withText(data.EntityType))
        await t.typeText(Selector('#lastname'), EntityName).setTestSpeed(0.6)
        .click(Selector('#abbreviation'))
        await t.typeText(Selector('#abbreviation'), EntAbb).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#Save').find('i').withText('save'))
        const ele1 = Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add').with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        //Entity Saved

        .click(Selector('#lastname'))
        .pressKey('ctrl+a delete')
        .typeText(Selector('#lastname'), "Edited"+EntityName).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#Save').find('i').withText('save'))
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        //Entity Edited

        .click(Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add'))
        .click(Selector('#bankname'))
        await t.typeText(Selector('#bankname'), BankName).setTestSpeed(0.6)
        await t.typeText(Selector('#accountnumber'), AccNumber).setTestSpeed(0.6)
        .click(Selector('#btn_accttypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountType))
        .click(Selector('#btn_bankingstatus_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountStatus))
        .typeText(Selector('#transit'), '888888888').setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        //Banking Information Saved

        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="entities_"]'))
        .click(Selector('#Delete\\ Record').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .wait(2000)
		console.log("Entity Maintenance Verified!".green);
        //Entity Deleted

        await t.switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
        //Logout Of Application
});});

// dataSet.forEach(data => {
// test('DriverCreation', async t => {
//     await t
//         .maximizeWindow()
//         .typeText(Selector('#username'), data.Username)
//         .pressKey('tab')
//         .typeText(Selector('#login-password'), data.Password)
//         .pressKey('enter')
//         .click(Selector('[ng-model="dsnSelected"]'))
//         .click(Selector('[role="option"]').find('span').withText(data.DSN))
//         .click(Selector('[ng-model="zoneSelected"]'))
//         .click(Selector('[role="option"]').find('a').withText('Maintenance'))
//         .click(Selector('#loginbox').find('button').withText('Continue'))
//         //Login Into Application

//         .click(Selector('#menuBar').find('a').withText('Maintenance').nth(0))
//         .click(Selector('#menu_MaintenanceRoot').find('a').withText('Driver'))
//         .switchToIframe(Selector('[id^="driver"]'))
//         .click(Selector('#entitytableid'))
//         .wait(1000)
//         .click(Selector('[aria-label="Type Of Driver"]').find('option').withText(data.DriverType))
//         await t.typeText(Selector('#lastname'), DriverName).setTestSpeed(0.6)
//         .pressKey('tab')
//         .click(Selector('#Save').find('i').withText('save'))
//         const ele1 = Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add').with({ visibilityCheck: true })
//         await t.expect(ele1.exists).ok('', { timeout: 20000 })
//         //Driver Saved

//         .click(Selector('#lastname'))
//         .pressKey('ctrl+a delete')
//         .typeText(Selector('#lastname'), "Edited"+DriverName).setTestSpeed(0.6)
//         .pressKey('tab')
//         .click(Selector('#Save').find('i').withText('save'))
//         await t.expect(ele1.exists).ok('', { timeout: 20000 })
//         //Driver Edited

//         .click(Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add'))
//         .click(Selector('#bankname'))
//         await t.typeText(Selector('#bankname'), BankName).setTestSpeed(0.6)
//         await t.typeText(Selector('#accountnumber'), AccNumber).setTestSpeed(0.6)
//         .click(Selector('#btn_accttypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
//         .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountType))
//         .click(Selector('#btn_bankingstatus_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
//         .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountStatus))
//         .typeText(Selector('#transit'), '888888888').setTestSpeed(0.6)
//         .click(Selector('#Save').find('i').withText('save'))
//         //Banking Information Saved

//         .switchToMainWindow()
//         .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
//         .switchToIframe(Selector('[id^="driver"]'))
//         .click(Selector('#Delete\\ Record').find('i').withText('delete'))
//         .click(Selector('#btnRoll').find('i').withText('done'))
//         .wait(2000)
//			console.log("Driver Maintenance Verified!".green);
//         //Driver Deleted

//         await t.switchToMainWindow()
//         .click(Selector('#morebtn').find('i').withText('more_vert'))
//         .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
//         .click(Selector('#btnRoll').find('i').withText('done'));
//         //Logout Of Application
// });});

dataSet.forEach(data => {
test('EmployeeCreation', async t => {        
    await t
        .maximizeWindow()
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Maintenance'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
        //Login Into Application

        .click(Selector('#menuBar').find('a').withText('Maintenance').nth(0))
        .click(Selector('#menu_MaintenanceRoot').find('a').withText('Employee'))
        .switchToIframe(Selector('[id^="employees"]'))
        await t.typeText(Selector('#employeenumber'), EmpNumber).setTestSpeed(0.6)
        await t.typeText(Selector('#lastname'), EmpName).setTestSpeed(0.6)
        .click(Selector('[role="button"]').find('span').withText('Employment Info'))
        .typeText(Selector('#lookup_deptassignedeid'), data.Department).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('[role="button"]').find('span').withText('Employee'))
        await t.typeText(Selector('#taxid'), SSN).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#Save').find('i').withText('save'))
        const ele1 = Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add').with({ visibilityCheck: true })
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        //Employee Saved

        .click(Selector('#lastname'))
        .pressKey('ctrl+a delete')
        .typeText(Selector('#lastname'), "Edited"+EmpName).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#Save').find('i').withText('save'))
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        //Employee Edited

        .click(Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add'))
        .click(Selector('#bankname'))
        await t.typeText(Selector('#bankname'), BankName).setTestSpeed(0.6)
        await t.typeText(Selector('#accountnumber'), AccNumber).setTestSpeed(0.6)
        .click(Selector('#btn_accttypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountType))
        .click(Selector('#btn_bankingstatus_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountStatus))
        .typeText(Selector('#transit'), '888888888').setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        //Banking Information Saved

        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="employees"]'))
        .click(Selector('#Delete\\ Record').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .wait(2000)
		console.log("Employee Maintenance Verified!".green);
        //Employee Deleted

        await t.switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
        //Logout Of Application
});});

// dataSet.forEach(data => {
// test('PeopleCreation', async t => {
//     await t
//         .maximizeWindow()
//         .typeText(Selector('#username'), data.Username)
//         .pressKey('tab')
//         .typeText(Selector('#login-password'), data.Password)
//         .pressKey('enter')
//         .click(Selector('[ng-model="dsnSelected"]'))
//         .click(Selector('[role="option"]').find('span').withText(data.DSN))
//         .click(Selector('[ng-model="zoneSelected"]'))
//         .click(Selector('[role="option"]').find('a').withText('Maintenance'))
//         .click(Selector('#loginbox').find('button').withText('Continue'))
//         //Login Into Application

//         .click(Selector('#menuBar').find('a').withText('Maintenance').nth(0))
//         .click(Selector('#menu_MaintenanceRoot').find('a').withText('People'))
//         .switchToIframe(Selector('[id^="people"]'))
//         .click(Selector('#entitytableid'))
//         .click(Selector('#entitytableid').find('option').withText(data.PeopleType))
//         await t.typeText(Selector('#lastname'), PeopleName).setTestSpeed(0.6)
//         .pressKey('tab')
//         .click(Selector('#Save').find('i').withText('save'))
//         .wait(2000)
//         //People Saved

//         .click(Selector('#lastname'))
//         .pressKey('ctrl+a delete')
//         .typeText(Selector('#lastname'), "Edited"+PeopleName).setTestSpeed(0.6)
//         .pressKey('tab')
//         .click(Selector('#Save').find('i').withText('save'))
//         //People Edited

//         .click(Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add'))
//         .click(Selector('#bankname'))
//         await t.typeText(Selector('#bankname'), BankName).setTestSpeed(0.6)
//         await t.typeText(Selector('#accountnumber'), AccNumber).setTestSpeed(0.6)
//         .click(Selector('#btn_accttypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
//         .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountType))
//         .click(Selector('#btn_bankingstatus_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
//         .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountStatus))
//         .typeText(Selector('#transit'), '888888888').setTestSpeed(0.6)
//         .click(Selector('#Save').find('i').withText('save'))
//         //Banking Information Saved

//         .switchToMainWindow()
//         .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
//         .switchToIframe(Selector('[id^="people"]'))
//         .click(Selector('#Delete\\ Record').find('i').withText('delete'))
//         .click(Selector('#btnRoll').find('i').withText('done'))
//         .wait(2000)
//			console.log("People Maintenance Verified!".green);		
//         //People Deleted

//         await t.switchToMainWindow()
//         .click(Selector('#morebtn').find('i').withText('more_vert'))
//         .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
//         .click(Selector('#btnRoll').find('i').withText('done'));
//         //Logout Of Application
// });});

dataSet.forEach(data => {
test('OrgHierarchyCreation', async t => {
    await t
        .maximizeWindow()
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Maintenance'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
        //Login Into Application

        .click(Selector('#menuBar').find('a').withText('Maintenance').nth(0))
        .click(Selector('#menu_MaintenanceRoot').find('a').withText('Org. Hierarchy'))
        .switchToIframe(Selector('#orghierarchyentity'))
        .click(Selector('#idnodeadd').find('i').withText('note_add'))
        .switchToMainWindow()
        .switchToIframe(Selector('[id^="orghierarchyentities_"]'))
        .click(Selector('#lastname'))
        await t.typeText(Selector('#lastname'), OrgName).setTestSpeed(0.6)
        await t.typeText(Selector('#deptabbreviation'), Abb).setTestSpeed(0.6)
        .pressKey('tab')
        .click(Selector('#Save').find('i').withText('save'))
        //Org Hierarchy Saved

        .click(Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add'))
        .click(Selector('#bankname'))
        await t.typeText(Selector('#bankname'), BankName).setTestSpeed(0.6)
        await t.typeText(Selector('#accountnumber'), AccNumber).setTestSpeed(0.6)
        .click(Selector('#btn_accttypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountType))
        .click(Selector('#btn_bankingstatus_openlookup').find('.glyphicon.glyphicon-option-horizontal'))
        .click(Selector('[class="ui-grid-cell-contents ng-scope"]').find('span').withText(data.AccountStatus))
        .typeText(Selector('#transit'), '888888888').setTestSpeed(0.6)
        .click(Selector('#Save').find('i').withText('save'))
        //Banking Information Saved

        .switchToMainWindow()
        .click(Selector('#dvbreadcrumbscroll').find('i').withText('reply'))
        .switchToIframe(Selector('[id^="orghierarchyentities_"]'))
        .click(Selector('#Delete\\ Record').find('i').withText('delete'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        .wait(2000)
		console.log("OrgHierarchy Maintenance Verified!".green);
        //Org Hierarchy Deleted

        await t.switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
        //Logout Of Application
});});



