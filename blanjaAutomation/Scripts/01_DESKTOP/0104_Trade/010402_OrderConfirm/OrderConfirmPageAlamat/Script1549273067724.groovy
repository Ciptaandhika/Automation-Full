import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

urlHomepage = WebUI.getUrl()

log.logInfo(urlHomepage.contains('trade.bljstaging.com/transaction/orderConfirm').toString())

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/hrefTambahAlamat'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/lblTambahkanAlamatBaruPopUp'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/txtBoxNamaDepan'), 
    GlobalVariable.namaDepanInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/txtBoxNamaBelakang'), 
    GlobalVariable.namaBelakangInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/txtNomorTelp'), 
    GlobalVariable.nomorHPInputFieldsMandatory)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/ddProvinsi'), 
    GlobalVariable.provinsiInputFieldMandatoryBuyer, GlobalVariable.choices)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/ddKotamadyaKabupaten'), 
    GlobalVariable.kotaInputFieldMandatoryBuyer, GlobalVariable.choices)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/ddKecamatan'), 
    GlobalVariable.kecamatanDKIInputFieldMandatoryBuyer, GlobalVariable.choices)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/txtAreaAlamatPengiriman'), 
    GlobalVariable.alamatPengirimanInputFieldsMandatory)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/cbJadikanAlamatUtama'), 
    5)

WebUI.check(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/cbJadikanAlamatUtama'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/TambahkanAlamatBaruPage/btnSimpanAlamatBaru'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/rbDefaultAddress'), 
    30)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ShoppingChartPage/rbDefaultAddress'), 
    30)

