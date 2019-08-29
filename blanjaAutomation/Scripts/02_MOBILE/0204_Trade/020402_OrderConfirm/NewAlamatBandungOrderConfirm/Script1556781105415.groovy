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

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/hrefEditAlamat'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/FrameAlamat/ddNewPropinsiOrderConfirm'), 
    '17', GlobalVariable.choices)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/FrameAlamat/ddNewKotaOrderConfirm'), 
    '1711', GlobalVariable.choices)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/FrameAlamat/ddNewKecamatanOrderConfirm'), 
    '171110', GlobalVariable.choices)

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/FrameAlamat/btnSimpanAlamat'), 0)

WebUI.delay(4)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/FrameAlamat/btnSimpanAlamat'))

WebUI.delay(2)

