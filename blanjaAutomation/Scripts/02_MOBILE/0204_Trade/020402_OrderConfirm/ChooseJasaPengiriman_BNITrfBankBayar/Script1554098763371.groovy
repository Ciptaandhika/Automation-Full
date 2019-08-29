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

if (WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 2, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
        false)
} else {
    WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/ddJasaPengirimanKurir'), 'Kurir Standar', 
        false)
}

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBNI'))

WebUI.delay(3)

'menggunakan xpath'
WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankBNI/lblTransferBankBNI'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/btnOkZipCode'), 0, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/btnLanjutkanZipCode'), FailureHandling.OPTIONAL)
}

