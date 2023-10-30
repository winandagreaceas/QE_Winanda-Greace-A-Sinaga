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

	@Given("User navigated to Register Page")
	def openRegisterPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	}

	@When("User fill in the (.*) and (.*) and (.*) Field")
	def inputFieldForReg1(String fullNameR1, String emailR1, String passwordR1) {

		WebUI.setText(findTestObject('Object Repository/Authentication/Register/Registration with Existing Email/Page_frontend-web/input_Nama Lengkap_input-18'), fullNameR1)

		WebUI.setText(findTestObject('Object Repository/Authentication/Register/Registration with Empty Full Name Field/Page_frontend-web/input_Email_input-21'), emailR1)

		WebUI.setText(findTestObject('Object Repository/Authentication/Register/Registration with Empty Full Name Field/Page_frontend-web/input_Password_input-24'), passwordR1)
	}

	@When("User click Register Button")
	def clickRegisterButton() {
		WebUI.click(findTestObject('Object Repository/Authentication/Register/Successful Registration/Page_frontend-web/button_Register'))
	}

	@Then("User get Error Message")
	def getError() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Authentication/Register/Registration with Existing Email/Page_frontend-web/i_Register_v-icon notranslate v-alert__icon_8dd8aa'),0)
		WebUI.closeBrowser()
	}

	@Then("User get directed to Login Page")
	def directedLogin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Authentication/Register/Successful Registration/Page_frontend-web/div_Login'), 0)
		WebUI.closeBrowser()
	}
}