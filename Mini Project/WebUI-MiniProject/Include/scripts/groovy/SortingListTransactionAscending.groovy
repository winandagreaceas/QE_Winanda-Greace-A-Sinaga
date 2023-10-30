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



class SortingListTransactionAscending {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigated to the Login Page TA1")
	def openLoginPageTA1() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User fill in (.*) then (.*) Field TA1")
	def fillInFieldTA1(String emailTA1, String passwordTA1) {
		
		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Email_input-18'), emailTA1)

		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Password_input-21'), passwordTA1)
	}
	
	@And("User click the Login Button TA1")
	def clickLoginButtonTA1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/button_Login'))
	}
	
	@When("User click Profile Icon TA1")
	def clickProfileTA1() {
		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Product/Sorting Transaction Asc/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
	}
	
	@And("User click Transaction Menu and refresh the webpage")
	def clickAndRefresh() {
		
		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Amount/Sort Transactions Asc/Page_frontend-web/div_Transaksi'))
		
		WebUI.refresh()
	}
	
	@Then("User click ascending icon on Product Name and view that the list changes")
	def ascendingProductName() {
		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Product/Sorting Transaction Asc/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174'))
		WebUI.closeBrowser()
	}
	
	@Then("User click ascending icon on Price and view that the list changes")
	def ascendingPrice() {
		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Price/Sort Transactions Asc/Page_frontend-web/i_Harga_v-icon notranslate v-data-table-hea_4f5547'))
		WebUI.closeBrowser()
	}
	
	@Then("User click ascending icon on Amount and view that the list changes")
	def ascendingAmount() {
		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Amount/Sort Transactions Asc/Page_frontend-web/i_Banyaknya_v-icon notranslate v-data-table_53cca4'))
		WebUI.closeBrowser()
	}
	
	@Then("User click ascending icon on Sub-Total and view that the list changes")
	def ascendingSubTotal() {
		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Sub-Total/Sort Transactions Asc/Page_frontend-web/i_Sub-total_v-icon notranslate v-data-table_e7a03f'))
		WebUI.closeBrowser()
	}

}