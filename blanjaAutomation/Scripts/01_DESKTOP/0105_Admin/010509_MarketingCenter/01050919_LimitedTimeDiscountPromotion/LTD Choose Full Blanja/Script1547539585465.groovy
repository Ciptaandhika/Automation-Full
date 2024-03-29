import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.selectOptionByValue(findTestObject('Page_/select_-- Please Select Progra'), GlobalVariable.ddProgramName, true)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Page_/div_Promotion Name'))

WebUI.setText(findTestObject('Page_/input_Promotion Name_promotion'), 'Promo 5')

WebUI.click(findTestObject('Page_/span_Next'))

WebUI.click(findTestObject('Page_/a_1'))

WebUI.click(findTestObject('Page_/a_28'))

WebUI.setText(findTestObject('Page_/input_Store ID_storeId'), '100821')

WebUI.setText(findTestObject('Page_/input_Product ID_productId'), '13338645')

WebUI.click(findTestObject('Page_/input_Product ID_searchBtn'))

WebUI.selectOptionByValue(findTestObject('Page_/select_-- please select covera'), '1', true)

