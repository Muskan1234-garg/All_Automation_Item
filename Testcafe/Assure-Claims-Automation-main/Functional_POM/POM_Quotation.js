import {Selector,t} from 'testcafe';
class POM_Quotation {
constructor(){

this.AssureClaims_Quotation_Btn_AddQuotation = Selector('[aria-label="Add Quotation"]');
//POM For Quotation Add Button on Claim Right Navigation Tree

this.AssureClaims_QuotationIframe = Selector('[id^="claimgc"]');
//POM for Quotation Iframe

this.AssureClaims_Quotation_Tab_QuotationInformation=(Selector('[role="button"]').find('span').withText('Quotation Information'))
//POM for Selecting Quotation Information Accordian On Quotation Screen

this.AssureClaims_PropertyQuote_Txt_QuotationNum = Selector('#propertyLossQuotationNumber');
//POM for Quotation Number TextBox on Quotation Screen

this.AssureClaims_PropertyQuote_Txt_QuotationDesc = Selector('#quotationDescription');
//POM for Quotation Description TextBox on Quotation Screen

this.AssureClaims_PropertyQuote_Btn_QuotationStatus = (Selector('#btn_propquotationStatus_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
//POM of Quotation Status Button On Quotation Screen

this.AssureClaims_PropertyQuote_Lnk_SelectQuotationStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
//POM of Quotation Status Link On Quotation Screen

this.AssureClaims_Quotation_Txt_ExpirationDate = (Selector('#expirationDate').nth(1));
//POM of Expiration Date Textbox On Quotation Screen

this.AssureClaims_PropertyQuote_Tab_PropertyLossInformation=(Selector('[role="button"]').find('span').withText('Property Loss Information'))
//POM for Selecting Property Loss Information Accordian On Quotation Screen

this.AssureClaims_PropertyQuote_Txt_PropertyID = Selector('#pi_propertyid');
//POM for PropertyID TextBox on Quotation Screen

this.AssureClaims_PropertyQuote_Txt_TypeOfProperty = Selector('#pltypecode');
//POM for Type Of Property TextBox on Quotation Screen

this.AssureClaims_Quotation_Tab_QuotationDetails=(Selector('[role="button"]').find('span').withText('Quotation Details'))
//POM for Selecting Quotation Details Accordian On Quotation Screen

this.AssureClaims_Quotation_Btn_AddQuotationDetails=Selector('#cruduiGridAddBtn')
//POM for Add Quotation Details Button on Quotation Screen

this.AssureClaims_QuoteDetail_Txt_PartNameOrNum=Selector('#partName')
//POM for Part Name/Number TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Txt_Description=Selector('#description')
//POM for Description TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Txt_Quantity=Selector('#quantity')
//POM for Quantity TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Txt_UnitPrice=(Selector('#unitPrice').nth(1))
//POM for Unit Price TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Txt_DiscountInPercent=(Selector('#discountInPercent').nth(0))
//POM for Discount In Percent TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Txt_DiscountInAmount=(Selector('#discountInAmount').nth(1))
//POM for Discount In Amount TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Txt_TaxInPercent=(Selector('#taxInPercent').nth(0))
//POM for Tax In Percent TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Txt_TotalAmount=(Selector('#totalAmount').nth(1))
//POM for Total Amount TextBox on Quotation Detail screen

this.AssureClaims_QuoteDetail_Btn_Save=(Selector('[id="Save And Exit"]').find('i').withText('save'))
//POM for Save Button on Quotation Details

this.AssureClaims_Quotation_Tab_VendorInformation=(Selector('[role="button"]').find('span').withText('Vendor Information'))
//POM for Selecting Vendor Information Accordian On Quotation Screen

this.AssureClaims_Quotation_Txt_VendLastName = Selector('#lookup_vendorlastname');
//POM for Vendor Last Name TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendFirstName = Selector('#vendorfirstname');
//POM for Vendor First Name TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendMiddleName = Selector('#vendormiddlename');
//POM for Vendor Middle Name TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendTitle = Selector('#vendortitle');
//POM for Vendor Title TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendAddr1 = Selector('#adjaddr1');
//POM for Vendor Address1 TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendAddr2 = Selector('#adjaddr2');
//POM for Vendor Address2 TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendAddr3 = Selector('#adjaddr3');
//POM for Vendor Address3 Textbox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendAddr4 = Selector('#adjaddr4');
//POM for Vendor Address4 TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendCity = Selector('#vendorcity');
//POM for Vendor City TextBox on Quotation Screen

this.AssureClaims_Quotation_Txt_VendZip = Selector('#vendorzipcode');
//POM for Vendor Zipcode TextBox on Quotation Screen

this.AssureClaims_Quotation_Btn_VendCountry = Selector('#btn_vendorcountrycode_openlookup').find('.glyphicon.glyphicon-option-horizontal');
//POM for Vendor Country Lookup Button on Quotation Screen

this.AssureClaims_Quotation_Lnk_VendSelectCountry = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
//POM for Vendor Country Value on Quotation Screen

//this.AssureClaims_Adjuster_Btn_State = Selector('#btn_adjstateid_openlookup').find('.glyphicon glyphicon-option-horizontal')
this.AssureClaims_Quotation_Btn_VendState = Selector('#btn_vendorstateid_openlookup');
//POM for Vendor State Lookup Button on Quotation Screen

this.AssureClaims_Quotation_Lnk_VendSelectState = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
//POM for Vendor State Value on Quotation Screen

this.AssureClaims_Quotation_Btn_VendEmailType = Selector('#btn_vendoremailtypecode_openlookup');
//POM for Vendor Email Type Lookup Button on Quotation Screen

this.AssureClaims_Quotation_Lnk_VendSelectEmailType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
//POM for Vendor Email Type Value on Quotation Screen

this.AssureClaims_Quotation_Txt_VendEmail = Selector('#vendoremailaddress');
//POM for Vendor Email TextBox on Quotation Screen

this.AssureClaims_Quotation_Tab_Supplementals=(Selector('[role="button"]').find('span').withText('Supplementals'))
//POM for Selecting Supplementals Accordian On Adjuster Screen

}
};
export default POM_Quotation;