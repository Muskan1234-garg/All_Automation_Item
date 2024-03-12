import { Selector } from 'testcafe';
import { Crypto } from 'testcafe';
import colors from 'colors';
var faker = require('faker');

const dataSet = require('./dataIUT.json');
const crt = require('crypto')

var LastName = "Lname_"+faker.random.alphaNumeric(4).toUpperCase();
var FirstName = "Fname_"+faker.random.alphaNumeric(4).toUpperCase();
var LoginName = faker.random.alphaNumeric(7);
        
fixture `Smoke_Security`
    .page `https://rmabaselbl.dxc-rmcl.com/RiskmasterUX/#/login?clientId=3f28130450c00018`
    .beforeEach(t => t.resizeWindow(1200, 1100));

dataSet.forEach(data => {
test('UserCreation&Login', async t => {
    await t
        .maximizeWindow()
        .typeText(Selector('#username'), data.Username)
        .pressKey('tab')
        .typeText(Selector('#login-password'), data.Password)
        .pressKey('enter')
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Security'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
        //Login Into Application

        .click(Selector('#menuBar').find('a').withText('Security').nth(0))
        .click(Selector('#menu_SecurityRoot').find('a').withText('Security Management System'))
        .switchToIframe(Selector('#securitymgtsystem'))
        .click(Selector('#btnIconAddNew'))
        await t.typeText(Selector('#txt_lm'), LastName).setTestSpeed(0.6)
        .pressKey('tab')
        await t.typeText(Selector('#txt_fm'), FirstName).setTestSpeed(0.6)
        .click(Selector('#chk_AccessSms'))
        .click(Selector('#chk_PrivSetup'))
        .click(Selector('#exTab3').find('a').withText('Allowed/Assigned Data-Sources to Login'))
        .click(Selector('#tab_default_2').find('td').withText(data.DSN).child('input'))
        .click(Selector('#btn_save'))
        .click(Selector('#txt_newpass'))
        .typeText(Selector('#txt_newpass'), 'abkabk1').setTestSpeed(0.6)
        .click(Selector('#txt_con'))
        .typeText(Selector('#txt_con'), 'abkabk1').setTestSpeed(0.6)
        .click(Selector('#btn_save').nth(0))
        .click(Selector('#Select1'))
        .click(Selector('#Select1').find('option').withText(data.ModuleSecurityGroup))
        .click(Selector('#btn_del'))
        .click(Selector('#btn_edit_userPer'))
        .click(Selector('#permissionLoginName')).pressKey('ctrl+a delete')
        await t.typeText(Selector('#permissionLoginName'), LoginName).setTestSpeed(0.6)
        .click(Selector('#btn_save'))
		console.log("User Created!".green);
        await t.switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        //User Created And Logged-In User Is Logged-Out

        .typeText(Selector('#username'), LoginName).setTestSpeed(0.6)
        .pressKey('tab')
        .typeText(Selector('#login-password'), 'abkabk1').setTestSpeed(0.6)
        .click(Selector('#loginForm').find('button').withText('Sign in'))
        .click(Selector('[ng-model="dsnSelected"]'))
        .click(Selector('[role="option"]').find('span').withText(data.DSN))
        .click(Selector('[ng-model="zoneSelected"]'))
        .click(Selector('[role="option"]').find('a').withText('Security'))
        .click(Selector('#loginbox').find('button').withText('Continue'))
		console.log("Loggedin With New User!".green);
        //Login With New Created User

        await t.click(Selector('#menuBar').find('a').withText('Security').nth(0))
        .click(Selector('#menu_SecurityRoot').find('a').withText('Security Management System'))
        .switchToIframe(Selector('#securitymgtsystem'))
        .click(Selector('[class="tree-branch-head c-iCollapsed"]').nth(0))
        .click(Selector('#'+FirstName+'\\ '+LastName))
        .click(Selector('#btnIconDelete'))
        .click(Selector('#btn_del'))
		console.log("Created User deleted!".green)
        //Deleted Created User From Security

        await t.switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'))
        //Logged-Out

        .typeText(Selector('#username'), LoginName).setTestSpeed(0.6)
        .pressKey('tab')
        .typeText(Selector('#login-password'), 'abkabk1').setTestSpeed(0.6)
        .click(Selector('#loginForm').find('button').withText('Sign in'));
        const ele = Selector('[class="panel-body panel-body1"]').find('div').withText('*Incorrect Username and Password.').nth(0).with({ visibilityCheck: true })
        await t.expect(ele.exists).ok('', { timeout: 20000 })
        //Verified That User Cannot Be Logged In After Deletion
});});