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

WebUI.navigateToUrl(GlobalVariable.txtKoinBlanja_URLKoinBlanja)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnCreateCampaign'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignName'), 
    dynamic_Campaign)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeStartDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeEndDate'), 
    'endDate', 5, 0)

WebUI.delay(6)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPointExpirationTime'), 
    'startDate', 7, 0)

WebUI.delay(5)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtThresholdSpend'), 
    GlobalVariable.Threshold31500)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAppliesMultiply'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/rbUseCriteriaNo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPrizeTitle'), 'Cobacoba1')

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + '\\image\\390x200.png'

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefUploadImage'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtAreaExchangeKoin'), '10')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/hrefSelectCoupon'))

WebUI.delay(6)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtBlanjaCoupons_CouponName20k)

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

WebUI.delay(6)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtAreaStartTimeRedeem'), 
    'startDate', 1, 0)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtAreaEndTimeRedeem'), 
    'endDate', 4, 0)

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAutoCreate'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/btnAddNewDirect'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPrizeTitle2'), 'Cobacoba2')

String Projectpath2 = System.getProperty('user.dir')

String Filepath2 = Projectpath2 + '\\image\\390x200.png'

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/hrefUploadImage2'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtExchangePoint2'), 
    '4')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/hrefSelectCoupon2'))

WebUI.delay(6)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtBlanjaCoupons_CouponName20k)

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

WebUI.delay(6)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/StartTimeRedeem2'), 
    'startDate', 2, 0)

WebUI.delay(6)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/EndTimeRedeem2'), 
    'endDate', 3, 0)

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Edit/cbAutoCreate2'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/btnAddNewDirect'))

WebUI.delay(6)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Edit/txtPrizeTitle3'), 'Cobacoba3')

String Projectpath3 = System.getProperty('user.dir')

String Filepath3 = Projectpath3 + '\\image\\390x200.png'

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Edit/hrefUploadImage3'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Edit/txtExchangePoint3'), 
    '2')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/hrefSelectCoupon3'))

WebUI.delay(6)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtBlanjaCoupons_CouponName20k)

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

WebUI.delay(6)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/StartTimeRedeem3'), 
    'startDate', 3, 0)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/EndTimeRedeem3'), 
    'endDate')

WebUI.delay(6)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Edit/cbAutoCreate3'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSave'))

WebUI.delay(6)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/lblActive'), 
    0)

