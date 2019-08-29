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

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/lblTabSudahDibayar'), 
    60)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnUploadNomorResi'))

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.pathFile

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnUploadNewNoResi'), 
    Filepath)

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnOrangeFileExcelUpload'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010603_KelolaPemesanan/01060301_TransaksiPenjualan/btnLanjutkan'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblPastikanFileExcel'), 6)

