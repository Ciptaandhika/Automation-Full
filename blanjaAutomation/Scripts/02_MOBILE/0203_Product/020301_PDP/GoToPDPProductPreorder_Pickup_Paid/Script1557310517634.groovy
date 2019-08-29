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

WebUI.navigateToUrl('https://m.bljstaging.com/katalog/p/hob/buku-berhitung-1234-23343993')

WebUI.delay(2)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnPreOrder'))

WebUI.delay(5)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/input_nama_Nama'), 'vera')

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnPilihAlamatPengambilan'))

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxProvinsi'), 2)

provinsi = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxProvinsi'))

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxKota'), 1)

kota = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/txtBoxKota'))

println(provinsi)

println(kota)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/lblPickUpLocation'))

pickUpLocation = WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/lblDisplayPickUpLocation'))

println(pickUpLocation)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/i_Ganti Alamat Pengambilan Bar'))

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/label_Jasa Pengiriman'), 2)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/select_PilihJasaPengiriman'), 'Kurir Standar', 
    true)

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/BCAVirtualAccount/lbl_BCA'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/BCAVirtualAccount/rbBCAVirtualAccount'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'))

