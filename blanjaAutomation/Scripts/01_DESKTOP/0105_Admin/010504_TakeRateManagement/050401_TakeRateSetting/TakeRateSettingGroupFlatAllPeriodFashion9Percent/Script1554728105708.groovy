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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/rbAllPeriod'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/rbTakeRateFlat'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/txtBoxTakeRateFlat'), 
    GlobalVariable.valueTakeRateFlat9)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/ddScopeCategoryGroupType'), 
    GlobalVariable.index0)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/ddScopeCategoryGroupName'), 
    GlobalVariable.valueFashionTR, GlobalVariable.choices)

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010504_TakeRateManagement/050401_TakeRateSetting/btnSaveTakeRate'))

