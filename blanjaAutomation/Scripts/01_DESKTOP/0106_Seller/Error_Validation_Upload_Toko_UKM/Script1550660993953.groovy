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
import com.kms.katalon.core.logging.KeywordLogger

KeywordLogger log = new KeywordLogger()
WebUI.click(findTestObject('01_DESKTOP/0106_Seller/lblTabPerusahaan'))

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.largeimage

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0106_Seller/btnUploadNPWPUKMToko'), 
    Filepath)

WebUI.delay(3)

WebUI.verifyAlertPresent(30)

popupAlert=WebUI.getAlertText()

log.logInfo(popupAlert)

WebUI.acceptAlert()

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0106_Seller/btnUploadSIUPUKMToko'), 
    Filepath)

WebUI.delay(3)

WebUI.verifyAlertPresent(30)

popupAlert2=WebUI.getAlertText()

log.logInfo(popupAlert2)

WebUI.acceptAlert()

