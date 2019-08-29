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

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnROOTCurrentCategory'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnROOTCurrentCategory'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnCurrentCategoryComputerLaptop'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnCurrentCategoryLaptop'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnCurrentCategoryGamingLaptop'))

WebUI.waitForElementVisible(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/txtboxCurrentCategoryProductNameGamingLaptop'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/txtboxCurrentCategoryProductNameGamingLaptop'), 
    GlobalVariable.keywordProductModLogNotFound)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnSearchCurrenCategoryGamingLaptop'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblWarningProductNotFound'), 
    30)

