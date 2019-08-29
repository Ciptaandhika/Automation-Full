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

WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyerTest13'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/BuyerEntertoBuyerMainsite'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/BuyerUpdateAllFieldAddress'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaNamaDepanBuyer'), 
    GlobalVariable.namaDepanInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaNamaBelakangBuyer'), 
    GlobalVariable.namaBelakangInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaAlamatPengirimanBuyer'), 
    GlobalVariable.alamatPengirimanInputFieldMandatoryBuyer)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/ddProvinsiBuyer'), 
    GlobalVariable.provinsiBuyer, GlobalVariable.choices)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/ddKotaBuyer'), 
    GlobalVariable.kotaBuyer, GlobalVariable.choices)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/ddKecamatan'), 
    GlobalVariable.kecamatanDKIBuyer, GlobalVariable.choices)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaKodePos'), 
    GlobalVariable.kodePosBuyer14)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaNomorTeleponBuyer'), 
    GlobalVariable.noTelpBuyer)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/hrefUbahLokasi'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/txtAreaChooseLocation'), 
    'Grogol')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnUseLocation'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/Page_/btnSimpanBuyer'))

