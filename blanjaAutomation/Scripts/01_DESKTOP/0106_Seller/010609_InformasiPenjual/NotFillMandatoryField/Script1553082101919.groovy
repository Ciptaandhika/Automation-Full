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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/lblTabPerusahaan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNamaToko'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaAlamatTokoNew'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/lblNomorRekening'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNamaBank'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaCabang'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaPemilikRekening'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNamaPerusahaan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNPWPPerusahaan'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/lblTidakBolehKosong'), 2)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/lblNomorRekening (1)'), 2)

