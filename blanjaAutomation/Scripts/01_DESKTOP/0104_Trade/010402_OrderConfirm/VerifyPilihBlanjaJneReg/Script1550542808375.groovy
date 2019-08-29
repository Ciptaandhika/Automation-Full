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

WebUI.waitForPageLoad(3)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJasaPengiriman4'), GlobalVariable.jasaPengirimanJne, 
    false)

WebUI.verifyOptionPresentByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJasaPengiriman4'), GlobalVariable.jasaPengirimanJne, 
    true, 0)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJenisJasaPengiriman4'), GlobalVariable.jasaPengirimanJne1, 
    false)

WebUI.verifyOptionSelectedByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPilihJenisJasaPengiriman4'), 
    GlobalVariable.jasaPengirimanJne1, false, 0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblBiaya PengirimanIndividu'), 0)
