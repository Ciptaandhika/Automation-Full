import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

List<WebElement> objectLists = WebUI.findWebElements(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/selectKurirForMultipleProducts'), 
    0)

GlobalVariable.varTotalProductOrdered = objectLists.size()

KeywordLogger log = new KeywordLogger()

log.logInfo(GlobalVariable.varTotalProductOrdered.toString())

for (WebElement eachlist : objectLists) {
    shopId = eachlist.getAttribute('shopid')

    TestObject to = new TestObject()

    to.addProperty('class', ConditionType.EQUALS, 'select-courier-provider column-12 p5')

    to.addProperty('tag', ConditionType.EQUALS, 'select')

    to.addProperty('shopid', ConditionType.EQUALS, shopId)

    WebUI.selectOptionByLabel(to, findTestData('Payment/01_DESKTOP/0104_Trade/010402_OrderConfirm/orderConfirmData').getValue(
            'kurirStandarOrderConfirm', 1), false)

    log.logInfo(shopId)
}

GlobalVariable.idrTotalProdukOrderConfirm = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/labelTotalProdukRingkasanBelanja'))

GlobalVariable.idrBiayaPengiriamanOrderConfirm = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/labelBiayaPengirimanRingkasanBelanja'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010402_OrderConfirm/LanjutkanPembayaran'))

WebUI.delay(3)

