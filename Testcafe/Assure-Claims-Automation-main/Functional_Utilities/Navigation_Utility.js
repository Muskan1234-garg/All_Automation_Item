import {Selector,t} from 'testcafe';
import Colors from 'colors';

class Navigation_Utility{
    
    async AssureClaims_ElementClick_Utility(Element,ElementDesc){
        await t.click(Element);
        console.log(ElementDesc.green+" is Clicked")
        //Logged comment to be added
    }//Utility To Click any Element, Pass the value of Element and Description of It In Parameters

 async AssureClaims_MenuOptionClick_Utility(MenuItems)
    {
        var String = MenuItems.split(":");
        var ele1 = String[0];
        console.log("ele1 is " + ele1);
        for (const st of String) 
        {
            console.log("st is " + st);      
            if (st === "Event" || st === "Bank Account" || st === "Address" || st === "Catastrophe" || st === "Client Program" || st === "Vehicle" || st === "Property" || st === "Physician" || st === "Medical Staff" || st === "Org. Hierarchy" || st === "Driver" || st === "Leave Plan Management" || st === "Disability Plan Management"|| st === "Employee" || st === "Entity" )
             {
                const Element = Selector('a[aria-label='+ele1+']').sibling('ul').child('li').find('a').withAttribute('role', 'menuitem').withExactText(st);
                await t.click(Element)
                console.log(st + " Menu Option Clicked")
            }
            else
            {
                const Element = Selector('[role="menuitem"]').withExactText(st);
                await t.click(Element)
                console.log(st + " Menu Option Clicked")
            }      
          
        }
    }//Utility To Click Menu-Options, Pass Menu-Options separated by ':'Exact

       async AssureClaims_WebCheckBoxSelect_Utility(Element, State, ElementDesc){
        if(State === 'Check'){
            if((await Element.checked === true)){
                console.log(ElementDesc.green+' Is Already Checked'.green)
            }
            else{
                await t.click(Element)
                console.log(ElementDesc.green+' Is Successfully Checked'.green)
            }
        }
        else if(State === 'UnCheck'){
            if((await Element.checked === false)){
                console.log(ElementDesc.green+' Is Already Unchecked'.green)
            }
            else{
                await t.click(Element)
                console.log(ElementDesc.green+' Is Successfully UnChecked'.green)
            }
        }
    }
    //************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-102191
    //Description      : Utility for checking/unchecking checkboxes over configuration manager screen.
    //Input Parameters : Element--> User need to provide locator for the element to be checked/unchecked
    //                   State --> The action that need s to be performed over that particular element i.e Check/UnCheck
    //                   ElementDesc --> Description of the elemnet
    //Revision	       : 0.0 Yashaswi Mendhekar 25/04/2023
    //************************************************************************************************************************************
    async AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Element, State, ElementDesc) {
        var Result = await Element.checked;
        if (State === 'Check') {
            if ((Result === true)) {

                console.log(ElementDesc.green + ' Is Already Checked'.green)
            }
            else {
                await t.click(Element)
                console.log(ElementDesc.green + ' Is Successfully Checked'.green)
            }
        }
        else if (State === 'UnCheck') {
            if ((Result === false)) {
                console.log(ElementDesc.green + ' Is Already Unchecked'.green)
            }
            else {
                await t.click(Element)
                console.log(ElementDesc.green + ' Is Successfully UnChecked'.green)
            }
        }
    }

    async AssureClaims_Generic_WebLinkClick_Utility(Text){
        await t.click(Selector('[role="button"]').withText(Text));
        console.log("Provided Text::".green +Text.green+" Is Successfully Clicked".green)
    }
    
    //************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-99470
    //Description      : Utility for searching the configuration screen by name and navigate the user to the filtered search result
    //Input Parameters : StrSettingPageName->User need to give configuration screen by name
    //Revision	       : 0.0 Muskan Garg 01/11/2023
    //************************************************************************************************************************************
    async AssureClaims_ConfigManagerSearchSettingPage_Utility(StrSettingPageName) {

        await t
            .click(Selector('#search-box-input'))
            .pressKey('ctrl+a delete')
        console.log("Searching for :" + StrSettingPageName)
        await t.typeText(Selector('#search-box-input'), StrSettingPageName).setTestSpeed(0.7);
        await t
            .click(Selector('[class="service-name"]'))
        console.log("Clicked on " + StrSettingPageName)
    }

    //************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-99470
    //Description      : Utility for searching the upper tab over configuration manager
    //Input Parameters : StrUpperTabName->User have to provide upper tab name
    //Revision	       : 0.0 Muskan Garg 01/11/2023
    //************************************************************************************************************************************
    async AssureClaims_ConfigManagerUpperTab(StrUpperTabName) {
        await t
            .click(Selector('[class="dxc-tab-label"]').find('span').withExactText(StrUpperTabName))
        console.log(StrUpperTabName.green + " Tab is Clicked")
    }

    //************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-99470
    //Description      : Utility for searching the left tab over configuration manager
    //Input Parameters : StrLeftTabName->User have to provide left sub tab name
    //Revision	       : 0.0 Muskan Garg 01/11/2023
    //************************************************************************************************************************************
    async AssureClaims_ConfigManagerLeftTab(StrLeftTabName) {
        if(StrLeftTabName!="NA")
        {
        await t
            .click(Selector('[class="list-unstyled mb-0"]').find('li').withExactText(StrLeftTabName))
        console.log(StrLeftTabName.green + "Sub Tab is Clicked")
        }
        if(StrLeftTabName=="NA")
        {
            console.log("Left Tab is not present");
        }
    }
    
    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109178
    //Description      : It is used to select value from dropdown over CM zone
    //Input Parameters : strOptionName -> option name
    //Revision         : 0.0 Muskan Garg 23-01-2024
    // ***********************************************************************************************************************************************************************************************************************************************************************************
   
    async AssureClaims_CofigManagerSelectValueFromDropdown(strOptionName) {
        await t
            .click(Selector('[role="listbox"]').find('dxc-select-option > span').withText(strOptionName))
        console.log(strOptionName.green + "  is selected")
    }
    //************************************* Naveen's code used in OSHA *****************************************************************************************************
    async AssureClaims_UserSearch_Utility(UserName){
        await t
            .click(Selector('#userslect'))
            .pressKey('ctrl+a delete')
        console.log("Searching for :" + UserName)
        await t.typeText(Selector('#userslect'), UserName).setTestSpeed(0.7);
        await t
            .click(Selector('[class="ng-scope"]'))
        console.log("Clicked on" + UserName)
    }
    
    async AssureClaims_VerifyAndClick_Utility(DataVerify,Element,ElementDesc){
        await t
            .click(Selector('[class="code-table-list ng-scope"]').withText(DataVerify))
            .click(Element);
        console.log(ElementDesc.green+" is Clicked")
        //Logged comment to be added
    }


    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573 starts here
    //Description      : Function for checking the sub menu otpions under My Work 
    //Input Parameters : StrSubMenuItem-> The sub menu item under the My Work menu
    //Revision         : 0.0 Nalayirem Subramanian 06/03/2024
    //****************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************  
    async AssureClaims_SubMenuOptionCheck_Utility(StrSubMenuItem) {
        const Element = Selector('[class="dropdown-submenu ng-scope"]').child('li').find('a[aria-label="' + StrSubMenuItem + '"]').withExactText(StrSubMenuItem);
        if (await Selector(Element).exists) {
        await t.expect(Element.exists).ok();
        console.log(StrSubMenuItem + ' Sub Menu Option Check the record was present'.green)
        }
        else{
            await t.expect(Element.exists).notOk(); 
            console.log(StrSubMenuItem + ' Sub Menu Option Check the record was not present'.green)

        }
    }// Utility To Check Sub-Menu-Options, pass submenu name
}; export default Navigation_Utility;
