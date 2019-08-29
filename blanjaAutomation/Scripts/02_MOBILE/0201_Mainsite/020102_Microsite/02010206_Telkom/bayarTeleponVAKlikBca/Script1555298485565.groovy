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

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010206_Telkom/Page_/btnPilihMetodePembayaran'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010206_Telkom/Page_/btnPilihMetodePembayaran'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010206_Telkom/Page_/btnDompetBlj'))

WebUI.delay(3)

WebUI.setText(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010206_Telkom/Page_/txtBoxNominalVA'), GlobalVariable.tagihanIndihome2500)

WebUI.setText(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010206_Telkom/Page_/txtBoxPasswordVA'), GlobalVariable.PasswordDompetBlanja)

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010206_Telkom/Page_/btnKlikBCA'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020204_TagihanProdukDigital/Page_/hrefDebit'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010206_Telkom/Page_/btnKonfirmasiPembayaran'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0202_Member/020204_TagihanProdukDigital/Page_/btnLanjutDebit'))

WebUI.delay(3)

url = WebUI.getUrl()

url.contains('https://app.sandbox.midtrans.com')

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0202_Member/020204_TagihanProdukDigital/Page_/btnBayarSekarangDebit'), 
    0)
