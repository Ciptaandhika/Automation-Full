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
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
    false)

WebUI.focus(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnExpandKodeVoucher'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnExpandKodeVoucher'), 
    60)

WebUI.delay(60)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtboxInputKodeVoucher'), '03 May 171946')

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnGunakanKodeVoucher'), 
    60)

subTotal = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblSubTotalAfterUseCoupon'))

println(subTotal)

WebUI.delay(6)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/divCashbackDompetBlanjaLinkAja2'))

WebUI.delay(2)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/divDompetBlanjaSlider'), 
    30)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtDompetBlanjaVA'), 0)

WebUI.clearText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtDompetBlanjaVA'))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtDompetBlanjaVA'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtDompetBlanjaVA'), '25000')

WebUI.delay(5)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtPasswordVA'), 'a123456')

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divCashbackSlider - Copy'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divCashbackSlider - Copy'))

WebUI.delay(2)

WebUI.clearText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), '0')

subTotal = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblSubTotalAfterUseCoupon'))

println(subTotal)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblKoinBlanja'), 0)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblFinpayMethodPayment'), 60)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementHasAttribute(findTestObject('02_MOBILE/0204_Trade/020404_ThankYouPage/Finpay/lblPembayaranFinpayKonfirm'), 
    'Finpay', 0)

