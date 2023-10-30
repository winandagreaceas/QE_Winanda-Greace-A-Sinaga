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



class GetCategoryByID {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC-A-016 - Verify that users can successfully get category with valid ID
	@Given("I set GET method CID1")
	def setMethodCID1() {
		println ("Set GET method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/categories/29722 CID1")
	def setUrlCID1() {
		println ("https://altashop-api.fly.dev/api/categories/29722")
		response = WS.sendRequest(findTestObject('Object Repository/Product Categories/GetCategoryByID/016-GetCategoryByID'))
	}

	@And("I click the Test Request CID1")
	def clickTestReqCID1() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 200 CID1")
	def verifyRespCodeCID1() {
		println ("The verify result is Response Code 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC-A-017 - Verify that users failed to get category because invalid ID
	@Given("I set GET method CID2")
	def setMethodCID2() {
		println ("Set GET method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/categories/1 CID2")
	def setUrlCID2() {
		println ("https://altashop-api.fly.dev/api/categories/1")
		response = WS.sendRequest(findTestObject('Object Repository/Product Categories/GetCategoryByID/016-GetCategoryByID'))
	}

	@And("I click the Test Request CID2")
	def clickTestReqCID2() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 404 CID2")
	def verifyRespCodeCID2() {
		println ("The verify result is Response Code 404")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


}