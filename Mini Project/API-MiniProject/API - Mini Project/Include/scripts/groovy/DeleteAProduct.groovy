import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class DeleteAProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	// TC-A-006 - Verify that users can successfully create a new product with valid data
	@Given("I set DELETE method DEL1")
	def setMethodDEL1() {
		println ("Set DELETE method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/products/1 DEL1")
	def setUrlDEL1() {
		println ("https://altashop-api.fly.dev/api/products/1")
		response = WS.sendRequest(findTestObject('Products/DeleteAProduct/006-DeleteAProduct'))
	}

	@And("I click the Test Request DEL1")
	def clickTestReqDEL1() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 200 DEL1")
	def verifyRespCodeDEL1() {
		println ("The verify result is Response Code 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	
	// TC-A-007 - Verify that users can successfully create a new product with valid data
	@Given("I set DELETE method DEL2")
	def setMethodDEL2() {
		println ("Set DELETE method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/products/01 DEL2")
	def setUrlDEL2() {
		println ("https://altashop-api.fly.dev/api/products/01")
		response = WS.sendRequest(findTestObject('Products/DeleteAProduct/007-DeleteAProduct'))
	}

	@And("I click the Test Request DEL2")
	def clickTestReqDEL2() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 404 DEL2")
	def verifyRespCodeDEL2() {
		println ("The verify result is Response Code 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}
}