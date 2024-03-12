import { database } from 'faker';
import {Selector,t} from 'testcafe';


class POM_AutoAssignAdjuster{
constructor(){

    
 
    this.AssureClaimsApp_Lnk_AutoAssignAdjuster=Selector('[class="rma-service-list"]').find('span');
    //POM for click on Auto Assign Adjuster

    this.AssureClaimsApp_Lnk_AutoAssignAdjuster_SelectFirstRecord=Selector('#AdjusterScreensGrid_gvData_ctl00_ctl04_SelectSelectCheckBox')
    //POM for Select First Record on Auto Assign Adjuster

    this.AssureClaimsApp_Lnk_AutoAssignAdjuster_SelectDelete=Selector('#AdjusterScreensGrid_Delete');
    //POM for Delect Record on Auto Assign Adjuster

    this.AssureClaimsApp_Lnk_AutoAssignAdjuster_SelectSecondRecord=Selector('#AdjusterScreensGrid_gvData_ctl00_ctl06_SelectSelectCheckBox');
    //POM for Select Second Record on Auto Assign Adjuster

    this.AssureClaimsApp_Lnk_AutoAssignAdjuster_SelectThirdRecord=Selector('#AdjusterScreensGrid_gvData_ctl00_ctl08_SelectSelectCheckBox');
    //POM for Select third Record on Auto Assign Adjuster

    this.AssureClaimsApp_Lnk_AutoAssignAdjuster_SelectAdjuster=Selector('tr').find('td');
    //POM for Select  Record on Auto Assign Adjuster

     //Muskan's Code : RMA-106953
     this.AssureClaimsApp_AutoAssignAdjuster_Chk_AddedAdjustersCheckbox = Selector('[class="ag-selection-checkbox"]')
     //POM for added adjusters check box over auto assign adjuster

     this.AssureClaimsApp_AutoAssignAdjuster_Btn_DeleteAdjuster = Selector('#autoassignadjustergridstate_toolbar_delete_button')
     //POM for delete adjuster over auto assign adjuster

     this.AssureClaimsApp_AutoAssignAdjuster_Txt_Lastname=Selector('[aria-labelledby="lbl_Last Name"]')
     //POM for lastname textbox over auto assign adjuster

     this.AssureClaimsApp_AutoAssignAdjuster_Btn_SearchButton=Selector('[aria-label="Submit Query"]')
     //POM for search button over auto assign adjuster

     this.AssureClaimsApp_AutoAssignAdjuster_Lnk_SelectAdjuster=Selector('[class="btn-simple"]')
     //POM for select adjuster over auto assign adjuster

     this.AssureClaimsApp_AutoAssignAdjuster_Btn_AddAdjuster=Selector('#autoassignadjustergridstate_toolbar_addAutoAssignAdjuster_button')
     //POM for add adjuster over auto assign adjuster

     this.AssureClaimsApp_AutoAssignAdjuster_Lnk_AutoAssignAdjusterPage=Selector("#autoassignadjuster_screenid")
     //POM for auto assign adjuster page
    
     this.AssureClaimsApp_AutoAssignAdjuster_Lst_AutoAssignAdjusterDropdown=Selector('#rbAutoAssignAdj')
     //POM for click auto assign adjuster dropdown

     this.AssureClaimsApp_AutoAssignAdjuster_Lnk_SelectAutoAssignAdjusterValue=Selector('[class="mat-option-text"]').find("span")
     //POM for select value from auto assign adjuster dropdown

     this.AssureClaimsApp_AutoAssignAdjuster_Chk_PriortizeAdjusterHandling=Selector('#prioritizeAdj-input')
     //POM for Prioritize adjusters handling existing claims (WC/Non occ only) check box




}}export default  POM_AutoAssignAdjuster;
