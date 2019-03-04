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

WebUI.click(findTestObject('Object Repository/QM-008/Page_PMRS Web Application/button_Alfred Adonis_mat-fab mat-accent cdk-focused cdk-mouse-focused'))

WebUI.verifyElementText(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/h1_Add Appointment'), 'Add Appointment')

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/p_DR ALFRED ADONIS'), 0)

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/h6_0158'), 0)

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/h5_PM'), 0)

WebUI.verifyElementText(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/mat-label_PATIENT'), 'PATIENT')

WebUI.verifyElementText(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/mat-label_NICKNAME'), 'NICKNAME')

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/input_NICKNAME_mat-input-1'), 
    0)

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/input_PATIENT_mat-input-0'), 
    0)

WebUI.verifyElementText(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/mat-label_SELECT DATE  TIME'), 
    'SELECT DATE & TIME')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/QM-008/Page_PMRS Web Application/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/QM-008/Page_PMRS Web Application/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/span_PRIORITY PATIENT'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/QM-008/Page_PMRS Web Application/div_SELECT DATE  TIME_mat-select-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/QM-008/Page_PMRS Web Application/div_CONFIRM_cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing'))

WebUI.verifyElementText(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/p_By proceeding I confirm that I have obtained consent to store the PATIENT MOBILE NO.  NAME.'), 
    'By proceeding, I confirm that I have obtained consent to store the PATIENT MOBILE NO. & NAME.')

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/button_CANCEL'), 0)

WebUI.verifyElementPresent(findTestObject('QM-008/Dialogue Elements/Page_PMRS Web Application/button_CONFIRM'), 0)

