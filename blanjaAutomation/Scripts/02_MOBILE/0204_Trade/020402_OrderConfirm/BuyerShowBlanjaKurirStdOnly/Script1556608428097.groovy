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

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/hrefTinggalPesanUntukPenjual'), 0)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddJasaPengiriman'), GlobalVariable.index2)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddPilihPengirimanLayanan'), GlobalVariable.index1, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/div_SUBTOTAL'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblBiayaKirimAtOrderConfirm'), 0)

