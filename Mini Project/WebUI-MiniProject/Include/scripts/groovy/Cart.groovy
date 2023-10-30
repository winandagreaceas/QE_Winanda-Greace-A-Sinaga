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



class Cart {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigated to the Login Page Cr1")
	def openLoginPageCr1() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User fill in (.*) then (.*) Field Cr1")
	def fillInFieldV1(String emailCr1, String passwordCr1) {
		
		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Email_input-18'), emailCr1)

		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Password_input-21'), passwordCr1)
	}
	
	@And("User click the Login Button Cr1")
	def clickLoginButtonCr1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/button_Login'))
	}
	
	@When("User click Beli Button on the product Cr1")
	def clickBeliButtonCr1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Buy Products/Adding Single Item to Cart/Page_frontend-web/button_Beli'))
	}
	
	@And("User click Cart Icon")
	def clickCart() {
		WebUI.click(findTestObject('Object Repository/Cart/Add Quantity of Products/Successful Addition of Quantity/Page_frontend-web/button_2'))
	}
	
	@And ("User click Add Icon to Add Quantity of Product")
	def clickAdd() {
		WebUI.click(findTestObject('Object Repository/Cart/Add Quantity of Products/Successful Addition of Quantity/Page_frontend-web/button_'))
	}
	
	@Then("User can view quantity of the product changes")
	def viewQuantityProduct() {
		WebUI.click(findTestObject('Object Repository/Cart/Add Quantity of Products/Successful Addition of Quantity/Page_frontend-web/span_2'))
		WebUI.closeBrowser()
	}
	
	@And("User click Reduce Icon to Add Quantity of Product")
	def clickReduce() {
		WebUI.click(findTestObject('Object Repository/Cart/Reduce Quantity of Products/Successful Reduction of Quantity/Page_frontend-web/button_-'))
	}
	
	@Then("User can view the quantity of product changes")
	def viewQuantityProd() {
		WebUI.click(findTestObject('Object Repository/Cart/Reduce Quantity of Products/Successful Reduction of Quantity/Page_frontend-web/div_Order is empty'))
		WebUI.closeBrowser()
	}
	
	@And("User click Bayar Button")
	def clickBayar() {
		WebUI.click(findTestObject('Object Repository/Cart/Pay/Proceeding to Checkout/Page_frontend-web/button_Bayar'))
	}
	
	@Then("User successfully pay and directed to Transaction Page")
	def directedTrancastionPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Cart/Pay/Proceeding to Checkout/Page_frontend-web/h1_Transactions'), 0)
		WebUI.closeBrowser()
	}
}