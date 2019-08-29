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
import com.kms.katalon.core.logging.KeywordLogger



KeywordLogger log = new KeywordLogger()

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0106_Seller/txtAreaNamaToko'), 
    GlobalVariable.namaInputFieldsMandatory)

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0106_Seller/txtAreaAlamatToko (1)'), 
    GlobalVariable.alamatPengirimanInputFieldMandatoryBuyer)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddProvinsi'), GlobalVariable.index1)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKota'), GlobalVariable.index1)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKecamatan'), GlobalVariable.index1)

String Kodepos=WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxKodePosUKM'), 'value')

log.logInfo(Kodepos)

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0106_Seller/txtAreaNomorKTP'), 
    GlobalVariable.noHpRegisterPage)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.relativeImage

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0106_Seller/hrefUploadKTP'), Filepath)

WebUI.delay(6)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddJenisBinaan'), GlobalVariable.index1)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddNamaBank'), GlobalVariable.index1)

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0106_Seller/lblNomorRekening'), 
    GlobalVariable.nomorHPInputFieldsMandatory)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtAreaCabangBank'), GlobalVariable.NamaCabangDompetBlanja)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtAreaNamaPemilikRekening'), GlobalVariable.namaInputFieldsMandatory)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnMulaiBerjualan1'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnMulaiBerjualan1'))

WebUI.delay(2)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/hrefOKMulaiBerjualan'), 
    2)

