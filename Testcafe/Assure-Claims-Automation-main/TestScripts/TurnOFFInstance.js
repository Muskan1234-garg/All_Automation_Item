import { Selector } from 'testcafe';


fixture`New Fixture`
    .page`https://claimsaws.dxc-rmcl.com/rmaawsgateway`;

test('TurnOffAutomationDB_222', async t => {

    await t.wait(5000)
    await t.maximizeWindow();
    await t.setNativeDialogHandler(() => true)
    await t.wait(3000)
    await t.typeText(Selector('#Username'), 'dev')
    await t.typeText(Selector('#Password'), 'dev')
    await t.click(Selector('[type="submit"]'));
    await t.click(Selector('#ddlinstances'))
    await t.click(Selector('#ddlinstances').find('option').withText("54.151.18.222"))
    await t.wait(3000)
    await t.click(Selector('[value="Stop Instance"]'))
    await t.wait(3000)
    await t.click(Selector('[value="Check Status"]'))
    await t.wait(3000)
    await t.setNativeDialogHandler(() => true)
    await t.wait(5000)
const history = await t.getNativeDialogHistory();

    console.log(history)
});

test('TurnOffAutomationWeb_149', async t => {

    await t.wait(5000)
    await t.maximizeWindow();
    await t.setNativeDialogHandler(() => true)
    await t.wait(3000)
    await t.typeText(Selector('#Username'), 'dev')
    await t.typeText(Selector('#Password'), 'dev')
    await t.click(Selector('[type="submit"]'));
    await t.click(Selector('#ddlinstances'))
    await t.click(Selector('#ddlinstances').find('option').withText("PublicIP :54.183.86.149"))
    await t.wait(3000)
    await t.click(Selector('[value="Stop Instance"]'))
    await t.wait(3000)
    await t.click(Selector('[value="Check Status"]'))
    await t.wait(3000)
    await t.setNativeDialogHandler(() => true)
    await t.wait(5000)
    const history = await t.getNativeDialogHistory();

    console.log(history)
});

test('TurnOff_BurpMachine_107', async t => {

    await t.wait(5000)
    await t.maximizeWindow();
    await t.setNativeDialogHandler(() => true)
    await t.wait(3000)
    await t.typeText(Selector('#Username'), 'dev')
    await t.typeText(Selector('#Password'), 'dev')
    await t.click(Selector('[type="submit"]'));
    await t.click(Selector('#ddlinstances'))
    await t.click(Selector('#ddlinstances').find('option').withText("52.52.27.107"))
    await t.wait(3000)
    await t.click(Selector('[value="Stop Instance"]'))
    await t.wait(3000)
    await t.click(Selector('[value="Check Status"]'))
    await t.wait(3000)
    await t.setNativeDialogHandler(() => true)
    await t.wait(5000)
    const history = await t.getNativeDialogHistory();

    console.log(history)
});

test('TurnOff_BurpSuiteApplication_222.41', async t => {

    await t.wait(5000)
    await t.maximizeWindow();
    await t.setNativeDialogHandler(() => true)
    await t.wait(3000)
    await t.typeText(Selector('#Username'), 'dev')
    await t.typeText(Selector('#Password'), 'dev')
    await t.click(Selector('[type="submit"]'));
    await t.click(Selector('#ddlinstances'))
    await t.click(Selector('#ddlinstances').find('option').withText("44.239.222.41"))
    await t.wait(3000)
    await t.click(Selector('[value="Stop Instance"]'))
    await t.wait(3000)
    await t.click(Selector('[value="Check Status"]'))
    await t.wait(3000)
    await t.setNativeDialogHandler(() => true)
    await t.wait(5000)
    const history = await t.getNativeDialogHistory();

    console.log(history)
});


