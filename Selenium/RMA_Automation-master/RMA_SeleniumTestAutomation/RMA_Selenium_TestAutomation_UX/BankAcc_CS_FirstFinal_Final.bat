cd C:\windows\system32
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 1
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 2
set MyProject=D:\RMA_SeleniumTestAutomation\RMA_Selenium_TestAutomation_UX
echo %MyProject%
set classpath=%MyProject%\bin;%MyProject%\Lib\*
echo %classpath%
d:
CD %MyProject%
java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Reg_Funds_BankMAnagement.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Reg_Funds_BankAccount_Checkstocks.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Reg_Funds_FinalPayments_CorporateClaims.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Reg_Funds_FirstAndFinal_GCClaim.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Reg_Funds_SubbankAccount.xml
pause

