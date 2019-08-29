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

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPagePerusahaan'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPagePemilikToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageNomorTelepon'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageNamaToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageLogoToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageDeksripsiToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageAlamatToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageProvinsi'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageKabupaten'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageKecamatan'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageKodePos'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageBankName'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageNamaCabang'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageNomorRekening'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageNamaPemilikRekening'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageNamaPerusahaan'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageNPWP'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreConfirmationPageSIUP'), 30)

