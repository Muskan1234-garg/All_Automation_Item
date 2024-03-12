import {Selector,t} from 'testcafe';
import POM_Home from '../Functional_POM/POM_Home';
import Colors from 'colors';

const Home_POM = new POM_Home();

class Verification_Utility{

    async AssureClaims_ElementExist_Utility(Element, ElementDesc){
        console.log("Verification Of Existence For ".green+ElementDesc)
        await t.expect(Element.exists).ok();
        console.log("Is Successful".green)
    }

    async AssureClaims_VerifyUXMessage_Utility(TestMsg, IsCloseRequired, PageDesc){
        await t.expect(Home_POM.AssureClaims_Generic_Msg_ToastMessage.withText(TestMsg).visible).ok();
        console.log(TestMsg+" Is Found On "+PageDesc)
        if(IsCloseRequired){
            await t.click(Home_POM.AssureClaims_GenericBtn_ErrorToastMsgClose);
            console.log("Close Button On Toast Message Is Clicked");
        }
    }

    async AssureClaims_VerifyElementValue_Utility(Element, TextValue, ElementDesc){
        await t.expect(Element.value).eql(TextValue);//getAttribute("role");
        console.log(TextValue+" Is Present In "+ElementDesc);                
    }//Utility To Verify Text Value From Any Element

    async AssureClaims_AttributeFetch_Utility(Element, AttributeToFetch){
        var ReturnValue  = Element.value;
        return ReturnValue;           
    }//Utility To Fetch Attribite Value of  Any Element
 
    async AssureClaims_TextDisplayVerify_Utility(text){
        await t.expect((text).exists).ok()           
    }//Utility to Verify If certain Text exists 

    async AssureClaims_CheckedUncheckedStateVerification_Utility(Element, State, ElementDesc){
        if(State === 'Checked'){
        console.log(State.green+" State Verification For ".green+ElementDesc.green+" Started And".green)
        await t.expect(Element.checked).eql(true);
        console.log('Is Successful'.green)
        }
        else if(State === 'Unchecked'){
        console.log(State.green+" State Verification For ".green+ElementDesc.green+" Started And".green)
        await t.expect(Element.checked).eql(false);
        console.log('Is Successful'.green)
        }
        else{
            console.log('Selected Case Is Not Valid'.red)
        }
    }

    async AssureClaims_EnbDisbStateVerify_Utility(Element, State, ElementDesc){
        if(State === 'Enable'){
        console.log(State.green+" State Verification For ".green+ElementDesc.green+" Started And".green)
        var h = await Element.getAttribute('aria-disabled');
        var h1 = await Element.getAttribute('ng-disabled');
        var h2 = await Element.getAttribute('ng-readonly');
        var h3 = await Element.getAttribute('aria-readonly');
        await t.expect(h==='false'||h1==='false'||h2==='false'||h3==='false').ok()
        console.log('Is Successful'.green)   
        }        
        else if(State === 'Disable'){
        console.log(State.green+" State Verification For ".green+ElementDesc.green+" Started And".green)
        var h = await Element.getAttribute('aria-disabled');
        var h1 = await Element.getAttribute('ng-disabled');
        var h2 = await Element.getAttribute('ng-readonly');
        var h3 = await Element.getAttribute('aria-readonly');
        await t.expect(h==='true'||h1==='true'||h2==='true'||h3==='true').ok()
        console.log('Is Successful'.green)
        }
        else{
            console.log('Selected Case Is Not Valid'.red)
        }
    }

    async AssureClaims_VerifyUXGrid_Utility(SearchedText, UXGridDesc, ExpectedHeaders, ExpectedValues){
        var FoundRow;
        var ActualText;
        var FoundCol;
        var SearchedTextActual;
        try{
            if(ExpectedHeaders.length===ExpectedValues.length)
            {   SearchedTextActual=null;//initialize 
			    FoundRow = -1;
                const UX_Row = await Selector('[class="ui-grid-row ng-scope"]');
                for(let i=0; i<await UX_Row.count;i++)
                {
                    const Element = await UX_Row.nth(i).find('[class="ng-isolate-scope"]');
                    const UX_Column = await Element.find('[class^="ui-grid-cell ng-scope ui-grid-coluiGrid"]');
                    for(let j=0; j<await UX_Column.count; j++)
                    {
                        SearchedTextActual = await UX_Column.nth(j).innerText;
                        if(SearchedTextActual === SearchedText)
                        {
                            FoundRow = i;
                        }
                        if(FoundRow === -1)
                        continue;
                        else break;
                    }
                    if(FoundRow === -1)
                    continue;
                    else break;
                }
                var valcount = ExpectedHeaders.length;
                for(let k=0; k<valcount; k++)
                {
                    FoundCol = -1;
                    ActualText = null;
                    SearchedTextActual = null;
                    const UX_Headercolumn = await Selector('[class="ui-grid-header-cell-label ng-binding"]');
                    for(var j=0; j<await UX_Headercolumn.count; j++)
                    {
                        SearchedTextActual = await UX_Headercolumn.nth(j).innerText;
                        if(SearchedTextActual === ExpectedHeaders[k])
                        {
                            FoundCol = j;
                            break;
                        }
                    }
                    if(FoundCol === -1)
                    {
                        console.log("Expected Column Header ".red+ExpectedHeaders[k].brightYellow+" Is Not Found In ".red+ UXGridDesc.brightYellow+ " Hence Verification Cannot Be Done".red);
                        await t.expect(SearchedTextActual).eql(ExpectedHeaders[k]);
                    }
                    if(FoundRow !== -1)
                    {   
                        const Element = await UX_Row.nth(FoundRow).find('[class="ng-isolate-scope"]');
                        const UX_Column = await Element.find('[class^="ui-grid-cell ng-scope ui-grid-coluiGrid"]');
                        ActualText = await UX_Column.nth(FoundCol).innerText;
                        if(ActualText === ExpectedValues[k])
                        {
                            console.log("Expected Value ".green +ExpectedValues[k].brightYellow+" Is Matched with Actual Value ".green+ActualText.brightBlue+ " In Column: ".green+ExpectedHeaders[k].yellow+" Corresponding To Identifier Searched Text: ".green+SearchedText.yellow+" In ".green+UXGridDesc.yellow+" And Hence Verification Is Successful".green);
                        }
                        else{
                            console.log("Expected Value ".red +ExpectedValues[k].brightYellow+" Does Not Matched with Actual Value ".red+ActualText.brightBlue+ " In Column: ".red+ExpectedHeaders[k].yellow+" Corresponding To Identifier Searched Text: ".red+SearchedText.yellow+" In ".red+UXGridDesc.yellow+" And Hence Verification Is Not Successful".green);
                        }
                        await t.expect(ActualText).eql(ExpectedValues[k]);
                    }
                    else{
                        console.log("Searched Text ".red+ SearchedText.brightYellow+ " Is Not Found In ".red+UXGridDesc.yellow+" Hence Verification Fails".red);
                        await t.expect(FoundRow).notEql(-1);
                    }
                }
            }
            else{
                console.log("Expected Values To Be Verified: ".red+ExpectedValues.length.brightYellow+" Is Not Equal To Expected Column Headers To Be Verified: ".red+ExpectedHeaders.length.brightYellow+", Hence Verification Cannot Be Done".red);
                await t.expect(ExpectedHeaders.count).eql(ExpectedValues.count);
            }
        }
        catch(e){
            console.log("Verification Cannot Be Done Due To Error: ".red+e.toString().red);
        }
    }

    async AssureClaims_ElementNotExist_Utility(Element, ElementDesc){
        console.log("Negative Verification Of Existence For ".green+ElementDesc.yellow);
        await t.expect(Element.exists).notOk();
        console.log("Is Successful".green);
    }

    async AssureClaims_PartialTextVerification(ExpectedText, ActualText, ObjDesc){
        await t.expect(ActualText).contains(ExpectedText);
        console.log("Expected Value:: ".green +ExpectedText.brightYellow+" Is Contained In Actual Text:: ".green+ActualText.brightBlue+" In ".green+ObjDesc.yellow+", Hence Verification Is Done".green);
    }

    async AssureClaims_TextCompare(ExpectedText, ActualText, ObjDesc){
        await t.expect(ActualText).eql(ExpectedText);
        console.log("Expected Value:: ".green+ExpectedText.brightYellow+" And Actual Value:: ".green +ActualText.brightBlue+" Are Same And Hence ".green+ObjDesc.yellow+" Verification Is Successful".green);
    }

   	
    async AssureClaims_VerifyUXErrorMessage_Utility(TestMsg, IsCloseRequired, PageDesc){
        await t.expect(Home_POM.AssureClaims_Generic_ErrorMesg_ToastMessage.withText(TestMsg).visible).ok();
        console.log(TestMsg+" Is Found On "+PageDesc)
        if(IsCloseRequired){
            await t.click(Home_POM.AssureClaims_GenericBtn_ErrorToastMsgClose);
            console.log("Close Button On Toast Message Is Clicked");
        }
    }
       //Utility for Validation Error Message

    
async AssureClaims_TableVerifyText_Utility(x, PaymentNo, FromDate, ToDate, PrintDate, GrossPayment, NetPayment, DaysPaid) {
    const table = Selector('[class="table table-hover filterPadd"]');
    const rowCount = await table.find('tbody > tr').count;
    //const columnCount = await table.find('tbody > tr').nth(0).find('td').count;

    // Create one dimensional array
    var tbl = new Array(3);

    // Loop to create 2D array using 1D array
    for (var k = 0; k < tbl.length; k++) {
        tbl[k] = new Array(10);
    }
    for (let i = 0; i < rowCount; i++) {
        for (let j = 0; j < 8; j++) {
            tbl[i][j] = await table.find('tbody > tr').nth(i).find('td').nth(j).textContent;
        }
    }
    for (var y = 0; y < 8; y++) {
        //edited 
        if(y != 5){
        if (tbl[x][y] == PaymentNo ) {
            console.log("Expected Value ".green + PaymentNo.brightYellow+" Is Matched with Actual Value ".green+ tbl[x][y].brightBlue+ " Hence Verification Is Successful".green)
        }  
        if (tbl[x][y] == FromDate) {
            console.log("Expected Value ".green + FromDate.brightYellow+" Is Matched with Actual Value ".green+ tbl[x][y].brightBlue+ " Hence Verification Is Successful".green)
        }
        if (tbl[x][y] == ToDate) {
            console.log("Expected Value ".green + ToDate.brightYellow+" Is Matched with Actual Value ".green+ tbl[x][y].brightBlue+ " Hence Verification Is Successful".green)
        }
        if (tbl[x][y] == PrintDate) {
            console.log("Expected Value ".green + PrintDate.brightYellow+" Is Matched with Actual Value ".green+ tbl[x][y].brightBlue+ " Hence Verification Is Successful".green)
        }
        if (tbl[x][y] == GrossPayment && y == 4) {
            console.log("Expected Value ".green + GrossPayment.brightYellow+" Is Matched with Actual Value ".green+ tbl[x][y].brightBlue+ " Hence Verification Is Successful".green)
        }
        if (tbl[x][y] == NetPayment && y == 6) {
            console.log("Expected Value ".green + NetPayment.brightYellow+" Is Matched with Actual Value ".green+ tbl[x][y].brightBlue+ " Hence Verification Is Successful".green)
        }
        if (tbl[x][y] == DaysPaid) {
            console.log("Expected Value ".green + DaysPaid+" Is Matched with Actual Value ".green+ tbl[x][y].brightBlue+ " Hence Verification Is Successful".green)
        }
    }
    }
  
}
    async AssureClaims_VerifyUXMessage_Workflow_Utility(TestMsg, IsCloseRequired, PageDesc) {
        await t.expect(Home_POM.AssureClaims_Generic_Msg_ToastMessage27.withText(TestMsg).visible).ok();
        console.log(TestMsg + " Is Found On " + PageDesc)
        if (IsCloseRequired) {
            await t.click(Home_POM.AssureClaims_GenericBtn_ErrorToastMsgClose);
            console.log("Close Button On Toast Message Is Clicked");
        }
    }
    async AssureClaims_AttributeFetch_Workflow_Utility(Element) {
        var ReturnValue = await Element.textContent
        return ReturnValue;
    }//Utility To Fetch Attribite Value of  Any Element
    async AssureClaims_VerifyUXGrid_Workflow_Utility(SearchedText, UXGridDesc, ExpectedHeaders, ExpectedValues) {
        var FoundRow;
        var ActualText;
        var FoundCol;
        var SearchedTextActual;
        try {
            if (ExpectedHeaders.length === ExpectedValues.length) {
                SearchedTextActual = null;//initialize 
                FoundRow = -1;
                const UX_Row = await Selector('div[ref="eCenterColsClipper"]');
                //console.log("UX_Row" + UX_Row)
                for (let i = 0; i < await UX_Row.count; i++) {
                    const Element = await UX_Row.nth(i).find('div[ref="eCenterContainer"]');
                    const UX_Column = await Element.find('div[role="gridcell"]');
                    for (let j = 0; j < await UX_Column.count; j++) {
                        SearchedTextActual = await UX_Column.nth(j).innerText;
                        if (SearchedTextActual === SearchedText) {
                            FoundRow = i;
                        }
                        if (FoundRow === -1)
                            continue;
                        else break;
                    }
                    if (FoundRow === -1)
                        continue;
                    else break;
                }
                var valcount = ExpectedHeaders.length;
                for (let k = 0; k < valcount; k++) {
                    FoundCol = -1;
                    ActualText = null;
                    SearchedTextActual = null;
                    const UX_Headercolumn = await Selector('div[class="ag-header-cell-label"]');
                    //     console.log("UX_Headercolumn" + UX_Headercolumn.textContent)
                    for (var j = 0; j < await UX_Headercolumn.count; j++) {
                        SearchedTextActual = await UX_Headercolumn.nth(j).innerText;
                        //       console.log("UX_Headercolumn"+UX_Headercolumn)
                        //     console.log("SearchedTextActual is " + SearchedTextActual + " and ExpectedHeaders is " + ExpectedHeaders)
                        if (SearchedTextActual === ExpectedHeaders[k]) {
                            FoundCol = j;
                            break;
                        }
                    }
                    if (FoundCol === -1) {
                        console.log("Expected Column Header ".red + ExpectedHeaders[k].brightYellow + " Is Not Found In ".red + UXGridDesc.brightYellow + " Hence Verification Cannot Be Done".red);
                        await t.expect(SearchedTextActual).eql(ExpectedHeaders[k]);
                    }
                    if (FoundRow !== -1) {
                        const Element = await UX_Row.nth(FoundRow).find('div[ref="eCenterContainer"]');
                        const UX_Column = await Element.find('div[role="gridcell"]');
                        ActualText = await UX_Column.nth(FoundCol).innerText;
                        if (ActualText === ExpectedValues[k]) {
                            console.log("Expected Value ".green + ExpectedValues[k].brightYellow + " Is Matched with Actual Value ".green + ActualText.brightBlue + " In Column: ".green + ExpectedHeaders[k].yellow + " Corresponding To Identifier Searched Text: ".green + SearchedText.yellow + " In ".green + UXGridDesc.yellow + " And Hence Verification Is Successful".green);
                        }
                        else {
                            console.log("Expected Value ".red + ExpectedValues[k].brightYellow + " Does Not Matched with Actual Value ".red + ActualText.brightBlue + " In Column: ".red + ExpectedHeaders[k].yellow + " Corresponding To Identifier Searched Text: ".red + SearchedText.yellow + " In ".red + UXGridDesc.yellow + " And Hence Verification Is Not Successful".green);
                        }
                        await t.expect(ActualText).eql(ExpectedValues[k]);
                    }
                    else {
                        console.log("Searched Text ".red + SearchedText.brightYellow + " Is Not Found In ".red + UXGridDesc.yellow + " Hence Verification Fails".red);
                        await t.expect(FoundRow).notEql(-1);
                    }
                }
            }
            else {
                console.log("Expected Values To Be Verified: ".red + ExpectedValues.length.brightYellow + " Is Not Equal To Expected Column Headers To Be Verified: ".red + ExpectedHeaders.length.brightYellow + ", Hence Verification Cannot Be Done".red);
                await t.expect(ExpectedHeaders.count).eql(ExpectedValues.count);
            }
        }
        catch (e) {
            console.log("Verification Cannot Be Done Due To Error: ".red + e.toString().red);
        }
    }

    async AssureClaims_TableVerifyText_Workflow_Utility(Expectedheaders, ExpectedValues) {

        const table = Selector('[class="table table-hover table-bordered"]');
        const headercount = await table.find('thead > tr').count;
        var rowCount = await table.find('tbody > tr').count;

        // Create one dimensional array
        var tbl = new Array(3);
        rowCount = rowCount + 1;
        // Loop to create 2D array using 1D array
        for (var k = 0; k < tbl.length; k++) {
            tbl[k] = new Array(rowCount, 5);
        }

        for (let i = 0; i < rowCount; i++) {
            for (let j = 0; j < 5; j++) {
                if (i === 0) {
                    tbl[i][j] = await table.find('thead > tr').nth(i).child(j).textContent;

                }
                else {
                    tbl[i][j] = await table.find('tbody > tr').nth(i - 1).child(j).textContent;
                }
            }
        }
     

        for (let z = 0; z < Expectedheaders.length; z++) {
            for (let x = 0; x < rowCount; x++) {
                for (let y = 0; y < 5; y++) {
                    if (tbl[x][y] == Expectedheaders[z]) {
                        console.log("Expected Value ".green + Expectedheaders[z].brightYellow + " Is Matched with Actual Value ".green + tbl[x][y].brightBlue + " Hence Verification Is Successful".green)
                    }
                }
            }
        }


        for (let z = 0; z < ExpectedValues.length; z++) {
            for (let x = 0; x < rowCount; x++) {
                for (let y = 0; y < 5; y++) {
                    if (tbl[x][y] == ExpectedValues[z]) {
                        console.log("Expected Value ".green + ExpectedValues[z].brightYellow + " Is Matched with Actual Value ".green + tbl[x][y].brightBlue + " Hence Verification Is Successful".green)
                    }
                }
            }
        }
    }
}; export default Verification_Utility;