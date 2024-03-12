cd C:\windows\system32
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 1
RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 2
set MyProject=D:\RMA_SeleniumTestAutomation\RMA_Selenium_TestAutomation_UX
echo %MyProject%
set classpath=%MyProject%\bin;%MyProject%\Lib\*
echo %classpath%
d:
CD %MyProject%
java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite02_Maint_Employee_Regression_01.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite02_Maint_Employee_Regression_03.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite04_Maint_Patient_Regression.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite06_Maint_Driver_Regression.xml

java org.testng.TestNG %MyProject%\RMASeleniumTestSuites\RMA_Suite01_Funds_Deposit_Regression_01.xml
pause

