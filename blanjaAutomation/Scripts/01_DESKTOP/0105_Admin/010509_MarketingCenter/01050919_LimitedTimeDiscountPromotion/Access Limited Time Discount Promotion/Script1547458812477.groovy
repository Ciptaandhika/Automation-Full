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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/hrefLimitedTimeDiscountPromotion'))

WebUI.verifyEqual(GlobalVariable.urlLimitedTimeDisc, GlobalVariable.urlLimitedTimeDisc)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtPromotionName'), 
    GlobalVariable.txtLimitedTimeDisPromotion_PromotionName)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Master_Name/txtBoxStartDate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Master_Name/href15'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Master_Name/txtBoxEndDate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Master_Name/href31'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/labelPromotionTime'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/btnAddPromotion'))

