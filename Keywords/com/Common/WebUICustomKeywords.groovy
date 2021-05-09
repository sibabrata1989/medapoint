package com.Common
import groovy.json.JsonSlurper

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement


public class WebUICustomKeywords {

	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up 
	 * @return true if element present, otherwise false
	 */
	@Keyword
	def isElementPresent(TestObject to, int timeout){
		//Use Katalon built-in function to find elements with time out 1 seconds
		List<WebElement> elements = WebUiBuiltInKeywords.findWebElements(to, timeout)
		return elements.size() > 0
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table 
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * Get all cells of HTML table row
	 * @param row a WebElement instance represent for HTML table row 
	 * @param tagName HTML column tag name, usually is TD/TH
	 * @return All cells inside HTML table row 
	 */
	@Keyword
	def List<WebElement> getHtmlTableColumns(WebElement row, String tagName) {
		List<WebElement> selectedColumns = row.findElements(By.tagName(tagName))
		return selectedColumns
	}

	/**
	 * Method to select value form text type drop down
	 * @param label
	 * @param name
	 * @param value
	 * @return
	 */
	@Keyword
	def selectValueFromInputTypeDropDown(String label, String name, String value){
		WebUI.setText(findTestObject('CommonObjects/drpdwnInputField', [('label') : label,('name'):name]),value)
		WebUI.click(findTestObject('CommonObjects/drpdwnSelectSearchValue',[('fieldId') : name,('value'):value]))
	}

	/***
	 * Method to enter text with help of java script executor
	 */
	@Keyword
	def javaScriptExecutorInputText(String name, String value){
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject('CommonObjects/txtInputField', [('name') : name]),10)
		WebUI.executeJavaScript('arguments[0].value=\''+value+'\'', Arrays.asList(element))
	}

	/**
	 * click on last view action item
	 */
	@Keyword
	def clickOnViewActionForLatestRecord(String name){
		List<WebElement> element = WebUiCommonHelper.findWebElements(findTestObject('CommonObjects/drpdwnViewActionsList', [('name') : name]),10)
		int size = element.size()
		WebUI.click(findTestObject('CommonObjects/drpdwnViewAction',[('name') : name,('index'):size]))
		}
	}