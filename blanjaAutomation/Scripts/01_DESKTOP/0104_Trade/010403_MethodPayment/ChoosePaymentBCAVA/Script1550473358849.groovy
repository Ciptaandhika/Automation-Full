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

GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/hrefNoOrder'))

GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BCA/btnBCAVirtualAccount'), 
    10)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BCA/btnBCAVirtualAccount'), 
    10)

GlobalVariable.getTotalAmount = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment')).replaceAll('[^0-9]', '')

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'), 
    10)

