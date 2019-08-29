import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

SuccesURL = WebUI.getUrl()

SuccesURL.contains('success')

KeywordLogger log = new KeywordLogger()

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/FinpayChannelIndomaret/labelKodePembayaranFinpayIndomaret'), 
    0)

totalPembayaranFinpayIndomaret = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/FinpayChannelIndomaret/labelTotalPembayaranFinpayIndomaret'))
start =totalPembayaranFinpayIndomaret.indexOf("Rp ")
end =totalPembayaranFinpayIndomaret.indexOf(". Ikuti")

totalPembayaran=totalPembayaranFinpayIndomaret.substring(start,end)



WebUI.verifyImagePresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/FinpayChannelIndomaret/imgCaraMenggunakanFinpayChannelIndomaret'), 
    FailureHandling.STOP_ON_FAILURE)

