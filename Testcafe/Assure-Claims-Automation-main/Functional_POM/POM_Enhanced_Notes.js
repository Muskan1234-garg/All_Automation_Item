import { Selector } from 'testcafe';

class POM_Enhanced_Notes {
    constructor() {
        this.AssureClaims_Select_Enhanced_Notes = Selector('[uib-tooltip="Enhanced Notes"]').find('i');
        //POM for Enhanced_Notes Button

        this.AssureClaims_EnhancedNotes_Btn_CreateNotes = Selector('#btnCreateNote');
        //POM for Create_Note Button on Claim Page

        this.AssureClaims_EnhancedNotes_TxtArea_ProgressNotes = Selector('[class="fr-element fr-view"]').find('div');
        //POM for Create_Note TextBox on Claim Page
        this.AssureClaims_EnhancedNotes_Btn_BackToNotes = Selector('#btnBackToNotes');
        //POM for BackButton 

        this.AssureClaims_EnhancedNotes_Btn_NotesLookUp = Selector('#btn_noteslookup_openlookup');
        //POM for Note Type Button 

        this.AssureClaims_EnhancedNotes_Lnk_SelectNoteType = Selector('[class="ui-grid-cell-contents ng-scope"]').find('span');
        //POM for Note Type Value 

        this.AssureClaims_EnhancedNotes_Btn_EditNotes = Selector('#btnEditNote').find('i');
        //POM for Edit_Note Button on Claim Page

        this.AssureClaims_Select_GridWindow = (Selector('[class="ui-grid-cell-contents"]').nth(1).find('[class^="ui-grid-selection-row-header-buttons ui-grid-icon-"]'));
        //POM for Enhanced Note Grid on Claim Page

        this.AssureClaims_Select_Txt_Edit_Note = Selector('[class="fr-element fr-view"]').find('.fr-placeholder');
        //POM for Edit_Note Button on Claim Page

        this.AssureClaims_Select_Create_Note_BackButton = Selector('#btnBackToNotes').find('.material-icons.material-icons-clr');
        //POM for Create_Note_BackButton 

        this.AssureClaims_Select_Enhanced_Notes_Close_Button = Selector('[class="lg-modal-rm hidden-sm hidden-xs glyphicon glyphicon-remove modalcloseBtn"]');
        //POM for Enhanced_Notes_Cancel_Button 

        this.AssureClaims_Enhance_Note_SaveButton = Selector('#btnSave');
        //POM for Create_Note_saveButton

        this.AssureClaims_Enhanced_Notes_Btn_SelectGrid = Selector('[ng-click ="selectButtonClick(row, $event)"]');

        //POM for select grid
        this.AssureClaims_EnhancedNotes_Btn_DeleteNotes = Selector('#btnDeleteNotes').find('.material-icons.material-icons-clr');
        //POM for Delete_Note Button

        this.AssureClaims_EnhancedNotes_Btn_Cancel_DeleteNotes = Selector('#btnCancel').find('.material-icons.material-icons-clr');
        //POM for Cancel_Delete_Note Button

        this.AssureClaims_EnhancedNotes_Btn_Ok_DeleteNotes = Selector('#btnRoll').find('.material-icons.material-icons-clr');
        //POM for Cancel_Delete_Note Button

        this.AssureClaims_Enhance_Note_Level = Selector('#selNotesLevel')
        //POM for select notetype options

        this.AssureClaims_Enhance_Note_Levels = Selector('#selNotesLevel').find('option')
        //POM for select notetype options

        this.AssureClaims_Enhance_Note_Btn_ViewNote = Selector('#btnViewNotes')
        //POM for view notes btn

        this.AssureClaims_Enhance_Note_Txt_ViewNotetxt = Selector('#printThis').find('[class="paddingLeft ng-binding"]')
        //POM for print view all screen 

        this.AssureClaims_Enhance_Note_Btn_CloseViewAll = Selector('#btnViewAllClose')
        //POM for Close view all btn

        this.AssureClaims_Enhance_Note_Btn_AdvanceSearch = Selector('#btnAdvSearch')
        //POM for advance search btn

        this.AssureClaims_Enhance_Note_Btn_SelectClaim = Selector('#lstClaims').find('button')
        //POM for select claims dropdown

        this.AssureClaims_Enhance_Note_Btn_CheckAll = Selector('#selectAll')
        //POM for check all in claim dropdown

        this.AssureClaims_Enhance_Note_Btn_UnCheckAll = Selector('#deselectAll')
        //POM for Uncheck all in claim dropdown

        this.AssureClaims_Enhance_Note_Btn_SearchResult = Selector('#btnSave').find('i')
        //POM for search the results on Advance search screen

        this.AssureClaims_Enhance_Note_Btn_NotesDetailedView = Selector('#btnNotesNavigation').find('i')
        //POM for Notes detailed view 

        this.AssureClaims_Enhance_Note_Txt_NotesDetails = Selector('[class="noteText"]').find('[class="paddingLeft ng-binding"]')
        //POM for Note detailed view

        this.AssureClaims_Enhance_Note_Btn_CloseNotesDetailedView = Selector('#btnCancelmemo').find('span')
        //POM for close the notes detailed View screen 

        this.AssureClaims_Enhance_Note_Btn_HomeEnhanced = Selector('#div_backTonNotes').find('i')
        //POM for back to home screen of enhanced screen

        this.AssureClaims_Enhance_Note_Btn_NoteTemplate = Selector('#btnTemplates').find('i')
        //POM for note template btn

        this.AssureClaims_Enhance_Note_Btn_CreateTemplate = Selector('#btnCreateTemplate').find('i')
        //POM for Create new note template

        this.AssureClaims_Enhance_Note_Txt_TemplateName = Selector('#TemplateName')
        //POM for Template name 

        this.AssureClaims_Enhance_Note_Txt_TemplateSummary = Selector('[class="fr-element fr-view"]')
        //POM for TemplateSummary

        this.AssureClaims_Enhance_Note_Btn_SaveCreateTemplate = Selector('#btnSaveTemplate')
        //POM for save template 

        this.AssureClaims_Enhance_Note_Btn_CloseTemplateView = Selector('[name="btnCancelmemo"]')
        //POM for close template screen

        this.AssureClaims_Enhance_Note_Btn_SelectTemplate = Selector('#TemplateName')
        //POM for select template from enhanced notes 

        this.AssureClaims_Enhance_Note_Btn_SelectTemplateoption = Selector('#TemplateName').find('option')
        //POM for select template option from enhanced notes 

        this.AssureClaims_Enhance_Note_Btn_Deselect = Selector('#deselectAll')
        //POM for delselect the claims

        this.AssureClaims_Enhance_Note_Txt_SearchClaim = Selector('[class="form-control searchField ng-pristine ng-valid ng-empty ng-touched"]')
        //POM for search claims from advance screen

        this.AssureClaims_Enhance_Note_Btn_Sortbydropdown = Selector('#selSortBy1')
        //POM for sortby dropdown

        this.AssureClaims_Enhance_Note_Btn_Sortbydropdownoption = Selector('#selSortBy1').find('option')
        //POM for select sortby dropdown

        this.AssureClaims_Enhance_Note_Txt_SearchNoteType = Selector('[class="ng-scope sortable"]').withText('Note Type ').find('input')
        //POM for search note type txtbox

        this.AssureClaims_Enhance_Note_Btn_Backbtn = Selector('#btnBackToNotes').find('i')
        //POM for click back btn

        this.AssureClaims_Enhance_Note_Txt_InputNotesType = Selector('#lookup_noteslookup')
        //POM for input notes type

        this.AssureClaims_Enhance_Note_Btn_backToAdv = Selector('#btnBack').find('i')
        //POM for back to advance search 

        this.AssureClaims_Enhance_Note_Txt_SearchBox = Selector('[class="form-control searchField ng-pristine ng-valid ng-empty ng-touched"]')
        //POM for search claims on advance search screen

        this.AssureClaims_Enhance_Note_Lnk_ClaimGrid = Selector('[ng-keydown="option.disabled || keyDownLink($event)"]').find('span')
        //POM for Select claim search grid 

        this.AssureClaims_EnhancedNotes_Btn_AdvanceNotesLookUp = Selector('#btn_notesLookUp').find('i');
        //POM for Note Type Button 

        this.AssureClaims_EnhNotes_Tab_Drafts = Selector('[role="tab"]').withText("Drafts");
        //POM For Drafts Tab On enhanced Notes Window

        this.AssureClaims_EnhNotes_Btn_SaveAsDrafts = Selector('[aria-label="Save as draft"]').find('i');
        //POM For Save As Drafts Button On Enhanced Notes Screen

        this.AssureClaims_EnhNotes_Drafts_RedLine = Selector('[style="border-bottom: 3px solid red"]');
        //POM For Red Line For Drafts Notes

        this.AssureClaims_EnhNotes_Drafts_IconOnMainNote = Selector('[title="Edit Draft"]').withText("drafts");
        //POM For Draft Icon On Main Notes Grid

        this.AssureClaims_EnhNotes_Drafts_Btn_OpenAsMainNote = Selector('[name="mainnote"]').withExactText("Open As Main Note");
        //POM For Open As Main Note Button

        this.AssureClaims_EnhNotes_Drafts_Btn_OpenAsDraft = Selector('[name="draftnote"]').withText("Open as Draft");
        //POM For Open As Draft Button

        this.AssureClaims_EnhNotes_Drafts_Btn_CloseEditDraft = Selector('[title="Close"]').find('span');
        //POM For Close Button On Alert PopUp for Edit Draft

        this.AssureClaims_EnhNotes_Drafts_Btn_SaveAsDraftsHidden = Selector('[aria-hidden="true"]').find('[aria-label="Save as draft"]');
        //POM For Save As Drafts Button When Setting Is Off

        this.AssureClaims_EnhNotes_Tab_DraftsHidden = Selector('[aria-hidden="true"]').withText("Drafts");
        //POM For Drafts Tab On enhanced Notes Window

    }
}
export default POM_Enhanced_Notes;

