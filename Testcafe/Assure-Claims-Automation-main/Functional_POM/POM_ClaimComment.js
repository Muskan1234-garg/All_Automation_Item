import {Selector,t} from 'testcafe';

class POM_ClaimComment{
    constructor(){
        
        this.AssureClaims_Comment_ClickComment = (Selector('#Comments'));
        //POM for clicking comment option from the tool bar
    
        this.AssureClaims_Comment_Txt_TextEditor = (Selector('[class="fr-element fr-view"]').find ('div'))
        //POM for test editor

        this.AssureClaims_Comment_Btn_Save=(Selector('#btnSave').find('i').withText('save'));
        //POM for button save

        this.AssureClaims_Comment_Btn_Cancel=(Selector('#btnclose').find('i').withText('cancel'));
         //POM for cancle button
  
    }
}
export default POM_ClaimComment;


        
