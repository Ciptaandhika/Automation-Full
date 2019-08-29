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

WebUI.navigateToUrl(GlobalVariable.urlAdminOrderManagement)

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxOrderNumber'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearch'))

WebUI.verifyTextPresent('Payment Method :Mandiri Credit Card (Midtrans)', false)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnCancel'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/selectReasonForCancelation'), 
    'Reason_C', false)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSave'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.waitForPageLoad(0)

