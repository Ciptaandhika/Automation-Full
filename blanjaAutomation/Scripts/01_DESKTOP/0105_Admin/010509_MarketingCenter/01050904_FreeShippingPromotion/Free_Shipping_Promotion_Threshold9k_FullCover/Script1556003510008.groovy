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

WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/ChooseFreeShippingMenu'), 
    [:], FailureHandling.STOP_ON_FAILURE)

mydate = new Date()

formattedDate = mydate.format('ddMM ')

datehour = mydate.format('HHmmss')

promotionDate = mydate.format('dd/MM/yyyy HH')

site_id = (((GlobalVariable.txtBoxPromotionNameShipping2 + ' ') + formattedDate) + datehour)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/ddProgramNameShipping'), 
    GlobalVariable.ddProgramNameShipping)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxPromotionName'), 
    site_id)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/txtboxPartialPromotionStartDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/txtboxPartialPromotionEndDate'), 
    'endDate')

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/ddPartialPromotionCoverageArea'), 
    GlobalVariable.index1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtAreaPromotionInfo'), 
    GlobalVariable.txtAreaPromotionInfo)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbAppliedTo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxThreshold'), 
    GlobalVariable.index10k)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/ddPartialPromotionPartnership'), 
    GlobalVariable.index1)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/ddPartialPromotionBudgetArea'), 
    GlobalVariable.index1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/txtboxBudgetAlocation'), 
    GlobalVariable.txtBoxBilledPartner)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbPartnersIndirect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbATL(AbovetheLine)'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/btnSaveAllProduct'))

