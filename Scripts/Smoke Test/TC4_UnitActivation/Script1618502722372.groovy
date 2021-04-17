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

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Password') : findTestData('SmokeTestData').getValue(2, 1)
        , ('Username') : findTestData('SmokeTestData').getValue(1, 1), ('Organization') : findTestData('SmokeTestData').getValue(
            3, 1), ('headerTitle') : findTestData('SmokeTestData').getValue(4, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/span_Dispatch'))

WebUI.click(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/a_Unit Activation Matrix'))

WebUI.delay(2)

String unitBefore = WebUI.getText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/link_firstInactiveUnit'))

WebUI.click(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/link_firstInactiveUnit'))

WebUI.setText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/SelectedShift_input'), shiftInput)

WebUI.setText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/SelectedVehicle_input'), vehicleInput)

WebUI.setText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/SelectedCrew1_input'), crew1)

WebUI.setText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/SelectedCrew2_input'), crew2)

WebUI.setText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/SelectedCrew3_input'), crew3)

WebUI.setText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/SelectedCrew4_input'), crew4)

WebUI.click(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/btnSave'))

String unitAfter = WebUI.getText(findTestObject('Page_AdvanceDispatch Unit Activation Matrix/link_firstInactiveUnit'))

assert !(unitBefore.equals(unitAfter))

WebUI.closeBrowser()

