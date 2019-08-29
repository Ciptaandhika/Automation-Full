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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefKoinBlanja'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnCreateCampaign'))

mydate = new Date()

datehour = mydate.format('HHmm')

dynamic_Campaign = (GlobalVariable.txtKoinBlanja_CampaignName + datehour)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignName'), 
    dynamic_Campaign)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeEndDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeStartDate'), 
    'endDate')

WebUI.delay(3)

resetEndDate = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeEndDate'), 
    'value')

resetStartDate = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeStartDate'), 
    'value')

WebUI.verifyMatch(resetStartDate, resetEndDate, false)

