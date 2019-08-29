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

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/lblSekaliJalan'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/lblSekaliJalan'))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxDari'), GlobalVariable.fromLocation)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxDari'), Keys.chord(
        Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxTujuan'), GlobalVariable.toLocation)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxTujuan'), Keys.chord(
        Keys.DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxCabinClass'), 
    GlobalVariable.CabinClass, true)

WebUI.delay(2)

CustomKeywords.'com.mii.AutoDatePicker.pickDateGaruda'(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxlTanggalPergi'), 
    'startDate')

//WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxPromoCode'), 
//    GlobalVariable.KodePromo)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxDewasa'), 
    GlobalVariable.BangkuDewasa)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxAnak'), 
    GlobalVariable.BangkuAnak)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/txtBoxBayi'), 
    GlobalVariable.BangkuAnak)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010204_GarudaIndonesia/btnCariPenerbangan'))

