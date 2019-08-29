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

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/lblHitungBiayaPengiriman'), 0)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/lblHitungBiayaPengiriman'))

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/Page_/ddMobPilihKurirPDP'), 0)

WebUI.selectOptionByValue(findTestObject('02_MOBILE/0203_Product/020301_PDP/Page_/ddMobPilihKurirPDP'), GlobalVariable.PosValue36, 
    GlobalVariable.isTrue)

WebUI.verifyOptionSelectedByValue(findTestObject('02_MOBILE/0203_Product/020301_PDP/Page_/ddMobPilihKurirPDP'), GlobalVariable.PosValue36, 
    GlobalVariable.isTrue, 0)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/Page_/ddMobPilihLayananKurirPDP'))

WebUI.verifyElementClickable(findTestObject('02_MOBILE/0203_Product/020301_PDP/Page_/ddMobPilihLayananKurirPDP'))

