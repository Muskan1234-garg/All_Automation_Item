import {Selector,t} from 'testcafe';

class POM_ClaimScan{
    constructor(){

        
        
       this.AssureClaims_ClaimScan_morebtn = (Selector('#frmData').find('i').withText('list'));
       //POM for clicking three dot button from the tool bar
        this.AssureClaims_ClaimScan_ClickClaimScanBtn = (Selector('#frmData').find('a').withText('Claim Scan'));
        //POM for clicking Claim Scan option from the tool bar
    

    }
};
export default POM_ClaimScan;


        
