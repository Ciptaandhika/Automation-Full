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

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
    false)

WebUI.focus(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBNI'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBNI'), 
    0)

WebUI.delay(2)

WebUI.focus(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblBNIKartuKreditPromo'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblBNIKartuKreditPromo'), 
    0)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddBankPromotionBNI'), 'MwebExcludeDigProd', 
    false)

WebUI.delay(3)

WebUI.focus(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), 
    0)

