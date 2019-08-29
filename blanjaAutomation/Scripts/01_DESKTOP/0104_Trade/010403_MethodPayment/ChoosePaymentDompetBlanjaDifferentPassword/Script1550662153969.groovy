import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

GlobalVariable.subTotalAmount = WebUI.getText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblTotalPaymentWithCoupon')).replaceAll(
    '\\D+', '')

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/sliderDompetBlanja'), 2)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/sliderDompetBlanja'))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/txtBoxDompetBlanjaSaldo'), GlobalVariable.subTotalAmount)

WebUI.delay(2)

// False Password Dompet Blanja
WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblDompetBlanjaPassword'), GlobalVariable.passwordQWE)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/btnKonfirmasiPembarayan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblPopUpPembayaranGagal'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblBtnOKPembayaranGagal'))

WebUI.delay(2)

// True Password Dompet Blanja
WebUI.clearText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblDompetBlanjaPassword'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblDompetBlanjaPassword'), GlobalVariable.passwordDompetBlanja)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblTotalAmount'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblTotalAmount'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/btnKonfirmasiPembarayan'), FailureHandling.STOP_ON_FAILURE)

