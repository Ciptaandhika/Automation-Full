import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(3)

List<WebElement> objectLists = WebUI.findWebElements(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/selectPilihPengiriman'), 
    0)

for (WebElement eachlist : objectLists) {
    shopId = eachlist.getAttribute('shopid')

    TestObject to = new TestObject()

    // to.addProperty('class', ConditionType.EQUALS, 'select-courier-provider column-12')
    to.addProperty('tag', ConditionType.EQUALS, 'select')

    to.addProperty('shopid', ConditionType.EQUALS, shopId)

    WebUI.selectOptionByLabel(to, 'Kurir Standar', false)
}

WebUI.delay(3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divPunyaKodeVoucher'))

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxKodeVoucher'), 'Blanja Murah')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/btnGunakan'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/ddVA'), 0)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Page_/ddVA'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divCashbackSlider'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divCashbackSlider'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/divCashbackSlider'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('02_MOBILE/0204_Trade/020403_MethodPayment/txtboxCashback'), '5000')

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Finpay/dropDownFinpayBayarDiOutlet'))

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/Finpay/lblFinpayATM'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblKoinBlanjaYangDidapatkan'), 3)

WebUI.verifyElementPresent(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/lblKoinBlanjaYangDidapatkan'), 3)

WebUI.click(findTestObject('02_MOBILE/0204_Trade/020402_OrderConfirm/btnBayar'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyTextPresent('Proses Pemesanan Selesai', true)

