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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/hrefKelolaPengembalianDana'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/txtAreaNomorPesananPengembalianDana'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.delay(4)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnCariPengembalianDana'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/a_ButuhKonfirmasiPenjual'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/SCHEDULER/btnSetuju'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/txtBoxPasswordDompetBlanja'), 
    GlobalVariable.PasswordDompetBlanja)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010605_LayananPelanggan/01060501_KelolaPengembalianDana/SCHEDULER/Pengembalian Dana/btnKonfirmasi'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.verifyTextPresent('Pengembalian Dana Berhasil', false)

