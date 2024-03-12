import { Selector } from 'testcafe';
import { Crypto } from 'testcafe';
import { colors } from 'colors';
import { ClientFunction } from 'testcafe';

function randomString(size) {
            return crt
                .randomBytes(size)
                .toString('hex')
                .slice(0, size)
        };
const dataSet = require('./dataIUT.json');
// const dataSet = require('../DataFiles/DataAutoRegDSN_2.json'); 
const crt = require('crypto')

fixture`Configuration Manager`
    .page`https://rma194automation.dxc-rmcl.com/riskmasterux`
    .beforeEach(t => t.resizeWindow(1200, 1100))

dataSet.forEach(data => {
    test('Smoke_ConfigManager', async t => {
        
        //==================Login Code With User Starts================================       
        await t
            .maximizeWindow()
            .typeText(Selector('#username'), data.Username)
            .pressKey('tab')
            .typeText(Selector('#login-password'), data.Password)
            .pressKey('enter')
            .click(Selector('[role="trigger"]'))
            .wait(2000)
            .click(Selector('[role="listbox"]').find('span').withText(data.DSN))
            .click(Selector('[class="content childComponents"]').find('span').withText('Configuration Manager'))
            .wait(20000)
        console.log("Configuration Manager!".green);
        //==================Login Code With User Ends================================

        //==================Configuration Manager Starts================================
        //====================General System Parameters -> System -> Event -> Event Number Prefix value change and save started==================================
        await t
            .click(Selector('#all-services-itemec2 > a').find('span').withText("General System Parameters"))
            .wait(5000)
            .switchToIframe(Selector('#systemparameter'))
            .click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText("Event"))
            .click(Selector('#evPrefix')).pressKey('ctrl+a delete')
        var evt = "E" + randomString(3).toUpperCase();
        await t.typeText(Selector('#evPrefix'), evt)
            .click(Selector('[aria-label="Save"]'))
            .wait(8000)
        console.log("Event Number Prefix value change and SAVED".green);
        //====================General System Parameters -> System -> Event -> Event Number Prefix value change and save ended==================================
        //====================Open General Claim Parameter Screen started==================================

        await t.switchToMainWindow()
            .click(Selector('[aria-label="Menu"]'))
            .click(Selector('#all-services-itemec2 > a').find('span').withText("General Claim Parameters"))
            .wait(5000)
            .switchToIframe(Selector('#gc'))
            //====================Open General Claim Parameter Screen ended================================== 
            //====================Payment parameter Setup -> Checks -> Check output -> max # of autochecks per batch value edit started================================== 
            .switchToMainWindow()
            .click(Selector('[aria-label="Menu"]'))
            .click(Selector('#all-services-itemec2 > a').find('span').withText("Payment Parameters"))
            .wait(5000)
            .switchToIframe(Selector('iframe[id*="paymentparameter"]'))
            .click(Selector("#maxAutoChecksBatch")).pressKey('ctrl+a delete')
            .typeText(Selector('#maxAutoChecksBatch'), '10')
            .click(Selector('[aria-label="Save"]'))
        console.log("Max # of autochecks per batch value edit SAVED".green);
        await t.switchToMainWindow()
            .click(Selector('#logoutButton'))
            .click(Selector('[class="mdc-dialog__container"]').find('button').withText("Confirm"))
        //====================Payment parameter Setup -> Checks -> Check output -> max # of autochecks per batch value edit ended================================== 
        console.log("Configuration Manager!Testcase Successful".green);
        //==================Configuration Manager Ends================================
    })
})


