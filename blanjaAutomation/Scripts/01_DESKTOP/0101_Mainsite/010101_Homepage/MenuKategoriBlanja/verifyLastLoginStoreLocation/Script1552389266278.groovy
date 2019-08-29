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
import sun.util.logging.resources.logging as logging
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

lastLogin = WebUI.getText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/CategoryHomepage/lblLastLoginStore'))

log.logInfo(lastLogin.toString())

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/CategoryHomepage/lblLastLoginStore'), 
    GlobalVariable.setTimeOutGlobal)

locationStore = WebUI.getText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/CategoryHomepage/lblLocationStore'))

log.logInfo(locationStore.toString())

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/CategoryHomepage/lblLocationStore'), 
    GlobalVariable.setTimeOutGlobal)

