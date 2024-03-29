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

WebUI.delay(2)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblKategori'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblIBA'), 0)

WebUI.mouseOver(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblIBA'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblIBA'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020101_Homepage/CategoryHomepage/lblClickProdukPDPMobile'))

