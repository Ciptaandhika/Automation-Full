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

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/cbSellerAgreement'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanConfirmPage'))

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0106_Seller/inputBStoreOTP'), 30)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/inputBStoreOTP'), GlobalVariable.inputBstoreOTP1)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/inputBStoreOTP2'), GlobalVariable.inputBstoreOTP1)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/inputBStoreOTP3'), GlobalVariable.inputBstoreOTP1)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/inputBStoreOTP4'), GlobalVariable.inputBstoreOTP1)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/inputBStoreOTP5'), GlobalVariable.inputBstoreOTP1)

WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/inputBStoreOTP6'), GlobalVariable.inputBstoreOTP1)

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0106_Seller/btnBStoreVerifikasiEnable'))

WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreVerifikasiEnable'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblBStoreOTPKodeKeamanan'), 30)

