import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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

//not_run: WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))
//
//not_run: WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/txtNamaProduk'), 
//    GlobalVariable.nameKopiBubuk2)
//
//not_run: WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/btnCari'))
//
//not_run: WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/Refund/aRefund'))
//
//not_run: WebUI.switchToWindowIndex(1)
//
//not_run: WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/Refund/rbRefundPengiriman'))
//
//not_run: WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/Refund/ddAlasanRefund'), 
//    2)
//
//not_run: WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/Refund/txtAlasanRefund'), 
//    GlobalVariable.textAlasanRefund)
//
//not_run: WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/Refund/btnSubmit'))
//
//not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/Refund/popupBerhasilRefund'), 
//    0)
//
//not_run: WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/Refund/btnKonfirmasiRefund'))
//
WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/txtNamaProduk'), GlobalVariable.nameKopiBubuk2)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/btnCari'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/aAjukanPermohonanPost-Sale'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/rbRefundPengembalian'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/ddAlasan'), 
    1)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/txtDeskripsi'), 
    GlobalVariable.textAlasanRefund)

WebUI.delay(2)
WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Submit'))

WebUI.click(findTestObject('Object Repository/Konfrimasi'))
	
//WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/ddBank'), 
//    1)
//
//WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/txtCabang'), 
//    GlobalVariable.storeLocation)
//
//WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/txtNamaAkun'), 
//    GlobalVariable.namaDepanInputFieldMandatoryBuyer)
//
//WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/txtNoRek'), 
//    GlobalVariable.noHpTelkomsel)
//
//WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/ddBank'), 
//    0)
//
//WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Refund dan Pengembalian/btnSubmit'))

