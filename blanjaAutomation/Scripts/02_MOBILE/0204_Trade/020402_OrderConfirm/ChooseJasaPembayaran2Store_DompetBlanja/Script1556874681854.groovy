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

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/BtnPembayaran'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page/ddPilihPengirimanAtas'), 'Kurir Standar', 
    false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page/ddPilihPengirimanBawah'), 'Kurir Standar', 
    false)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/ddVA'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/sliderDompetBlanja2S'))

WebUI.delay(10)

GlobalVariable.subTotalAmount = WebUI.getText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/lblTotalPembayaran')).replaceAll(
    '[^\\d]', '')

println(GlobalVariable.subTotalAmount)

WebUI.delay(5)

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/DompetBlanja/textBoxPasswordDompetBlanja'), GlobalVariable.PasswordDompetBlanja)

WebUI.delay(10)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/DompetBlanja/textBoxDompetBlanjaTerpakai'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/DompetBlanja/textBoxDompetBlanjaTerpakai'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/DompetBlanja/textBoxDompetBlanjaTerpakai'), Keys.chord(
        Keys.DELETE))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/DompetBlanja/textBoxDompetBlanjaTerpakai'), GlobalVariable.subTotalAmount)

WebUI.delay(10)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

url = WebUI.getUrl()

url.contains('https://m.bljstaging.com/trade/order/payment/success')

WebUI.verifyTextPresent('You have already completed the payment', true)

