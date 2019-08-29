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
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Business_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickDisiniDeskripsiToko'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), GlobalVariable.input500karakter)

    String karakter = GlobalVariable.input500karakter

    mychar = karakter.length()

    String deskripsitoko = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), 'value')

    mychar2 = deskripsitoko.length()

    int maxcharacter = 500

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksium yang ada di text box ' + mychar2)
    }
    
    WebUI.delay(3)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), GlobalVariable.URLProdukRegular5KMainsite)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblDeskripsiTokoTidakBolehMengandungLink'), 30)
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickDisiniDeskripsiToko'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), GlobalVariable.input500karakter)

    String karakter = GlobalVariable.input500karakter

    mychar = karakter.length()

    String deskripsitoko = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), 'value')

    mychar2 = deskripsitoko.length()

    int maxcharacter = 500

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksium yang ada di text box ' + mychar2)
    }
    
    WebUI.delay(3)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtareaBStoreDeskripsiToko'), GlobalVariable.URLProdukRegular5KMainsite)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/lblDeskripsiTokoTidakBolehMengandungLink'), 30)
}

