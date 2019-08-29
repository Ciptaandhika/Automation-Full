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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/SellerTest'), 
    [:], FailureHandling.STOP_ON_FAILURE)

try {WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnX'))}
catch (Exception e){}

WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/clickTambahkanProduk'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnTambahFotoNewVersion'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnTambahFotoNewVersion'), 
    30)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.relativeImage

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnUploadImageNew'), 
    Filepath)

String myPulsa = GlobalVariable.namaTokenPLN

mydate = new Date()

formattedDate = mydate.format('dd MM ')

datehour = mydate.format('HHmm')

String newPulsa = (myPulsa + formattedDate) + datehour

String myNewPulsa = newPulsa.replaceAll('\\s+', '')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxNamaProductNewVersion'), 
    myNewPulsa)

GlobalVariable.urlEvent = myNewPulsa

not_run: WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/divDescription'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/divDescription'), 
    myNewPulsa)

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtAreaTinyMCENewVersionBilly'), 
    GlobalVariable.urlEvent)

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxCategoryNewVersion'), 
    GlobalVariable.nameKataKunci2)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/li_SuggestPulsa'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/txtboxHargaBarangmain'), 
    GlobalVariable.saldoAdd50K)

String mynumber = GlobalVariable.SKUID1

int mylength = mynumber.length()

String submynumber = mynumber.substring(0, mylength - 4)

mydate = new Date()

formattedDate = mydate.format('dd MM ')

String sku_newcharacter = submynumber + formattedDate

String skunew = sku_newcharacter.replaceAll('\\s+', '')

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/txtboxSkuProduk'), skunew)

log.logInfo(skunew)

GlobalVariable.urlEvent3 = skunew

log.logInfo(GlobalVariable.urlEvent3)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/txtboxStockBarangNewVersion'), 
    GlobalVariable.nominal30k)

WebUI.delay(10)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnLanjutkanNewVersion'), 
    30)

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/divCloseDialog'))

WebUI.delay(5)

