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

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/txtNoHandphone'), GlobalVariable.noHpTelkomsel)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/tableContent'), 0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/Nominal/btn30k'))

not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/spanLogoProviderTelkomsel'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/btnBlanja'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/Pulsa/aWARUNGKAMI (1)'))

WebUI.switchToWindowIndex(1)

linkToko = WebUI.getUrl()

WebUI.verifyMatch(linkToko, GlobalVariable.linkTokoWarungkami, false)

