import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.delay(5)

sandboxURL = WebUI.getUrl()

if (sandboxURL.contains('success')) {
    log.logInfo(sandboxURL.contains('success').toString())

    WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020404_ThankYouPage/Finpay/labelKodePembayaran'), 0)

    WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020404_ThankYouPage/Finpay/divDetail'), 0)

    WebUI.verifyTextPresent('sejumlah Rp', false)
} else {
    log.logInfo(sandboxURL.contains('fail').toString())
}

