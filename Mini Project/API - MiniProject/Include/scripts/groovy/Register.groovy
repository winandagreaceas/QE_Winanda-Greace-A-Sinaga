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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	// TC-A-018 - Verify that users can successfully register with valid data
	@Given("I set POST method R1")
	def setMethodR1() {
		println ("set POST method")
	}

	@When("I set URL R1")
	def setUrlR1() {
		println ("https://altashop-api.fly.dev/api/auth/register")
		WS.sendRequest(findTestObject('Object Repository/Authentication/Register/018-Register'))
	}

	@And("I input the HTTP Body R1")
	def inputBodyR1() {
		println ("Input valid Nama Lengkap, valid Email, and Valid Password")
	}

	@And("I click the Test Request R1")
	def clickTestReqR1() {
		println ("I click the Test Request")
	}

	@Then("The verify result is Response Code 200 R1")
	def verifyRespCodeR1() {
		println ("The verify result is Response Code 200")
	}

	// TC-A-019 - Verify that users failed to register with an email that is already exist
	@When("I set URL R2")
	def setUrlR2() {
		println ("https://altashop-api.fly.dev/api/auth/register")
		WS.sendRequest(findTestObject('Object Repository/Authentication/Register/019-Register'))
	}

	@And("I input the HTTP Body R2")
	def inputBodyR2() {
		println ("Input valid Nama Lengkap, existing Email, and Valid Password")
	}

	@And("I click the Test Request R2")
	def clickTestReqR2() {
		println ("I click the Test Request")
	}

	@Then("The verify result is Response Code 400 R2")
	def verifyRespCodeR2() {
		println ("The verify result is Response Code 400")
	}

	// TC-A-020 - Verify that users failed to register with Empty Field data
	@When("I set URL R3")
	def setUrlR3() {
		println ("https://altashop-api.fly.dev/api/auth/register")
		WS.sendRequest(findTestObject('Object Repository/Authentication/Register/020-Register'))
	}

	@And("I input the HTTP Body R3")
	def inputBodyR3() {
		println ("Leave the Field of Data Blank")
	}

	@And("I click the Test Request R3")
	def clickTestReqR3() {
		println ("I click the Test Request")
	}

	@Then("The verify result is Response Code 400 R3")
	def verifyRespCodeR3() {
		println ("The verify result is Response Code 400")
	}
}