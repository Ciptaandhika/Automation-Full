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

//WebUI.callTestCase(findTestCase('01_DESKTOP/0102_Member/010201_LoginPage/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('https://admin.bljstaging.com/shopAndWin/management')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050920_KoinBlanjaManagement/txtBoxAccountNameAddCoin'), 
    'Test08')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050920_KoinBlanjaManagement/btnSearchAccountNameAddCoin'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050920_KoinBlanjaManagement/hrefEditAddCoin'))

WebUI.delay(3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050920_KoinBlanjaManagement/txtBoxAmountAddCoin'), 
    '4500')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050920_KoinBlanjaManagement/txtBoxNoteAddCoin'), 
    'Add coin for test08')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050920_KoinBlanjaManagement/btnConfirmAddCoin'))

WebUI.delay(2)

WebUI.acceptAlert()

