import {Selector} from 'testcafe';

class POM_ClientProgram{
    constructor(){
        this.AssureClaims_CP_Txt_ClientProgramName = Selector('#clientprogname');
        //POM for CP Name on ClientProgram Creation Page

		this.AssureClaims_ClientProgram_Btn_Status = (Selector('#btn_clientprogstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Clientprogram Status Button On Client Program Screen

        this.AssureClaims_ClientProgram_Lnk_SelectStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Clientprogram Status Value On Client Program Screen

        this.AssureClaims_CP_Txt_EffectiveDate = Selector('#clientprogeffectivedate').nth(1);
        //POM for Effective Date On ClientProgram ID Tab

        this.AssureClaims_CP_Txt_ExpirationDate = Selector('#clientprogexpirydate').nth(1);
        //POM for Expiration Date on ClientProgram ID Tab
        
		this.AssureClaims_CP_Txt_ClientProgramNumber = Selector('#clientprognumber');
	    //POM for CP Number on ClientProgram ID Tab

        this.AssureClaims_ClientProgram_Btn_ProgramType = (Selector('#btn_clientprogtypeofprogramcode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Client Program Type Button On Client Program Screen

        this.AssureClaims_ClientProgram_Lnk_SelectProgramType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM of Client Program Type Value On Client Program Screen

        this.AssureClaims_ClientProgram_Btn_RevenueType = (Selector('#btn_clientprogrevenuetypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM of Revenue Type Button On Client Program Screen

        this.AssureClaims_ClientProgram_Lnk_SelectRevenueType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
         //POM of Revenue Type Value On Client Program Screen

          this.AssureClaims_ClientProgram_Btn_DeleteRecord=Selector('[id^="Delete Record"]')
         //POM for delete button
      
    }
};export default POM_ClientProgram;
