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

WebUI.delay(2)

WebUI.click(findTestObject('QM-017/Page_PMRS Web Application/button_Dina  Tuto_mat-fab mat-accent'))

WebUI.setText(findTestObject('QM-017/Page_PMRS Web Application/input_PATIENT_mat-input-2'), 'test@gmail.com')

WebUI.setText(findTestObject('QM-017/Page_PMRS Web Application/input_NICKNAME_mat-input-3'), '34;[234;2[34;')

WebUI.click(findTestObject('QM-017/Page_PMRS Web Application/input_NICKNAME_mat-input-3'))

WebUI.click(findTestObject('QM-017/Page_PMRS Web Application/button_CONFIRM'))

WebUI.delay(1)

WebUI.click(findTestObject('QM-017/Page_PMRS Web Application/button_CONFIRM'))

WebUI.delay(2)

WebUI.setText(findTestObject('QM-017/Page_PMRS Web Application/input_NICKNAME_mat-input-3'), 'testname')

WebUI.click(findTestObject('QM-017/Page_PMRS Web Application/button_CONFIRM'))

