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

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKlikDisiniLogoToko'))

    String Projectpath = System.getProperty('user.dir')

    String Filepath = Projectpath + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnBStoreUploadLogoToko'), Filepath)

    result = WebUI.getText(findTestObject('01_DESKTOP/0106_Seller/lblBStoreTitleImage'), FailureHandling.STOP_ON_FAILURE)

    log.logInfo(result)

    String relativeImage = GlobalVariable.relativeImage

    log.logInfo(relativeImage)

    if (relativeImage.contains(result)) {
        log.logInfo('Passed')
    } else {
        log.logInfo('Failed')
    }
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKlikDisiniLogoToko'))

    String Projectpath = System.getProperty('user.dir')

    String Filepath = Projectpath + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnBStoreUploadLogoToko'), Filepath)

    result = WebUI.getText(findTestObject('01_DESKTOP/0106_Seller/lblBStoreTitleImage'), FailureHandling.STOP_ON_FAILURE)

    log.logInfo(result)

    String relativeImage = GlobalVariable.relativeImage

    log.logInfo(relativeImage)

    if (relativeImage.contains(result)) {
        log.logInfo('Passed')
    } else {
        log.logInfo('Failed')
    }
} else {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKembaliDokumenPage'))

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKlikDisiniLogoToko'), FailureHandling.CONTINUE_ON_FAILURE)

    String Projectpath = System.getProperty('user.dir')

    String Filepath = Projectpath + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnBStoreUploadLogoToko'), Filepath)

    result = WebUI.getText(findTestObject('01_DESKTOP/0106_Seller/lblBStoreTitleImage'), FailureHandling.STOP_ON_FAILURE)

    log.logInfo(result)

    String relativeImage = GlobalVariable.relativeImage

    log.logInfo(relativeImage)

    if (relativeImage.contains(result)) {
        log.logInfo('Passed')
    } else {
        log.logInfo('Failed')
    }
}

