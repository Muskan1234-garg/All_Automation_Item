import {Selector,t} from 'testcafe';

class Input_Utility{

    async AssureClaims_SetValue_Utility(Element, TextValue, ElementDesc){
        await t
        .click(Element)
        .pressKey('ctrl+a delete')
        .typeText(Element,TextValue).setTestSpeed(0.7);
        console.log(TextValue+" is Entered in "+ElementDesc)
        //Logged comment to be added
    }
    
   async AssureClaims_SetValueForUserAndPassword_Utility(Element, TextValue, ElementDesc){
        await t
        .click(Element)
        .pressKey('ctrl+a delete')
        .typeText(Element,TextValue).setTestSpeed(0.7);
        console.log("****** is Entered in "+ElementDesc)
        //Logged comment to be added
    }

    async AssureClaims_ElementWebListSelect_Utility(Element, Value, ElementDesc){
        await t.click(Element);
        await t.click(Selector(Element).find('option').withText(Value));
        console.log("Value Selected In "+ElementDesc+" Is::"+Value);
        //Logged comment to be added
    }
    
        async AssureClaims_ElementWebListSelectByIndex_Utility(Element, Value, ElementDesc){
        await t.click(Element);
        await t.click(Selector(Element).find('option').nth(Value));
        console.log("Value Selected In "+ElementDesc+" Is::"+Value);
        //Logged comment to be added
    }


    async AssureClaims_ElementWebListSelectInteger_Utility(Element, Value, ElementDesc){
        await t.click(Element);
        await t.click(Selector(Element).find('option').nth(Value));
        const Val = await Selector(Element).find('option').nth(Value).textContent;
        console.log("Value Selected In "+ElementDesc+" Is::"+Val);
        //Logged comment to be added
    }

    async AssureClaims_SetValueAndTabOut_Utility(Element, TextValue, ElementDesc){
        await t
        .click(Element)
        .pressKey('ctrl+a delete')
        .typeText(Element,TextValue).setTestSpeed(0.6)
        .pressKey('tab');
        console.log(TextValue+" is Entered in "+ElementDesc)
        //Logged comment to be added
    }
    
    //***********************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-104755
    //Description      : It is used to select value from drop down
    //Input Parameters : Element : where user want to click for dropdown , TextValue  : which value user want to select from dropdown, ElementDesc : Description
    //Revision         : 0.0 Muskan Garg 4-08-2023
    // **********************************************************************************************************************************************************
    
    async AssureClaims_ConfigManagerElementWebList_Utility(Element, TextValue, ElementDesc){
        await t.click(Element)
        await t.click(Selector('[role="option"]').find('span').withExactText(TextValue));
        console.log("Value Selected In "+ElementDesc+" Is::"+TextValue);
    }


     //***********************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109573
    //Description      : It is used to check whether the values are exist or not
    //Input Parameters : Element : where user want to click for dropdown , TextValue  : which value user want to select from dropdown, ElementDesc : Description
    //Revision         : 0.0 Nalayirem Subramanian 07-03-2024
    // ********************************************************************************************************************************************************** 

    async AssureClaims_SetValue_Append_For_Existing_Utility(StrElement, StrTextValue, StrElementDesc){
        await t
        .click(StrElement)
        .typeText(StrElement,StrTextValue).setTestSpeed(0.4);
        console.log(StrTextValue+" is Entered in "+StrElementDesc)
        //Logged comment to be added
    }
    
}; export default Input_Utility;
