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

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/lblProfil'))

WebUI.scrollToElement(findTestObject('02_MOBILE/0202_Member/020208_Alamat/hrefAlamat'), 6)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/hrefAlamat'))

WebUI.delay(6)

WebUI.refresh()

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/btnTambahkanAlamat'))

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/txtAreaNamaDepan'), GlobalVariable.namaDepanInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/txtAreaNamaBelakang'), GlobalVariable.namaBelakangInputFieldMandatoryBuyer)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/txtAreaAlamatPengiriman'), GlobalVariable.alamatPengirimanInputFieldsMandatory)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0202_Member/020208_Alamat/ddProvinsi'), GlobalVariable.index7)

WebUI.scrollToElement(findTestObject('02_MOBILE/0202_Member/020208_Alamat/ddKota'), 2)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0202_Member/020208_Alamat/ddKota'), GlobalVariable.index11)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0202_Member/020208_Alamat/ddKecamatan'), GlobalVariable.index6)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/txtAreaNomorTelepon'), GlobalVariable.NomorBukanTelkom)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/hrefCariAlamat'))

WebUI.delay(6)

WebUI.setText(findTestObject('02_MOBILE/0202_Member/020208_Alamat/txtAreaCariAlamat'), 'Bandung Kidul')

WebUI.delay(6)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/lblBandung'))

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/lblGunakanLokasi'))

WebUI.delay(6)

WebUI.scrollToElement(findTestObject('02_MOBILE/0202_Member/020208_Alamat/cbJadikanAlamat'), 2)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/cbJadikanAlamat'))

WebUI.click(findTestObject('02_MOBILE/0202_Member/020208_Alamat/btnSimpan'))

