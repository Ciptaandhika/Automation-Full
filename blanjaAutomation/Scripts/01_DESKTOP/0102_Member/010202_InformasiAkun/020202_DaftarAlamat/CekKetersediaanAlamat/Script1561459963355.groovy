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

WebUI.navigateToUrl(GlobalVariable.urlBuyerAddressList)

if(WebUI.verifyTextPresent('Belum ada alamat', false, FailureHandling.OPTIONAL)){

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/txtNamaDepan'), 'Test')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/txtNamaBelakang'), 'Blj2')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/txtAlamatPengiriman'), 'Jl. TestBlj No. 02')

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/selectPropinsi'), 
    '14', false)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/selectKota'), 
    '1410', false)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/selectKecamatan'), 
    '141010', false)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/txtKodePos'), '12345')

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/txtNomorTelepon'), '08001123229')

WebUI.check(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/cbJadikanAlamatUtama'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010202_InformasiAkun/020202_DaftarAlamat/btnSimpanAlamat'))

}