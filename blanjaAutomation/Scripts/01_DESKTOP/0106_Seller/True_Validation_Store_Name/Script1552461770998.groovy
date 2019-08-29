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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnOpenStore'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Individual_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.input35Karakter)

    String karakter = GlobalVariable.input35Karakter

    mychar = karakter.length()

    String shopname = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), 'value')

    mychar2 = shopname.length()

    int maxcharacter = 30

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksimum yang ada di text box ' + mychar2)
    }
    
    WebUI.delay(3)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.inputSameStore)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningNamaTokoSudahTerdaftar'), GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.inputSameStoreCaseSensitive)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningNamaTokoSudahTerdaftar'), GlobalVariable.setTimeOutGlobal)
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), 3, FailureHandling.OPTIONAL)) {
    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'))

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.input35Karakter)

    String karakter = GlobalVariable.input35Karakter

    mychar = karakter.length()

    String shopname = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), 'value')

    mychar2 = shopname.length()

    int maxcharacter = 30

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksium yang ada di text box ' + mychar2)
    }
    
    WebUI.delay(3)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.inputSameStore)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningNamaTokoSudahTerdaftar'), GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxShopName'), GlobalVariable.inputSameStoreCaseSensitive)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningNamaTokoSudahTerdaftar'), GlobalVariable.setTimeOutGlobal)
}

