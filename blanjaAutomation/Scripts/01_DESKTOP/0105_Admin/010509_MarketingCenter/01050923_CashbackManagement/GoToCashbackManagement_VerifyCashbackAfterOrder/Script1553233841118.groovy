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

WebUI.navigateToUrl(GlobalVariable.URLCashbackManagement)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050923_CashbackManagement/txtBoxAccountNameAccount'), 
    GlobalVariable.usernameBuyerTest01LoginPage)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050923_CashbackManagement/btnSearch'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050923_CashbackManagement/hrefView'))

GlobalVariable.nominalCashbackAfter = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050923_CashbackManagement/labelSaldoCashback'))

GlobalVariable.nominalCashbackAfter = GlobalVariable.nominalCashbackAfter.replaceAll('[^\\d]', '')

println(GlobalVariable.nominalCashbackBefore)

println(GlobalVariable.nominalCashbackAfter)

int cashbackFromManualCounting = Integer.parseInt(GlobalVariable.nominalCashbackBefore) - Integer.parseInt(GlobalVariable.nominalCashbackForPartialPayment)

int cashbackFromCashbackPage = Integer.parseInt(GlobalVariable.nominalCashbackAfter)

println(cashbackFromManualCounting == cashbackFromCashbackPage)

labelNote = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050923_CashbackManagement/labelMenggunakanCashbackUntukOrder'), 
    FailureHandling.STOP_ON_FAILURE)

labelNote.contains("Menggunakan Cashback untuk order")

