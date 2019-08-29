import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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

GlobalVariable.orderNumberTemp_1 = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/hrefNoPemesanan'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/LinkAja/sliderLinkAja'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/LinkAja/divLinkAjaBisaDigabungkan'), 
    0)

subtotal = WebUI.getText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/labelTotalHargaNew')).replaceAll('\\D+', 
    '')

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/LinkAja/textBoxLinkAjaNew'), subtotal)

WebUI.delay(2)

WebUI.delay(10)

