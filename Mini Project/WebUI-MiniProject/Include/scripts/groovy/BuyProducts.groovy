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



class BuyProducts {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigated to the Login Page B1")
	def openLoginPageB1() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User fill in (.*) then (.*) Field B1")
	def fillInFieldV1(String emailB1, String passwordB1) {
		
		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Email_input-18'), emailB1)

		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Password_input-21'), passwordB1)
	}
	
	@And("User click the Login Button B1")
	def clickLoginButtonB1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/button_Login'))
	}
	
	@When("User click Beli Button on the product B1")
	def clickBeliButtonB1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Buy Products/Adding Single Item to Cart/Page_frontend-web/button_Beli'))
	}
	
	@Then("User successfully Add a Product to Cart B1")
	def productOnCartB1() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Buy Products/Adding Single Item to Cart/Page_frontend-web/span_1'), 0)
		WebUI.closeBrowser()
	}
	
	@And("User click Beli Button on the product B2")
	def clickBeliButtonB2() {
		WebUI.click(findTestObject('Object Repository/Homepage/Buy Products/Adding Multiple Items to Cart/Page_frontend-web/button_Beli'))
	}
	
	@And("User click Beli Button on the product B3")
	def clickBeliButtonB3() {
		WebUI.click(findTestObject('Object Repository/Homepage/Buy Products/Adding Multiple Items to Cart/Page_frontend-web/button_Beli'))
	}
	
	@Then("User successfully Add a Product to Cart B2")
	def productOnCartB2() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Buy Products/Adding Multiple Items to Cart/Page_frontend-web/span_3'), 0)
		WebUI.closeBrowser()
	}

}