import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.ConcurrentSkipListMap.KeySet as KeySet
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordLogger log = new KeywordLogger()

WebUI.delay(10)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/DetailPemesanan/btnDetailPemesanan'))

WebUI.delay(3)

perjalananPergi = WebUI.getText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/DetailPemesanan/Page_Garuda Indonesia - Kalender/lblPergi'))

perjalananPulang = WebUI.getText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/DetailPemesanan/Page_Garuda Indonesia - Kalender/lblPulang'))

log.logInfo(perjalananPergi).toString()
log.logInfo(perjalananPulang).toString()

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/DetailPemesanan/btnDetailPemesanan'), 
    GlobalVariable.setTimeOutGlobal)

