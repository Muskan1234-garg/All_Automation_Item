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
    async AssureClaims_SetValue_Utility_test(TextValue, ElementDesc) {
        await t
        const suplink = Selector('#lbl_usernamelogin').find('input')
        await t.click(suplink)
  //          .click(Element)
          //  .pressKey('ctrl+a delete')
            .typeText(Element, TextValue).setTestSpeed(0.7);
        console.log(TextValue + " is Entered in " + ElementDesc)
        //Logged comment to be added
    }
    async AssureClaims_ElementWebListSelect_Utility(Element, Value, ElementDesc){
        await t.click(Element);
        await t.click(Selector(Element).find('option').withText(Value));
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
    async AssureClaims_ElementWebListSelect_Utility_test(Element, Value, ElementDesc) {
        await t.click(Element);
        await t.click(Selector(Element).withText(Value));
        console.log("Value Selected In " + ElementDesc + " Is::" + Value);
        //Logged comment to be added
    }

    async AssureClaims_SetValue_Workflow_Utility(Element, TextValue, ElementDesc) {
        await t
            .click(Element)
            .pressKey('ctrl+a delete')
            .typeText(Element, TextValue).setTestSpeed(0.7)
            .pressKey('enter')
            .pressKey('tab');
        console.log(TextValue + " is Entered in " + ElementDesc)
        //Logged comment to be added
    }
    async AssureClaims_ElementMultitSelect_Workflow_Utility_Test2(Element, Value, ElementDesc, Checkboxelement, Element_value, searchelement, searchval, Case) {

        const Element2 = Selector(Checkboxelement).withAttribute(('aria-label'), (Value));
        const searchele = Selector(searchelement).withAttribute(('placeholder'), (searchval));
        await t.click((Element).withText(Element_value));
        if (Case === "Associate Documents") {
            await t.click(searchelement);
            await t.pressKey('ctrl+a delete')
            await t.typeText(searchelement, Value).setTestSpeed(0.7);
        }
        else {
            await t.click(searchele);
            await t.pressKey('ctrl+a delete')
            await t.typeText(searchele, Value).setTestSpeed(0.7);
        }


        await t.click(Element2);
        // await t.pressKey('tab');
        console.log("Value Selected In " + ElementDesc + " Is::" + Value)

        //Logged comment to be added
    }
}; export default Input_Utility;