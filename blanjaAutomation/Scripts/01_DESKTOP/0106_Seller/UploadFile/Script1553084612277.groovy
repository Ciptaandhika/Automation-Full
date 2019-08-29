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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/lblTabPerusahaan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNamaToko'), GlobalVariable.storeOwnerName)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaAlamatTokoNew'), GlobalVariable.storeName)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddProvinceRegisterUKMToko'), GlobalVariable.ddIndexValue)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKotaRegisterUKMToko'), GlobalVariable.ddIndexValue)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKecamatanRegisterUKMToko'), GlobalVariable.ddIndexValue)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/lblNomorRekening'), GlobalVariable.accountBankNumber)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNamaBank'), GlobalVariable.BranchBank)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaCabang'), GlobalVariable.BranchBank)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaPemilikRekening'), GlobalVariable.storeOwnerName)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNamaPerusahaan'), GlobalVariable.storeName)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/txtAreaNPWPPerusahaan'), GlobalVariable.accountBankNumber)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.relativeImage

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/hrefUploadNPWP'), 
    Filepath)

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/btnMulaiBerjualan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/Perusahaan/btnMulaiBerjualan'))

WebUI.delay(5)

WebUI.verifyAlertPresent(5)

