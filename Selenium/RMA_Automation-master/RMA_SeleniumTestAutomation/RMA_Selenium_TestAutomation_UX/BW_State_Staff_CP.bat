cd C:\windows\system32
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 1
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 2
set MyProject=D:\RMA_SeleniumTestAutomation\RMA_Selenium_TestAutomation_UX
echo %MyProject%
set classpath=%MyProject%\bin;%MyProject%\Lib\*
echo %classpath%
d:
CD %MyProject%
java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RRMA_Suite01_Funds_Withholding_EROFF_01.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite01_Funds_Withholding_EROFF_02.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite02_Funds_Withholding_ERON.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite05_Maint_State_Regression.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite10_Maint_Staff_Regression_01.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite10_Maint_Staff_Regression_02.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite10_Maint_Staff_Regression_03.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Regression_CombinedPayment_On_CorporateGC_01.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Regression_StopCombinedPayment_On_CorporateGC_02.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Regression_CombinedPayment_On_CorporateGC_03.xml
pause

