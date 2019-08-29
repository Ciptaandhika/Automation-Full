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
    60)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnROOTCurrentCategory'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnCurrentCategoryComputerLaptop'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnCurrentCategoryLaptop'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnCurrentCategoryOffice Laptop'), 
    30)

WebUI.check(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/cbCurrenCategoryOfficeLaptop'))

WebUI.check(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/cbProduct2MigrateListing'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnROOTNewCategory'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnMainCategoryComputerLaptop(New)'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnSubCategoryLaptop(New)'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnPremiumUltraBook(New)'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnSubmit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblSuccessMigrate'), 
    30)

product1 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblListProductNum1MigrateListing'), 
    'value')

product2 = WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblListProductNum2MigrateListing'), 
    'value')

WebUI.delay(5)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnOrangePopUpMigrateSubmit'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/btnHistoryMigrateListing'))

historyProduct1=WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblMigrateHistoryProduct1'), 
    'value')

historyProduct2=WebUI.getAttribute(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050310_MigrateProductListing/lblMigrateHistoryProduct2'), 
    'value')

