import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

newUrl = 'https://m.bljstaging.com/katalog/p/fas/athletic-shoes-23342174'

GlobalVariable.urlEvent = newUrl

WebUI.navigateToUrl(GlobalVariable.urlEvent)

WebUI.delay(5)

try {
    WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnCloseDialogGojek'), FailureHandling.OPTIONAL)
}
catch (Exception e) {
} 

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'), 0)

not_run: WebUI.clearText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'))

WebUI.setText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'), '0')

WebUI.setText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'), '2')

WebUI.delay(5)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnAddToCart'))

WebUI.delay(5)

