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

WebUI.navigateToUrl(GlobalVariable.urlAdminPromoLimitByPhone)

mydate = new Date()

formattedDate = mydate.format('dd MMM ')

datehour = mydate.format('HHmm')

promoPhone = (((GlobalVariable.txtBoxPromotionNameShipping5 + ' ') + formattedDate) + datehour)

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/txtBoxcampaignName'), 
    promoPhone)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/txtBoxstartDate'), 
    GlobalVariable.startDate)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/txtBoxendDate'), 
    GlobalVariable.endDate)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/txtBoxlimitOrderMin'), 
    GlobalVariable.qtyPDPforPayment)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/txtBoxlimitOrderMax'), 
    GlobalVariable.qtyPDPforPayment)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/btnAddProductBtn'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/txtBoxStore ID_shopId'), 
    GlobalVariable.StoreIDTokoA)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/txtBoxProduct ID_productId'), 
    GlobalVariable.txtBoxProductId3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/btnSearchProd'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/btnSelectAdmin'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050905_LimitedByPhonePromotion/btnGO_saveBtn'))

