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

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeStartDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeEndDate'), 
    'endDate')

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPointExpirationTime'), 
    'startDate', 2, 0)

WebUI.delay(5)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtThresholdSpend'), 
    GlobalVariable.Threshold31500)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAppliesMultiply'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/rbUseCriteriaNo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPrizeTitle'), GlobalVariable.txtKoinBlanja_PrizeTitle)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.largeimage

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/hrefUploadImagePrize'), 
    Filepath)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/lblAlertMaximum500kb'), 
    60)

