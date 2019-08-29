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

txt = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050925_BQodeCampaign/Page_/textAreaResultUrl'), 
    'value')

log.logInfo(txt)

txt.contains('&utm_source=Donat%20Payu&utm_medium=Donat%20Payu&utm_campaign=Donat%20Payu&utm_term=Donat%20Payu&utm_content=Donat%20Payu')

WebUI.verifyElementNotClickable(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050925_BQodeCampaign/Page_/txtBoxUrlUtm'))
