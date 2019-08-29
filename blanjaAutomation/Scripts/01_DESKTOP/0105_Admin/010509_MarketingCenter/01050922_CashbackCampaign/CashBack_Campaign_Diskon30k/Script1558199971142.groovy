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

formattedDate = mydate.format('ddMMM')

dynamic_Campaign = ((GlobalVariable.txtCashbackCampaign_CampaignName + formattedDate) + datehour)

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/hrefCashbackCampaign'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnAdd'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/ddProgramName'), 
    GlobalVariable.ddCashbackCampaign_ProgramName, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/txtCampaignName2'), 
    dynamic_Campaign)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/hrefSelectCoupon'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/Page_/txtSearchCouponName'), 
    GlobalVariable.txtBlanjaCoupons_CouponName20k)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/Page_/btnSearchCouponName'))

WebUI.delay(3)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/Page_/lblDiskon100K'), 
    60)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnSelect'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/txtCashbackWillExp'), 
    GlobalVariable.txtCashbackCampaign_CashbackWillExp)

WebUI.verifyElementNotChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/cbNoExp'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnSubmit'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/txtCampaignName'), 
    GlobalVariable.txtCashbackCampaign_CampaignName)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/ddStatus'), 
    GlobalVariable.ddCashbackCampaign_Status, GlobalVariable.isTrue)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnAdd'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/ddProgramName'), 
    GlobalVariable.ddCashbackCampaign_ProgramName, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/txtCampaignName2'), 
    GlobalVariable.txtCashbackCampaign_CampaignName)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/hrefSelectCoupon'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/lblPartialCoupons'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnSelect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/cbNoExp'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/cbNoExp'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnSubmit'))

