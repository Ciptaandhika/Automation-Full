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

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddProvinsiOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKabupatenOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKecamatanOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.postalCode)

    String karakter = GlobalVariable.inputPostalCode6Karakter

    mychar = karakter.length()

    String postalcode = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), 'value')

    mychar2 = postalcode.length()

    int maxcharacter = 5

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksimum yang ada di text box ' + mychar2)
    }
    
    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(3)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.storeOwnerName)

    WebUI.verifyTextNotPresent(GlobalVariable.storeOwnerName, false)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.inputCombinationCharacter)

    WebUI.verifyTextNotPresent(GlobalVariable.inputCombinationCharacter, false)
} else {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddProvinsiOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKabupatenOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0106_Seller/ddKecamatanOpenStore'), GlobalVariable.ddIndexValue)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.postalCode)

    String karakter = GlobalVariable.inputPostalCode6Karakter

    mychar = karakter.length()

    String postalcode = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), 'value')

    mychar2 = postalcode.length()

    int maxcharacter = 5

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksimum yang ada di text box ' + mychar2)
    }
    
    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(3)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.storeOwnerName)

    WebUI.verifyTextNotPresent(GlobalVariable.storeOwnerName, false)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPostalCode'), GlobalVariable.inputCombinationCharacter)

    WebUI.verifyTextNotPresent(GlobalVariable.inputCombinationCharacter, false)
}

