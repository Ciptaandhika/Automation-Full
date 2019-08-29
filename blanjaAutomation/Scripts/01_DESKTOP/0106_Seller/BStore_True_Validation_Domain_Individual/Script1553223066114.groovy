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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnOpenStore'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Individual_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.input35Karakter)

    String karakter = GlobalVariable.input35Karakter

    mychar = karakter.length()

    String shopname = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), 'value')

    mychar2 = shopname.length()

    int maxcharacter = 30

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksimum yang ada di text box ' + mychar2)
    }
    
    WebUI.delay(2)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rules1)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rules1, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rule2)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rule2, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rule3)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rule3, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.urlRule4)

    if (WebUI.verifyTextNotPresent(GlobalVariable.urlRule4, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rule5)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rule5, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
} else {
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.input35Karakter)

    String karakter = GlobalVariable.input35Karakter

    mychar = karakter.length()

    String shopname = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), 'value')

    mychar2 = shopname.length()

    int maxcharacter = 30

    if (mychar > maxcharacter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksimum yang ada di text box ' + mychar2)
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.inputSameStoreCaseSensitive)

    WebUI.delay(3)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rules1)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rules1, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rule2)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rule2, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rule3)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rule3, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.urlRule4)

    if (WebUI.verifyTextNotPresent(GlobalVariable.urlRule4, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
    
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreDomainToko'), GlobalVariable.rule5)

    if (WebUI.verifyTextNotPresent(GlobalVariable.rule5, false)) {
        log.logInfo('Tidak Sesuai')
    } else {
        log.logInfo('Sesuai')
    }
}

