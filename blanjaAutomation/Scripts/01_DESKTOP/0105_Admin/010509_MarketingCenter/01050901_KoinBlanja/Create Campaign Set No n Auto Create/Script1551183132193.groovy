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

mydate = new Date()

datehour = mydate.format('HHmm')

dynamic_Campaign = (GlobalVariable.txtKoinBlanja_CampaignName + datehour)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefKoinBlanja'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnCreateCampaign'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignName'), 
    dynamic_Campaign)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeStartDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamic'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeEndDate'), 
    'endDate', 5)

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamic'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPointExpirationTime'), 
    'endDate', 6)

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbUseRedeemTime'))

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPointExpTimeStartDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamic'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPointExpTimeEndDate'), 
    'endDate', 5)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtThresholdSpend'), 
    GlobalVariable.txtKoinBlanja_ThresholdSpend)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAppliesMultiply'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAppliesMultiply'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtMaximumGetPoint'), 
    GlobalVariable.txtKoinBlanja_MaxGetPoint)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/rbUseCriteriaNo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPrizeTitle'), GlobalVariable.txtKoinBlanja_PrizeTitle)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.relativeImage

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefUploadImage'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtExchangePoint'), 
    GlobalVariable.txtKoinBlanja_ExchangePoint)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/hrefSelectCoupon'))

WebUI.delay(1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtKoinBlanja_CouponPartnerUnique)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamic'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtStartTimeRedeem'), 
    'startDate', 2)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamic'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/txtEndTimeRedeem'), 
    'endDate', 4)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010510_ReportManagement/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnAddNew'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPrizeTitle2'), GlobalVariable.txtKoinBlanja_PrizeTitle)

String Projectpath1 = System.getProperty('user.dir')

String Filepath1 = Projectpath1 + GlobalVariable.relativeImage

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefUploadImage2'), 
    Filepath1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtExchangePoint2'), 
    GlobalVariable.txtKoinBlanja_ExchangePoint)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefSelectCoupon2'))

WebUI.delay(1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtKoinBlanja_CouponPartnerUnique)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamic'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtStartTimeRedeem2'), 
    'startDate', 3)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamic'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtEndTimeRedeem2'), 
    'endDate', 5)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010510_ReportManagement/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnAddNew'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPrizeTitle3'), GlobalVariable.txtKoinBlanja_PrizeTitle)

String Projectpath3 = System.getProperty('user.dir')

String Filepath3 = Projectpath3 + GlobalVariable.relativeImage

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefUploadImage3'), 
    Filepath3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtExchangePoint3'), 
    GlobalVariable.txtKoinBlanja_ExchangePoint)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefSelectCoupon3'))

WebUI.delay(1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtKoinBlanja_CouponPartnerUnique)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAutoCreate3'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSave'))

String label = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_CampaignTesting081259'))

WebUI.verifyMatch(dynamic_Campaign, label, false)

