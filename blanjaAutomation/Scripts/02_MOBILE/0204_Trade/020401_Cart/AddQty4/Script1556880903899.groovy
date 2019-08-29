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

not_run: WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/Instant Courier - Buyer - MWeb/divHitungBiayaPengiriman (1)'), 
    0)

not_run: WebUI.delay(5)

not_run: WebUI.clearText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'))

not_run: WebUI.setText(findTestObject('02_MOBILE/0203_Product/020301_PDP/textBoxJumlah'), GlobalVariable.index3)

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('02_MOBILE/0203_Product/020301_PDP/lblQty'), GlobalVariable.index3)

WebUI.scrollToElement(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnBlanjaSekarang'), 0)

WebUI.click(findTestObject('02_MOBILE/0203_Product/020301_PDP/btnBlanjaSekarang'))

