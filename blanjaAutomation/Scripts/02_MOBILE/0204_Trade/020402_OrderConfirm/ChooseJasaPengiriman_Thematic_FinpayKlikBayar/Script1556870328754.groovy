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

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
    false)

WebUI.focus(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnExpandKodeVoucher'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnExpandKodeVoucher'), 
    60)

WebUI.delay(60)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnGunakanKodeVoucher'), 
    60)

subTotal = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblSubTotalAfterUseCoupon'))

println(subTotal)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblKoinBlanja'), 0)

//CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Finpay/lblFinpayPembayaranTry'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblFinpayMethodPayment'), 60)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementHasAttribute(findTestObject('02_MOBILE/0204_Trade/020404_ThankYouPage/Finpay/lblPembayaranFinpayKonfirm'), 
    'Finpay', 0)

