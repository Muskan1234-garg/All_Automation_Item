import {Selector,t} from 'testcafe';
import POM_Login from '../Functional_POM/POM_Login';
import POM_Home from '../Functional_POM/POM_Home';
import POM_Document_Event from '../Functional_POM/POM_Document_Event';
import POM_Generic_Claims from '../Functional_POM/POM_Generic_Claims';
import POM_VerificationMessage from '../Functional_POM/POM_VerificationMessage';


//Added By Nitika for Syndicate and UMR POM
import POM_Syndicate from '../Functional_POM/POM_Syndicate';
import POM_UMR from '../Functional_POM/POM_UMR';
//Added By Nitika for Syndicate and UMR POM


import Input_Utility from './Input_Utility'
import Verification_Utility from './Verification_Utility'
import Navigation_Utility from './Navigation_Utility'
import GenericUsages_Utility from './GenericUsages_Utility';

const POM_LoginPOM = new POM_Login();
const Home_POM = new POM_Home();

const In_Utility = new Input_Utility();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();

const Generic_Claims = new POM_Generic_Claims();
const Generic_Utility = new GenericUsages_Utility();
const Verification_Msg = new POM_VerificationMessage();

//Added By Nitika for Syndicate and UMR POM
const Syndicate_POM = new POM_Syndicate();
const UMR_POM = new POM_UMR();
//Added By Nitika for Syndicate and UMR POM

var faker = require('faker');

class MaintenanceChildAddition_Utility{
    constructor(){}
    
    async AssureClaims_MaintenanceChildAddition_ClientProgram_Utility(EntityType, ReqParam, ReqParam1, ReqParam2)
     {
            switch(EntityType)
            {

     case "Syndicate/Insurer":
          var SyndicateNumber = faker.random.number({min: 100000000, max: 999999999});               
	      var SyndicateName = faker.name.lastName();
	      var Address1 = faker.address.streetName();
	      var Address2 = faker.address.streetAddress();
	      var Address3 = faker.address.cityPrefix();
	      var City = faker.address.city();
                    
                                                                      
          await Nav_Utility.AssureClaims_ElementClick_Utility(Syndicate_POM.AssureClaims_Syndicate_Btn_AddSyndicate,"Add Syndicate/Insurer Button on Syndicate/Insurer Page")
          await t.wait(10000)
		  await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Number,SyndicateNumber.toString(),"Syndicate Number")
          await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Name,SyndicateName,"Syndicate Name")
          await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Address1,Address1,"Syndicate Address1")
          await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Address2,Address2,"Syndicate Address2")
          await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Address3,Address3,"Syndicate Address3")
          await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_City,City,"Syndicate City")

		  await Nav_Utility.AssureClaims_ElementClick_Utility(Syndicate_POM.AssureClaims_Syndicate_Btn_Country,"Country Lookup")
          const ele_SyndicateCountry = Syndicate_POM.AssureClaims_Syndicate_Lnk_SelectCountry.withText(ReqParam).with({ visibilityCheck: true })
          await t.expect(ele_SyndicateCountry.exists).ok('', { timeout: 20000 })
          await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SyndicateCountry,"Country Option")

		  await Nav_Utility.AssureClaims_ElementClick_Utility(Syndicate_POM.AssureClaims_Syndicate_Btn_State,"State Lookup")
          const ele_SyndicateState = Syndicate_POM.AssureClaims_Syndicate_Lnk_SelectState.withText(ReqParam1).with({ visibilityCheck: true })
          await t.expect(ele_SyndicateState.exists).ok('', { timeout: 20000 })
          await Nav_Utility.AssureClaims_ElementClick_Utility(ele_SyndicateState,"State Option")
          
          await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On Syndicate creation Screen");
          await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Syndicate Creation Screen");
		  return SyndicateNumber;
          break;
     
	 case "UMR":
          var UMRNUmber = faker.random.number({min: 100000000, max: 999999999});       
		  var EffExpirationDate = await Generic_Utility.AssureClaims_CurrentDateInfo_Utility("MM/DD/YYYY");
		  var date1 = new Date();
          var YearofAccount = date1.getFullYear();
		
	                                                           
          await Nav_Utility.AssureClaims_ElementClick_Utility(UMR_POM.AssureClaims_UMR_Btn_AddUMR,"Add UMR Button on UMR Page")
          await t.wait(10000)
	  await t.click(UMR_POM.AssureClaims_UMR_Txt_Number)
          await t.pressKey('ctrl+a delete')
	  await In_Utility.AssureClaims_SetValue_Utility(UMR_POM.AssureClaims_UMR_Txt_Number,UMRNUmber.toString(),"UMR Number")
          await In_Utility.AssureClaims_SetValue_Utility(UMR_POM.AssureClaims_UMR_Txt_EffectiveDate,EffExpirationDate,"UMR Effective Date")
          await In_Utility.AssureClaims_SetValue_Utility(UMR_POM.AssureClaims_UMR_Txt_ExpirationDate,EffExpirationDate,"UMR Expiration Date")
          await In_Utility.AssureClaims_SetValue_Utility(UMR_POM.AssureClaims_UMR_Txt_YearofAccount,YearofAccount.toString(),"UMR Year Of Account")
         
		  await Nav_Utility.AssureClaims_ElementClick_Utility(UMR_POM.AssureClaims_UMR_Btn_LOB,"Line of Business Lookup")
          const ele_UMRLOB = UMR_POM.AssureClaims_UMR_Lnk_SelectLOB.withText(ReqParam).with({ visibilityCheck: true })
          await t.expect(ele_UMRLOB.exists).ok('', { timeout: 20000 })
          await Nav_Utility.AssureClaims_ElementClick_Utility(ele_UMRLOB,"Line of Business Option")
		  
		  await In_Utility.AssureClaims_SetValue_Utility(UMR_POM.AssureClaims_UMR_Txt_AuthorityLimit,ReqParam2.toString(),"UMR Authority Limit")
          
		  await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image Button On UMR creation Screen");
          await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "UMR Creation Screen");
		  return UMRNUmber;
          break;

                    
    default: console.log("This Case is Not Defined In the Function of Child Client Program creation")   
            }
     }

	  async AssureClaims_MaintenanceChildAddition_EditEntity_Utility(EntityType, ReqParam, ReqParam1, ReqParam2){
            switch(EntityType){
                case "Syndicate/Insurer":
				
				 var SyndicateNumber = faker.random.number({min: 100000000, max: 999999999});               
	             var SyndicateName = faker.name.lastName();
	             var Address1 = faker.address.streetName();
	             var Address2 = faker.address.streetAddress();
	             var Address3 = faker.address.cityPrefix();
	             var City = faker.address.city();

				 await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Number,SyndicateNumber.toString(),"Syndicate Number Textbox on Syndicate Creation Screen")
                 await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Name,SyndicateName,"Syndicate Name Textbox on Syndicate Creation Screen")
                 await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Address1,Address1,"Syndicate Address1 Textbox on Syndicate Creation Screen")
                 await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Address2,Address2,"Syndicate Address2 Textbox on Syndicate Creation Screen")
                 await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Address3,Address3,"Syndicate Address3 Textbox on Syndicate Creation Screen")
                 await In_Utility.AssureClaims_SetValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_City,City,"Syndicate City Textbox on Syndicate Creation Screen")

                 await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image On Syndicate Creation Page");
                 await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "Syndicate Creation Screen");
                 await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Syndicate_POM.AssureClaims_Syndicate_Txt_Name, SyndicateName, "Syndicate Name Textbox On Syndicate Creation Screen");
                 return SyndicateName;
                 break;

				 case "UMR":
                 var UMRNUmber = faker.random.number({min: 100000000, max: 999999999});   
				 var date1 = new Date();
                 var YearofAccount = date1.getFullYear();
		         
		         await In_Utility.AssureClaims_SetValue_Utility(UMR_POM.AssureClaims_UMR_Txt_Number,UMRNUmber.toString(),"UMR Number Textbox on UMR Creation Screen")
                 await In_Utility.AssureClaims_SetValue_Utility(UMR_POM.AssureClaims_UMR_Txt_YearofAccount,YearofAccount.toString(),"UMR Year Of Account Textbox on UMR Creation Screen")
                 await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_Generic_Img_Save,"Save Image On UMR Creation Page");
                 await Verify_Utility.AssureClaims_VerifyUXMessage_Utility(Verification_Msg.AssureClaims_Generic_SaveMessage, false, "UMR Creation Screen");
                 await Verify_Utility.AssureClaims_VerifyElementValue_Utility(UMR_POM.AssureClaims_UMR_Txt_Number,UMRNUmber.toString(), "UMR Number Textbox On UMR Creation Screen");
				 return UMRNUmber;
                 break;

                default: console.log("This Case is Not Defined In the Function of Maint Child of Client Program creation")
            }
        }


}
     
    
    
export default MaintenanceChildAddition_Utility;
