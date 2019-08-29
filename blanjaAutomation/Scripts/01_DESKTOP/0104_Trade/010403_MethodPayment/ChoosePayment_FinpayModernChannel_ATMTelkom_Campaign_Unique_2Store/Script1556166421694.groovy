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

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Finpay/rbFinpayATMMenuTelkom'), 30)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Finpay/rbFinpayATMMenuTelkom'))

//Coupon1
WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/CouponVoucher/txtKodeVoucher'), GlobalVariable.CouponCodeUnique)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/CouponVoucher/btnGunakanKodeVoucher'))

WebUI.delay(5)

//Coupon2
WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/CouponVoucher/txtKodeVoucher2'), GlobalVariable.CouponCodeUnique2)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/CouponVoucher/btnGunakanKodeVoucher2'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalHarga'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/lblKoinBlanjaYangDidapatkan'), 30)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))
