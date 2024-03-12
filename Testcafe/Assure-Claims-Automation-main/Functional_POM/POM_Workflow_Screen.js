import {Selector,t} from 'testcafe';

class POM_Workflow_Screen{
    constructor() {
        this.AssureClaims_Workflow_Configure_Screen_NameTextbox = Selector('input[formcontrolname="name"]');
        this.AssureClaims_Workflow_Configure_Screen_DescriptionTextbox = Selector('input[formcontrolname="description"]');
        //this.AssureClaims_Workflow_Configure_Screen_SaveButton = Selector('#save"]');

        this.AssureClaims_Workflow_Configure_Screen_SaveButton = Selector('div.toolbarcontainer>dxc-claims-button').find('button').withText('save');
        this.AssureClaims_Workflow_Configure_Screen_EditButton = Selector('div.toolbarcontainer>dxc-claims-button').find('button').withText('Edit');
//        this.AssureClaims_Workflow_Configure_Screen_Savemessage = Selector('div[aria-label="Saved Successfully"]');
//        this.AssureClaims_Workflow_Configure_Screen_Filter = Selector('#mat-chip-list-input-1');
        this.AssureClaims_Workflow_Configure_Screen_Filter_row = Selector('div.ag-selection-checkbox > div[ref="eCheckbox"] > div[ref="eWrapper"] > input[type="checkbox"]');
        this.AssureClaims_Workflow_Configure_Screen_Confirmation_popup = Selector('#mat-dialog-0').find('div').withText('Are you sure? You want to delete this record.');
        this.AssureClaims_Workflow_Configure_Screen_Confirmation_popup_ok_button = Selector('button.btn.btn-secondary').withText('Ok');
        this.AssureClaims_Workflow_Configure_Screen_Grid_Refresh_Button = Selector('#gridrefresh');
       this.AssureClaims_Workflow_Configure_Step_Screen_Header = Selector('h5.docHeader');
        //this.AssureClaims_Workflow_Configure_Step_Screen_Header = Selector('h5.header');
        this.AssureClaims_Workflow_Configure_Step_Screen_Step_DetailTextbox = Selector('textarea[formcontrolname="stepDetails"]');
        this.AssureClaims_Workflow_Configure_Step_Screen_instructionsTextbox = Selector('textarea[formcontrolname="instructions"]');
        this.AssureClaims_Workflow_Configure_Step_Screen_Assign_User_Dropdown = Selector('div.multiselect-dropdown[tabindex="0"]').find('span').withText('Select assignee');
        this.AssureClaims_ConfigureWorkflow_Step_Screen_Buttonname = Selector('div.toolbarcontainer > dxc-claims-button').find('button');
        this.AssureClaims_ConfigureWorkflow_Step_Screen_Multiselect = Selector('div.dropdown-list >ul.item2 > li >input[type="checkbox"]');
        this.AssureClaims_Workflow_Configure_Step_Screen_Assign_Group_Dropdown = Selector('div.multiselect-dropdown [ tabindex="-1"]').find('span').withText('Select group');
        this.AssureClaims_Workflow_Configure_Step_Screen_Popup_Heading = Selector('#modal-basic-title');
        this.AssureClaims_Workflow_Configure_Step_Screen_Trigger_Add_rule_Dropdown = Selector('div.multiselect-dropdown [ tabindex="-1"]').find('span');
        this.AssureClaims_Workflow_Configure_Step_Screen_Trigger_Add_Rule_Button = Selector('mat-card.example-card.mat-card > mat-card-content > div > dxc-claims-toolbar > div.toolbarcontainer > dxc-claims-button').find('button');
        this.AssureClaims_Workflow_Initiate_Document_Screen_File_Upload = Selector('#scriptName');
        this.AssureClaims_Workflow_Initiate_Document_Screen_Upload_Button = Selector('div.float-right.mt-2.mb-2 > button[class="btn btn-success btn-s mr-2"]').withText("Upload");
        this.AssureClaims_Workflow_Initiate_Document_Screen_Finish_button = Selector('div.float-right.mt-2.mb-2 > button[class="btn btn-warning btn-s mr-2"]').withText("Finish");
        this.AssureClaims_Workflow_Associate_Document_Screen_Next_Button = Selector('div[role="tabpanel"]>div').find('button');
        this.AssureClaims_Workflow_Associate_Document_Screen_Event_Number_Textbox = Selector('input[formcontrolname = "eventNumber"]');
        this.AssureClaims_Workflow_Associate_Document_Screen_Search_Button = Selector('div[role="tabpanel"] > div >button[name="locate"]');
        this.AssureClaims_Workflow_Associate_Document_Screen_Attach_Button = Selector('div[id="style-1"] > div > button[name="initiateWF"]');
        this.AssureClaims_Workflow_Active_Workflow_Screen_grid_header = Selector('div[ref = "headerRoot"]');
        this.AssureClaims_Workflow_Active_Workflow_Screen_grid_row = Selector('div.ag-center-cols-container[role = "rowgroup"]');
        this.AssureClaims_Workflow_MY_Workflow_Screen_Verify_Button = Selector('#preview');
        this.AssureClaims_Workflow_MY_Workflow_Screen_Comments_Textarea = Selector('#documentWorkflow > div > div:nth-child(2) > div > div:nth-child(4) > div > textarea');
        this.AssureClaims_Workflow_MY_Workflow_Screen_Next_Button = Selector('#documentWorkflow > div > div:nth-child(2) > div > div:nth-child(5) > div > button');
        this.AssureClaims_Workflow_MY_Workflow_Screen_Finish_Button = Selector('#finish');
        this.AssureClaims_Workflow_MY_Workflow_Screen_History_Button = Selector('#history > span > mat-icon');
        this.AssureClaims_Workflow_MY_Workflow_Screen_History_Label = Selector('label.historyLabel');
        this.AssureClaims_Workflow_attach1 = Selector('#attach');
        this.AssureClaims_Workflow_History_Button = Selector('a[title="History"]');

        //this.AssureClaims_ConfigureWorkflow_Step_Screen_searchtext1 = Selector('div.dropdown-list > ul.item1 > li > input[aria-label="multiselect-search"]');
        //this.AssureClaims_ConfigureWorkflow_Step_Screen_searchtext2 = Selector('div.dropdown-list > ul.item1 > li > input[aria-label="multiselect-search"]');
        this.AssureClaims_ConfigureWorkflow_Step_Screen_searchtext_attach = Selector('div.dropdown-list > ul.item1 > li > input[type = "text"]').nth(2);
        this.AssureClaims_ConfigureWorkflow_Step_Screen_searchtext_doc = Selector('div.dropdown-list > ul.item1 > li > input[type = "text"]').nth(1);
        this.AssureClaims_ConfigureWorkflow_Step_Screen_searchtext_record = Selector('div.dropdown-list > ul.item1 > li > input[type = "text"]');
    }   
};
export default POM_Workflow_Screen;

