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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/btnUploadKTPMemberBlanja'), 30, 
    FailureHandling.OPTIONAL)) {
    String userDir = System.getProperty('user.dir')

    String KTP = userDir + GlobalVariable.relativeImage

    String Surat_Pernyataan = userDir + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/btnNewUploadKTP'), KTP)

    WebUI.delay(3)

    WebUI.click(findTestObject('01_DESKTOP/0102_Member/010208_DompetBlanja/btnSubmitUpload'))

    String URLpenarikandana = WebUI.getUrl()

    if (URLpenarikandana.contains('withdraw/toVerifyInfo')) {
        log.logInfo('KTP sudah di upload')
    }
} else {
    String URLpenarikandana = WebUI.getUrl()

    if (URLpenarikandana.contains('withdraw/toVerifyInfo')) {
        log.logInfo('KTP sudah di upload')
    }
}

