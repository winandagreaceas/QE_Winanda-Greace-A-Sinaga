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

WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')

WebUI.setText(findTestObject('Object Repository/Authentication/Register/Successful Registration/Page_frontend-web/input_Nama Lengkap_input-18'), 
    'Alterra Academy')

WebUI.setText(findTestObject('Object Repository/Authentication/Register/Successful Registration/Page_frontend-web/input_Email_input-21'), 
    'alterraqe@gmail.com')

WebUI.setText(findTestObject('Object Repository/Authentication/Register/Successful Registration/Page_frontend-web/input_Password_input-24'), 
    'alterra')

WebUI.click(findTestObject('Object Repository/Authentication/Register/Successful Registration/Page_frontend-web/button_Register'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Authentication/Register/Successful Registration/Page_frontend-web/div_Login'), 
    0)

WebUI.closeBrowser()

