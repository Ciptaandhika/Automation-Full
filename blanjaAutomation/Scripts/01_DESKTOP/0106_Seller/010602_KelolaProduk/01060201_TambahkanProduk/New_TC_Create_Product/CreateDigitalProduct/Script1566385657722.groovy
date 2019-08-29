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

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxNamaProductNewVersion'), 
    GlobalVariable.namePulsa30k)

WebUI.mouseOver(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnTambahFotoNewVersion'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnTambahFotoNewVersion'), 
    30)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.JPGimage

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnUploadImageNew'), 
    Filepath)

//CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnUploadLocalDiskNewVersion'), 
//   Filepath)
WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtAreaTinyMCENewVersionBilly'), 
    GlobalVariable.addProductDescription)

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/rbNewCondition'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxCategoryNewVersion'), 
    GlobalVariable.nameKataKunci2)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/liPulsa'), 
    30)

//WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/ddFoodBrandNewVersion'), 
//    GlobalVariable.ddIndexValue)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxPriceNewVersion'), 
    GlobalVariable.nominal30k)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxStockBarangNewVersion'), 
    GlobalVariable.qtyMaxProduct)

//WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/ddProvinceNewVersion'), 
//    GlobalVariable.ddIndexValue)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnLanjutkanNewVersion'), 
    30)

WebUI.delay(5)

