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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnOpenStore'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Individual_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.storeOwnerName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.noHPPulsa)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.storeName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopDomain'), GlobalVariable.domainName)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickUploadLogoToko'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnUploadLogoToko'), GlobalVariable.sampleImage, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickDisiniDeskripsiToko'))

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaDeskripsiToko'), GlobalVariable.storeDescription)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaAlamatToko'), GlobalVariable.storeLocation)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddProvinsiOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKabupatenOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKecamatanOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.postalCode)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanOpenStore'))

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/cbSellerAgreement'))

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanConfirmPage'))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelCountdownVerifyPhoneNumber'), GlobalVariable.setTimeOutGlobal)
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), 3, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.storeOwnerName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.noHPPulsa)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.storeName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopDomain'), GlobalVariable.domainName)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickUploadLogoToko'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnUploadLogoToko'), GlobalVariable.sampleImage, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickDisiniDeskripsiToko'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaDeskripsiToko'), GlobalVariable.storeDescription)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaAlamatToko'), GlobalVariable.storeLocation)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/ddProvinsiOpenStore'))

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddProvinsiOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKabupatenOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKecamatanOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.postalCode)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanOpenStore'))

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/cbSellerAgreement'))

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanConfirmPage'))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelCountdownVerifyPhoneNumber'), GlobalVariable.setTimeOutGlobal)
} else {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/cbSellerAgreement'))

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanConfirmPage'))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelCountdownVerifyPhoneNumber'), GlobalVariable.setTimeOutGlobal)
}

