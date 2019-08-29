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

GlobalVariable.PlacedOrderNumberForPaymentInstallment_1 = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/labelOrderNumber'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_Mandiri/Mandiri_KartuKreditCicilan/rbKartuKreditCicilan'), 
    10)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_Mandiri/Mandiri_KartuKreditCicilan/rbKartuKreditCicilan'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_Mandiri/Mandiri_KartuKreditCicilan/selectPilihOpsiPembayaran'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_Mandiri/Mandiri_KartuKreditCicilan/selectPilihOpsiPembayaran'), 
    'mandiri 3 Bulan', false)

GlobalVariable.getTotalAmount = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment')).replaceAll('[^0-9]', '')

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

