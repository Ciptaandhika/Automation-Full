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

WebUI.navigateToUrl(GlobalVariable.urlOrderList)

try{WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'), FailureHandling.OPTIONAL)}

catch (Exception e){}

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/txtBoxOrderNumberBlanjaanSaya'), GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnCari'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnKonfirmasiPenerimaan'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnKonfirmasiPenerimaanLagi'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(8)

WebUI.verifyTextPresent("Pesanan selesai", false)

