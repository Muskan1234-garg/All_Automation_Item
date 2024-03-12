cd C:\windows\system32
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 1
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 2
set MyProject=d:\RMA_SeleniumTestAutomation\RMA_Selenium_TestAutomation_UX
echo %MyProject%
set classpath=%MyProject%\bin;%MyProject%\Lib\*
echo %classpath%
d:
CD %MyProject%
java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_DailySmoke_CorporateGCandWC_01.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_DailySmoke_CarrierGCandWC_02.xml
pause

