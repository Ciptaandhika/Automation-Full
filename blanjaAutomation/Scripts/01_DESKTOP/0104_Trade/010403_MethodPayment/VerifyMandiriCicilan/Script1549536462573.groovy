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

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_Mandiri/Mandiri_KartuKreditCicilan/New Button/rbKartuKreditMandiriNew'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/ddPilihDiskonSpesial'), GlobalVariable.index1)

WebUI.verifyTextPresent('Diskon20k', true)

WebUI.verifyTextPresent('6 bulan', true)

not_run: WebUI.verifyOptionSelectedByIndex(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/ddPilihDiskonSpesial'), 
    '1', 0, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

