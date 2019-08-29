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

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/btnLanjutkanPembayaranPaketWisata'), FailureHandling.OPTIONAL)

//not_run: WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/divScrollToMandiri'), 
//    0)
//
//not_run: WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Scheduler/tabDompetBlanja'), 0)
//
//not_run: WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/rbBNIVA'))

GlobalVariable.lastOrderNumberBlanjaanSaya = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/hrefNoOrder'))

GlobalVariable.lastOrderNumberBlanjaanSaya = GlobalVariable.lastOrderNumberBlanjaanSaya.replaceAll('[^\\d]', '')

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Scheduler/rbBNIVA'))

//not_run: WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/h3RingkasanBlanja'), 
//    0)
//
//not_run: WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/btnKonfirmasiPembayaran'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Scheduler/btnKonfirmasiPembayaran'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/lablePemesananSelesai'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/btnBlanjaanSaya'))

