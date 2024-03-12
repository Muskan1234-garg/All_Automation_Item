import fs from 'fs';
export const ReportLevel = {
    DETAILED: 'DETAILED',
    PASSED: 'PASSED',
    FAILED: 'FAILED',
    DISABLED: 'DISABLED'
};

class Logs_Utility {
    constructor() {
        this.logTracker = {
            passedMessages: [],
            failedMessages: [],
            allMessages: []
        };
    }

    //JIRA ID OF STORY : RMA-110477
    //Description      : It is used to write logs in console and also store logs in collection.
    //Input Parameters : logMessage -> It will be log messages, IsSuccess --> It will be true if test case passed and false if test case failed and undefined in case of informative messages.
    //Revision         : Aditi Aggarwal 03-08-2024
    async AssureClaims_ClaimsScheduler_LogMessage(logMessage, IsSuccess) {
        this.logTracker.allMessages.push(logMessage);
        if (IsSuccess === undefined) {
            console.log(logMessage.green);
        }
        else if (IsSuccess) {
            console.log("Success:".green, logMessage);
            this.logTracker.passedMessages.push(logMessage);
        } else {
            console.error("Error:".red, logMessage);
            this.logTracker.failedMessages.push(logMessage);
        }
    }

    //Return Passed Test Cases Collection if any.
    AssureClaims_ClaimsScheduler_GetPassedMessages() {
        return this.logTracker.passedMessages;
    }

    //Return Failed Test Cases Collection if any.
    AssureClaims_ClaimsScheduler_GetFailedMessages() {
        return this.logTracker.failedMessages;
    }

    //Return All Message Collection if any including Passed, Failed and Informative.
    AssureClaims_ClaimsScheduler_allMessages() {
        return this.logTracker.allMessages;
    }

    //JIRA ID OF STORY : RMA-110477
    //Description      : It is used to set Report Level and call save Logs to File Method.
    //Input Parameters : logsFilePath -> It will be logs File Path, reportLevel --> It will be report level i.e Detailed, passed, failed or disabled.
    //Revision         : Aditi Aggarwal 03-08-2024
    async AssureClaims_ClaimsScheduler_WriteLogsToFile(logsFilePath, reportLevel) {
        let level = ""
        switch (reportLevel.toUpperCase()) {
            case 'DETAILED':
                level = ReportLevel.DETAILED
                break;
            case 'PASSED':
                level = ReportLevel.PASSED
                break;
            case 'FAILED':
                level = ReportLevel.FAILED
                break;
            default:
                this.AssureClaims_ClaimsScheduler_LogMessage("Report Level is set as" + reportLevel + ",inside InfoDetails spec sheet. Logs will not saved to File. Please check Report Level.To see Logs Report Level should be DETAILED,PASSED or FAILED.", false)
        }
        if (level.trim().length > 0) {
            LogsUsage_Utility.AssureClaims_ClaimsScheduler_SaveLogMessagesToFile(logsFilePath, level)
        }
    }

    //JIRA ID OF STORY : RMA-110477
    //Description      : It is used to save logs to file based on report level.
    //Input Parameters : filePath -> It will be logs File Path, reportLevel --> It will be report level i.e Detailed, passed, failed or disabled.
    //Revision         : Aditi Aggarwal 03-08-2024
    async AssureClaims_ClaimsScheduler_SaveLogMessagesToFile(filePath, reportLevel) {
        let logMessages = [];

        switch (reportLevel) {
            case 'DETAILED':
                logMessages = this.logTracker.allMessages
                break;
            case 'PASSED':
                logMessages = this.logTracker.passedMessages
                break;
            case 'FAILED':
                logMessages = this.logTracker.failedMessages
                break;
        }

        if (logMessages.length > 0) {
            const logs = logMessages.join('\n');
            try {
                fs.writeFileSync(filePath, logs);
                await this.AssureClaims_ClaimsScheduler_LogMessage("Logs saved to file: " + filePath)

            } catch (err) {
                await this.AssureClaims_ClaimsScheduler_LogMessage("Error while saving Logs to file: " + filePath + "Error : " + err)
            }
        }
    }
};
const LogsUsage_Utility = new Logs_Utility();
export default LogsUsage_Utility;




