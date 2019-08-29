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
import groovy.time.TimeCategory as TimeCategory

WebUI.navigateToUrl(GlobalVariable.urlOrderManagementOrderManagement)

WebUI.comment('Order Number 1')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/txtboxStoreName'), 
    GlobalVariable.NoteStoreTokoA)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearch'))

GlobalVariable.PaymentCodeOrderManagement = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/GetPaymentCode'))

println(GlobalVariable.PaymentCodeOrderManagement)

GlobalVariable.PaymentCodeOrderManagement = GlobalVariable.PaymentCodeOrderManagement.substring(14, 27).trim()

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/txtboxPaymentCodeAtAdminOrderManage'), 
    GlobalVariable.PaymentCodeOrderManagement)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/ddOrderStateAdmin'), 
    4)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearch'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/lblStatusOrderAdmin'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/a_Change Logistics'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxChangeLogisticAwb'), 
    0)

String mynumber = GlobalVariable.couponCodeNew

int mylength = mynumber.length()

String submynumber = mynumber.substring(0, mylength - 8)

mydate = new Date()

formattedDate = mydate.format('dd MM ')

datehour = mydate.format('HHmm')

use(TimeCategory, { 
        Hours = (mydate + 1.hours)
    })

endHour = Hours.format('HHmm')

String wahana_newcharacter = (submynumber + formattedDate) + endHour

String wahananewresi = wahana_newcharacter.replaceAll('\\s+', '')

println(wahananewresi)

WebUI.clearText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxChangeLogisticAwb'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxChangeLogisticAwb'), 
    wahananewresi)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnOKAdmin'), 
    0)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnOKAdmin'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('OrderNumber 2')

WebUI.clearText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/txtboxStoreName'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/txtboxStoreName'), 
    GlobalVariable.NoteStoreTokoB)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearch'))

GlobalVariable.PaymentCodeOrderManagement = WebUI.getText(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/GetPaymentCode'))

println(GlobalVariable.PaymentCodeOrderManagement)

GlobalVariable.PaymentCodeOrderManagement = GlobalVariable.PaymentCodeOrderManagement.substring(14, 27).trim()

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/txtboxPaymentCodeAtAdminOrderManage'), 
    GlobalVariable.PaymentCodeOrderManagement)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnSearch'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/lblStatusOrderAdmin'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnKirimOrderAdmin'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/ValidasiAwb/a_Change Logistics'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxChangeLogisticAwb'), 
    0)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/txtBoxChangeLogisticAwb'), 
    wahananewresi)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnOKAdmin'), 
    0)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/btnOKAdmin'), 
    30, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.acceptAlert()

