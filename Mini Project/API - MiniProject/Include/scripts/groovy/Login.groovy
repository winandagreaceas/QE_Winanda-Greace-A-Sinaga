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



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC-A-021 - Verify that users can successful login with valid login credentials
	@Given("I set POST method Lg1")
	def setMethodLg1() {
		println ("Set POST method")
	}

	@When("I set URL Lg1")
	def setUrlLg1() {
		println ("https://altashop-api.fly.dev/api/auth/login")
		WS.sendRequest(findTestObject('Object Repository/Authentication/Login/021-Login'))
	}

	@And("I input the HTTP Body Lg1")
	def inputBodyLg1() {
		println ("Input valid Email and Password")
	}

	@And("I click the Test Request Lg1")
	def clickTestReqLg1() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 200 Lg1")
	def verifyRespCodeLg1() {
		println ("The verify result is Response Code 200")
	}

	// TC-A-022 - Verify that users can failed login with invalid password
	@And("I input the HTTP Body Lg2")
	def inputBodyLg2() {
		println ("Input valid Email and invalid Password")
	}

	@And("I click the Test Request Lg2")
	def clickTestReqLg2() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 400 Lg2")
	def verifyRespCodeLg2() {
		println ("The verify result is Response Code 400")
	}

	// TC-A-023 - Verify that users can failed login with an email that is not registered
	@And("I input the HTTP Body Lg3")
	def inputBodyLg3() {
		println ("Input not registered Email and valid Password")
	}

	@And("I click the Test Request Lg3")
	def clickTestReqLg3() {
		println ("Click the Test Request")
	}

	@Then("The verify result is Response Code 400 Lg3")
	def verifyRespCodeLg3() {
		println ("The verify result is Response Code 400")
	}
}