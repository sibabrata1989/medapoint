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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Password') : findTestData('SmokeTestData').getValue(2, 1)
        , ('Username') : findTestData('SmokeTestData').getValue(1, 1), ('Organization') : findTestData('SmokeTestData').getValue(3, 1)
        , ('headerTitle') : findTestData('SmokeTestData').getValue(4, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch  Call Taking/a_New Call'))

WebUI.setText(findTestObject('Object Repository/Page_AdvanceDispatch  Call Taking/input_Patient_SelectedPatient_input'), 
    patient)

WebUI.click(findTestObject('Page_AdvanceDispatch  Call Taking/select_patientByName', [('patient') : patient]))

WebUI.click(findTestObject('Page_AdvanceDispatch  Call Taking/input_ScenePick up Information'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_AdvanceDispatch  Call Taking/input_DestinationDrop Off Information'))

WebUI.setText(findTestObject('Object Repository/Page_AdvanceDispatch  Call Taking/input_Service Requested_SelectedServiceType_input'), 
    serviceRequested)

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch  Call Taking/input_Service Requested_SelectedServiceType_input'))

WebUI.setText(findTestObject('Object Repository/Page_AdvanceDispatch  Call Taking/input_Unit_SelectedUnit_input'), unit)

WebUI.click(findTestObject('Page_AdvanceDispatch  Call Taking/select_UnitByName', [('unit') : unit]))

WebUI.setText(findTestObject('Object Repository/Page_AdvanceDispatch  Call Taking/input_Dispatch Complaint_SelectedComplaint_input'), 
    dispatchComplaint)

WebUI.click(findTestObject('Page_AdvanceDispatch  Call Taking/select_dispatchComplaintByName', [('complaint') : dispatchComplaint]))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch  Call Taking/button_Publish'))

WebUI.closeBrowser()

