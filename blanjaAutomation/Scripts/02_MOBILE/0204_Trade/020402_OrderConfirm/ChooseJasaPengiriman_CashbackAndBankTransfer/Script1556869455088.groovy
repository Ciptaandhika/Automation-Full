import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 'Kurir Standar', 
    false)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/divCashbackDompetBlanjaLinkAja'))

WebUI.delay(2)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divCashbackSlider'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), '5000')

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/BankTransfer/dropDownMandiri'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/BankTransfer/dropDownMandiri'))

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/BankMandiri/BankTransfer/rbTransferBank'))

WebUI.delay(3)

subtotal = Integer.parseInt(WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/labelSubTotal')).replaceAll(
        '[^\\d]', ''))

cashback = Integer.parseInt(WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/labelCashback')).replaceAll(
        '[^\\d]', ''))

totalPembayaran = Integer.parseInt(WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/labelTotalPembayaran')).replaceAll(
        '[^\\d]', ''))

totalPembayaranInCount = (subtotal - cashback)

println(totalPembayaran.toString())

println(totalPembayaranInCount.toString())

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

