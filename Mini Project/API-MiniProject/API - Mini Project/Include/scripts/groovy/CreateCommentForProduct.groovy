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



class CreateCommentForProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC-A-011 - Verify that users can successfully create a comment or review for a product
	@Given("I set POST method CC1")
	def setMethodCC1() {
		println ("Set POST method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/products/2/comments CC1")
	def setUrlCC1() {
		println ("https://altashop-api.fly.dev/api/products/2/comments")
		response = WS.sendRequest(findTestObject('Object Repository/Products/CreateCommentForProduct/011-CreateCommentForProduct'))
	}

	@And("I input the HTTP Body CC1")
	def inputBodyCC1() {
		println ("Input valid content")
	}

	@And("I click the Test Request CC1")
	def clickTestReqCC1() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 200 CC1")
	def verifyRespCodeCC1() {
		println ("The verify result is Response Code 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC-A-012 - Verify that users failed to create a comment with invalid or empty data
	@Given("I set POST method CC2")
	def setMethodCC2() {
		println ("Set POST method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/products/2/comments CC2")
	def setUrlCC2() {
		println ("https://altashop-api.fly.dev/api/products/2/comments")
		response = WS.sendRequest(findTestObject('Object Repository/Products/CreateCommentForProduct/012-CreateCommentForProduct'))
	}

	@And("I input the HTTP Body CC2")
	def inputBodyCC2() {
		println ("Let the content empty")
	}

	@And("I click the Test Request CC2")
	def clickTestReqCC2() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 400 CC2")
	def verifyRespCodeCC2() {
		println ("The verify result is Response Code 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}