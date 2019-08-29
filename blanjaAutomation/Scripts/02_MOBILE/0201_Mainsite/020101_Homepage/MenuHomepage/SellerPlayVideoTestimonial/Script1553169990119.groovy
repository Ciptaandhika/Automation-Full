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

WebUI.switchToWindowIndex(GlobalVariable.index1)

WebUI.scrollToElement(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/MenuHomepage/lblPenjualandenganPotensi'), 
    5)

WebUI.navigateToUrl(GlobalVariable.VideoTestimonialMob, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/MenuHomepage/lblVideoTesti'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/MenuHomepage/btnPlay'))

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/MenuHomepage/lblVideoStraming'), 2)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/MenuHomepage/lblVideoStreaming2'), 2)

