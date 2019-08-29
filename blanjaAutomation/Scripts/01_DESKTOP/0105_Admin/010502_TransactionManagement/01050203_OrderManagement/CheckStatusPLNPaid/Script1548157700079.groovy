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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtOrderNumber'), 
    GlobalVariable.idOrderNumberPLN2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearchOrange'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtOrderNumber'), 
    0)

WebUI.delay(2)

if (WebUI.verifyTextPresent('Paid', true)) {
    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/aOrderDetails'))

    WebUI.switchToWindowIndex(1)
} else {
    WebUI.closeBrowser()
}

