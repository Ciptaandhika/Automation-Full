import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.check(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/checklistCashback'))

WebUI.delay(5)

WebUI.clearText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/txtBoxCashbackNominal'))

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/txtBoxCashbackNominal'), GlobalVariable.nominalCashbackForPartialPayment)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_Mandiri/rbMandiriKartuKredit'))

nominalTotalProduk = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/labelTotalProduk')).replaceAll(
    '\\D+', '')

String nominalCashback = GlobalVariable.nominalCashbackForPartialPayment

nominalTotalHarga = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/labelTotalHarga')).replaceAll(
    '\\D+', '')

nominalAfterCashback = (Integer.parseInt(nominalTotalProduk) - Integer.parseInt(nominalCashback))

log.logInfo(nominalTotalHarga.equalsIgnoreCase(nominalAfterCashback.toString()).toString())

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

WebUI.delay(10)

