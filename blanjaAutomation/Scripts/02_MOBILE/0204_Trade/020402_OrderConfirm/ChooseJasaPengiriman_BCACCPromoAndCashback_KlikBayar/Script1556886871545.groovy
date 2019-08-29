import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

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

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/divCashbackDompetBlanjaLinkAja'))

WebUI.delay(2)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divCashbackSlider'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), '5000')

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/BCAVirtualAccount/dropDownBankBCA'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/BCAVirtualAccount/dropDownBankBCA'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/BCAKartuKredit/rbBCAKartuKredit - Copy'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBCA/BCAKartuKredit/selectPilihDiskonSpesial'), 
    'diskonsprintasia2', false)

WebUI.delay(3)

diskon = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBNI/BNIKartuKredit/labelDiskonBlanja'), 
    FailureHandling.STOP_ON_FAILURE).replaceAll('[^\\d]', '')

WebUI.delay(3)

println(diskon)

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

