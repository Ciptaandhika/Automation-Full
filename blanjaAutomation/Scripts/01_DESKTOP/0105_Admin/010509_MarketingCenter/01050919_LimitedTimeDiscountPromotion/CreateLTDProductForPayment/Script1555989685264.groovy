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

WebUI.navigateToUrl(GlobalVariable.urlCreateLTD)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/ddProgramName'), 
    GlobalVariable.ddProgramName, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionName'), 
    GlobalVariable.promotionNameLTDForPayment)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTimeFrom'), 
    'startDate', 0, 0)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTime'), 
    'endDate', 0, 5)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxStoreID'), 
    GlobalVariable.storeIdLtdForPayment)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxProductID'), 
    GlobalVariable.productIdLtdForPayment)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnSearch'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/textBoxTotalBudget'), 
    GlobalVariable.totalBudgetForPaymentCase)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/selectBudgetType'), 
    1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxEachBuyer1'), 
    GlobalVariable.txtBoxEachBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtBoxPromotionInventory'), 
    GlobalVariable.promotionInventoryLtdForPayment)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtBoxSellerNet'), 
    GlobalVariable.sellerNetLtdForPayment)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtBoxChipIn'), 
    GlobalVariable.chipInLtd)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/hrefSelect'))

//not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnSave'))
//not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnOke'))
WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/lblPromoPrice'), 
    2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnSave'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnOke'))

