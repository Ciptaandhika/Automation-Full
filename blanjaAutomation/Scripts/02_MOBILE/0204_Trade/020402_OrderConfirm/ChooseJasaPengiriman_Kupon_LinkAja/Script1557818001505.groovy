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
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
    false)

not_run: WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/btnKodeVoucherDiv'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/txtBoxKodeVoucher'), 'BAHFCUI59B')

not_run: WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/btnGunakanKodeVoucher'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/DompetBlanja/dropDownCashbackDompetBlanjaLinkAja'))

WebUI.delay(10)

GlobalVariable.subTotalAmount = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/lblTotalPembayaran')).replaceAll(
    '[^\\d]', '')

println(GlobalVariable.subTotalAmount)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/Page_/btnLinkAja'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/Page_/txtBoxLinkAja_tcashWallet'), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/Page_/txtBoxLinkAja_tcashWallet'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/Page_/txtBoxLinkAja_tcashWallet'), GlobalVariable.subTotalAmount)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/Page_/btnBayarLinkAja'))

WebUI.delay(5)

url = WebUI.getUrl()

url.contains('https://m.bljstaging.com/payment/result/success')

