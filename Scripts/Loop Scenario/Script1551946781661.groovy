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

WebUI.openBrowser('pmrsqa.eschost2.com')

WebUI.callTestCase(findTestCase('Log In'), [:], FailureHandling.STOP_ON_FAILURE)

int x = 0

while (x < 20) {
    WebUI.click(findTestObject('Loop Scenario/button_Dina  Tuto_mat-fab mat-accent'))

    WebUI.setText(findTestObject('Loop Scenario/input_PATIENT_mat-input-2'), 'test@gmail.com')

    WebUI.setText(findTestObject('Loop Scenario/input_NICKNAME_mat-input-3'), 'testname')

    WebUI.click(findTestObject('Loop Scenario/button_CONFIRM'))

    WebUI.delay(2)

    WebUI.dragAndDropToObject(findTestObject('Loop Scenario/div_ACTIONS_cdk-drag-handle ng-star-inserted'), findTestObject(
            'Loop Scenario/mat-card_2  testname   testgmail.com    WALK-IN access_time 0434 PM access_time 0430 PM more_vertnotifications'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Loop Scenario/i_more_vert'))

    WebUI.click(findTestObject('Loop Scenario/button_Move to Priority Queue'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Loop Scenario/a_more_vert'))

    WebUI.click(findTestObject('Loop Scenario/button_Add Waiting Time'))

    WebUI.setText(findTestObject('Loop Scenario/input_ADDITIONAL WAITING TIME_mat-input-8'), '10')

    WebUI.click(findTestObject('Loop Scenario/button_ADD'))

    WebUI.delay(2)

    println(x)

    x++
}

