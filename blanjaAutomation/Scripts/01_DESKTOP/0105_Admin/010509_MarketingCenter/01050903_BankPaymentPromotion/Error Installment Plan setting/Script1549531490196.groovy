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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/hrefBankPaymentPromotion'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnAddPromotion'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddPayment_Type2'), 
    GlobalVariable.ddValueBankPaymentPromotion_PaymentType2, GlobalVariable.isTrue)

WebUI.verifyOptionSelectedByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddPayment_Type2'), 
    GlobalVariable.ddValueBankPaymentPromotion_PaymentType2, GlobalVariable.isTrue, 30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtInstallmentPlan'), 
    GlobalVariable.txtBankPaymentPromotion_InstallmentPlan)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtInstallmentPlan'), 
    30)

WebUI.verifyElementNotChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/rbNo'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnAdd'))

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnAdd'))

WebUI.verifyElementText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/lblPleaseInputInstallment'), 
    'please input installment month or choose is 0 % Installment')

