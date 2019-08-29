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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/hrefCashbackCampaign'))

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

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/lblPartialCoupons'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/hrefSelectCoupon'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/lblCovBlanjaUnique'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/btnSelect'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050922_CashbackCampaign/lblCovBlanjaUnique'), 
    30)

