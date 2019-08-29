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
    0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/lblSliderCashback'))

WebUI.delay(2)

GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/hrefGetNoOrder'))

GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')

WebUI.delay(0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_Kartu_Kredit/rbBNIKartuKredit'))

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BNI/BNI_Kartu_Kredit/txtBoxBankPromotion'), 
    GlobalVariable.namaPromoDinamis, false)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/sliderDompetBlanja'), 2)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/sliderDompetBlanja'), 
    0)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/txtBoxDompetBlanjaSaldo'), GlobalVariable.index10k)

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblDompetBlanjaPassword'), GlobalVariable.passwordDompetBlanja)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

