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
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl(GlobalVariable.URLTransPenjualan)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/txtBoxNomorPesanan'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnCari'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnShipBarangSeller'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/ddPilihJasaPengirimanSellerShipping'), 
    GlobalVariable.pilhanJasaLain, GlobalVariable.choices)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnSelectJasaPengirimanLainShipping'))

//CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/li_PilihWahana'), 
  //  30)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/li_PilihWahana'))

WebUI.delay(5)

String mynumber = GlobalVariable.nomorResiPengirimanForSellerWahana

int mylength = mynumber.length()

String submynumber = mynumber.substring(0, mylength - 8)

mydate = new Date()

formattedDate = mydate.format('dd MM ')

datehour = mydate.format('HHmm')

String jne_newcharacter = (submynumber + formattedDate) + datehour

String newresi = jne_newcharacter.replaceAll('\\s+', '')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/txtboxResiInvoiceNumber'), 
    newresi)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnSimpanResiPengiriman'))

WebUI.delay(6)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/lblKonfirmasiShipping'), 0)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnOKSellerPage'))

