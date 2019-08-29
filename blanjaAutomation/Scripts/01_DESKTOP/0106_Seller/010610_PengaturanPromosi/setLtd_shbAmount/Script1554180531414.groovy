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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/lblBatalkanPromoSeller'), 0, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/lblBatalkanPromoSeller'))

    WebUI.acceptAlert()
} else {
}

KeywordLogger log = new KeywordLogger()

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxJudulPromosi'), GlobalVariable.txtBoxPromotionName3)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/startDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/endDate'), 
    'endDate')

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/rbRpDiskon'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxRpDiskon'), GlobalVariable.Diskon)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahkanProduk'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxProductIdLtd'), GlobalVariable.txtBoxProductId5)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnSearchItem'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnSearchItem'), 0)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/cbItem'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxStokPromosiSHB'), GlobalVariable.maxItem)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/txtBoxKuotaPembeliSHB'), GlobalVariable.ratingProduct)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010609_PengaturanPromosi/Page_/btnTambahLtd'))

WebUI.delay(5)

alert = WebUI.getAlertText()

log.logInfo(alert)

WebUI.acceptAlert()

WebUI.verifyTextPresent(GlobalVariable.txtBoxPromotionName3, true)

