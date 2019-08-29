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

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/btnTambahAlamat'))

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/ddAlamatPengirimanSaya'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/txtNamaDepan'), GlobalVariable.ddValueTelkomsel)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/txtNamaBelakang'), GlobalVariable.ddValueAS)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/txtAlamatPengiriman'), GlobalVariable.kecamatanGrogol)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/ddProvinsi'), 
    7)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/ddKota'), 23)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/ddKecamatan'), 
    1)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/txtKodePos'), GlobalVariable.inputPostalCode6Karakter)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/txtNoTelepon'), GlobalVariable.noHpTelkomsel)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/rbJadikanAlamatUtama'))

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/Instant Courier - Buyer -MWeb/btnSimpan'))

