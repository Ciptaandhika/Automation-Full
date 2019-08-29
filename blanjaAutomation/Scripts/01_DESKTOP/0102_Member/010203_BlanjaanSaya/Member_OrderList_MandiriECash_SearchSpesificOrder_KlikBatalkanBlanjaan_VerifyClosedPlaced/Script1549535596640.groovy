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

WebUI.navigateToUrl(GlobalVariable.urlMemberOrderListBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtboxNomorOrder'), GlobalVariable.PlacedOrderNumberForPaymentInstallment_1)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnCari'))

//WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/verifyPembayaran'))
WebUI.verifyTextPresent('Pembayaran :Mandiri E-Cash', false)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020304_BatalkanBlanjaan/hrefBatalkanBlanjaan'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtBoxAlasanPembatalan'), 'Reason_A', 
    false)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020304_BatalkanBlanjaan/btnOkBatalkanBlanjaan'))

WebUI.verifyElementText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020304_BatalkanBlanjaan/div_StatusBlanjaanTutup'), 
    'Tutup')

WebUI.clearText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtboxNomorOrder'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtboxNomorOrder'), GlobalVariable.PlacedOrderNumberForPaymentInstallment_2)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnCari'))

WebUI.verifyElementText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/labelTelahDitempatkan'), 
    'Telah ditempatkan')

