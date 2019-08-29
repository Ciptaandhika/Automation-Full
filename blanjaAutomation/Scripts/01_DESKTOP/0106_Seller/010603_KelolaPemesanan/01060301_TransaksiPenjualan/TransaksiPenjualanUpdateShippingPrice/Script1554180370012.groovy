import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.navigateToUrl(GlobalVariable.urlTransaksiPenjualanTransaksiPenjualan)

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/txtNomorOrder'), 
    GlobalVariable.lastOrderNumberBlanjaanSaya)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnCari'))

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/hrefPerbaharuiHargaTransaksiPenjualan'))

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/txtBoxBiayaPengirimanUpdatePrice'), 
    GlobalVariable.value100, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnOKUpdatePrice'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnOKUpdatePrice'))

WebUI.delay(2)

WebUI.verifyAlertPresent(30)

WebUI.acceptAlert()

WebUI.verifyAlertPresent(30)

WebUI.acceptAlert()
