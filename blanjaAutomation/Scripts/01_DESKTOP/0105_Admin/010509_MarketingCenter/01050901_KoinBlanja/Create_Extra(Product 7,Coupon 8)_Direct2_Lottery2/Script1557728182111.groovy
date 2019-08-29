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

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtCampaignTimeEndDate'), 
    'endDate')

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPointExpirationTime'), 
    'startDate', 2, 0)

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtThresholdSpend'), 
    GlobalVariable.txtBlanjaCoupons_Threshold)

//Extra Coin Product 7
WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtProductID'), GlobalVariable.idProductKoinBlanja)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtExtraPoint'), '7')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnCreateExtraPoint'))

//Voucher Non-Cashback 8 Coin
WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/ddCriteria'), 
    GlobalVariable.index1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtBoxUseCoupon'), 
    GlobalVariable.CouponCodeUnique)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtExtraPoint'), '8')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnCreateExtraPoint'))

WebUI.comment('Direct Prize Langsung Row 1')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtPrizeTitle'), 'Voucher Samsung')

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + '\\image\\390x200.png'

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/hrefUploadImagePrize'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtAreaExchangeKoin'), '5')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/hrefSelectCoupon'))

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtBlanjaCoupons_CouponName20k)

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtAreaStartTimeRedeem'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtAreaEndTimeRedeem'), 
    'endDate')

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAutoCreate'))

WebUI.comment('Direct Prize Langsung Row 2')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/btnAddNew'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtboxRow2PrizeTitle'), 'Voucher Sharp')

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrize10Times/hrefUploadImageDirect2'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtboxRow2ExchangeCoin'), 
    '6')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/DirectPrice/hrefSelectCoupon2'))

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/txtSearchCouponName'), 
    GlobalVariable.txtBlanjaCoupons_CouponName5K)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSearchCouponName'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_Partner Unique'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSelect'))

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtboxRow2StartTimeRedeem'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/txtboxRow2EndTimeRedeem'), 
    'endDate')

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/cbAutocreate2'))

WebUI.comment('Lottery Prize Undian Row 1')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/KoinBlanja_Terbaru/txt_LotteryPrize_Tittle'), 
    'Konser Blackpink')

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/KoinBlanja_Terbaru/href_LotteryPrize_UploadFoto'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/KoinBlanja_Terbaru/txt_LotteryPrize_Stock'), 
    '10')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/KoinBlanja_Terbaru/txt_LotteryPrize_ExchangeKoin'), 
    '3')

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/KoinBlanja_Terbaru/txt_LotteryPrize_StartTime'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/KoinBlanja_Terbaru/txt_LotteryPrize_EndTime'), 
    'endDate')

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/KoinBlanja_Terbaru/tzt_LotteryPrize_DrawTime'), 
    'startDate', 2, 0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/btnAddPrize2Lottery'))

WebUI.comment('Lottery Prize Undian Row 2')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/btnAddPrize2Lottery'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/LottePrize10Times/txtboxLottePrizeTitleRow2'), 
    'Konser Tulus')

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/LottePrize10Times/hrefUpload2'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/LottePrize10Times/txtboxLottePrizeStockRow2'), 
    '15')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/LottePrize10Times/txtboxLottePrizeExchangeRow2'), 
    '4')

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/LottePrize10Times/txtboxLottePrizeStartTimeRow2'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/LottePrize10Times/txtboxLottePrizeEndTimeRow2'), 
    'endDate')

WebUI.delay(3)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/LottePrize10Times/txtboxLottePrizeDrawTimeRow2'), 
    'startDate', 2, 0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/btnSave'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/lblActive'), 
    30)

String label = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050901_KoinBlanja/Page_/span_CampaignTesting081259'))

WebUI.verifyMatch(dynamic_Campaign, label, false)

