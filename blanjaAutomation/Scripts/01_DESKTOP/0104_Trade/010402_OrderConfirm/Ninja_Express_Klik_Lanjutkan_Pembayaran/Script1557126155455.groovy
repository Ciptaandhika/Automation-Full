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

WebUI.selectOptionByLabel(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddOrderConfirmJasaPengiriman'), 'Ninja Xpress', 
    false)

WebUI.delay(3)

WebUI.focus(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPengirimanRegulerNinjaXpress'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/ddPengirimanRegulerNinjaXpress'), GlobalVariable.index1)

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnLanjutkanPembayaran'))

WebUI.delay(2)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnLanjutkanPembayaran'), 
    60)

//WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/OrderConfirmPage/btnLanjutkanPembayaran'))
WebUI.delay(2)

ninjaXpressURL = WebUI.getUrl()

if (ninjaXpressURL.contains('choosePayment')) {
    println('Halaman Pembayaran')
} else {
    println('Bukan Halaman Pembayaran')
}

