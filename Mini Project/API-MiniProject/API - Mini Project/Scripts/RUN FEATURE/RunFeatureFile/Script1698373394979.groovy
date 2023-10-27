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

CucumberKW.runFeatureFile('Include/features/GetAllProducts.feature')

CucumberKW.runFeatureFile('Include/features/GetProductByID.feature')

CucumberKW.runFeatureFile('Include/features/CreateANewProduct.feature')

CucumberKW.runFeatureFile('Include/features/DeleteAProduct.feature')

CucumberKW.runFeatureFile('Include/features/GetProductRating.feature')

CucumberKW.runFeatureFile('Include/features/AssignARatingForProduct.feature')

CucumberKW.runFeatureFile('Include/features/GetProductComments.feature')

CucumberKW.runFeatureFile('Include/features/CreateCommentForProduct.feature')

CucumberKW.runFeatureFile('Include/features/CreateNewProductCategory.feature')

CucumberKW.runFeatureFile('Include/features/GetAllCategories.feature')

CucumberKW.runFeatureFile('Include/features/GetCategoryByID.feature')

CucumberKW.runFeatureFile('Include/features/Register.feature')

CucumberKW.runFeatureFile('Include/features/Login.feature')

CucumberKW.runFeatureFile('Include/features/UserInfo.feature')

CucumberKW.runFeatureFile('Include/features/Index.feature')