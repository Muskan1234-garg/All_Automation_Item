import {Selector,t} from 'testcafe';

class POM_Workflow_Generic{
    constructor(){
        this.AssureClaims_WorkflowMenu_SearchBox = Selector('#search-box-input');
        this.AssureClaims_WorkflowLogin_Modulename = Selector('#all-services-itemec2 > a > span > p');
     //   this.AssureClaims_WorkflowLogin_Modulename = Selector('#all-services-itemec2 > a > span > p').withText('Configure Workflows');
       this.AssureClaims_WorkflowLogin_Menu = Selector('#menuButton');
        this.AssureClaims_Workflow_Screen_Heading = Selector('h5.docHeader'||'h5');
        //this.AssureClaims_Workflow_Screen_Heading = Selector('h5.header' || 'h5');
        this.AssureClaims_Workflow_Configure_Screen_Filter = Selector('div.mat-chip-list-wrapper > input[placeholder = "Filter by column name...."]');
       // this.AssureClaims_Workflow_Confirmation_Popup_message = Selector('div.mb-3.w-100.txt-confirm');
        this.AssureClaims_Workflow_Confirmation_Popup_message = Selector('div.modal-body > div.form-row > div');
        this.AssureClaims_Workflow_Confirmation_Popup_Heading = Selector('h5.modal-title');
        this.AssureClaims_Workflow_Confirmation_Button = Selector('div.toolbarcontainer > dxc-claims-button').find('button');
        this.AssureClaims_Workflow_Logout_Button = Selector('button[id="notificationButton"]').find('mat-icon').withText('login');
        this.AssureClaims_ConfigureWorkflow_Step_Screen_searchtext = Selector('div.dropdown-list > ul.item1 > li > input[type = "text"]').nth(2);
        this.AssureClaims_Workflow_Configure_Step_Screen_Trigger_Add_rule_Dropdown = Selector('div.multiselect-dropdown [ tabindex="-1"]').find('span');
        this.AssureClaims_ConfigureWorkflow_Step_Screen_Multiselect = Selector('div.dropdown-list >ul.item2 > li >input[type="checkbox"]');
        this.AssureClaims_ConfigureWorkflow_Step_Screen_Searchtext_Textbox = Selector('div.dropdown-list > ul.item1 > li > input[aria-label="multiselect-search"]');
        
    }
};
export default POM_Workflow_Generic;