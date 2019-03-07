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

WebUI.click(findTestObject('Object Repository/QM-023/Page_PMRS Web Application/button_Alfred Adonis_mat-fab mat-accent cdk-focused cdk-mouse-focused'))

WebUI.verifyElementClickable(findTestObject('QM-023/Page_PMRS Web Application/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/QM-023/Page_PMRS Web Application/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/QM-023/Page_PMRS Web Application/div_NICKNAME_mat-checkbox-inner-container'))

