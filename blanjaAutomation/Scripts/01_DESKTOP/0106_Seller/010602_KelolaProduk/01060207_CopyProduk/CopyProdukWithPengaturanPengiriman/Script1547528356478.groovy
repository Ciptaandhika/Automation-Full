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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnXToko'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBerikutKelolaProduk'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBerikutPilihJasa'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnAturJasaSekarang'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/hrefKelolaJasaPengiriman'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/hrefKelolaJasaPengiriman'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnToogleFirst'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnToogleJne'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnTooglePos'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnTiki'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/hrefProdukDijual'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060207_CopyProduk/hrefCopyProd'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060207_CopyProduk/labelDetailPengirimanCopy'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/ddPropinsiLokasiToko'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/ddLokasiKabRembang'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/Page_/comboBoxTikiReguler'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/Page_/rbPembeliBiayaKirim'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/hrefKelolaJasaPengiriman'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/hrefKelolaJasaPengiriman'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnToogleFirst'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnToogleJne'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnTooglePos'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010604_KelolaPengiriman/01060402_KelolaJasaPengiriman/PilihJasaPengiriman/btnTiki'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/hrefProdukDijual'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060207_CopyProduk/hrefCopyProd'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060207_CopyProduk/labelDetailPengirimanCopy'), 
    0)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

