import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(5)

KeywordLogger log = new KeywordLogger()

WebUI.navigateToUrl(GlobalVariable.URLBlanjaSayaMobile)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/btnPetunjukPembayaran'))

WebUI.delay(5)

List<WebElement> tableList = WebUI.findWebElements(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/tabelDetailPesanan'), 
    0)

log.logInfo(tableList.size().toString())

GlobalVariable.TotalPaymentTempMobile = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/labelPembayaranSejumlah')).replaceAll(
    '[^\\d]', '')

log.logInfo(GlobalVariable.TotalPaymentTempMobile)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/btnX'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/btnBatalkanBlanjaan'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/selectAlasanPembatalan'), 'Reason_A', 
    false)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/btnOKBatalkanBlanjaan'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/labelTutup'), 0)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/btnPetunjukPembayaran'))

WebUI.delay(5)

List<WebElement> tableList_2 = WebUI.findWebElements(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/tabelDetailPesanan'), 
    0)

log.logInfo(tableList_2.size().toString())

GlobalVariable.TotalPaymentTempMobile = WebUI.getText(findTestObject('02_MOBILE/0202_Member/020202_BlanjaanSaya/labelPembayaranSejumlah')).replaceAll(
    '[^\\d]', '')

log.logInfo(GlobalVariable.TotalPaymentTempMobile)

