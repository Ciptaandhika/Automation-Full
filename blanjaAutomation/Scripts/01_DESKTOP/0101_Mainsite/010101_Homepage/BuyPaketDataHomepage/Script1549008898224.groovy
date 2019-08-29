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

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnX'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Pulsa/spanPaketData'))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Pulsa/txtNoHpPaketData'), GlobalVariable.noHpTelkomsel)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Pulsa/ddNominalPaketData'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Pulsa/ddDataGamesMax'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/Pulsa/btnPaketData'))

WebUI.callTestCase(findTestCase('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/LoginPulsa'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/lableVABCA'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/btnKonfirmasi'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/lablePemesananSelesai'), 
    0)

