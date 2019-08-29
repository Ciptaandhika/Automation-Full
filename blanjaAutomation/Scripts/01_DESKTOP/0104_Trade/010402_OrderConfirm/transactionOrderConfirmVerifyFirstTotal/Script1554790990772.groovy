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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.check(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/cbSayaMenyetujuiDataYangSayaMasukkanBenar'))

WebUI.delay(2)

GlobalVariable.idrTotalProdukOrderConfirm = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/Total_Produk'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/LanjutkanPembayaran'))

String subtotal = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblSubTotalAwal'))

String totalamount = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblTotalAmountVoucherBlanja'))

log.logInfo(subtotal)

log.logInfo(totalamount)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/txtBoxMasukkanKodeVoucherCashback'), 
    GlobalVariable.CouponCodeUnique)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/btnGunakan1'), 
    30)

String newSubTotal=WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblSubTotalAfter'))

String newTotalAmount=WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblTotalAmountAfterInputCoupon'))

log.logInfo(newSubTotal)

log.logInfo(newTotalAmount)

if(subtotal==newSubTotal){
	log.logInfo('Sub Total Tidak Berubah Setelah Input Coupon')
}else {
    log.logInfo('Sub Total Berubah Setelah Input Coupon')
}

if(totalamount==newTotalAmount){
	log.logInfo('Total Amount Tidak Berubah Setelah Input Coupon')
	
} else {
   log.logInfo('Total Amount Tidak Berubah Setelah Input Coupon')
}
WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/lblAndamendapatkanpotensi35'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/lblHargaRp65.000'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BCA/New Button/rbBcaVAPostDev'), 
    2)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'), 
    2)

orderURL = WebUI.getUrl()

log.logInfo(orderURL)

if (orderURL.contains('success')) {
    log.logInfo('order berhasil di generate')
} else {
    log.logInfo('order gagal di generate')
}

