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

WebUI.navigateToUrl(GlobalVariable.urlPaketData)

WebUI.setText(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010202_PaketData/txtNomorTeleponPaketData'), GlobalVariable.noHpTelkomsel)

not_run: WebUI.selectOptionByIndex(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/ddNominalM'), 
    2)

not_run: WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/formPulsa'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010202_PaketData/PilihNominal'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010202_PaketData/liTelkomselData50k'))

not_run: WebUI.scrollToElement(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/spanHargaM'), 
    0)

not_run: WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/formPulsa'))

WebUI.scrollToElement(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010202_PaketData/btnBlanjaPaketData2'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010202_PaketData/btnBlanjaPaketData2'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/hrefKodeVoucher'))

WebUI.delay(2)

WebUI.setText(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/txtKodeVoucher'), GlobalVariable.txtBlanjaCoupons_CouponCodeCustom)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/btnInputVoucher'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/divPotongan'), 
    0)

WebUI.scrollToElement(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/lableMetodePembayaran'), 
    0)

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/divBankTransfer'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/divBCAVAM2'))

WebUI.click(findTestObject('02_MOBILE/0201_Mainsite/020102_Microsite/02010201_Pulsa/Pulsa/btnBayarM'))

WebUI.delay(10)

