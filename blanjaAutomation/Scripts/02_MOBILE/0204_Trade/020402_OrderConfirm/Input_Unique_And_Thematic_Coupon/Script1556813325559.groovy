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

WebUI.focus(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/hrefPunyaKodeVoucher1'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/hrefPunyaKodeVoucher1'), 
    60)

WebUI.focus(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/hrefPunyaKodeVoucher2'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/hrefPunyaKodeVoucher2'), 
    60)

GlobalVariable.contentText = 'EP'

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtboxInputKodeVoucherBlanja1'), GlobalVariable.contentText)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnGunakanKodeVoucherWarungKita'), 
    60)

WebUI.delay(60)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnGunakanKodeVoucherWarungKami'), 
    60)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblPotensiCashBack'), 30)

subTotal_1 = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblSubTotalWarungKami'))

subTotal_2 = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblSubTotalWarungKita'))

println(subTotal_1)
println(subTotal_2)

