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

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/hrefUbahAlamatt'))

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/txtAreaKodePosEdit'), GlobalVariable.kodePosBuyer)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/hrefUbahLokasiMap'))

WebUI.delay(5)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/txtAreaCariAlamat2'), GlobalVariable.kodePosBuyer)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblJadikanAlamatUtama'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lbl15157'))

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnGunakanLokasiBuyer'))

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnSimpanBuyerEdit'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/lblAddress'))

WebUI.delay(2)

