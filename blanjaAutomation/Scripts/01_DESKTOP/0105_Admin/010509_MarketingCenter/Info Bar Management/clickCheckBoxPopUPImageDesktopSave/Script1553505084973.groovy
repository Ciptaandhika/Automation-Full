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

WebUI.check(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/cbxClickToAction'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/rbtnPopUpImageDesktop'))

String Projectpath = System.getProperty('user.dir')

println(Projectpath)

String Filepath = Projectpath + GlobalVariable.relativeFile

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/btnPopUpImageDesktop'), 
    Filepath)

//WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/btnPopUpImageDesktop'), 
//Filepath)
WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/btnPopUpImageDesktop'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/btnSave'))

WebUI.verifyTextPresent('image format must be in JPG, JPEG, PNG with max size 2 MB', false)

