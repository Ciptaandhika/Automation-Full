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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.delay(7)

KeywordLogger log = new KeywordLogger()

importWeight = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxWeightNewVersion'), 
    'value')

importTitle = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxNamaProductNewVersion'), 
    'value')

importPrice = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxPriceNewVersion'), 
    'value')

importDescription = WebUI.getText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtAreaTinyMCENewVersionBilly'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/imgMainPhotoAsusROG'), 
    30)

log.logInfo('Nama Barang sebelum di edit :' + importTitle)

log.logInfo('Berat sebelum di edit :' + importWeight)

log.logInfo('Harga sebelum di edit :' + importPrice)

log.logInfo('Deskripsi sebelum di edit :' + importDescription)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxWeightNewVersion'), 
    GlobalVariable.value100)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxNamaProductNewVersion'), 
    GlobalVariable.nameKopiBubuk)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxPriceNewVersion'), 
    GlobalVariable.editNominal20k)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtAreaTinyMCENewVersionBilly'), 
    GlobalVariable.addProductDescription)

editWeight = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxWeightNewVersion'), 
    'value')

editTitle = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxNamaProductNewVersion'), 
    'value')

editPrice = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxPriceNewVersion'), 
    'value')

editDescription = WebUI.getText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtAreaTinyMCENewVersionBilly'))

if(WebUI.verifyNotEqual(importWeight, editWeight)){
	log.logInfo('Berat setelah di edit :' + editWeight)
}

if(WebUI.verifyNotEqual(importTitle, editTitle)){
	log.logInfo('Nama setelah di edit :' + editTitle)
}

if(WebUI.verifyNotEqual(importPrice, editPrice)){
	log.logInfo('Nama setelah di edit :' + editPrice)
}

if(WebUI.verifyNotEqual(importDescription, editPrice)){
	log.logInfo('Nama setelah di edit :' + editDescription)
}









