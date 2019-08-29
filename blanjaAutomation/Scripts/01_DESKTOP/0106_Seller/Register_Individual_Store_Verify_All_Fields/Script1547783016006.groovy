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

WebUI.waitForPageLoad(GlobalVariable.setTimeOutGlobal)

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnOpenStore'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Individual_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxShopDomain'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnDisini'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnClickDisiniDeskripsiToko'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtareaAlamatToko'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/ddProvinsiOpenStore'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnBackToTypeStore'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanOpenStore'), GlobalVariable.setTimeOutGlobal)
} else {
    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxShopDomain'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnDisini'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnClickDisiniDeskripsiToko'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtareaAlamatToko'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/ddProvinsiOpenStore'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnBackToTypeStore'), GlobalVariable.setTimeOutGlobal)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanOpenStore'), GlobalVariable.setTimeOutGlobal)
}

