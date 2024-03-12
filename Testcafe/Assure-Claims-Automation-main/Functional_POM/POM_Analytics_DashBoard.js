import { Selector, t } from 'testcafe';

class POM_Analytics_DashBoard {
    constructor() {



        this.AssureClaims_ConfigSetting_Clicking_On_Screen = Selector('#configsettings_screenid')
        //Pom for Opening the screen Config Settings
        this.AssureClaims_Grid_filter_Txt_SectionName = Selector('[type = "text"]').nth(1)
        //pom For clicking on Grid Filter Section name name
        this.AssureClaims_Grid_filter_Txt_KeyName = Selector('[type = "text"]').nth(2)
        //pom For clicking on Grid Filter key name
        this.AssureClaims_ConfigSetting_Btn_Edit = Selector('[class="glyphicon glyphicon-pencil"]').nth(10)
        //Pom For Clicking on Grid Filter Button
        this.AssureClaims_ConfigSettings_Txt_KeyDeatils = Selector('#keyData')
        //Pom for inputing the value in key details
        this.AssureClaims_ConfigSettings_KeyDetail_Btn_Save = Selector('#btn_save')
        //Pom clicking on save button
        this.AssureClaims_ConfigSettings_KeyDetail_Btn_Cancel = Selector('#btn_cancel')
        //Pom clicking on Cancel button
        
        



        


    

    }
};
export default POM_Analytics_DashBoard
