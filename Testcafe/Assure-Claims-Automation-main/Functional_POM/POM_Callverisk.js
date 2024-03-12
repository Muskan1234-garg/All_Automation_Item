import {Selector,t} from 'testcafe';

class POM_Callverisk{
    constructor(){

        
        
       this.AssureClaims_Callverisk_morebtn = (Selector('#frmData').find('i').withText('list'));
       //POM for clicking three dot button from the tool bar
	   
        this.AssureClaims_Callverisk_ClickCallveriskBtn = (Selector('#frmData').find('a').withText('Call Verisk'));
        //POM for clicking Call Verisk option from the tool bar
		
		 this.AssureClaims_Callverisk_Hailreport=Selector('#chkHailReports')
        //POM for Check Box of Hail report checkbox 
		
		this.AssureClaims_Callverisk_HailHistoryreport=Selector('#chkHailHistoryReports')
        //POM for Check Box of Hail History report checkbox 
		
		this.AssureClaims_Callverisk_windReports=Selector('#windReports')
        //POM for Check Box of Wind report checkbox 
		
		this.AssureClaims_Callverisk_windHistoryReports=Selector('#windHistoryReports')
        //POM for Check Box of Wind History report checkbox 
		
		this.AssureClaims_Callverisk_lightningReports=Selector('#lightningReports')
        //POM for Check Box of Lightening report checkbox 
		
		this.AssureClaims_Callverisk_lightningHistoryReports=Selector('#lightningHistoryReports')
        //POM for Check Box of Lightening History checkbox 
		
		
        this.AssureClaims_download_veriskreport= Selector('[class="material-icons mdi mdi-arrow-down-box"]');
        //pom to click on verisk report  download button 
		
		
		this.AssureClaims_DefaultView_Img_Reload= Selector('[class="material-icons material-breadcrumb"]').find('[ng-click="main.reLoadScreen($root.selectedId)"]');
		//POM For Reload Button On Top Of The Application Screen
		
		
		this.AssureClaims_Veriskreports_btnCancelmemo = Selector('[class="lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn"]');
		//pom to click on cancel button
		

	
    
	
	

    }
};
export default POM_Callverisk;
