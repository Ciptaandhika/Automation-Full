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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050307_CategoryGroup/CreateNewGroup/txtBoxGroupName'), 
    GlobalVariable.groupCategoryName)

WebUI.delay(1)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050307_CategoryGroup/CreateNewGroup/lblExpandFashionSportAndHealtyBeauty'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050307_CategoryGroup/CreateNewGroup/lblExpandGirlsClothes'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050307_CategoryGroup/CreateNewGroup/lblGirlsClothes'))

WebUI.delay(1)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010503_CategoryManagement/01050307_CategoryGroup/CreateNewGroup/btnSaveNewCategory'))

WebUI.delay(3)

WebUI.acceptAlert()

