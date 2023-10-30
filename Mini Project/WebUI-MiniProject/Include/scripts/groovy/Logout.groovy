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



class Logout {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User navigated to the Login Page")
	def openLoginPage2() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User fill in Field (.*) and (.*)")
	def fillInField(String email, String password) {

		WebUI.setText(findTestObject('Object Repository/Authentication/Logout/Successful Logout/Page_frontend-web/input_Email_input-18'), email)

		WebUI.setText(findTestObject('Object Repository/Authentication/Logout/Successful Logout/Page_frontend-web/input_Password_input-21'), password)
	}

	@And("User click the Login Button")
	def clickLoginButton2() {
		WebUI.click(findTestObject('Object Repository/Authentication/Logout/Successful Logout/Page_frontend-web/button_Login'))
	}

	@When("User click Profile Icon")
	def clickProfile1() {
		WebUI.click(findTestObject('Object Repository/Authentication/Logout/Successful Logout/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
	}

	@And("User click Logout")
	def clickLogout() {
		WebUI.click(findTestObject('Object Repository/Authentication/Logout/Successful Logout/Page_frontend-web/div_Logout'))
	}

	@Then("User successfully Logout and directed to Login Page")
	def directedLoginPage2() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Authentication/Logout/Successful Logout/Page_frontend-web/div_Login'), 0)
		WebUI.closeBrowser()
	}
}