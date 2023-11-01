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



class ResetItem {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	// TC-M-004
	
	@Given("User open The ShoppingList App")
	def openApp2() {
		Mobile.startApplication('D:\\Downloads\\mobile-app\\app-debug.apk', true)
	}

	@When("User tap add icon on Homepage")
	def addIcon2() {
		Mobile.tap(findTestObject('Mobile/Add New Item/add_icon'), 0)
	}

	@And("User tap and set (.*) on the Name Field")
	def setNameField(String name) {

		Mobile.tap(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - Name'), 0)

		Mobile.setText(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - Name (1)'), 'Sirloin', 0)
	}

	@And("User tap and set (.*) on the Quantity Field")
	def setQuantityField(String quantity) {

		Mobile.tap(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - 1, Quantity'), 0)

		Mobile.setText(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - 1, Quantity (1)'), '5', 0)
	}

	@Then("User click reset item button and all field was blank")
	def clickAdd() {

		Mobile.tap(findTestObject('Object Repository/Mobile/Reset Form/android.widget.Button (1)'), 0)

		Mobile.verifyElementVisible(findTestObject('Mobile/Reset Form/android.widget.EditText - 1, Quantity'), 0)

		Mobile.closeApplication()
	}
}