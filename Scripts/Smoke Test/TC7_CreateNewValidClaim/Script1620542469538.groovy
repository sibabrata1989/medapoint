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

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'LastName']), lastName)

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'search']))

WebUI.waitForPageLoad(5)

CustomKeywords.'com.Common.WebUICustomKeywords.clickOnViewActionForLatestRecord'(lastName)

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'aNew']))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'PatientCareNumber']), patientCare)

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'IncidentNumber']), incidentNumber)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Response Mode to Scene', 'SelectedResponseMode', 
    responseModeToScene)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('NEMSIS CMS Service Level', 'SelectedServiceLevel', 
    CMSserviceLevel)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Type of Service', 'SelectedServiceType', 
    typeOfService)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Incident/Patient Disposition', 'SelectedDisposition', 
    patientDisposition)

WebUI.waitForPageLoad(5)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Destination Reason', 'SelectedTransportReason', 
    destinationReason)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Response Urgency', 'SelectedResponseUrgency', 
    reasonUrgency)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Leg of Trip', 'SelectedTripLeg', legOfTrip)

WebUI.click(findTestObject('CommonObjects/chkboxInput', [('id') : 'UseScenePatientAddress']))

WebUI.click(findTestObject('CommonObjects/chkboxInput', [('id') : 'UseDestinationPatientAddress']))

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Scene Type', 'SelectedSceneType', sceneType)

CustomKeywords.'com.Common.WebUICustomKeywords.selectValueFromInputTypeDropDown'('Destination Type', 'SelectedDestinationType', 
    destinationType)

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'StartOdoMeterReading']), '1')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('CommonObjects/txtInputField', [('name') : 'EndOdoMeterReading']))

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'EndOdoMeterReading']), '10')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('CommonObjects/chkboxInput', [('id') : 'IsEmergency']))

WebUI.click(findTestObject('CommonObjects/chkboxInput', [('id') : 'IsEmergency']))

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'tabstrip-procedure']))

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'btnOpenInsurance']))

WebUI.waitForElementVisible(findTestObject('CommonObjects/btnField', [('id') : 'btnUseSelfPay']), 5)

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'btnUseSelfPay']))

WebUI.click(findTestObject('CommonObjects/btnYes'))

WebUI.click(findTestObject('CommonObjects/btnPopUpClose'))

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'CreateICD9Code']))

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'DiagnosisCode_input']), diagonosisInput)

WebUI.click(findTestObject('CommonObjects/drpdwnFirstValue', [('fieldId') : 'DiagnosisCode']))

WebUI.click(findTestObject('CommonObjects/btnGridUpdate'))

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'CreateNewProcedure']))

WebUI.setText(findTestObject('CommonObjects/txtInputField', [('name') : 'Procedure_input']), procedureInput)

WebUI.click(findTestObject('CommonObjects/drpdwnSelectSearchValue', [('fieldId') : 'Procedure', ('value') : procedureValue]))

WebUI.click(findTestObject('CommonObjects/btnGridUpdate'))

WebUI.click(findTestObject('CommonObjects/chkboxInput', [('id') : 'COBCheckedBox']))

WebUI.click(findTestObject('CommonObjects/btnField', [('id') : 'btnValidateSave']))

WebUI.click(findTestObject('CommonObjects/btnYes'))

WebUI.closeBrowser()

