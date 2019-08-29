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

WebUI.callTestCase(findTestCase('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/TakeRateSettingDirectSetTakeRate'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/rbFromTakeRate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/lblStartDateTakeRate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/labelNext'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/lblEndDateTakeRate'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/labelNext'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/rbTakeRateFlat'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/txtBoxTakeRateFlat'), 
    GlobalVariable.takeRate7)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/ddScopeCategoryGroupType'), 
    GlobalVariable.index2, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/txtAreaProductTakeRate'), 
    GlobalVariable.idProductFashion)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/btnSaveTakeRate'))

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/btnOkeTakeRateSama'), 
    2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/btnOkeTakeRateSama'))
} else {
}

