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

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddPromosiOngkir'), 10)

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddPromosiOngkir'), FailureHandling.STOP_ON_FAILURE)

hargaproduk = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelHargaBarang')).replaceAll("[^0-9]", "")

ongkir = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelBiayaPengiriman')).replaceAll("[^0-9]", "")

WebUI.verifyEqual(ongkir, "0")
	
total = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/labelTotalHarga')).replaceAll("[^0-9]", "")
	
WebUI.verifyEqual(total, hargaproduk)

atb_ongkir = WebUI.getAttribute(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/btnToggleBiayaPengiriman'), 'style')

WebUI.verifyEqual(atb_ongkir, "display: none;")

