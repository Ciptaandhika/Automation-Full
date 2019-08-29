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

WebUI.navigateToUrl(GlobalVariable.urlPaymentMethodSetting)

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/txtBoxCampaignName'), 
    GlobalVariable.campaignNameBase)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/txtBoxPeriodStartDate'), 
    GlobalVariable.startDate)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/txtBoxPeriodEndDate'), 
    GlobalVariable.endDate)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/btnAddProducts'))

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/txtBoxStoreId'), 
    GlobalVariable.storeId)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/txtBoxProductId'), 
    GlobalVariable.productId)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/btnSearch'))

WebUI.check(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/cbSelect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/hrefSelect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050910_PaymentMethodSetting/btnSave'))

