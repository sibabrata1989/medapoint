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

WebUI.callTestCase(findTestCase('Common Test Cases/Login - claim'), [('Password') : findTestData('SmokeTestData').getValue(
            2, 1), ('Username') : findTestData('SmokeTestData').getValue(1, 1), ('Organization') : findTestData('SmokeTestData').getValue(
            3, 1), ('headerTitle') : findTestData('SmokeTestData').getValue(4, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_AdvanceClaim  Home Page/a_Claims'))

WebUI.setText(findTestObject('Object Repository/Page_AdvanceClaim  Command Form/input_Claim _ClaimNumber'), claimNumber)

WebUI.click(findTestObject('Object Repository/Page_AdvanceClaim  Command Form/button_Find'))

WebUI.click(findTestObject('Page_AdvanceClaim  Command Form/linkClaimRecord', [('claim') : claimNumber]))

WebUI.click(findTestObject('Object Repository/Page_AdvanceClaim  Claims/button_Validate  Complete'))

WebUI.click(findTestObject('Object Repository/Page_AdvanceClaim  Claims/button_OK'))

WebUI.setText(findTestObject('Page_AdvanceClaim  Claims/inputPayer'), payer)

WebUI.click(findTestObject('Page_AdvanceClaim  Claims/span_PayerSelection', [('payer') : payer]))

//WebUI.click(findTestObject('Object Repository/Page_AdvanceClaim  Claims/dd_SELF PAY'))
WebUI.click(findTestObject('Object Repository/Page_AdvanceClaim  Claims/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AdvanceClaim  Claims/div_Claim is valid for submission'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_AdvanceClaim  Claims/button_OK'))

WebUI.closeBrowser()

