import {Selector} from 'testcafe';

class POM_Vehicle{
    constructor(){
        this.AssureClaims_Vehicle_Txt_Vehicle_ID = Selector('#vin');
        //POM for Vehicle_ID Textbox On Vehicle Screen

        this.AssureClaims_Vehicle_Txt_Vehicle_Make = Selector('#vehiclemake');
        //POM for Vehicle_Make Textbox On Vehicle Screen

        this.AssureClaims_Vehicle_Txt_Vehicle_Model = Selector('#vehiclemodel');
        //POM for Vehicle_Model Textbox On Vehicle Screen

        this.AssureClaims_Vehicle_Tab_Supplementals = Selector('[role="button"]').find('span').withText('Supplementals');
        //POM for Supplementals Tab

        this.AssureClaims_Vehicle_Tab_Vehicle_Info = Selector('[role="button"]').find('span').withText('Vehicle Info');
        //POM for Supplementals Tab


        this.AssureClaims_Vehicle_Tab_Vehicle_Detail = Selector('[role="button"]').find('span').withText('Vehicle Detail');
        //POM for Vehicle Detail Tab

        this.AssureClaims_Vehicle_Txt_Weight = Selector('[name="grossWeight"]');
        //POM for Vehicle_weight Textbox On Vehicle Screen

        this.AssureClaims_Vehicle_Txt_License_Number = Selector('#licensenumber');
        //POM for Vehicle_Model Textbox On Vehicle Screen

    }
}; export default POM_Vehicle;