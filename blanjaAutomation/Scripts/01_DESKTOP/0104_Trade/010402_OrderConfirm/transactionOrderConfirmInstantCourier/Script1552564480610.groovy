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

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010513_LogisticsManagement/01051304_InstantCourier/lblProdukDipesan'), 
    2)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddJasaPengiriman'), GlobalVariable.jasaPengirimanGOSEND, 
    true)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddJenisPengirimanInstantCourier'), GlobalVariable.jenisPengirimanInstant, 
    GlobalVariable.isTrue)

WebUI.delay(3)

idrTotalProdukOrderConfirm = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/Total_Produk'))

idrBiayaPengiriamanOrderConfirm = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/Biaya_Pengiriman'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/LanjutkanPembayaran'))

