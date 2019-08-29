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

OrderConfirmURL = WebUI.getUrl()

OrderConfirmURL.contains('trade.bljstaging.com/transaction/orderConfirm')

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/OrderConfirmPage/txtBoxQtyBarang'), GlobalVariable.qtymaxbarang)

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/OrderConfirmPage/lblAlertAcceptNumber'), 
    30)) {
    WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/OrderConfirmPage/btnOKAcceptAllert'))
}

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/OrderConfirmPage/txtBoxQtyBarang'), 
    30)

name = WebUI.getAttribute(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/OrderConfirmPage/hrefAddQtyDisable'), 
    'class')

name.contains('disable')
