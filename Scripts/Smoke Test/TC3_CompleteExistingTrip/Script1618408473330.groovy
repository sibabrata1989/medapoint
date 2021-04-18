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

WebUI.delay(1)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/linkCommand Form'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/i-expandTrip', [('patient') : patient]))

if (WebUI.verifyElementPresent(findTestObject('Page_AdvanceDispatch  Command Form/button_OK'),5, FailureHandling.OPTIONAL))
{
	WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/button_OK'))
}

//WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/div_Please wait while content loads'))
WebUI.delay(1)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _TripEventCollection0ActualTime'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _TripEventCollection1ActualTime'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Unit Left Scene_TripEventCollection2ActualTime'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _TripEventCollection3ActualTime'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _TripEventCollection4ActualTime'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _PreStartOdoMeterReading'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _StartOdoMeterReading'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _EndOdoMeterReading'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/input_Mileage _PostEndOdoMeterReading'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_AdvanceDispatch  Command Form/button_Complete Trip'))

WebUI.closeBrowser()

