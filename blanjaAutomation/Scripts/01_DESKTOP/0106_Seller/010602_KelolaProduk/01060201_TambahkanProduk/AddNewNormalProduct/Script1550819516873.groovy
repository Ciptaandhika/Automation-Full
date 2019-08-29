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

WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/SellerTest'), 
    [:], FailureHandling.STOP_ON_FAILURE)

try {WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnX'))}
catch (Exception e){}

WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/clickTambahkanProduk'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/txtKataKunci'), GlobalVariable.nameKataKunci)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/btnCari'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/rbCamilanRingan'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/btnLanjutkan'))

WebUI.check(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060202_ProdukDijual/rbNewCondition'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/ddFoodBrand'), 
    GlobalVariable.valueIndexBarangSeller)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtPanjang'), 
    GlobalVariable.value100)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtLebar'), 
    GlobalVariable.value100)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtTinggi'), 
    GlobalVariable.value100)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtBerat'), 
    GlobalVariable.value100)

not_run: WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtBeratPengiriman'), 
    GlobalVariable.value100)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtNamaProduk'), 
    GlobalVariable.nameKopiBubuk2)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtHargaJual'), 
    GlobalVariable.nominal30k)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/txtStokBarang'), 
    GlobalVariable.value100)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + '\\image\\sampleimage.jpg'

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/btnTambahFoto'), 
    Filepath)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/SCHEDULER/rbTIDAK'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/btnLanjutkanTambahkanProduct'))

WebUI.mouseOver(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/lableSeller01'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/aKeluar'))

