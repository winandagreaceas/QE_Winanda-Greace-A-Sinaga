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



class CreateANewProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC-A-004 - Verify that users can successfully create a new product with valid data
	@Given("I set POST method CP1")
	def setMethodCP1() {
		println ("Set POST method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/products CP1")
	def setUrlCP1() {
		println ("https://altashop-api.fly.dev/api/products")
		response = WS.sendRequest(findTestObject('Products/CreateANewProduct/004-CreateANewProduct'))
	}

	@And("I input the HTTP Body CP1")
	def inputBodyCP1() {
		println ("Input valid data of product")
	}

	@And("I click the Test Request CP1")
	def clickTestReqCP1() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 200 CP1")
	def verifyRespCodeCP1() {
		println ("The verify result is Response Code 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC-A-005 - Verify that users can failed create a new product with missing data
	@Given("I set POST method CP2")
	def setMethodCP2() {
		println ("Set POST method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/products CP2")
	def setUrlCP2() {
		println ("https://altashop-api.fly.dev/api/products")
		response = WS.sendRequest(findTestObject('Products/CreateANewProduct/005-CreateANewProduct'))
	}

	@And("I input the HTTP Body CP2")
	def inputBodyCP2() {
		println ("Input valid Email and Password")
	}

	@And("I click the Test Request CP2")
	def clickTestReqCP2() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 500 CP2")
	def verifyRespCodeCP2() {
		println ("The verify result is Response Code 500")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
}