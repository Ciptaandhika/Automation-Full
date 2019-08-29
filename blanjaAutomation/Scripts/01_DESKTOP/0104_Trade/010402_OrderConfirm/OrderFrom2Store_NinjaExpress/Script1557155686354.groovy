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

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddJasaPengiriman'), 'Ninja Xpress', 
    false)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/select_Pilih Jenis PengirimanR'), 
    GlobalVariable.index1)

WebUI.delay(5)

not_run: WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddPromosiOngkir'), GlobalVariable.index0)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddJasaPengirimanB'), 'Ninja Xpress', 
    false)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/ddJenisPengirimanB'), GlobalVariable.index1)

WebUI.delay(5)

WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/spanBiayaPengirimanA'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Page_/spanBiayaPengirimanB'), FailureHandling.STOP_ON_FAILURE)

