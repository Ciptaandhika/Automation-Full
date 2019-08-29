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

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/ddVendorPayment'), 
    GlobalVariable.ddVendorPaymentSearch, true)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/ddGroupBinBank'), 
    GlobalVariable.ddGroupBinBank, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/ddBankName'), 
    GlobalVariable.ddBankName, true)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/rbYes'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/txtBoxInstallmentPlan'), 
    GlobalVariable.txtBoxInstallmentPlan)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/rbCoveredBy'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/txtBoxMDRCharge'), 
    GlobalVariable.txtBoxMDRCharge)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/txtBoxThreshold'), 
    GlobalVariable.txtBoxThreshold)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/btnSubmit'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050915_InstallmentSettings/btnOke'))

