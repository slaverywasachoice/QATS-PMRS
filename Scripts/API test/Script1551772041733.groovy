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

WS.sendRequest(findTestObject('APIs/listDoctors'))
response = WS.sendRequestAndVerify(findTestObject('APIs/listDoctors'))

def data = findTestData('Data Files/DoctorNames')

def dr1_firstname = data.getValue(1, 1)

def dr2_firstname = data.getValue(1, 2)

def dr3_firstname = data.getValue(1, 3)

def dr1_lastname = data.getValue(2, 1)
 
def dr2_lastname = data.getValue(2, 2)

def dr3_lastname = data.getValue(2, 3)

for(int x=0; x<=2;x++){
	WS.verifyElementPropertyValue(response, 'data['+ x +'].first_name', dr1_firstname)
}


