import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.poi.ss.formula.functions.Subtotal as Subtotal
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

WebUI.delay(10)

KeywordLogger log = new KeywordLogger()

subtotal = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/NewObject/labelTotalHarga')).replaceAll(
    '\\D+', '')

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/sliderCashback'), 0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/sliderCashback'))

WebUI.clearText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/txtBoxCashbackNominal'))

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Cashback/txtBoxCashbackNominal'), subtotal)


WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))


