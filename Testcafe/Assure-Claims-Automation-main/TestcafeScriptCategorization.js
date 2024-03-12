const fs = require('fs');
const path = require('path');

const sourceDir = 'TestScripts';

const fileMapping = {
    TestScripts1: ["Adjuster_GC.js", "Adjuster_PC.js", "Adjuster_VC.js","AutoAssignAdjuster1_GCPCVA.js","AutoAssignAdjuster2_WcNonOcc.js", "Adjuster_WC.js", "ClientProgram_TS1.js", "ClientProgram_TS2.js", "EntityRoleON1_MaintenanceLevel.js", "EntityRoleON2_PersonInvLevel.js", "EntityRoleON3_PaymentLevel.js", "EntityRoleON4_ClaimLevel.js", "EntityRoleON5_UseEntityPaymentApproval.js", "EntityRoleON6_DeleteRole.js", "EntityRoleON7_RuntimeEntityCreation.js", "EventLevelPersonInv.js", "PropertyQuotation1.js", "PropertyQuotation2.js", "Smoke_ClaimGC.js", "Smoke_ClaimPC.js", "Smoke_ClaimVC.js", "Smoke_ClaimWC.js", "Smoke_Diary.js", "Smoke_DiaryAssignToMe.js", "Smoke_DiaryPeekTransferPurge.js", "Smoke_EnhancedNotes.js", "Smoke_Funds.js", "Smoke_Maintenance.js", "Smoke_NonOcc.js", "Smoke_NonOccPayments.js"],
    TestScripts2: ["ControlRequest1_CareerClaim.js","ControlRequest2_CorporateGC.js","ControlRequest3_VerifyFunctionality.js","Deductible1_UtilitySetting.js","Deductible2_FirstParty.js","Deductible3_ThirdParty.js","Deductible4_MiscellaneousScenarios.js","Deductible5_RevertSetting.js","FnFRecCollection.js","FNOL1_ConfigurationManagerSettings.js","FNOL2_ReserveOverCarrierClaim.js","FNOL3_CorporateClaimAndDisabled.js","IntPolicy1.js","IntPolicy2.js","Smoke_CarrierGC.js"],
    TestScripts3: ["MultipleAddress1.js","MultipleAddress2_Transaction.js", "MultipleAddress3_EnbableDisableAddressSetting.js","MultipleAddress4_ModifyAddress.js", "StopPay1_Bulk.js","StopPay2_DifferentStopPayStatus.js","StopPay3_MiscllaneousPayment.js","StopPay4_DifferentStatusMessage.js", "UnclaimedEscheat1_PaymentConfiguration.js", "UnclaimedEscheat2_PaymentWithholding.js","WLR1_ConfigSetting.js","WLR2_WLCaseMgmt.js","WLR3_RCaseMgmt.js","WLR4_WLFundTransaction.js", "WLR5_RFundsTransaction.js","WLR6_RestFromToDate.js","WLR7_Rest_PI.js","WLR8_RevertConfigSetting.js"],
    TestScripts4: ["BankReconciliation1.js","BankReconciliation2.js","BankReconciliation3.js", "BankReconciliation4.js", "BankReconciliation5.js","BankReconciliation6.js","CopyTransaction1_ClaimLevel.js","CopyTransaction2_OrphanTransaction.js","CopyTransaction3_ExistForVoid_Config.js","EditPayeeFromFunds1.js","EditPayeeFromFunds2.js","EditPayeeFromFunds3.js","EditPayeeFromFunds4.js","EditPayeeFromFunds5.js","ReserveRecovery1.js","ReserveRecovery2.js"],
    TestScripts5: ["MyPendingClaims.js", "PaymentLimit_DifferentAdminGroup.js", "PaymentLimit_GroupSupervisoryAproval.js", "PerClaimPayLimits1_ConfigurationManagerSetting.js", "PerClaimPayLimits2_ExceedingTransaction.js", "PerClaimPayLimits3_ApproveTransaction.js", "PerClaimPayLimits5_PreventExceededTransaction.js", "Smoke_PayDetailLimit.js","PerPayclaimUsers.js"],
    TestScripts6: ["Global360.js", "InsufficientReserve1.js", "InsufficientReserve2_Supervisory.js", "SaveAsDraft.js", "Smoke_PaymentLimit.js", "Smoke_QueuedPayment_Config.js", "Smoke_ReserveLimit.js","ReserveLimit_DifferentModuleGroup.js","ReserveLimit_SameModuleGroup.js","PerClaimPayLimit_DifferentModuleGroup.js","PerClaimPayLimit_SameModuleGroup.js","PayDetail_TopLevelApproval.js","PerClaimPay_TopLevelApproval.js"],
    TestScripts7: ["QueryDesigner_FundsSearch.js","QueryDesigner_ClaimSearch.js","QueryDesigner_EventSearch.js","QueryDesigner_EntitySearchEROFF.js","PerClaimPayLimit_AdjusterChain.js", "PrintCheckLimit.js", "ReserveLimit_TopLevelApproval.js","AdminTracking1_Settings.js","PaymentLimit_TopLevelApproval.js","ClaimLimit.js","ReserveLimit_AdjusterChain.js", "Smoke_Okta.js"],
    InstanceTurnOff: ["TurnOFFInstance.js"]
};

// Create folders and copy files
for (const folderName in fileMapping) {
    if (fileMapping.hasOwnProperty(folderName)) {
        const filesToCopy = fileMapping[folderName];
        const destinationDir = path.join(__dirname, folderName);

        fs.mkdirSync(destinationDir, { recursive: true });

        filesToCopy.forEach(fileName => {
            const sourceFilePath = path.join(sourceDir, fileName);
            const destinationFilePath = path.join(destinationDir, fileName);

            if (fs.existsSync(sourceFilePath)) {
                fs.copyFileSync(sourceFilePath, destinationFilePath);
                console.log(`Copied ${fileName} to ${folderName}`);
            } else {
                console.log(`Source file ${fileName} not found`);
            }
        });
    }
}
