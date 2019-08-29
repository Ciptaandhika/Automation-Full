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

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxKategori'), 
    GlobalVariable.kategoriPO)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/btnCariKategori'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/rbMakananMentah'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/btnLanjutkan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/rbNew'))

not_run: WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/ddNoBrand'), 
    'No Brand', true)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxPanjang'), 
    GlobalVariable.PoLebar)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxLebar'), 
    GlobalVariable.PoLebar)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxTinggi'), 
    GlobalVariable.PoLebar)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxBerat'), 
    GlobalVariable.PoBerat)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxNamaProduk'), 
    GlobalVariable.PoNamaProduk)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txBoxLabel'), 
    GlobalVariable.PoLabelHarga)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxHargaJual'), 
    GlobalVariable.PoHargaJual)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxStok'), 
    GlobalVariable.StokPromosi)

String Projectpath = System.getProperty('user.dir')

String Filepath1 = Projectpath + GlobalVariable.filePromo280

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/Page_/uploadImage'), 
    Filepath1)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtAreaDeskripsiProduk'), 
    GlobalVariable.PoDeskripsiProduk)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/ddLokasi1'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/ddLokasi2'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/rbYa'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/Page_/ddPeriode1null'))

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/datePeriodeDari'), 
    GlobalVariable.startDate)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/datePeriodeSampai'), 
    GlobalVariable.endDate)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/dateWaktuPengiriman'), 
    GlobalVariable.endDate)

WebUI.delay(5)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/txtBoxBatasBeli'), 
    GlobalVariable.batasBeli)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/TambahProdukBaru/btnSimpanProdukBaru'))

