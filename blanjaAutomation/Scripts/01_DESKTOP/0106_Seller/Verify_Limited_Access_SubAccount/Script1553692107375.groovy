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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnCloseTemanBlanja'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Tambahkan Produk'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Produk Dijual'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Akun Saya'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Alamat Pengiriman'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Info Toko'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Dekorasi Toko'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Kelola Akun Tambahan'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Kelola Jasa Pengiriman'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Kelola Kategori'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Kelola Pengembalian Dana'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Kelola Setelah Pembelian'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Kelola testimoni pembeli'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Keluarkan Produk'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Liburkan Toko'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Masukkan Produk'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Pengaturan Promosi'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Penyimpanan Gambar'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Pesan Pembeli'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Produk Tersimpan'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/a_Transaksi Penjualan'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/lbl_Akun Saya'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/lblKelola Pemasaran'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/lblKelola Pemesanan'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/lblKelola Pengiriman'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/lblKelola Pesan'), 
    30)

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0106_Seller/Akses_Seller/Page_Toko WARUNGKITA - BLANJA.com/lblLayanan Pelanggan'), 
    30)

