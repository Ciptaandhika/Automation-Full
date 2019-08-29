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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

List<WebElement> objectLists = WebUI.findWebElements(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/hrefNoPemesanan'), 
    0)

KeywordLogger log = new KeywordLogger()

n = 0

for (WebElement eachlist : objectLists) {
    noOrder = eachlist.getAttribute('text').replaceAll('[^\\d]', '')

    if (n == 0) {
        GlobalVariable.orderNumberTemp_1 = noOrder
    } else if (n == 1) {
        GlobalVariable.orderNumberTemp_2 = noOrder
    }
    
    log.logInfo(noOrder)

    n++
}

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersBankTransfer/rbOthersBankTransfer'),10)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/OthersBankTransfer/rbOthersBankTransfer'))

GlobalVariable.getTotalAmount = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0104_Trade/010403_MethodPayment/lblTotalAmountPayment')).replaceAll(
    '[^0-9]', '')

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/KonfirmasiPembayaran'))

