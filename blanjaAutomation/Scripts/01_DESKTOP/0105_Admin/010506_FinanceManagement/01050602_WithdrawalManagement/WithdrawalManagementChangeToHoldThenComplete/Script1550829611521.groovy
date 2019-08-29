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

WebUI.navigateToUrl(GlobalVariable.urlWithdrawalManagement)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabPending'))

GlobalVariable.lastSwiftNumber = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblLastSwiftNumber'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/cbWithdrawalObject'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/btnHold'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblUpdatedSuccessfully'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/btnOKDataUpdatedSuccessfully'))

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabHold'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/cbWithdrawalObject'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/btnComplete'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblUpdatedSuccessfully'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/btnOKDataUpdatedSuccessfully'))

WebUI.delay(5)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/txtBoxSwiftNumber'), 
    GlobalVariable.lastSwiftNumber)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/ddStatusWithdrawal'), 
    GlobalVariable.valueComplete, GlobalVariable.choices)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/btnSearch'))

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabComplete'))

