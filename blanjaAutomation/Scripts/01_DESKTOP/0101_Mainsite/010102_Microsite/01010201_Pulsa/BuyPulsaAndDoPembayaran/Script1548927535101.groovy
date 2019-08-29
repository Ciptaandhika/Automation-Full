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

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/txtNoHandphone'), GlobalVariable.noHpTelkomsel)

not_run: WebUI.getAttribute(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/txtNoHandphone'), '')

WebUI.scrollToElement(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/tableContent'), 0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/Nominal/btn30k'))

not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/spanLogoProviderTelkomsel'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/btnBlanja'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/Pulsa/lableNominal30k'), 0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/Pulsa/lableProviderAS'), 0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010403_MethodPayment/Bank_BCA/btnBCAVirtualAccount'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010102_Microsite/01010201_Pulsa/btnKonfirmasi'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010404_ThankYouPage/btn_LihatBlanjaanSaya'))

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/txtNamaProduk'), GlobalVariable.nameProductScheduler6)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/btnCari'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050203_OrderManagement/SCHEDULER/lableRincianBlanjaan1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(1)

not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/lablePhoneNumber'), 
    0)

NoHp = WebUI.getText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/txtAlamatPengiriman'))

NoHp.contains(GlobalVariable.noHpTelkomsel)

