import {Selector,t} from 'testcafe';

class POM_WorkflowLogin{
    constructor(){
    this.AssureClaims_WorkflowLogin_LoginUserNameTextbox = Selector('input[formcontrolname="username"]');
        this.AssureClaims_WorkflowLogin_LoginPasswordTextbox = Selector('input[formcontrolname="password"]');
     //   this.AssureClaims_WorkflowMenu_SearchBox = Selector('#search-box-input');
       // this.AssureClaims_WorkflowLogin_Modulename = Selector('#all-services-itemec2 > a > span > p');
     //   this.AssureClaims_WorkflowLogin_Modulename = Selector('#all-services-itemec2 > a > span > p').withText('Configure Workflows');
       //this.AssureClaims_WorkflowLogin_Menu = Selector('#menuButton');
     //   this.AssureClaims_WorkflowLogin_Modulename1 = Selector('#all-services-itemec2 > a > span > p').withText('Initiate Document Workflow');
       // this.AssureClaims_WorkflowLogin_Modulename = Selector('#all-services-itemec2').find('a');
        this.AssureClaims_ConfigureWorkflow_Buttonname = Selector('div.toolbarcontainer>dxc-claims-button').find('button');
     //   this.AssureClaims_Workflow_Screen_Heading = Selector('#DivHeader');
        //this.AssureClaims_Workflow_Screen_Heading = Selector('h5.docHeader'||'h5');

        //this.AssureClaims_WorkflowLogin_LoginUserNameTextbox = Selector('div[id="lbl_usernamelogin"]').find('input');
        //this.AssureClaims_WorkflowLogin_LoginUserNameTextbox = Selector('#lbl_usernamelogin').find('input');

        //this.AssureClaims_WorkflowLogin_LoginUserNameTextbox = Selector('div[id="lbl_passwordlogin"]').find('input');
    }
  /*  constructor(text) {
        this.AssureClaims_WorkflowLogin_Modulename = Selector('a.menuitem');
        this.AssureClaims_WorkflowLogin_Modulename = AssureClaims_WorkflowLogin_Modulename.withText(text);
     //   this.label = label.withText(text);
       // this.checkbox = this.label.find('input[type=checkbox]');
    }*/
};
export default POM_WorkflowLogin;