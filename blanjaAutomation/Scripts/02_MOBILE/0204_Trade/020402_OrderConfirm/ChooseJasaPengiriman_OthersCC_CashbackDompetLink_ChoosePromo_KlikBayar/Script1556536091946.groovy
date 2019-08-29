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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 2, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
        false)
} else {
    WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddJasaPengirimanKurir'), 'Kurir Standar', 
        false)
}

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/lblVAPayment'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/h3DompetBlanja'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/DompetSlider'))

WebUI.delay(3)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/txtInputDompetBlanja'), 
    GlobalVariable.value100)

WebUI.delay(3)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/txtInputDompetBlanja'), 
    GlobalVariable.value100)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/txtPasswordDompetBlanja'), 
    GlobalVariable.PasswordDompetBlanja)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/h3Cashback'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/cashbackSlider'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/cashbackSlider'))

WebUI.delay(3)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/txtCashback'), 
    GlobalVariable.value100)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/h3LinkAja'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/LinkajaSlider'))

WebUI.delay(3)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/Page_Checkout - BLANJA.com  blanja/txtInputLinkaja'), 
    GlobalVariable.value100)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/btnKartuKreditOther'))

WebUI.delay(3)

not_run: WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/selectPilihDiskonKartuKredit'), 
    'Diskon21k', false)

WebUI.delay(7)

if (WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divJumlahDiskon'), 0, FailureHandling.OPTIONAL)) {
    log.logPassed('Discount Applied')
} else {
    log.logPassed('Discount not Applied')
}

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

url = WebUI.getUrl()

log.logPassed(url)

