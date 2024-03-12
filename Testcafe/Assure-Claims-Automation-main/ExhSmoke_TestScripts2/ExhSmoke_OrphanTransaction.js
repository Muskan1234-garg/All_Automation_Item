import { Selector, Role } from 'testcafe';
import Verification_Utility from '../Functional_Utilities/Verification_Utility'
import Functionality_Utility_Sec_Exh from '../Functional_Utilities/Functionality_Utility_Sec_Exh';
import POM_PaymentsCollections from '../Functional_POM/POM_PaymentsCollections';

const Verify_Utility = new Verification_Utility();
const Payment_POM = new POM_PaymentsCollections();
const Function_Utility = new Functionality_Utility_Sec_Exh();
const DataIUT = require('../DataFiles/DataIUTSQL_ExhSmoke.json');
//Global Variables
var StrControlNumberPayment;

//***********************************************************************************
//JIRA ID OF STORY : RMA-97883
//Description      : ExhSmoke_OrphanTransaction
//AUTHOR           : Saikrishan,Maddula
//DEPENDANCY       : No
// PRE-REQUISITES  : No
//Preferred Server : IUTSQL
//***********************************************************************************

DataIUT.forEach(data => {
  const LoggedInUser = Role(data.URL, async t => {
    await t.maximizeWindow()
    console.log("AssureClaims_LoginIntoApplication_Utility Function is Called To Login Into Application".yellow);
    await Function_Utility.AssureClaims_LoginIntoApplication_Utility(data.Username, data.Password, data.DSN, 'Claims')
    await t.wait(5000)
    console.log("Login Into Application!!".green)
  }, { preserveUrl: true }
  );

  fixture`ExhSmoke_OrphanTransaction`.beforeEach(async t => {
    await t.setNativeDialogHandler(() => true).useRole(LoggedInUser);
  });
  //Creating Orphan Transaction
  test('Funds Transaction Creation_Test_01', async t => {
    console.log("Funds Transaction Creation_Test_01 Started".rainbow);
    await t.wait(10000)
    console.log("AssureClaims_Funds_Transaction_Creation Function is Called To Create Payment ".yellow);
    await Function_Utility.AssureClaims_Funds_Transaction_Creation("NA", "NA", "NA", "NA", "NA", data.BankAccount, data.PayeeType, data.LastName, "NA", data.TransactionType, "15")
    console.log("Funds Transaction is Created");
    //==========================================================New Orphan Transaction Is Created==================================================================================================================
    await Verify_Utility.AssureClaims_VerifyElementValue_Utility(Payment_POM.AssureClaims_PaymentCollection_CheckStatus, data.CheckStatusRReleased, "CheckStatus TextBox");
    //==========================================================Orphan Transaction Status Released Verified================================================================================================
    StrControlNumberPayment = await Verify_Utility.AssureClaims_AttributeFetch_Utility(Payment_POM.AssureClaims_PaymentCollection_Txt_ControlNumber, "value");
    //===============================================================Fetched Control Number=================================================================================================================
    console.log("ControlNumber Of Printed Payment : ".green + StrControlNumberPayment);
  });
});


