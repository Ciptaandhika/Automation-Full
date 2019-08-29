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

site_id = (((GlobalVariable.txtBoxMultipleShipping4 + ' ') + formattedDate) + datehour)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/ddProgramNameShipping'), 
    GlobalVariable.ddProgramNameShipping, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxPromotionName'), 
    site_id)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelStartDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelEndDate'), 
    'endDate')

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/ddCoverageArea'), 
    GlobalVariable.ddCoverageAreaShipping, true)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxShippingDiscount'), 
    GlobalVariable.index10k)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbShippingDiscount'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtAreaPromotionInfo'), 
    GlobalVariable.txtAreaPromotionInfo)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbAppliedTo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxThreshold'), 
    GlobalVariable.txtBox100000)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/ddType'), 
    GlobalVariable.ddType, true)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxBilledPartner'), 
    GlobalVariable.txtBoxBilledPartner)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbPartnersIndirect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbATL(AbovetheLine)'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/btnSave'))

not_run: WebUI.navigateToUrl(GlobalVariable.urlAdminFreeShipping)

