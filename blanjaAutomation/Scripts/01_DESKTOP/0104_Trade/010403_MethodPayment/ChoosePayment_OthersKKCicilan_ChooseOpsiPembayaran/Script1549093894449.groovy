import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/hrefNoOrder'))

GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKreditCicilan/rbKartuKreditCicilan'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKreditCicilan/rbKartuKreditCicilan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKreditCicilan/lblEstimasiCicilanPerBulan'), 
    5)

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKreditCicilan/selectPilihOpsiPembayaran'), 
    'CIMB 12 Bulan', false)

String cicilan = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/OthersKartuKreditCicilan/lblEstimasiCicilanPerBulan'), 
    FailureHandling.STOP_ON_FAILURE).replaceAll('[^0-9]', '')

if (cicilan.toInteger() == 0) {
    KeywordUtil.markFailed('Estimasi Cicilan tidak boleh sama dengan nol')
}

GlobalVariable.getTotalAmount = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment')).replaceAll('[^0-9]', '')

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

