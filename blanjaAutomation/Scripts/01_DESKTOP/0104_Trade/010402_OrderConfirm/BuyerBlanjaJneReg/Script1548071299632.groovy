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

WebUI.waitForPageLoad(3)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJasaPengiriman4'), GlobalVariable.jasaPengirimanJne, 
    GlobalVariable.isTrue)

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJenisJasaPengiriman4'), 0)

WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJenisJasaPengiriman4'))

//not_run: WebUI.delay(2)
//not_run: WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJenisJasaPengirimanDetail'), 
//GlobalVariable.jasaPengirimanJne1, true)
WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJenisJasaPengiriman4'), GlobalVariable.index1, 
    FailureHandling.STOP_ON_FAILURE)

//not_run: WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0103_Product/010301_PDP/B/Page_Konfirmasi Pesanan - BLANJA.co/select_Pilih Jenis PengirimanR'), 
//GlobalVariable.ddIndexValue)
WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnLanjutkanPembayaran3'))

WebUI.delay(4)

