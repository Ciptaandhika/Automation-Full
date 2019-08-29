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

not_run: GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/hrefGetNoOrder'))

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/txtBoxMasukkanKodeVoucherCashback'), 
    GlobalVariable.txtBlanjaCoupons_CouponName20k)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/VoucherCashback/btnGunakan'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKredit/rbOthersKartuKredit'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKredit/ddPilihNamaPromosiFromCreditCard'), 
    GlobalVariable.index1)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKredit/btnOKPaymentDiskonBlanja'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKredit/lblDiskonBlanja'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/btnOKchoosePaymentSecond'), FailureHandling.OPTIONAL)

