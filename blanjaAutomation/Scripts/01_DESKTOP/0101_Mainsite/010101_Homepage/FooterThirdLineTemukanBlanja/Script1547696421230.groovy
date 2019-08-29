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

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnFacebook'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnFacebook'))

WebUI.switchToWindowIndex(GlobalVariable.index1)

url1 = WebUI.getUrl()

WebUI.verifyEqual(url1, GlobalVariable.fbBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnTwitter'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnTwitter'))

WebUI.switchToWindowIndex(GlobalVariable.index2)

url2 = WebUI.getUrl()

WebUI.verifyEqual(url2, GlobalVariable.twitterBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnYoutube'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnYoutube'))

WebUI.switchToWindowIndex(GlobalVariable.index3)

url3 = WebUI.getUrl()

WebUI.verifyEqual(url3, GlobalVariable.youtubeBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnInstagram'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnInstagram'))

WebUI.switchToWindowIndex(GlobalVariable.index4)

url4 = WebUI.getUrl()

WebUI.verifyEqual(url4, GlobalVariable.igBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnLinkedIn'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnLinkedIn'))

WebUI.switchToWindowIndex(GlobalVariable.index5)

url5 = WebUI.getUrl()

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnGoogle'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Page_Situs Jual Beli  Belanja Onlin/btnGoogle'))

WebUI.switchToWindowIndex(GlobalVariable.index6)

url6 = WebUI.getUrl()

WebUI.verifyEqual(url6, GlobalVariable.googleBlanja)

