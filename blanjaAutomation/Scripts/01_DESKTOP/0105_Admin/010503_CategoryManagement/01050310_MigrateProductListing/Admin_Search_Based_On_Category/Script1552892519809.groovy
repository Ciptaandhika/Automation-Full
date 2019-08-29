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

WebUI.waitForPageLoad(60)

WebUI.waitForElementVisible(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnROOTCurrentCategory'), 
    60)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/txtboxSearchCurrentCategory'), 
    GlobalVariable.keywordProductModLogFashion)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnSearchCurrentCategory'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblCurrentCategoryFashion'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/txtboxNewCategoryMigrateProductListing'), 
    GlobalVariable.keywordProductModLogFashion)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnSearchNewCategoryMigrateProductListing'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblNewCategoryFashion'), 
    30)

