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

WebUI.delay(2)

VP1 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabPending'), 
    'Text')

VP2 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblStatusPending'), 
    'Text')

WebUI.verifyEqual(VP1, VP2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabHold'))

WebUI.delay(2)

VH1 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabHold'), 
    'Text')

VH2 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblStatusHold'), 
    'Text')

WebUI.verifyEqual(VH1, VH2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabComplete'))

WebUI.delay(2)

VC1 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblTabComplete'), 
    'Text')

VC2 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050602_WithdrawalManagement/lblStatusComplete'), 
    'Text')

WebUI.verifyEqual(VC1, VC2)

