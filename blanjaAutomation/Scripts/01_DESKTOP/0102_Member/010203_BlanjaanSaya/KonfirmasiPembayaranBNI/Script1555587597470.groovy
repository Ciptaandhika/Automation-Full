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

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/transferKe'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/Page_Blanjaan Saya - BLANJA.com/liRekeningBNI'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/txtNominal'), GlobalVariable.nominalKonfirmasiPembayaran)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/txtNomorRekening'), 
    GlobalVariable.nomorRekeningPengirim)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/bankPengirim'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/Page_Blanjaan Saya - BLANJA.com/liRekeningBNI_Pengirim'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/txtNamaPemilikRekening'), 
    GlobalVariable.namaPemilikRekening)

not_run: CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Blanjaan Saya - BLANJA.com/btnPilihBuktiTransfer'), 
    30)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.relativeImage

WebUI.uploadFile(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/Page_Rincian Blanjaan - BLANJA.com/btnPilihGambar'), 
    Filepath)

not_run: WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/010602_KelolaProduk/01060201_TambahkanProduk/NewVersion/btnUploadImageNew'), 
    Filepath)

WebUI.delay(10)

WebUI.click(findTestObject('01_DESKTOP/0102_Member/010203_BlanjaanSaya/020301_OrderDetail/Page_Rincian Blanjaan - BLANJA.com/btnSubmitKonfirmasi'))

WebUI.delay(5)

