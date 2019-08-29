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
import org.openqa.selenium.Keys as Keys
import groovy.time.TimeCategory as TimeCategory

WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

mydate = new Date()

formattedDate = mydate.format('dd MMM ')

datehour = mydate.format('HHmm')

promotionDate = mydate.format('dd/MM/yyyy HH')

use(TimeCategory, { 
        Hours = (mydate + 1.hours)
    })

endDate = Hours.format('dd/MM/yyyy HH')

site_id = (((GlobalVariable.promoJakartaJabar + ' ') + formattedDate) + datehour)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/hrefFreeShippingPromotion'))

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/ddDiskonOngkirOnsite2019'), 
    GlobalVariable.index1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/txtAreaPromotionName'), 
    site_id)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelStartDate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelNext'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/href1'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelEndDate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelNext'))

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/lblArea'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/span_Daerah Istimewa Yogyakart'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/span_Kota Sungai Penuh_tree_65'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/span_Kota Sungai Penuh_tree_65Check'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxShippingDiscount'), 
    GlobalVariable.CoverShippingDiscount30K)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbShippingDiscount'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtAreaPromotionInfo'), 
    GlobalVariable.promoJakartaJabar)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbAppliedTo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxThreshold'), 
    GlobalVariable.valueThresholdShipping80K)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/ddType'), 
    GlobalVariable.index1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/ddBudgetArea2'), 
    GlobalVariable.index1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/txtBoxBudget-alocation-1'), 
    GlobalVariable.txtBoxTotalBudget)

//WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/rbBlanjaCoveredPercent'))

//WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/input__budget-covered-1'), 
  //  GlobalVariable.txtBoxPromotionInventory)

//WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/Free Shipping Promotion/txtboxBilledPartner'), 
  //  GlobalVariable.txtBoxBilledPartner)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/input_Partners Indirect Suppor'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/input_ATL'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/btnSave'))

