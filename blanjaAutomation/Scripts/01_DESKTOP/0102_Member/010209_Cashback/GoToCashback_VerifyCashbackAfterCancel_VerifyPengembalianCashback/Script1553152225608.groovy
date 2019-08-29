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

WebUI.navigateToUrl(GlobalVariable.URLCashback)

try {
    WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'), FailureHandling.OPTIONAL)
}
catch (Exception e) {
} 

GlobalVariable.nominalCashbackAfterCancel = WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/labelNominalCashback'))

GlobalVariable.nominalCashbackAfterCancel = GlobalVariable.nominalCashbackAfterCancel.replaceAll('[^\\d]', '')

int cashbackAfterCancelManualCounting = Integer.parseInt(GlobalVariable.nominalCashbackAfter) + Integer.parseInt(GlobalVariable.nominalCashbackForPartialPayment)

int cashbackFromCashbackPage = Integer.parseInt(GlobalVariable.nominalCashbackAfterCancel)

println(cashbackAfterCancelManualCounting == cashbackFromCashbackPage)

WebUI.verifyElementText(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/hrefNoPesanan'), GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/labelPengembalianCashback'), 0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/labelTanggalTransaksi'), 0)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/tabPenerimaan'))

WebUI.verifyElementText(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/hrefNoPesanan'), GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/labelPengembalianCashback'), 0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010209_Cashback/labelTanggalTransaksi'), 0)

