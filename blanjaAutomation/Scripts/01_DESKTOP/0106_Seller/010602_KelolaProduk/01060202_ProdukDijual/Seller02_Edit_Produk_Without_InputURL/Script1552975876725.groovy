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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/hrefEditProduct'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/ddFoodBrand'), 
    GlobalVariable.index2)

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/rbNewCondition'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtPanjang'), 
    GlobalVariable.sizeForPayment)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtLebar'), 
    GlobalVariable.sizeForPayment)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtTinggi'), 
    GlobalVariable.sizeForPayment)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtBerat'), 
    GlobalVariable.value100)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtNamaProduk'), 
    GlobalVariable.editProductNameKopi)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtHargaJual'), 
    GlobalVariable.editNominal20k)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtStokBarang'), 
    GlobalVariable.editValue30)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.qode500jpg

WebUI.mouseOver(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/btnMainTambahkanFoto'))

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/btnMainTambahkanFoto'), 
    Filepath)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/txtareaEditProductKopi'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/txtareaEditProductKopi'), 
    GlobalVariable.editProductDescription)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/btnLanjutkan'))

