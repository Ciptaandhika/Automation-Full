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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/hrefCashbackCampaign'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnAdd'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/ddProgramName'), 
    GlobalVariable.ddCashbackCampaign_ProgramName, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/txtCampaignName2'), 
    dynamic_Campaign)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/hrefSelectCoupon'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/Page_/txtSearchCouponName'), 
    GlobalVariable.txtKoinBlanja_CouponPartnerUnique2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/Page_/btnSearchCouponName'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/Page_/lblDiskon100K'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnSelect'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/txtCashbackWillExp'), 
    GlobalVariable.txtCashbackCampaign_CashbackWillExp)

WebUI.verifyElementNotChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/cbNoExp'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnSubmit'))

