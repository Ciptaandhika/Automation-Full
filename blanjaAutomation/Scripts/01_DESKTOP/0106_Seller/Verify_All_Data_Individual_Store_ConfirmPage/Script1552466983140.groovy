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

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblTypeStorePerorangan'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreOwnerName'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreNoHandphone'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreNamaToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreDomainToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreDeskripsiToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreAlamatToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreLogoToko'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreProvinsi'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreKabupaten'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreKecamatan'), 30)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lbl_IStoreKodePos'), 30)

