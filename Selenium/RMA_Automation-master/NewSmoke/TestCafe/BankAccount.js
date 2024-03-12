import { Selector } from 'testcafe';
import { Crypto } from 'testcafe';
var faker = require('faker');
function randomString(size) {  
        return crt
        .randomBytes(size)
        .toString('hex')
        .slice(0, size)
    };

function numberGen(len) {       //Function to Generate random number; length of number = value specified in 'len'
	 //  var genNum= Math.floor(Math.pow(10, len)*Math.random()).toString()
	  var text = "";
		var charset = "0123456789";
		for( var i=0; i < len; i++ ) {
		text += charset.charAt(Math.floor(Math.random() * charset.length));}
		return text;
};
const dataSet = require('./dataIUT.json');
const crt   = require('crypto')
var randomBankAccName = faker.random.alphaNumeric(6)+"Bank";
var AccountNumber = numberGen(9)
var AccountName = "AccName_"+faker.random.alphaNumeric(4)
fixture `CreateBankAccount`
    .page `https://rmabaselbl.dxc-rmcl.com/RiskmasterUX/#/login?clientId=3f28130450c00018`
    .beforeEach(t => t.resizeWindow(1200, 1100));

dataSet.forEach(data => {    
test('CreateBankAccount', async t => {
    
   
    //==================Login Code With JSON Starts================================       
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
        .wait(1000)
    //==================Login Code With JSON Ends================================    

    //==================Code to Create Bank Account Starts ================================    
 
        .click(Selector('#menuBar').find('a').withText('Funds').nth(0))
        .click(Selector('#menu_FundsRoot').find('a').withText('Bank Account'))

        .switchToIframe(Selector('[id^="bankaccount"]'))
        .wait(1000)
        //var BankAccount = "BA_"+randomString(4).toUpperCase()
        //await t
        .click(Selector('#lookup_banklastname'))
		.typeText(Selector('#lookup_banklastname'), randomBankAccName).setTestSpeed(0.6).pressKey('tab')
        //.click(Selector('#accountnumber'))         
        .typeText(Selector('#accountnumber'), AccountNumber).setTestSpeed(0.6)
        .pressKey('tab')           
        .click(Selector('#accountname')).typeText(Selector('#accountname'), AccountName).setTestSpeed(0.6)
        .pressKey("tab")
        .click(Selector('#Save').find('i').withText('save'))
    //==================Code to Create Bank Account Endss==================================

    //========================Click to RHS Child's Add button Starts=========================
        const ele1 = Selector('[class="row main_menu right-panel-bg-hover"]').find('i').withText('add').with({ visibilityCheck: true }) // RHS Menu is available
        await t.expect(ele1.exists).ok('', { timeout: 20000 })
        .click(ele1)
    //========================Click to RHS Child's Add button Ends=========================

    //==========================Logout Code Starts==========================================
        .switchToMainWindow()
        .click(Selector('#morebtn').find('i').withText('more_vert'))
        .click(Selector('#menu_othersMenu').find('a').withText('exit_to_appLogout'))
        .click(Selector('#btnRoll').find('i').withText('done'));
    //===========================Logout Code Ends======================================== 
});});