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

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010203_PLN/PLN/spanPLN'))

WebUI.setText(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010203_PLN/PLN/txtNoMeterM'), GlobalVariable.noMeterPLN)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010203_PLN/PLN/ddPilihNominalM'))

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010203_PLN/PLN/ddNominal20kM'), 0)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010203_PLN/PLN/ddNominal20kM'))

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010203_PLN/PLN/lableHargaPLNM'), 0)

