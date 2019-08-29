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

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/lblAlamatPengiriman2'), 
    2)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/hrefAlamatPengiriman'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010607_AkunSaya/lblJumlahAlamat'), 3)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010607_AkunSaya/hrefUbahAlamat'))

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/txtAreaNama'), GlobalVariable.namaInputFieldsMandatory)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/txtAreaAlamatPengiriman'), GlobalVariable.alamatPengirimanInputFieldMandatoryBuyer)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/ddMohonPilihProvinsi'), 
    GlobalVariable.provinsiDKIJakarta, GlobalVariable.choices)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/ddEditKotaSeller'), 
    GlobalVariable.kotaJakBar, GlobalVariable.choices)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/ddEditWilayahSeller'), 
    GlobalVariable.kecamatanGrogol, GlobalVariable.choices)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/txtAreaNomorHandphoneSeller'), 
    GlobalVariable.nomorTeleponInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/txtAreaEditNamaPerusahaanSeller'), 
    GlobalVariable.namaPerusahaanSeller)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/txtAreaCatatan'), GlobalVariable.catatanSeller)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/btnSimpanAlamatSeller'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010601_KelolaToko/01060105_InfoToko/lblAlamatBerhasilDisimpan'), 
    2)

