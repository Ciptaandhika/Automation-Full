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

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/judulPromosi'), GlobalVariable.txtBoxPromotionNameShipping3)

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtBoxBatas'), GlobalVariable.index20k)

not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtBoxBatas'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/labelPengirimanGratis'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/labelPengirimanGratis'), 
    0)

not_run: WebUI.click(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/labelPotonganDiskon'))

not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/labelPotonganDiskon'), 
    0)

not_run: WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtBoxPotonganDiskon'), 
    GlobalVariable.txtBox100000)

not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/txtBoxPotonganDiskon'), 
    0)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/ddCoverArea'), 
    GlobalVariable.index1)

WebUI.verifyOptionSelectedByIndex(findTestObject('01_DESKTOP/0106_Seller/010606_KelolaPemasaran/01060601_PengaturanPromosi/ddCoverArea'), 
    GlobalVariable.index1, 0)

