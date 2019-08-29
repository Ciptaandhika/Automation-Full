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

WebUI.navigateToUrl(GlobalVariable.URLProdukDiJualSeller)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/txtboxNamaProdukDiJual'), GlobalVariable.nameKopiBubuk)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/btnSearchProdukDiJualOffShelf'))

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060206_EditProduk/cbProdukDiJual1'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/hrefOffShelf'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnOkeOffShelf'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/hrefProdukTersimpan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/hrefEdit'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxCategoryNewVersion'), 
    GlobalVariable.kategoriMinuman)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/lblMinuman'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/Page_/btnEditLanjutkanNewVersion'), 
    60)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/lblXTambahkanProduk'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/hrefKopi'))

WebUI.switchToWindowIndex(GlobalVariable.index1)

GlobalVariable.urlEditProduct = WebUI.getUrl()

