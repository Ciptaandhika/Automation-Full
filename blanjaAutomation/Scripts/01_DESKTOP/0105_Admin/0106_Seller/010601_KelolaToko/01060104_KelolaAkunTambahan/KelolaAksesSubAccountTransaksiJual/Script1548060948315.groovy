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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnXToko'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnXToko'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
}

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btKelolaProd'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btKelolaProd'))
} else {
}

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btnPilihJasa'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btnPilihJasa'))
} else {
}

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btAturJasa'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/btAturJasa'))
} else {
}

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/hrefKelolaAkunTambahan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/hrefAksesSubaccountSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbDeskripsiTokoSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbPenyimpananGambarSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbTambahProdukSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbProdukGudangSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbKelolaLiburSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbKelolaTestimoniPembeliSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbPengaturanPromosiSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbPengaturanAfterPembelianSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbEskporProdukSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbPengaturanPromosiSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbAkunSayaSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/cbJasaPengirimanAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbDekorasiTokoSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbKelolaKategoriProdSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbProdukDijualSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbAlamatPengirimanSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbKelolaPemesananAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbBeritaSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbKelolaReturnBarangUangSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbLaporkanSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbImporProdSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/0106010401_KelolaSubAkunAkses/cbPesanProdSubAkunSetting'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060104_KelolaAkunTambahan/btnSimpanSubAccSetting'))

