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

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/btnTCASH'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/txtNamaProduk'), GlobalVariable.nameKopiBubuk2)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Pulsa/btnCari'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/KonfirmasiPermintaanPenjual'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/TolakKonfirmasiPenjual'))

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/YASetuju'))

//WebUI.click(findTestObject('Object Repository/btn_menolak_Ya'))

//WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/dibBatalOtomatisBuyer'), 
//    0)
WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginSeller(Seller01)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/hrefTransaksiPenjualan'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/Proses Tunda/txtNamaProduk'), 
    GlobalVariable.nameKopiBubuk2)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/SCHEDULER/btnCari'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/SCHEDULER/lableTolakPerpanjangan'), 
    0)
