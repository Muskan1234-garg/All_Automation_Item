import { Selector, t } from 'testcafe';
class POM_PowerView {
    constructor() {
        this.AssureClaimsApp_Lnk_Power_View = Selector('#all-services-itemec2 > a > span');
        //POM for PowerView Link On Utilites Screen

        this.AssureClaimsApp_Lnk_Power_View_Add_Button = Selector('#btnCreate');
        //POM for Add Button On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Add_Popup_Heading = Selector('#modal-header');
        //POM for Add Popup Heading On Power View Screen

        this.AssureClaimsApp_Lnk_Utilites_Search_Input_Field = Selector('#search-box-input');
        //POM for Search Field In Grid On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Name = Selector('#powerViewName');
        //POM for Power View Name Field On Add Power View Popup Screen

        this.AssureClaimsApp_Lnk_Power_View_Add_Popup_View_Description = Selector('#powerViewDesc');
        //POM for Power View Description Field On Add Power View Popup Screen

        this.AssureClaimsApp_Lnk_Power_View_Add_Popup_Data_Collection_Enabled = Selector('#Incidentcollectionview');
        //POM for Data Collection Checkbox Field On Add Power View Popup Screen

        this.AssureClaimsApp_Lnk_Power_View_Add_Popup_Save_Button = Selector('#btn_Save');
        //POM for Save Button On Add Power View Popup Screen

        this.AssureClaimsApp_Lnk_Power_View_Add_Popup_Search_Filter = Selector('[aria-label="Filter for column"]')
        //POM for Search Filter On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Edit_View_Heading = Selector('#DivHeader')
        //POM for Edit View On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Edit_View_Available_Checkbox = Selector('[class="panel-title"]>a>span').find('i')
        //POM for Available Checkbox On Power View Popup Screen

        this.AssureClaimsApp_Lnk_Power_View_Edit_View_Available_Claims_Checkbox = Selector('[class="panel-title"]>a>span')
        //pom for Clicking on Claims Checkbox

        this.AssureClaimsApp_Lnk_Power_View_Edit_View_Save_Button = Selector('#btnCreate > i')
        //POM for Save Button On Power View Popup Screen

        this.AssureClaimsApp_Lnk_Power_View_Search_Form_Search_Filter = Selector('[placeholder="Search Form"]')
        //POM for Search Filter On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_AvailableForm = Selector('[class="col-md-1"] > i')
        //POM for Available For Checkbox On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_GeneralClaims_Form = Selector('#forms1-0')
        //POM for GC Screen  Checkbox On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Users_search_textbox= Selector('[placeholder="Search User"]')
         //POM for Search Form textbox On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Users_Selection_Chckbx= Selector('#Checkbox4')
         //POM for User Selection Checbox  On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Page_Form_Label = Selector('#DivHeader')
         //POM for GC Screen  hyperlink On Power View Screen

        this.AssureClaimsApp_Lnk_Power_View_Page_Form_Label_Insight_button = Selector('#dashboard')
         //POM forInsight Dashboard Button in  LOB Claim Screen On Power View Screen

        this.AssureClaims_DashBoard_URL_Txt_box = Selector('#lblbox')
        //pom For Dashboard verification in Dashboard Configuration

        this.AssureClaims_Chk_Box_Assure_Insights_URL = Selector('#chk_insight')
        //pom for checkbox Assure Insights_URL in dashboard configuration

        this.AssureClaims_Chk_Box_Filter_Configuration_Adjuster = Selector('#chk_adjuster')
        //pom for checkbox Assure Insights_URL in dashboard configuration

        this.AssureClaims_Btn_Visible =  Selector('.maxtoggleswitch').withText("Visible")
        //Pom for Turning on Visible Button
        
        this.AssureClaims_Btn_Ok = Selector('#btn_okay')
        //pom for Ok button in Dashboard configuration in power view
        
        this.AssureClaims_Btn_Logout = Selector('#logoutButton > mat-icon');
        //Pom for Logout Button Of Configuration Manager
    }
}
export default POM_PowerView;