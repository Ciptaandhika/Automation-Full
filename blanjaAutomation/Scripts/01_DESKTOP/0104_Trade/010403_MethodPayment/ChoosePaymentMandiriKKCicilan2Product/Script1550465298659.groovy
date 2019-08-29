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

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/hreflastOrderNumberBlanjaanSayaNew'), 
    30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/lblOrderNumber2'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/rbMandiriKartuKreditCicilan'), 
    30)

WebUI.verifyElementNotClickable(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/lblKlikBCA'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/rbMandiriKartuKreditCicilan'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/ddSelectInstallment'), 
    GlobalVariable.value6Bulan, GlobalVariable.choices)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/ChoosePaymentPage/btnKonfirmasiPembarayan'))

