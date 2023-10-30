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



class GetProductByID {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC-A-002 - Verify that users can successfully retrieve product details with valid ID

	@Given("I set GET method ID1")
	def setMethodID1() {
		println ("set GET method")
	}

	@When("I set URL ID1")
	def setUrlID1() {
		println ("Check and go to https://altashop-api.fly.dev/api/products/85533")
		WS.sendRequest(findTestObject('Object Repository/Products/GetProductByID/002-GetProductByID'))
	}

	@And("I click the Test Request ID1")
	def clickTestReqID1() {
		println ("click the Test Request")
	}

	@Then("The verify result is Response Code 200 ID1")
	def verifyRespCodeID1() {
		println ("The verify result is Response Code 200")
	}

	// TC-A-003 - Verify that users failed retrieve product details with invalid ID
	@When("I set URL ID2")
	def setUrlID2() {
		println ("Check and go to https://altashop-api.fly.dev/api/products/1000")
		WS.sendRequest(findTestObject('Object Repository/Products/GetProductByID/003-GetProductByID'))
	}

	@And("I click the Test Request ID2")
	def clickTestReqID2() {
		println ("click the Test Request")
	}

	@Then("The verify result is Response Code 404 ID2")
	def verifyRespCodeID2() {
		println ("The verify result is Response Code 404")
	}
}