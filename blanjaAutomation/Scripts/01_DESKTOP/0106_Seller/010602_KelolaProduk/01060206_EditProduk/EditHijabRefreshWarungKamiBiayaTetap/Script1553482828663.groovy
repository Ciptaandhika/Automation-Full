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

WebUI.navigateToUrl(GlobalVariable.editHijabRefWarungKami)

WebUI.delay(30)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/lbl_Info Pengiriman'), 
    0)

WebUI.delay(6)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/span_Biaya Pengiriman Tetap2'), 
    0)

WebUI.delay(6)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/txtboxBiayaTetap'), GlobalVariable.biayaPengirimanTetap)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/input_Informasi Pre Order tida'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/Page_/btnEditLanjutkanNewVersion-Copy'), 
    60)

