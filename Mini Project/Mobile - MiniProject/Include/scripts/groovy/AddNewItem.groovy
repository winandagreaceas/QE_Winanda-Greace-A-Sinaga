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



class AddNewItem {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User open ShoppingList App")
	def openApp1() {
		Mobile.startApplication('D:\\Downloads\\mobile-app\\app-debug.apk', true)
	}

	@When("User tap add icon")
	def addIcon1() {
		Mobile.tap(findTestObject('Mobile/Add New Item/add_icon'), 0)
	}

	// TC-M-001
	@And("User tap and set (.*) on Name Field A1")
	def setNameField1(String nameA1) {

		Mobile.tap(findTestObject('Mobile/Add New Item/android.widget.EditText - Name'), 0)

		Mobile.setText(findTestObject('Mobile/Add New Item/android.widget.EditText - Name'), 'Orange', 0)
	}

	@And("User tap and set (.*) on Quantity Field A1")
	def setQuantityField1(String quantityA1) {

		Mobile.tap(findTestObject('Mobile/Add New Item/android.widget.EditText - 1, Quantity'), 0)

		Mobile.setText(findTestObject('Mobile/Add New Item/android.widget.EditText - 1, Quantity'), '10', 0)
	}

	@And("User tap and select the item type A1")
	def selectTypeA1() {

		Mobile.tap(findTestObject('Object Repository/Mobile/Add New Item/001-Successful Addition of a New Item/android.widget.Button (4)'),0)

		Mobile.tap(findTestObject('Mobile/Add New Item/fruit'), 0)
	}

	@Then("User click add item button and directed to Homepage")
	def clickAddA1() {

		Mobile.tap(findTestObject('Mobile/Add New Item/add-item-button'), 0)

		Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile/Add New Item/001-Successful Addition of a New Item/android.view.View (2)'),0)

		Mobile.closeApplication()
	}

	// TC-M-002
	@And("User tap and set (.*) on Quantity Field A2")
	def setQuantityField2(String quantityA2) {

		Mobile.tap(findTestObject('Object Repository/Mobile/Add New Item/002-Adding an Item with Empty Name Field/android.widget.EditText - 1, Quantity'), 0)

		Mobile.setText(findTestObject('Object Repository/Mobile/Add New Item/002-Adding an Item with Empty Name Field/android.widget.EditText - 1, Quantity (1)'), '10', 0)
	}

	@And("User tap and select the item type A2")
	def selectTypeA2() {

		Mobile.tap(findTestObject('Object Repository/Mobile/Add New Item/002-Adding an Item with Empty Name Field/android.widget.Button (1)'), 0)

		Mobile.tap(findTestObject('Object Repository/Mobile/Add New Item/002-Adding an Item with Empty Name Field/android.view.View'), 0)
	}

	@Then("User click add item and view error message on Name Field")
	def clickAddA2() {

		Mobile.tap(findTestObject('Object Repository/Mobile/Add New Item/002-Adding an Item with Empty Name Field/android.widget.Button (2)'), 0)

		Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile/Add New Item/002-Adding an Item with Empty Name Field/android.widget.EditText - Name'), 0)

		Mobile.closeApplication()
	}


	// TC-M-003
	@And("User tap and set (.*) on Name Field A2")
	def setNameField2(String nameA2) {

		Mobile.tap(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - Name (2)'), 0)

		Mobile.setText(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - Name (3)'), 'Melon', 0)
	}

	@And("User tap and set (.*) on Quantity Field A3")
	def setQuantityField3(String quantityA3) {

		Mobile.tap(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - 1, Quantity (2)'), 0)

		Mobile.setText(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - 1, Quantity (3)'), '0', 0)
	}

	@And("User tap and select the item type A3")
	def selectTypeA3() {

		Mobile.tap(findTestObject('Object Repository/Mobile/Add New Item/002-Adding an Item with Empty Name Field/android.widget.Button (1)'), 0)

		Mobile.tap(findTestObject('Mobile/Add New Item/fruit'), 0)
	}

	@Then("User click add item and view error message on Quantity Field")
	def clickAddA3() {

		Mobile.tap(findTestObject('Object Repository/Mobile/Reset Form/android.widget.Button (5)'), 0)

		Mobile.tap(findTestObject('Object Repository/Mobile/Reset Form/android.widget.EditText - 0, Quantity'), 0)

		Mobile.closeApplication()
	}


}