cd C:\windows\system32
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 1
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 2
set MyProject=D:\RMA_SeleniumTestAutomation\RMA_Selenium_TestAutomation_UX
echo %MyProject%
set classpath=%MyProject%\bin;%MyProject%\Lib\*
echo %classpath%
d:
CD %MyProject%
java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite01_Funds_ClearCheck_Regression_Corporate_GC.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite01_Funds_ResetCheck_Regression_Corporate_GC.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite01_Funds_UnClearCheck_Regression_Corporate_GC.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite01_Funds_VoidCheck_Regression_Corporate_GC.xml
pause

