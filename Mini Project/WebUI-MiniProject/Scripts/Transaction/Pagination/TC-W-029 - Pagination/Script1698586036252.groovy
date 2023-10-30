import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/')

WebUI.click(findTestObject('Object Repository/Transaction/Pagination/Pagination Controls/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))

WebUI.setText(findTestObject('Object Repository/Transaction/Pagination/Pagination Controls/Page_frontend-web/input_Email_input-4408'), 
    'winandasinaga22@gmail.com')

WebUI.setText(findTestObject('Object Repository/Transaction/Pagination/Pagination Controls/Page_frontend-web/input_Password_input-4411'), 
    'indomie')

WebUI.click(findTestObject('Object Repository/Transaction/Pagination/Pagination Controls/Page_frontend-web/button_Login'))

WebUI.click(findTestObject('Object Repository/Transaction/Pagination/Pagination Controls/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))

WebUI.click(findTestObject('Object Repository/Transaction/Pagination/Pagination Controls/Page_frontend-web/div_Transaksi'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Transaction/Pagination/Pagination Controls/Page_frontend-web/i_Rows per page_v-icon notranslate fas fa-c_8437b0'))

WebUI.closeBrowser()

