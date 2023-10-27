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



class CreateNewProductCategory {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC-A-013 - Verify that users can successfully create a product category with valid data.
	@Given("I set GET method CPC1")
	def setMethodCPC1() {
		println ("Set GET method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/categories CPC1")
	def setUrlCPC1() {
		println ("https://altashop-api.fly.dev/api/categories")
		response = WS.sendRequest(findTestObject('Product Categories/CreateNewProductCategory/013-CreateNewProductCategory'))
	}

	@And("I input the HTTP Body CPC1")
	def inputBodyCPC1() {
		println ("Input valid content")
	}

	@And("I click the Test Request CPC1")
	def clickTestReqCPC1() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 200 CPC1")
	def verifyRespCodeCPC1() {
		println ("The verify result is Response Code 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC-A-014 - Verify that users failed to create a product category with missing information.
	@Given("I set GET method CPC2")
	def setMethodCPC2() {
		println ("Set GET method")
	}

	@When("I set URL https://altashop-api.fly.dev/api/categories CPC2")
	def setUrlCPC2() {
		println ("https://altashop-api.fly.dev/api/categories")
		response = WS.sendRequest(findTestObject('Product Categories/GetCategoryByID/014-CreateNewProductCategory'))
	}
	
	@And("I input the HTTP Body CPC2")
	def inputBodyCPC2() {
		println ("Input invalid content")
	}

	@And("I click the Test Request CPC2")
	def clickTestReqCPC2() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 400 CPC2")
	def verifyRespCodeCPC2() {
		println ("The verify result is Response Code 400")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}