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

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/Instant Courier - Buyer - MWeb/tabToko'), 0)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0203_Product/020301_PDP/Instant Courier - Buyer - MWeb/ddPilihPengiriman'), 
    2)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddPilihLayanan'), 1)

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/Instant Courier - Buyer - MWeb/divMetodePembayaran'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Logistic/imgBNI'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Logistic/labelVirtualAccount'))

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/Instant Courier - Buyer - MWeb/divPegadaianviaFinpay'), 
    0)

WebUI.getText(findTestObject('02_MOBILE/0203_Product/020301_PDP/Instant Courier - Buyer - MWeb/lableTotalKoin'))

