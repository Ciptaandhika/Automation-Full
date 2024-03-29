import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.logging.Logger as Logger
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.keyword.builtin.ContainsStringKeyword as ContainsStringKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

SuccesURL = WebUI.getUrl()

KeywordLogger log = new KeywordLogger()

SuccesURL.contains('success')

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/hrefSalinNomor'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/hrefSalinNomor'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/hrefNomorTersalin'), 
    0)

