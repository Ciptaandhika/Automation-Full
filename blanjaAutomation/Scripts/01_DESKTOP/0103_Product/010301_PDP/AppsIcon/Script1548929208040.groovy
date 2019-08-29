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

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgFbPdp'))

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgFbPdp'))

WebUI.switchToWindowIndex(GlobalVariable.index1)

url1 = WebUI.getUrl()

WebUI.verifyEqual(url1, GlobalVariable.fbBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgTwitterPdp'))

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgTwitterPdp'))

WebUI.switchToWindowIndex(GlobalVariable.index2)

url2 = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(url2, GlobalVariable.twitterBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgYoutubePdp'))

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgYoutubePdp'))

WebUI.switchToWindowIndex(GlobalVariable.index3)

url3 = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(url3, GlobalVariable.youtubeBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgIgPdp'))

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgIgPdp'))

WebUI.switchToWindowIndex(GlobalVariable.index4)

url4 = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(url4, GlobalVariable.igBlanja)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgLinkedPdp'))

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgLinkedPdp'))

WebUI.switchToWindowIndex(GlobalVariable.index5)

url5 = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(GlobalVariable.index0)

WebUI.mouseOver(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgGooglePdp'))

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/imgGooglePdp'))

WebUI.switchToWindowIndex(GlobalVariable.index6)

url6 = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(url6, GlobalVariable.googleBlanja)

