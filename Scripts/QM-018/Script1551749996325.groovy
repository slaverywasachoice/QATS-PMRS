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

WebUI.click(findTestObject('Object Repository/QM-018/Page_PMRS Web Application/button_Alfred Adonis_mat-fab mat-accent cdk-focused cdk-mouse-focused'))

WebUI.setText(findTestObject('Object Repository/QM-018/Page_PMRS Web Application/input_PATIENT_mat-input-0'), 'test@gmail.com')

WebUI.click(findTestObject('QM-018/Page_PMRS Web Application/p_DR ALFRED ADONIS'))

WebUI.setText(findTestObject('Object Repository/QM-018/Page_PMRS Web Application/input_NICKNAME_mat-input-1'), '134]2\'41]4[1;3')

WebUI.click(findTestObject('Object Repository/QM-018/Page_PMRS Web Application/button_CONFIRM'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('QM-018/Page_PMRS Web Application/div_Invalid Input'))

