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

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnROOTBackEndCateogory'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnROOTDigitalProduct'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/txtboxAddNewCategoryEN'), 
    GlobalVariable.storeName)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/txtboxAddNewCategoryID'), 
    GlobalVariable.storeName)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnAddBackEndCategory'), 
    30)

WebUI.delay(3)

alertAdd = WebUI.getAlertText()

println(alertAdd)

WebUI.acceptAlert()

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnNewChildCategory'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/txtboxEditBackEndCategory'), 
    GlobalVariable.searchKeywordProductCategory)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnSaveEditBackEndCategory'), 
    30)

WebUI.delay(3)

alertEdit = WebUI.getAlertText()

println(alertEdit)

WebUI.acceptAlert()

WebUI.refresh()

WebUI.delay(7)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnROOTBackEndCateogory'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnROOTDigitalProduct'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnNewCategoryWarungkuKomputer'), 
    30)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050301_BackendProductCategory/btnDeleteBackEndCategory'), 
    30)

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(2)

alertDelete = WebUI.getAlertText()

WebUI.acceptAlert()

println(alertDelete)

WebUI.refresh()

WebUI.verifyTextNotPresent(GlobalVariable.searchKeywordProductCategory, false)

