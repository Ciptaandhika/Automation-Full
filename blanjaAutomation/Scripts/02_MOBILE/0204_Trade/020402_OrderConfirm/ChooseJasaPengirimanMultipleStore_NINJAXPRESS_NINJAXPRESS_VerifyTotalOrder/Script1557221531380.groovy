import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Ninja Xpress', 
    false)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddJenisPengirimanPos'), GlobalVariable.index1)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman2'), 'Ninja Xpress', 
    false)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddJenisPengiriminJNE2'), GlobalVariable.index1, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblBiayaKirimKonfirmasiOrderConfirmPage'), 
    30)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblBiayaKirimKonfirmasiOrderConfirmPage'), 
    30)

