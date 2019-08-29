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

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNama'), GlobalVariable.namaAttributeNama)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNoKTP'), GlobalVariable.idNoKtp)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNoHP'), GlobalVariable.noHpTelkomsel)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtNoPassport'), GlobalVariable.idNoPassport)

WebUI.setText(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/txtAlamat'), GlobalVariable.namaAttributeAlamat)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/btnLanjutkanPembayaranPaketWisata'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/popupAgreement'), 0)

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/btnXPopup'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/cbAgreement'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/btnLanjutkanPembayaranPaketWisata'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/labelBCAVA'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/btnKonfirmasiPembayaran'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0104_Trade/010402_OrderConfirm/PaketWisata/lablePemesananSelesai'), 
    0)

