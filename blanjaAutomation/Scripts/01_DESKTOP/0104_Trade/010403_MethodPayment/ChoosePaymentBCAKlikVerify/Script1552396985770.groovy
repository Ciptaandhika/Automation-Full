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

KeywordLogger log = new KeywordLogger()

urlHomepage = WebUI.getUrl()

log.logInfo(urlHomepage.contains('trade.bljstaging.com/transaction/choosePayment').toString())

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/hrefStoreName'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/hrefOrderNumber'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/hrefProductName'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/txtBoxCouponField'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/cbDompetBlanja'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/txtBoxDompetBlanjaSaldo'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblDompetBlanjaPassword'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblOnlinePaymentMethod'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblTotalAmount'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BCA/btnKlikBCA'))

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BCA/txtBoxUserIDKlikBCA'), GlobalVariable.KlikBCAUserID)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/btnKonfirmasiPembarayan'), FailureHandling.STOP_ON_FAILURE)

