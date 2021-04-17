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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Password') : findTestData('SmokeTestData').getValue(2, 1)
        , ('Username') : findTestData('SmokeTestData').getValue(1, 1), ('Organization') : findTestData('SmokeTestData').getValue(
            3, 1), ('headerTitle') : findTestData('SmokeTestData').getValue(4, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch  Command Form/span_Emergency Call Taking'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Page_AdvanceDispatch/input_Caller Name_CallerName'), patient)

WebUI.click(findTestObject('Page_AdvanceDispatch/input_Call Back Number_CallbackNumber'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Page_AdvanceDispatch/input_Call Back Number_CallbackNumber'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'2169604444\'', Arrays.asList(element))

//WebUI.sendKeys(findTestObject('Page_AdvanceDispatch /input_Call Back Number_CallbackNumber'), '2169604444')
WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/span_Dispatch Complaint_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/li_Abdominal PainProblems'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/span_Service Requested_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/li_911 Response (Scene)'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/span_Dispatch Priority_k-select'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/li_Priority 2 (Emergent)'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/span_Transport Method_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/li_Ground-Ambulance'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/input_Caller Ref _CallerReferenceNumber'))

WebUI.setText(findTestObject('Object Repository/Page_AdvanceDispatch/input_Street Address_SceneStreetAddress'), '1300 napoli valie')

WebUI.setText(findTestObject('Object Repository/Page_AdvanceDispatch/input_City_SceneCity'), 'san antonio')

WebUI.setText(findTestObject('Object Repository/Page_AdvanceDispatch/input_State_SceneStateID_input'), '78253')

WebUI.click(findTestObject('Object Repository/Page_AdvanceDispatch/button_Publish And Continue'))

WebUI.waitForElementVisible(findTestObject('Page_AdvanceDispatch/lblcallReferenceNumber'), 10)

WebUI.closeBrowser()

