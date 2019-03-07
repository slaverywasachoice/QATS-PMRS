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

WebUI.delay(0)

WebUI.callTestCase(findTestCase('Add Appointment Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/input_PATIENT_mat-input-2'), 'test@gmail.com')

WebUI.click(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/Labels, Titles/h1_Add Appointment'))

WebUI.setText(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/input_NICKNAME_mat-input-3'), 'testname')

WebUI.click(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/div_SELECT DATE  TIME_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/div_    08'))

WebUI.click(findTestObject('Main/Page_PMRS Web Application/Dialog Elements/button_CONFIRM'))

