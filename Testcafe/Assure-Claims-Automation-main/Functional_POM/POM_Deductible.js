import {Selector,t} from 'testcafe';
class POM_Deductible {
constructor(){


    this.AssureClaims_Utility_Tab_PolicyInterfaceSetting=Selector('#LINKTABSAdvanceClaim')
    //POM for Policy Interface Settings Button

    this.AssureClaims_Utility_Chk_PolicySystemInterface=Selector('#UsePolicyInterface')
    //POM for Check Box Use Policy Interface 

    this.AssureClaims_Utility_Tab_DeductibleOptions=Selector('#LINKTABSDeductibleOptions')
    //POM for Deductible Options button

    this.AssureClaims_Utility_Chk_CalculateDeductiblePayments=Selector('#calculateDeductiblePayments-input')
    //POM for Check Box Calculate Deductible on Payments

    this.AssureClaims_Utility_Chk_PreventPrintingZeroOrNegativeAmountChecks=Selector('#preventPrintZeroCheck-input')
    //POM for Check Box Prevent Printing Zero or Negative Amount Checks and Set to Printed

    this.AssureClaims_Utility_Txt_AutomaticDeductibleRecoveryIdentifierCharacter=Selector('#dedRecoveryIdentifierChar')
    //POM for text box Automatic Deductible Recovery Identifier Character

    this.AssureClaims_Utility_Txt_ManualDeductibleRecoveryIdentifierCharacter=Selector('#manualDedRecoveryIdentifierChar')
    //POM for Manual Deductible Recovery Identifier Character

    this.AssureClaims_Utility_Chk_ShowRecoveryReserveRowWhenDeductibleIsOn=Selector('#showRecoveryReserveRowWhenDeductibleIsOn-input')
    //POM for check box Show Recovery Reserve Row When Deductible Is On

    this.AssureClaims_Utility_Tab_DeductibleResrveMappingOptions=Selector('#LINKTABSDeductibleReserveOptions')
    //POM for deductible reserve mapping options tab

    this.AssureClaims_Utility_Select_ReserveType=Selector('#lstReserveType').find('option')
    //POM for select Reserve Type

    this.AssureClaims_Utility_Txt_DeductibleReserveType=Selector('#dedrecreservetypeMapping_codelookup')
    //POM for Deductible Reserve Type

    this.AssureClaims_Utility_Txt_DeductibleTransactionType=Selector('#dedrectransactiontypeMapping_codelookup')
    //POM for Deductible Transaction Type

    this.AssureClaims_Utility_Btn_AddDeductibleReserveMapping=Selector('#addReservebtn')
    //POM for add Deductible Reserve Mapping

    this.AssureClaims_Utility_Btn_DeductibleReserveTypeLookUp=Selector('#dedrecreservetypeMapping_codelookupbtn')
    //POM for Deductible Reserve Type look up buttton

    this.AssureClaims_Utility_Btn_DeductibleTransactionTypeLookUp=Selector('#dedrectransactiontypeMapping_codelookupbtn')
    //POM for Deductible Transaction Type look up buttton

    this.AssureClaims_Utility_Btn_SelectDeductibleReserveAndTransactionType=Selector('#dgCodes').find('a')
    //POM for select Deductible Reserve Type & Deductible Transaction Type

    this.AssureClaims_Utility_Row_CheckRowExistOrNot=Selector('gvDedReserveMappingGrid > tbody > tr > td').withText('I Indemnity')
    
    //Muskan's Code : RMA-92767

    this.AssureClaims_Claims_Btn_DeductibleSummary=Selector('#Deductible')
    //POM for Deductible Summary button

    this.AssureClaims_Claims_Lnk_PolicyName=Selector('[ng-enter="grid.appScope.columnClick(row.entity,col)"]')
    //POM for link of policy name 

    this.AssureClaims_Claims_Btn_DeductibleTypeLookup=Selector('#btn_deductibletype_openlookup')
    //POM for deductible type lookup button

    this.AssureClaims_Claims_Lnk_SelectDeductibleType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
    //POM of select deductible type

    this.AssureClaims_Claims_Txt_DeductibleDedAmount=Selector('#dedsiramount')
    //POM for Ded/Sir Amount text box

    this.AssureClaims_Claims_Btn_ExcludeReserveType=Selector('#radio_isParent')
    //POM for radio button Exclude Reserve Type

    this.AssureClaims_Claims_Btn_CloseButton=Selector('#myPanel').find('p')
    //POM for Close Button

    this.AssureClaims_Claims_Txt_NoRecordAvailable=Selector('[ng-show="gridVM.noRecords"]').find('p')
    //POM for text No Record Available

    this.AssureClaims_Claims_Row_SelectAndCheckRowExist=Selector('[ng-click="selectButtonClick(row, $event)"]')
    //POM for any row

    this.AssureClaims_Claims_Btn_Lookup=Selector('[class="dropdown"]')
    //POM for look up button

    this.AssureClaims_Claims_Lnk_PrintCheck=Selector('[role="menuitem"]')
    //POM for printcheck button

    this.AssureClaims_Claims_Btn_PrintButton=Selector('#apscprint')
    //POM for print button

    this.AssureClaims_Claims_Btn_OkToPrintCheck=Selector('#chcekBatchMsgInfoSaveIcon')
   //POM for ok button to print check

   this.AssureClaims_Claims_Btn_OkToPrintCheckRange=Selector('#I1')
   //POM for ok button to print check renge

   this.AssureClaims_Claims_Lnk_ControlNumber=Selector('[class="a_bold ng-binding"]')
   //POM for control number link

   this.AssureClaims_Claims_Btn_CloseBtnOnTransactionHistory=Selector('#P1')
   //POM for close button on transaction history button
    
    
   //Muskan's Code : RMA-92770
   this.AssureClaims_Claims_Btn_ManualDeductible=Selector('#AddManualDeductible')
   //POM for Manual Deductible button on reserve screen
     
   this.AssureClaims_Utility_Chk_SelectMappedRow=Selector('#cbDedReserveMappingGrid')
   //POM for select the mapping row

   this.AssureClaims_Utility_Btn_DeleteDeductibleMapping=Selector('#DelReserveMapping')
   //POM for delete button of deductible mapping
    
    this.AssureClaims_Utility_Chk_UseReserveTypeToFilterTransactionType=Selector('#UseResFilter')
   //POM for Use Reserve Type To Filter Transaction Type checkbox

}
}
export default  POM_Deductible;
