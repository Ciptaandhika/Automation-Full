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

sandboxURL = WebUI.getUrl()

if (sandboxURL.contains('secure.bayarind.id')) {
    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bayarind/divDescription'), 0)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bayarind/divMerchantName'), 0)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bayarind/divTotalAmount'), 0)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bayarind/divTransactionNumber'), 
        0)
} else {
    log.logInfo(sandboxURL.contains('fail').toString())
}

totalamount = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010404_ThankYouPage/Others/KartuKreditCicilan/labelTotalAmount_OTHINS')).replaceAll('[^0-9]', '')

WebUI.verifyEqual(totalamount, GlobalVariable.getTotalAmount)