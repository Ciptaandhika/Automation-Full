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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/rbFromPeriod'))

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/txtInputStartDateTakerate'), 
    GlobalVariable.startDate)

WebUI.delay(2)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/txtInputEndDateTakerate'), 
    GlobalVariable.endDate)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/rbTakeRateFlat'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/txtBoxTakeRateFlat'), 
    GlobalVariable.valueTakeRateFlat)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/ddScopeCategoryGroupType'), 
    GlobalVariable.index1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/txtBoxSeller'), GlobalVariable.valueIDSellerTR)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/btnSaveTakeRate'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/lblPopupDuplicateTRSetting'),
	5)) {

	WebUI.navigateToUrl(GlobalVariable.urlTakeRateSettingPage, FailureHandling.OPTIONAL)

	} else {
	}
