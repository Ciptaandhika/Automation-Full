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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordLogger log = new KeywordLogger()

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblSearchCariPDPMobile'))

WebUI.focus(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/txtBoxSearchProduct'))

WebUiCommonHelper.findWebElements(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/txtBoxSearchProduct'), 
    30).clear()

WebUI.sendKeys(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/txtBoxSearchProduct'), GlobalVariable.CariPDP)

bahasa1 = WebUI.getAttribute(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/txtBoxSearchProduct'), 
    'value')

WebUI.sendKeys(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/txtBoxSearchProduct'), Keys.chord(
        Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/hrefFilterMobile'))

bahasa2 = WebUI.getText(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblFashionPriaMobile'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblFashionPriaMobile'))

WebUI.delay(3)

bahasa3 = WebUI.getText(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblBajuBekasDariBekasiMobile'))

log.logInfo(bahasa1.toString())

log.logInfo(bahasa2.toString())

log.logInfo(bahasa3.toString())

