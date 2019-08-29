import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.ConcurrentSkipListMap.KeySet as KeySet
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
import org.openqa.selenium.Keys as Keys

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/lblPulangPergi'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxDari'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxTujuan'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxCabinClass'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxlTanggalPergi'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxTanggalPulang1'), 
    0)

WebUI.delay(2)

//WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxPromoCode'), GlobalVariable.KodePromo)
WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxDewasa'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxAnak'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxBayi'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/btnCariPenerbangan'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxCodePromo'), 
    0)

