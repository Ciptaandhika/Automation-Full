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

for (def index : (1..3)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0103_Product/010301_PDP/GoToPDPURLProdukReguler10KMainsiteWarungKita_ClickBlanjaSekarang'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('01_DESKTOP/0104_Trade/010402_OrderConfirm/transactionOrderConfirm_PilihJasaPengirim'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('01_DESKTOP/0104_Trade/010403_MethodPayment/ChoosePayment_BCAVirtualAccount'), [:], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Member_OrderList'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/OrderManagement'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050204_PayManually/PayManually'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginBuyer10'), [:], FailureHandling.STOP_ON_FAILURE)
}

