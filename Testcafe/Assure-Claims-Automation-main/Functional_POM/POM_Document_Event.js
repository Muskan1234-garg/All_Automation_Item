import {Selector,t} from 'testcafe';

class POM_Document_Event{
    constructor(){
        
        this.AssureClaims_EventCreation_DocumentMenubar = (Selector('#menuBar').find('a').withText('Document').nth(0));
        //POM for clicking Document option

        this.AssureClaims_EventCreation_SelectEvent = (Selector('#menu_DocumentRoot').find('a').withText('Event'));
        //POM for clicking Event option

        this.AssureClaims_EventCreation_EventIframe = (Selector('[id^="event"]'));
        // POM to swtich Iframe to event iframe

        this.AssureClaims_EventCreation_Txt_DateOfEvent = (Selector('#dateofevent').nth(1));
        //POM for selecting date of event

        this.AssureClaims_EventCreation_Txt_TimeOfEvent = (Selector('#timeofevent').find('.glyphicon.glyphicon-time'));
         //POM for selecting time of event

        this.AssureClaims_EventCreation_Txt_EventStatus = (Selector('#btn_eventstatuscode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
         // POM for  clicking event status textbox

        this.AssureClaims_EventCreation_Txt_SelectEventStatus = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        // POM for selecting Event Status

        this.AssureClaims_EventCreation_Txt_DateReported=(Selector('#datereported'));
        //POM  for selecting date reported

        this.AssureClaims_EventCreation_Txt_TimeReported = (Selector('#timereported').find('.glyphicon.glyphicon-time'));
        // POM for selecting timereported

        this.AssureClaims_EventCreation_Txt_EventType = (Selector('#btn_eventtypecode_openlookup').find('.glyphicon.glyphicon-option-horizontal'));
        //POM  for clicking Event type

        this.AssureClaims_EventCreation_Txt_SelectEventType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM for selecting Event type 

        this.AssureClaims_EventCreation_Txt_ClaimInfo_Dept = (Selector('#lookup_depteid'));
        //POm for selecting department

        this.AssureClaims_EventCreation_Btn_Save = (Selector('#Save').find('i').withText('save'));
        // POM  for saving the Event 

        this.AssureClaims_EventCreation_Txt_EventNumber = (Selector('#eventnumber'));
        //POm For Event Number Textbox On Event Creation Screen

        this.AssureClaims_EventCreation_Tab_EventInfo = Selector('[class="accordion-toggle"]').find('span').withText('Event Info');
        //POM For Event Info Tab On Event Creation Page

        this.AssureClaims_EventCreation_Tab_FollowUp = Selector('[class="accordion-toggle"]').find('span').withText('Follow Up');
        //POM For Event Follow Up Tab On Event Creation Page

        this.AssureClaims_EventCreation_Tab_EventDetail = Selector('[class="accordion-toggle"]').find('span').withText('Event Detail');
        //POM For Event Detail Tab On Event Creation Page

        this.AssureClaims_EventCreation_Tab_ReportedInfo = Selector('[class="accordion-toggle"]').find('span').withText('Reported Info');
        //POM For Event Detail Tab On Event Creation Page

        this.AssureClaims_EventCreation_Tab_Supplementals = Selector('[class="accordion-toggle"]').find('span').withText('Supplementals');
        //POM For Supplementals Tab

        this.AssureClaims_EventCreation_Txt_CountyOfInjury = (Selector('#countyofinjury'));
        //POm For Event County of Injury Textbox On Event Creation Screen

        this.AssureClaims_EventCreation_Txt_ReporterLastName = (Selector('#lookup_replastname'));
        //POm For Event Reporter Lastname Textbox On Event Creation Screen

        this.AssureClaims_EventCreation_Txt_Outcome = (Selector('#lookup_outcomelist'));
        //POm For Event OutCome List Textbox On Event Creation Screen
        this.AssureClaims_AddDatedTextPlus_Btn = Selector(
            "#associated-datedtext i"
          ).withText("add");
          //POM for plus btn for  dated text
      
          this.AssureClaims_EditDatedText_Btn = Selector(
            '[class="btn btn-primary"]'
          ).find('[class="glyphicon glyphicon-edit"]');
          //POM for edit dated text
      
          this.AssureClaims_WriteDatedText_Txt = Selector(
            '[class="fr-element fr-view"]'
          );
          //POM for write dated text
      
          this.AssureClaims_OkDatedText_Btn = Selector("#usericon").find("i");
          //POM for Ok Btn for dated text

          this.AssureClaims_AddNewbtn = Selector('[class="material-icons material-icons-right addIconRight listAdd ng-binding ng-scope"]');
    //POM for add new btn 

    this.AssureClaims_AddNewClaimbtn = Selector('[ng-click="vm.addNew(plist)"]');
    //POM for add new Claims btn 

    this.AssureClaims_LnkBreadCrum = Selector('[ng-click="main.breadChange(breadc, $index)]');
    //POM for Link for bread crum
        
        //ANURAG'S CODE RMA-85449
        
    this.AssureClaims_PIEmp_LastName = (Selector('#lookup_lastname'));
    //POM for PI Employee Last Name
        
    }};
    export default POM_Document_Event;
