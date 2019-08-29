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

WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginSeller(Seller01)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/hrefTransaksiPenjualan'), 0)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/hrefKelolaPengembalianDana'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/hrefMembutuhkanKonfirmasiPenjual'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/SCHEDULER/btnTolak'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/SCHEDULER/txtAlasanKonfirmasi'), 
    GlobalVariable.textAlasanRefund)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/SCHEDULER/btnKonfirmasi'))

WebUI.verifyTextPresent('Penjual menolak pengajuan pengembalian dana, butuh konfirmasi pembeli', false)

