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

WebUI.click(findTestObject('QM-015/Page_PMRS Web Application/button_Dina  Tuto_mat-fab mat-accent cdk-focused cdk-program-focused'))

WebUI.setText(findTestObject('Object Repository/QM-015/Page_PMRS Web Application/input_PATIENT_mat-input-2 (1)'), 'test@gmail.com')

WebUI.click(findTestObject('Object Repository/QM-015/Page_PMRS Web Application/p_DR DINA  TUTO (1)'))

WebUI.setText(findTestObject('Object Repository/QM-015/Page_PMRS Web Application/input_NICKNAME_mat-input-3 (1)'), 'testname')

WebUI.click(findTestObject('Object Repository/QM-015/Page_PMRS Web Application/div_1600 - 2000      28'))

WebUI.click(findTestObject('Object Repository/QM-015/Page_PMRS Web Application/div_    28'))

WebUI.click(findTestObject('Object Repository/QM-015/Page_PMRS Web Application/button_CONFIRM'))
