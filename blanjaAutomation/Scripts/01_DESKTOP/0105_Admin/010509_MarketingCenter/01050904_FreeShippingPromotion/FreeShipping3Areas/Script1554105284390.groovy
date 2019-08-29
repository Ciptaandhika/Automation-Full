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

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/ddSelectProgramName'), GlobalVariable.ddProgramNameShipping)

CustomKeywords.'com.mii.DynamicGlobalVariable.dynamicvariable'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxPromotionName'), 
    GlobalVariable.txtBoxPromotionNameShipping4)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelStartDate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelNext'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/href1'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelNext'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/href28'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/LabelEndDate'))

WebUI.delay(2)

WebUI.check(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/lblBali'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/lblDKIJakarta'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/lblBengkulu'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxShippingDiscount'), 
    GlobalVariable.txtBoxShippingDiscount)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbShippingDiscount'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtAreaPromotionInfo'), 
    GlobalVariable.txtAreaPromotionInfo)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbAppliedTo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxThreshold'), 
    GlobalVariable.txtBoxThresholdShipping4)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/ddType'), 
    GlobalVariable.ddType, true)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/txtBoxBilledPartner'), 
    GlobalVariable.txtBoxBilledPartner)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbPartnersIndirect'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/cbATL(AbovetheLine)'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050904_FreeShippingPromotion/FSP/btnSave'))

