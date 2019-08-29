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

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxJudulPromosi'), 
    GlobalVariable.JudulPromosi)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxStartDate'), 
    'startDate')

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxStartHour'), 
    GlobalVariable.StartHour)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxEndDate'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxEndHour'), 
    GlobalVariable.EndHour)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/cbDiskon'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxDiskon'), 
    GlobalVariable.Diskon)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/btnTambahProduk'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/cbProduk'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxStokPromosi'), 
    GlobalVariable.StokPromosi)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/txtBoxKuotaPembelian'), 
    GlobalVariable.KuotaPembelian)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/Page_/btnTambah'))

