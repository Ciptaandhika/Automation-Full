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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnOpenStore'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Business_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), GlobalVariable.storeOwnerName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreNamaToko'), GlobalVariable.storeName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.domainName)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKlikDisiniLogoToko'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnBStoreUploadLogoToko'), GlobalVariable.sampleImage, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKlikDisiniDeskripsiToko'))

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), GlobalVariable.storeDescription)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreAlamatToko'), GlobalVariable.storeLocation)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddBStoreProvince'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddBStoreDistrict'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddBStoreRegency'), GlobalVariable.ddIndexValue)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStorePostalCode'), GlobalVariable.postalCode)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanBStore'))
	WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Verifiy_Individual_Store_ConfirmPage'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), GlobalVariable.storeOwnerName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreNamaToko'), GlobalVariable.storeName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.domainName)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKlikDisiniLogoToko'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnBStoreUploadLogoToko'), GlobalVariable.sampleImage, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKlikDisiniDeskripsiToko'))

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), GlobalVariable.storeDescription)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreAlamatToko'), GlobalVariable.storeLocation)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddBStoreProvince'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddBStoreDistrict'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddBStoreRegency'), GlobalVariable.ddIndexValue)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStorePostalCode'), GlobalVariable.postalCode)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanBStore'))
	WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Verifiy_Individual_Store_ConfirmPage'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Verifiy_Individual_Store_ConfirmPage'), [:], FailureHandling.STOP_ON_FAILURE)
}

