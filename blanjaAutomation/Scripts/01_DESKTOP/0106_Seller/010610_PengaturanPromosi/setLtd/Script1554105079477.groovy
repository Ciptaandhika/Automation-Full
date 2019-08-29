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

KeywordLogger log = new KeywordLogger()

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxJudulPromosi'), GlobalVariable.txtBoxPromotionName3)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/startDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/endDate'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxDiskon'), GlobalVariable.discountKopiLTD)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahkanProduk'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/cbBabyBlanket'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxStokPromosiBblanket'), GlobalVariable.maxItem)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxKuotaPembelianBblanket'), GlobalVariable.ratingProduct)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahLtd'))

WebUI.delay(5)

alert = WebUI.getAlertText()

log.logInfo(alert)

WebUI.acceptAlert()

WebUI.verifyTextPresent(GlobalVariable.txtBoxPromotionName3, true)

