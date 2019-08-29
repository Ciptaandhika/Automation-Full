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

WebUI.navigateToUrl(GlobalVariable.urlOrderManagementOrderManagement)

not_run: WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxOrderNumber'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearch'))

not_run: GlobalVariable.PaymentCodeOrderManagement = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/GetPaymentCode'))

not_run: GlobalVariable.PaymentCodeOrderManagement = GlobalVariable.PaymentCodeOrderManagement.substring(14, 27).trim()

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnKirimOrderAdmin'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtboxInputOrderNumberAdmin'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnOKAdmin'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnOKAdmin'))

