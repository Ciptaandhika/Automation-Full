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

WebUI.navigateToUrl(GlobalVariable.urlPayManuallyPayManually)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050204_PayManually/txtPleaseEnterPaymentCode'), 
    GlobalVariable.PaymentCodeOrderManagement)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0105_Admin/010502_TransactionManagement/01050204_PayManually/btnSubmit'))

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.verifyTextPresent('true', false)

//WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginSeller02'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/GoToTransaksiPenjualan_PayManually_InputOrderNumber_KlikBtnCari'), 
//    [:], FailureHandling.STOP_ON_FAILURE)

