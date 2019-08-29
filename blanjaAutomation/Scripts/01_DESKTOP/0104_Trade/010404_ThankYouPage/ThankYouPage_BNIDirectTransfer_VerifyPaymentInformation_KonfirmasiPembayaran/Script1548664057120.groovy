import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.logging.Logger as Logger
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.keyword.builtin.ContainsStringKeyword as ContainsStringKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

SuccesURL = WebUI.getUrl()

SuccesURL.contains('success')

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelNoPesananAnda'), 
    0)

GlobalVariable.tglPembayaranSebelum = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelMohonLakukanPembayaranSebelum'))

int iend = GlobalVariable.tglPembayaranSebelum.indexOf(' WIB.')

dateInPage = GlobalVariable.tglPembayaranSebelum.substring(33, iend)

DateFormat format = new SimpleDateFormat('dd MMMM yyyy HH:mm', Locale.ENGLISH)

Date dateInPageTemp = format.parse(dateInPage)

SimpleDateFormat dateFormat = new SimpleDateFormat('dd MMMM yyyy')

nextDateNewFormat = dateFormat.format(new Date() + 1)

dateInPageNewFormat = dateFormat.format(dateInPageTemp)

nextDateNewFormat.equalsIgnoreCase(dateInPageNewFormat)

KeywordLogger log = new KeywordLogger()

//log.logInfo(dateInPageNewFormat)
//log.logInfo(nextDateNewFormat)
WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/label3DigitKodeUnik'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/btnDetailPembayaran'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/divDetailPembayaran'), 
    0)

subTotalText = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelSubtotalPembayaranPadaDetail'))

subTotalText.contains('Subtotal Pembayaran:')

kodeUnikText = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelKodeUnikPadaDetail'))

kodeUnikText.contains('Kode Unik:')

totalPembayaranText = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelTotalPembayaranPadaDetail'))

totalPembayaranText.contains('Total Pembayaran:')

nominalSubTotal = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelNominalSubTotalPadaDetail')).replaceAll(
    '\\D+', '')

nominalKodeUnik = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelNominalKodeUnikPadaDetail')).replaceAll(
    '\\D+', '')

nominalTotalPembayaran = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelNominalTotalPembayaranPadaDetail')).replaceAll(
    '\\D+', '')

Integer.parseInt(nominalTotalPembayaran).equals(Integer.parseInt(nominalSubTotal) + Integer.parseInt(nominalKodeUnik))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_BNI/Direct_Transfer/labelNomorRekeningPembayaran'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_BNI/Direct_Transfer/labelLogoBNI'), 
    0)

WebUI.verifyElementText(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_BNI/Direct_Transfer/label7777234220'), 
    '7777234220')

WebUI.verifyElementText(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_BNI/Direct_Transfer/labelAnPTMetraplasaCabangDukuhBawah'), 
    'a/n PT Metraplasa Cabang Dukuh Bawah')

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/labelProsesVerifikasiDilakukan'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/hrefSalinNomor'), 
    0)

//log.logInfo(nominalSubTotal)
//log.logInfo(nominalKodeUnik)
//log.logInfo(nominalTotalPembayaran)
WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/divCaraMelakukanPembayaran'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/Bank_Mandiri/Direct_Transfer/btnKonfirmasiPembayaran'))

