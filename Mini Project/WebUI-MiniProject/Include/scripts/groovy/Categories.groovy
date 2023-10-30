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


class Categories {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigated to the Login Page C1")
	def openLoginPageC1() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User fill in (.*) then (.*) Field C1")
	def fillInFieldC1(String emailC1, String passwordC1) {
		
		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Email_input-18'), emailC1)

		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Password_input-21'), passwordC1)
	}
	
	@And("User click the Login Button C1")
	def clickLoginButtonC1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/button_Login'))
	}
	
	@When("User click dropdown to Select Categories on Homepage C1")
	def clickDropdownC1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-caret-_c5af76'))
	}
	
	@And("User click on the categories C1")
	def clickCategoriesC1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/div_gaming'))
	}

	@Then("User successfully directed to Categories Page C1")
	def categoriesPage() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/div_Products is empty'))
		WebUI.closeBrowser()
	}

	@When("User click close icon when successfully directed to Categories Page C2")
	def clickClose() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Navigation/Page_frontend-web/button_gaming_v-icon notranslate v-icon--li_c78751'))
	}
	
	@Then("User successfully directed to Homepage C2")
	def directedCategoriesC2() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/Categories/Category Navigation/Page_frontend-web/div_Sony PS5  play has no limits  5  Rp 299_6ab02c'),0)
		WebUI.closeBrowser()
	}
}