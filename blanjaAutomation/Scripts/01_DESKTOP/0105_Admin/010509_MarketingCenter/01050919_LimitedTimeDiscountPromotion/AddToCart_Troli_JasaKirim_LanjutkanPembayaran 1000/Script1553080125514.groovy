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

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnGoSendOK'))

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/txtBoxQty'), GlobalVariable.txtBox100000)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/a_Tambahkan ke Troli'))

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnTroliProductPage'))

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/Page_Keranjang Belanja Saya - BLANJ/btnLanjutkanPembayaranCart'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0103_Product/select_Pilih Jasa PengirimanKu'), GlobalVariable.ddPilihJasaPengiriman, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/btnLanjutkanPembayaranOrderConfirm'))

WebUI.delay(5)

