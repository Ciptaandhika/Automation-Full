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

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.input60Karakter)

    String karakter = GlobalVariable.input60Karakter

    mychar = karakter.length()

    String textboxkarakter = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), 'value')

    mychar2 = textboxkarakter.length()

    int maxkarakter = 60

    if (mychar > maxkarakter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksium yang ada di text box ' + mychar2)
    }
    
    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanPemilikToko'), GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.inputCombinationCharacter)

    WebUI.verifyTextNotPresent(GlobalVariable.inputCombinationCharacter, true)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.storeOwnerName)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelStoreOwnerName460'), 30)
} else {
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.input60Karakter)

    String karakter = GlobalVariable.input60Karakter

    mychar = karakter.length()

    String textboxkarakter = WebUI.getAttribute(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), 'value')

    mychar2 = textboxkarakter.length()

    int maxkarakter = 60

    if (mychar > maxkarakter) {
        log.logInfo('karakter yang di inputkan ' + mychar)

        log.logInfo('karakter maksium yang ada di text box ' + mychar2)
    }
    
    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanPemilikToko'), GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.inputCombinationCharacter)

    WebUI.verifyTextNotPresent(GlobalVariable.inputCombinationCharacter, true)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.storeOwnerName)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelStoreOwnerName460'), 30)
}

