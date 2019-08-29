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

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/select_PilihJasaPengiriman'), 'Kurir Standar', 
    true)

WebUI.focus(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnExpandKodeVoucher'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnExpandKodeVoucher'), 
    60)

GlobalVariable.getProductID = 'KT'

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblFinpayMethodPayment'), 
    60)

WebUI.delay(3)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtboxInputKodeVoucher'), GlobalVariable.getProductID)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnGunakanKodeVoucher'), 
    60)

WebUI.delay(3)

