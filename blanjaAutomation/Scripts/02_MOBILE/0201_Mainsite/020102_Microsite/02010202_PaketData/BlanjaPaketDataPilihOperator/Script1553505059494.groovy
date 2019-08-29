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

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/btnXM'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/PaketData/spanPaketDataM'))

WebUI.scrollToElement(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/divPilihOperator'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/imgTelkomsel'))

WebUI.setText(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/PaketData/txtPhoneNumberM'), GlobalVariable.noHpTelkomsel)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/PaketData/ddPilihNominalPaketDataM'))

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/PaketData/ddNominalPaketData25k'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/PaketData/ddNominalPaketData25k'))

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/divKeteranganM'), 
    0)

WebUI.scrollToElement(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/PaketData/divHargaM'), 0)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/PaketData/btnBlanjaPaketData'))

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/lableCheckoutM'), 
    0)

