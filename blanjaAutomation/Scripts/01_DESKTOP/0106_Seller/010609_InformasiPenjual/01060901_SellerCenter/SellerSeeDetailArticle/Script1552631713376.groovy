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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010607_AkunSaya/01060701_AkunSaya/hrefSellerCenter'))

WebUI.switchToWindowIndex(GlobalVariable.index1)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010607_AkunSaya/01060701_AkunSaya/hrefTipsSellerCenter'))

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010607_AkunSaya/01060701_AkunSaya/lblArticle'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010607_AkunSaya/01060701_AkunSaya/lblDetail'), 0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010607_AkunSaya/01060701_AkunSaya/lblDetailArticle'), 
    2)

WebUI.delay(2)

