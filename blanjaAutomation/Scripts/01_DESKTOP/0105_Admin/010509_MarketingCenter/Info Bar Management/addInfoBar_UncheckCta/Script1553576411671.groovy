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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/Page_/txtAreaContentText'), 
    GlobalVariable.txtContext)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/cbxClickToAction'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/Page_/btnSave'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/btnInfoBarManagement'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/cbxClickToAction'))

txt = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/Page_/txtAreaCta'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyEqual(txt, '')

not_run: txt1 = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/Page_/txtBoxRedirectUrlDesktop'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyEqual(txt1, '')

not_run: txt2 = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/Page_/txtBoxRedirectUrlMobile'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyEqual(txt2, '')

WebUI.navigateToUrl(GlobalVariable.urlhomepage)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnCloseBukuPanduan'))

WebUI.verifyElementNotPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/Info Bar Management/Page_/hrefCTA'), 
    0)

