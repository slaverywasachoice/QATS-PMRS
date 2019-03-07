import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pmrsqa.eschost2.com/')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('QM-032/Page_PMRS Web Application/mat-card_1  testname   testgmail.com   account_circle WALK-IN access_time 0933 AM access_time 0950 AM more_vertnotifications'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/div_1'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/div_access_time 0933 AM'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/div_access_time 0950 AM'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/div_account_circle WALK-IN'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/div_testgmail.com'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/div_testname'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/i_more_vert'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/i_notifications'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application/i_account_circle'), 0)

WebUI.verifyElementVisible(findTestObject('QM-032/Page_PMRS Web Application/mat-card_1  testname   testgmail.com   account_circle WALK-IN access_time 0933 AM access_time 0950 AM more_vertnotifications'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/div_2'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/div_access_time 0916 AM'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/div_access_time 0955 AM'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/div_account_circle WALK-IN'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/div_Hgg.com'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/div_Hvhfjvjgj'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/i_access_time'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/i_account_circle'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/i_more_vert'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/i_notifications'), 0)

WebUI.verifyElementPresent(findTestObject('QM-032/Page_PMRS Web Application 2/mat-card_2  Hvhfjvjgj   Hgg.com   account_circle WALK-IN access_time 0916 AM access_time 0955 AM more_vertnotifications'), 
    0)

