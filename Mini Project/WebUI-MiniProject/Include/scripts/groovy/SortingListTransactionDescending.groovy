//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.checkpoint.CheckpointFactory
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testcase.TestCaseFactory
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testdata.TestDataFactory
//import com.kms.katalon.core.testobject.ObjectRepository
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//
//import internal.GlobalVariable
//
//import org.openqa.selenium.WebElement
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.By
//
//import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
//import com.kms.katalon.core.webui.driver.DriverFactory
//
//import com.kms.katalon.core.testobject.RequestObject
//import com.kms.katalon.core.testobject.ResponseObject
//import com.kms.katalon.core.testobject.ConditionType
//import com.kms.katalon.core.testobject.TestObjectProperty
//
//import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
//import com.kms.katalon.core.util.KeywordUtil
//
//import com.kms.katalon.core.webui.exception.WebElementNotFoundException
//
//import cucumber.api.java.en.And
//import cucumber.api.java.en.Given
//import cucumber.api.java.en.Then
//import cucumber.api.java.en.When
//
//
//
//class SortingListTransactionDescending {
//	/**
//	 * The step definitions below match with Katalon sample Gherkin steps
//	 */
//	@Given("User navigated to the Login Page TA2")
//	def openLoginPageTA2() {
//		WebUI.openBrowser('')
//		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
//	}
//
//	@When("User fill in (.*) then (.*) Field TA2")
//	def fillInFieldTA2(String emailTA2, String passwordTA2) {
//		
//		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Email_input-18'), emailTA2)
//
//		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Password_input-21'), passwordTA2)
//	}
//	
//	@And("User click the Login Button TA2")
//	def clickLoginButtonTA2() {
//		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/button_Login'))
//	}
//	
//	@When("User click Profile Icon TA2")
//	def clickProfileTA2() {
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Product/Sorting Transaction Asc/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
//	}
//	
//	@And("User click Transaction Menu and refresh the webpage TA2")
//	def clickAndRefreshTA2() {
//		
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Product/Sorting Transaction Desc/Page_frontend-web/div_Transaksi'))
//		
//		WebUI.refresh()
//	}
//	
//	@Then("User click descending icon on Product Name and view that the list changes")
//	def descendingProductName() {
//		
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Product/Sorting Transaction Desc/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174'))
//
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Product/Sorting Transaction Desc/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174_1'))
//
//		WebUI.closeBrowser()
//	}
//	
//	@Then("User click descending icon on Price and view that the list changes")
//	def descendingPrice() {
//		
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Price/Sort Transactions Desc/Page_frontend-web/i_Harga_v-icon notranslate v-data-table-hea_4f5547'))
//
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Price/Sort Transactions Desc/Page_frontend-web/i_Harga_v-icon notranslate v-data-table-hea_4f5547_1'))
//	
//		WebUI.closeBrowser()
//	}
//	
//	@Then("User click descending icon on Amount and view that the list changes")
//	def descendingAmount() {
//		
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Amount/Sort Transactions Desc/Page_frontend-web/i_Banyaknya_v-icon notranslate v-data-table_53cca4'))
//
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Amount/Sort Transactions Desc/Page_frontend-web/i_Banyaknya_v-icon notranslate v-data-table_53cca4_1'))
//
//		WebUI.closeBrowser()
//	}
//	
//	@Then("User click descending icon on Sub-Total and view that the list changes")
//	def descendingSubTotal() {
//		
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Sub-Total/Sort Transactions Desc/Page_frontend-web/i_Sub-total_v-icon notranslate v-data-table_e7a03f'))
//
//		WebUI.click(findTestObject('Object Repository/Transaction/Sorting List Transaction by Sub-Total/Sort Transactions Desc/Page_frontend-web/i_Sub-total_v-icon notranslate v-data-table_e7a03f_1'))
//
//		WebUI.closeBrowser()
//	}
//}