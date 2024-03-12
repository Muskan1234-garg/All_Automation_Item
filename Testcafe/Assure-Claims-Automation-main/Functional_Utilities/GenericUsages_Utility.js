import { Selector, t } from 'testcafe';
import { ClientFunction } from 'testcafe';
import moment from 'moment';
import POM_Home from '../Functional_POM/POM_Home';
import Navigation_Utility from '../Functional_Utilities/Navigation_Utility';
import Verification_Utility from '../Functional_Utilities/Verification_Utility';
import os from 'os';

const Home_POM = new POM_Home();
const Nav_Utility = new Navigation_Utility();
const Verify_Utility = new Verification_Utility();
const path = require('path');
const fs = require('fs');

class GenericUsages_Utility {
    constructor() { }
    async AssureClaims_RandomNumberGeneration_Utility(Length) {
        var text = "";
        var charset = "0123456789";
        for (var i = 0; i < Length; i++) {
            text += charset.charAt(Math.floor(Math.random() * charset.length));
        }
        return text.toString();
    }//Utility to Create Random Number of 'Length' digits

    async AssureClaims_DynamicFrameSwitching(FrameName) {
        await t.switchToIframe(Selector('[id^="' + FrameName + '"]'));
    }//Utility To Switch Frame



    async AssureClaims_WebPageRefresh_Utility() {
        await t.switchToMainWindow();
        await t.eval(() => location.reload(true));
        await t.setNativeDialogHandler(() => true);
        console.log("Web Page Is Refreshed".green);
    }

    async AssureClaims_ModalDialogTextVerify_Utility(StrAccept, CompareFlag, ExpMsg, ModalDialogMsg) {
        await t.expect(Home_POM.AssureClaims_Generic_ModalDialog.exists).ok();
        var StrAlertMessage = await Home_POM.AssureClaims_Generic_ModalDialog.textContent;
        if (StrAccept === "Yes") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_ModalDialogOK, "OK Button On Modal Dialog Box On Application");
        }
        else {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_ModalDialogCancel, "Cancel Button On Modal Dialog Box On Application");
        }
        if (CompareFlag === "Complete") {
            await Verify_Utility.AssureClaims_TextCompare(ExpMsg, StrAlertMessage, ModalDialogMsg);
        }
        else {
            await Verify_Utility.AssureClaims_PartialTextVerification(ExpMsg, StrAlertMessage, ModalDialogMsg);
        }
    }

    async AssureClaims_ModelDialogHandler_Utility(StrAccept) {
        await t.expect(Home_POM.AssureClaims_Generic_ModalDialog.exists).ok();
        if (StrAccept === "Yes") {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_ModalDialogOK, "OK Button On Modal Dialog Box On Application");
        }
        else {
            await Nav_Utility.AssureClaims_ElementClick_Utility(Home_POM.AssureClaims_GenericBtn_ModalDialogCancel, "Cancel Button On Modal Dialog Box On Application");
        }
    }

    async AssureClaims_CurrentDateInfo_Utility(DateType) {
        var date = moment().format(DateType)
        return date;
    }

    async AssureClaims_CurrentTimeInfo_Utility(TimeType) {
        var tm = moment().format(TimeType)
        return tm;
    }

    async AssureClaims_Generic_ZoneSwitching(ZoneName) {
        await t.switchToMainWindow()
        await t.setNativeDialogHandler(() => true);
        await t.eval(() => location.reload(true));
        var getURL = await ClientFunction(() => window.location.href)();
        var urlst = getURL.split("riskmasterux/");
        if (ZoneName === "Utilities")
            var newURL = urlst[0] + "riskmasterux/document/#/utilities";
        else if (ZoneName === "Claims")
            var newURL = urlst[0] + "riskmasterux/document/#/document";
        else if (ZoneName === "Security")
            var newURL = urlst[0] + "riskmasterux/document/#/security";
        else if (ZoneName === "Maintenance")
            var newURL = urlst[0] + "riskmasterux/document/#/maintenance";
        else if (ZoneName === "Dashboard")
            var newURL = urlst[0] + "riskmasterux/#/dashboard";
        await t
            .setNativeDialogHandler(() => true)
            .navigateTo(newURL);
    }
    async AssureClaims_FuturePastDateInfo_Utility(Years, Months, Days, DateType) {
        var dateFrom = moment().add(Years, 'years').add(Months, 'months').add(Days, 'days').format(DateType);
        return dateFrom;
    }

    async AssureClaims_FuturePastTimeInfo_Utility(Minutes, TimeType) {
        var dateFrom = moment().add(Minutes, 'minutes').format(TimeType);
        return dateFrom;
    }
    async AssureClaims_formatDatetoMMDDYYYY(date) {
        const options = { year: 'numeric', month: '2-digit', day: '2-digit' };
        return date.toLocaleDateString('en-US', options);
    }

    async AssureClaims_SetADayInNextMonthOfAGivenDate_Utility(StrDate, Day) {

        try {
            var d = new Date(StrDate);
            d.setMonth(d.getMonth() + 1);
            d.setDate(Day);
            var retVal = await this.AssureClaims_formatDatetoMMDDYYYY(d);
            console.log("retval".green + retVal.toString());
            return retVal;
        } catch (e) {
            console.log("Following Error Occurred While Calculating A Day Of Next Month Of A Given Date : " + e)
        }
    }


    async AssureClaims_AddNumberOfDaysInADate_Utility(StrDate, DateFormat, NumberOfDays) {

        try {

            var d = new Date(StrDate);
            d.setDate(d.getDate() + NumberOfDays);
            var retVal = await this.AssureClaims_formatDatetoMMDDYYYY(d) //ignore DateFormat
            return retVal;


        } catch (e) {
            Console.log("Following Error Occurred While Converting Date from String Value : " + e);

        }
    }


    async AssureClaims_GetActualDaysInAMonthOfAGivenDate_Utility(StrDate) {
        var ActualDays = 0;

        try {
            console.log("strDate".green + StrDate);
            var d = new Date(await this.AssureClaims_SetADayInNextMonthOfAGivenDate_Utility(StrDate, 0));
            console.log("getdate".green + d.getDate());
            ActualDays = Number(d.getDate())

            console.log("actualday".green + ActualDays);
        }
        catch (e) {
            console.log("Following Error Occurred While Calculating First Day Of Next Month Of A Given Date : " + e);

        }
        return ActualDays;
    }

    async AssureClaims_GetDaysPaidInMonth_Utility(StrDate) {
        var DaysPaid = 0;
        try {
            var d = new Date(StrDate);
            DaysPaid = Number((await this.AssureClaims_GetActualDaysInAMonthOfAGivenDate_Utility(StrDate) - d.getDate()) + 1);

        } catch (e) {
            console.log("Following Error Occurred While Calculating Days Paid In A Month : " + e);

        }
        return DaysPaid;
    }

    // To get number of months between 2 dates
    async AssureClaim_GetNumberOfMonths_Utility(StartDate, EndDate) {
        var MonthsBetween;
        var YearDiff;
        var d = new Date(StartDate);
        var d1 = new Date(EndDate);
        YearDiff = d1.getFullYear() - d.getFullYear();
        MonthsBetween = d1.getMonth() - d.getMonth() + 12 * YearDiff
        MonthsBetween = MonthsBetween + 1;
        console.log("Number of months between 2 dates: " + MonthsBetween);
        return MonthsBetween;
    }

    // To Get The Actual Number Of Days In a Month Of A Given Date
    async AssureClaim_GetLastDayInAMonthOfAGivenDate_Utility(StrDate) {
        var date = new Date(StrDate);
        var ModifiedDate = new Date(date.getFullYear(), date.getMonth() + 1, 0);
        var retval = await this.AssureClaims_formatDatetoMMDDYYYY(ModifiedDate);
        console.log("Get The Actual Number Of Days In a Month Of A Given Date: " + retval);
        return retval;
    }

    // To Get Days Paid In A Month
    async AssureClaims_GetDayFromDate_Utility(StrDate) {
        var Days = 0;
        try {
            var date = new Date(StrDate);
            Days = date.getDate();
            console.log("To Get Days Paid In A Month: " + Days)
        }
        catch (e) {
            console.log("Following Error Occurred While Calculating Get Days Paid In A Month:" + e);
        }
        return Days;
    }


    //To Convert A Double Number In 1000 Format With Currency Sign
    async AssureClaims_FormatANumber_Utility(Num) {
        var FormatedNum = new Intl.NumberFormat('en-US', {
            style: 'currency',
            currency: 'USD',
        }).format(Num);

        console.log("Conversion of Number in 1000 format: " + FormatedNum);
        return FormatedNum;
    }


    //To Round A Big Decimal Number To 2 Decimal Points
    async AssureClaims_RoundedValue_Utility(Num) {

        var RoundedValue = Math.round(Num * 100.00) / 100.00;
        console.log("Round number to 2 decimal points : " + RoundedValue)
        return RoundedValue;
    }

    async AssureClaims_AddOneDay_Utility(StrDate) {
        var date = new Date(StrDate);
        var ModifiedDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() + 1);
        var retval = await this.AssureClaims_formatDatetoMMDDYYYY(ModifiedDate);
        console.log("Add 1 day In a Month Of A Given Date: " + retval);
        return retval;
    }


    async AssureClaims_MinusOneDay_Utility(StrDate) {
        var date = new Date(StrDate);
        var ModifiedDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - 1);
        var retval = await this.AssureClaims_formatDatetoMMDDYYYY(ModifiedDate);
        console.log("Minus 1 day In a Month Of A Given Date: " + retval);
        return retval;
    }

    // Tushar's Code : RMA-102144

    async AssureClaims_DynamicFrameSwitchingWithId(FrameName) {
        await t.switchToIframe(Selector('#' + FrameName));
    }

    //Naveen's code for OSHA
    async AssureClaims_CurrentDateInfo_UTC_Utility(DateType) {
        var utcdt = moment().utc().format(DateType)
        return utcdt;
    }

    async AssureClaims_CurrentTimeInfo_UTC_Utility(TimeType) {
        var utctm = moment().utc().format(TimeType)
        return utctm;
    }
    //************************************************************************************************************************************************************************************************************************************************************************************
    //JIRA ID OF STORY : RMA-109590
    //Description      : It is used to change the download path dynamically during runtime
    //Revision         : Chhavi Dave 02-20-2024
    // ***********************************************************************************************************************************************************************************************************************************************************************************


    async AssureClaims_getDefaultDownloadFolderPath_Utility() {
        let downloadFolderPath;


        // Determine the operating system
        const platform = os.platform();

        // Define default download folder paths for different operating systems
        const defaultDownloadFolders = {
            'win32': path.join(os.homedir(), 'Downloads'),
            'linux': path.join(os.homedir(), 'Downloads')
            // You may need to add more cases for different operating systems
        };

        // Check if the platform is in the defaultDownloadFolders object
        if (defaultDownloadFolders.hasOwnProperty(platform)) {
            downloadFolderPath = defaultDownloadFolders[platform] + path.sep;

            // Ensure the folder exists, create it if not
            if (!fs.existsSync(downloadFolderPath)) {
                fs.mkdirSync(downloadFolderPath);
            }
        } else {
            console.error('Unsupported operating system:', platform);
        }

        return downloadFolderPath;
    }
    //*****************************************************************************************************************
    //JIRA ID OF STORY : RMA-109815
    //Description      : It is used to Read the CSV File row by row and then it will return the value based on the seperator for a particular row 
    //Input Parameters : filePath --> It denotes the filepath where the CSV file is placed
    //Revision       : Sukanya Bose 02/23/2024
    // *******************************************************************************************************************
    async AssureClaims_ReadCSVFile_Utility(filePath) {
        const csvData = fs.readFileSync(filePath, 'utf8')
        const rows = csvData.split('\n')
        return rows;
    }

}; export default GenericUsages_Utility;
