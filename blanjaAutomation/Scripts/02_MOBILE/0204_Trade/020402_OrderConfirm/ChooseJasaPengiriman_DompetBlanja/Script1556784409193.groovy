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

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/divCashbackDompetBlanjaLinkAja'))

WebUI.delay(2)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/divDompetBlanjaSlider'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtDompetBlanjaVA'), '5000')

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtDompetBlanjaVA'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/txtPasswordVA'), 'a123456')

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/MandiriKartuKreditCicilan/dropDownBankMandiri'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/MandiriKartuKreditCicilan/dropDownBankMandiri'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/mandiriKartuKreditpromo'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/ddlPilihDiskonSpecial'), 
    'Untung Promo', false)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/ddlPilihDiskonSpecial'))

WebUI.verifyElementVisible(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/lblBankPromo'))

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

