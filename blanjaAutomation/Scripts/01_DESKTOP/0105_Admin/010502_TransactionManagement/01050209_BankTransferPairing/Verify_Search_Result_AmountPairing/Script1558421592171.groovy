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

amountPairing = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050209_BankTransferPairing/lblAmountPairingCode'))

newAmountPairing = amountPairing.replaceAll('[^0-9]', '')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050209_BankTransferPairing/txtboxPaymentAmount'), 
    newAmountPairing)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050209_BankTransferPairing/btnSearchBankTransferPairing'))

searchResultAmount = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050209_BankTransferPairing/lblSearchResultAmountPairing'))

newSearchResultAmount = searchResultAmount.replaceAll('[^0-9]', '')

WebUI.verifyMatch(newAmountPairing, newSearchResultAmount, false)
