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

WebUI.callTestCase(findTestCase('Log In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Add Appointment Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/h1_Add Appointment'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/p_DR DINA  TUTO'))

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/h6_EstimatedServiceTime'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/h6_0400'), 0)

WebUI.verifyElementPresent(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/h5_PM'), 0)

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/mat-label_PATIENT'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/input_PATIENT_mat-input-2'))

WebUI.verifyElementText(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/mat-label_NICKNAME'), 
    'NICKNAME')

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/input_NICKNAME_mat-input-3'))

WebUI.verifyElementPresent(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/label_PRIORITY PATIENT'), 
    0)

WebUI.verifyElementClickable(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.delay(1)

WebUI.click(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/mat-label_SELECT DATE  TIME'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/input_SELECT DATE  TIME_mat-input-4'))

WebUI.verifyElementText(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/p_By proceeding I confirm that I have obtained consent to store the PATIENT MOBILE NO.  NAME.'), 
    'By proceeding, I confirm that I have obtained consent to store the PATIENT MOBILE NO. & NAME.')

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/button_CONFIRM'))

WebUI.verifyElementClickable(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/button_CONFIRM'))

WebUI.verifyElementVisible(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/button_CANCEL'))

WebUI.verifyElementClickable(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/button_CANCEL'))

