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
import groovy.time.TimeCategory as TimeCategory
import org.openqa.selenium.WebElement as WebElement

mydate = new Date()

formattedDate = mydate.format('dd MMM ')

datehour = mydate.format('HHmm')

promotionDate = mydate.format('dd/MM/yyyy HH')

use(TimeCategory, { 
        Hours = (mydate + 1.hours)
    })

endDate = Hours.format('dd/MM/yyyy HH')

site_id = (((GlobalVariable.txtBoxPromotionNameShipping5 + ' ') + formattedDate) + datehour)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/ddProgramName'), 
    GlobalVariable.ddProgramName, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionName'), 
    site_id)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTimeFrom'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTime'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxStoreID'), 
    GlobalVariable.txtBoxStoreId3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxProductID'), 
    GlobalVariable.ProductIdWarungKita)

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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxEachBuyer1'), 
    GlobalVariable.txtBoxEachBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionInventory1'), 
    GlobalVariable.txtBoxPromotionInventory)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxSellerNET1'), 
    GlobalVariable.txtBoxChipIN1)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/hrefSelect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnSave'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnOke'))

WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Promotion Direct Url'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/LTD Promotion Create'), 
    [:], FailureHandling.STOP_ON_FAILURE)

mydate = new Date()

formattedDate = mydate.format('dd MMM ')

datehour = mydate.format('HHmm')

promotionDate = mydate.format('dd/MM/yyyy HH')

use(TimeCategory, { 
        Hours = (mydate + 1.hours)
    })

endDate = Hours.format('dd/MM/yyyy HH')

site_id = (((GlobalVariable.txtBoxPromotionNameShipping5 + ' ') + formattedDate) + datehour)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/ddProgramName'), 
    GlobalVariable.ddProgramName, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionName'), 
    site_id)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTimeFrom'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionTime'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxStoreID'), 
    GlobalVariable.idStoreWarungKami)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxProductID'), 
    GlobalVariable.txtKoinBlanja_ProductIDShampoo50K)

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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxEachBuyer1'), 
    GlobalVariable.txtBoxEachBuyer)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxPromotionInventory1'), 
    GlobalVariable.txtBoxPromotionInventory)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/txtBoxSellerNET1'), 
    GlobalVariable.tagihanIndihome2500)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/hrefSelect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnSave'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/btnOke'))

