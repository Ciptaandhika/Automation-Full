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

WebUI.scrollToElement(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreCompanyName'), GlobalVariable.setTimeOutGlobal)

String userDir = System.getProperty('user.dir')

String pngImage = userDir + GlobalVariable.pngimage

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnUploadSIUP'), pngImage)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelwarningLogoImagePNG'), GlobalVariable.setTimeOutGlobal)

WebUI.delay(GlobalVariable.setTimeOutGlobal)

String largeImage = userDir + GlobalVariable.largeimage

WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnUploadSIUP'), largeImage)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningGambarTerlaluBesar'), GlobalVariable.setTimeOutGlobal)

