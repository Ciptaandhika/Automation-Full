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

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/txtBoxMasukkanKodeVoucherCashback'), 
    GlobalVariable.CouponCodeUnique)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/btn_Gunakan'), 
    60)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/sliderCashback'), 0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/sliderCashback'))

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/txtBoxCashback'), GlobalVariable.value100)

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/cbVADompetBlanja'), 
    60)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/txtboxAccountVA'), GlobalVariable.value100)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/txtboxAccountVA'), 60)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/txtboxPasswordVA'), GlobalVariable.PasswordDompetBlanja)

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/rbNewMandiriCC'), 
    60)

totalAmount = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment'))

newTotalAmount = totalAmount.replaceAll('[^0-9]', '')

GlobalVariable.getTotalAmount = newTotalAmount

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'), 
    2)

