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

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/rbNewCondition'))

WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtPanjang'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtPanjang'), 
    GlobalVariable.value100)

WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtLebar'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtLebar'), 
    GlobalVariable.value100)

WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtTinggi'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtTinggi'), 
    GlobalVariable.value100)

WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtBerat'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtBerat'), 
    GlobalVariable.value100)

WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtNamaProduk'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtNamaProduk'), 
    GlobalVariable.nameKopiBubuk)

WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtHargaJual'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtHargaJual'), 
    GlobalVariable.nominal30k)

WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtStokBarang'))

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtStokBarang'), 
    GlobalVariable.value100)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.relativeImage

WebUI.mouseOver(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/btnMainTambahkanFoto'))

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/btnMainTambahkanFoto'), 
    Filepath)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/rbTIDAK'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/btnSimpan'))

