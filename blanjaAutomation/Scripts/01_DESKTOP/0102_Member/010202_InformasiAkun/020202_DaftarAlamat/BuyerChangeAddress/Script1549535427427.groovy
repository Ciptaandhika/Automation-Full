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

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/hrefEditBuyerAddress'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaNamaDepanBuyer'), 
    GlobalVariable.namaInputFieldsMandatory)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaNamaBelakangBuyer'), 
    GlobalVariable.namaBelakangInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaAlamatPengirimanBuyer'), 
    GlobalVariable.alamatPengirimanInputFieldsMandatory)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnSimpanBuyer'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/lblAlamatBerhasilDisimpan'), 
    2)

WebUI.delay(2)

