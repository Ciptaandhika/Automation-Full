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

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/ddProgramName'), 
    GlobalVariable.ddProgramName, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionName'), 
    GlobalVariable.txtBoxPromotionName2)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTimeFrom'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTime'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxStoreID'), 
    GlobalVariable.txtBoxStoreIdWarungKita)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxProductID'), 
    GlobalVariable.txtBoxProductId5)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnSearch'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050920_KoinBlanjaManagement/txtBoxTotalBudget'), 
    GlobalVariable.txtBoxTotalBudget)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/ddBudgetType'), 
    GlobalVariable.txtBoxBudgetType, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxBlanjaCovereage'), 
    GlobalVariable.txtBoxBlanjaCovereage)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/rbBlanjacovereage'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/ddPartnerName'), 
    GlobalVariable.ddPartnerName, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtBoxEachA'), 
    GlobalVariable.txtBoxEachBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtBoxInventoryA'), 
    GlobalVariable.txtBoxPromotionInventory)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtBoxSellerA'), 
    GlobalVariable.txtBoxSellerNet4)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/txtBoxChipA'), 
    GlobalVariable.txtBoxSellerNet4)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/hrefSelect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnSave'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnOke'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Limited Time Discount Promotion/td_Test LTD 2'), 
    30)

