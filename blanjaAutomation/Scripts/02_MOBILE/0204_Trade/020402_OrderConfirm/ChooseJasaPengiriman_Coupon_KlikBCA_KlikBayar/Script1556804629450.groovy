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

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
    false)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/btnKodeVoucherDiv'))

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/txtBoxKodeVoucher'), GlobalVariable.CouponCodeCustomDynamic)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/btnGunakanKodeVoucher'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/BCAVirtualAccount/dropDownBankBCA'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/KlikBCA/rbKlikBCA'))

WebUI.delay(5)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/KlikBCA/textBoxKlikBCA'), GlobalVariable.KlikBCAUserID)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

url = WebUI.getUrl()

url.contains('https://m.bljstaging.com/trade/klikbcaPay')

