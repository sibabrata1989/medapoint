import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common Test Cases/Login - claim'), [('Password') : findTestData('SmokeTestData').getValue(
            2, 1), ('Username') : findTestData('SmokeTestData').getValue(1, 1), ('Organization') : findTestData('SmokeTestData').getValue(
            3, 1), ('headerTitle') : findTestData('SmokeTestData').getValue(4, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CommonObjects/linkHomePageTab', [('tabName') : 'Patients']))

WebUI.click(findTestObject('Page_AdvanceClaim  Claims/btnRegisterNew Patient'))

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'LastName']), lastName)

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'FirstName']), firstName)

CustomKeywords.'com.Common.WebUICustomKeywords.javaScriptExecutorInputText'('DOB', DOB)

CustomKeywords.'com.Common.WebUICustomKeywords.javaScriptExecutorInputText'('SSN', SSN)

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'StreetAddress']), '13002 Napoli Valle')

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'City']), 'San Antonio')

CustomKeywords.'com.Common.WebUICustomKeywords.javaScriptExecutorInputText'('Zipcode', '78253')

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('State', 'SelectedState', stateCode)

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'patientSave']))

WebUI.click(findTestObject('CommonObjects/btnYes'))

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'address-resultbtn']))

WebUI.verifyElementNotClickable(findTestObject('CommonObjects/btnField', [('id') : 'patientSave']),FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

