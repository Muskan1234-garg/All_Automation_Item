import {Selector,t} from 'testcafe';
import Colors from 'colors';

class Navigation_Utility_workflow{
    
    async AssureClaims_ElementClick_Utility(Element,ElementDesc){
        await t.click(Element);
        console.log(ElementDesc.green+" is Clicked")
        //Logged comment to be added
    }//Utility To Click any Element, Pass the value of Element and Description of It In Parameters

    async AssureClaims_MenuOptionClick_Utility(MenuItems){
        var String = MenuItems.split(":");
        for(const st of String){
            const Element = Selector('[role="menuitem"]').withExactText(st);
            await t.click(Element)
            console.log(st+" Menu Option Clicked")
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

    async AssureClaims_WebCheckBoxSelectConfigMgnr_Utility(Element, State, ElementDesc) {
        var h = await Element.getAttribute('aria-checked');
        if (State === 'Check') {
            if ((h === 'true')) {
                console.log(ElementDesc.green + ' Is Already Checked'.green)
            }
            else {
                await t.click(Element)
                console.log(ElementDesc.green + ' Is Successfully Checked'.green)
            }
        }
        else if (State === 'UnCheck') {
            if ((h === 'false')) {
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

    /*async AssureClaims_ElementClick_Utility_test(Element,Text, ElementDesc) {
        const Element1 = Element.withAttribute('aria-label',(Text));
        await t.click(Element1);
        console.log(ElementDesc.green + " is Clicked")
        
    }//Utility To Click any Element, Pass the value of Element and Description of It In Parameters
*/
    async AssureClaims_ElementClick_Utility_test(Element, Text, ElementDesc, Screenname) {
        if (Screenname === 'Menu') {
          //  const Element1 = Element.find(Tag).withText((Text));
            const Element1 = Element.withText((Text));
            await t.click(Element1);
          
            console.log(ElementDesc.green + " is Clicked")
        }
        else if (Screenname === 'Configure Workflows') {

            const Element2 = Element.withAttribute(('aria-label'), (Text));
            await t.click(Element2);
            console.log(ElementDesc.green + " is Clicked")
        }
        else if (Screenname === 'Workflow Steps') {

            const Element2 = Element.withAttribute(('aria-label'), (Text));
            await t.click(Element2);
            console.log(ElementDesc.green + " is Clicked")
        }
        else if (Screenname === 'Start trigger condition') {
            console.log("trigger test1")
            const Element2 = Element.withAttribute(('aria-label'), (Text));
            await t.click(Element2);
            console.log(ElementDesc.green + " is Clicked")
        }
        else if (Screenname === 'Initiate Document Workflow') {
            const Element2 = Element.withAttribute(('aria-label'), (Text));
            await t.click(Element2);
            console.log(ElementDesc.green + " is Clicked")
        }
        else if (Screenname === 'Confirmation') {
            const Element2 = Element.withAttribute(('aria-label'), (Text));
            await t.click(Element2);
            console.log(ElementDesc.green + " is Clicked")
        }
        else if (Screenname === 'Active Workflows') {
            const Element2 = Element.withAttribute(('aria-label'), (Text));
            await t.click(Element2);
            console.log(ElementDesc.green + " is Clicked")
        }

    }//Utility To Click any Element, Pass the value of Element and Description of It In Parameters
}; export default Navigation_Utility_workflow;