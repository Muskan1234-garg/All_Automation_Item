import { Selector, t } from 'testcafe';

class POM_CommentSummary {
    constructor() {

      

        this.AssureClaims_CommentSummary_Lst_CommentSummary= (Selector('[class="dropdown"]'))
        //POM for clicking comment option from the tool bar

        this.AssureClaims_CommentSummary_ClaimCommentSummary = (Selector('[role="menuitem"]').withText('Claim Comment Summary'))
        //POM For Selecting Claim Comment Summary Option From The List
             
        this.AssureClaims_CommentSummary_Txt_TextEditor = (Selector('[role="row"]').find('div'))
        //POM for test editor

        this.AssureClaims_CommentSummary_Btn_Cancel = (Selector('#btnclose').find('i').withText('cancel'));
        //POM for cancle button

        this.AssureClaims_CommentSummary_ClaimActivityLog = Selector('[role="menuitem"]')
        //POM For Selecting Claim Comment Summary Option From The List


    }
}
export default POM_CommentSummary ;