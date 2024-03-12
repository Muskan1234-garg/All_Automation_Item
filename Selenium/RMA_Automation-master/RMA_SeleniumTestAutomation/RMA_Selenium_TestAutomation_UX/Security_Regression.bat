cd C:\windows\system32
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 1
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 2
set MyProject=d:\RMA_SeleniumTestAutomation\RMA_Selenium_TestAutomation_UX
echo %MyProject%
set classpath=%MyProject%\bin;%MyProject%\Lib\*
echo %classpath%
d:
CD %MyProject%
java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Regression_StopCombinedPayment_On_CarrierGC_02.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RRMA_Regression_StopCombinedPayment_On_CorporateGC_02.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Regression_StopCombinedPayment_On_CarrierWC_02.xml
pause

