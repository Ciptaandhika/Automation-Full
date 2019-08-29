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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/txtBoxPleaseSelectPromoName'))

WebUI.sendKeys(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/txtBoxSearchPromoName'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/txtBoxStartDateCreateShcedule'))

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/a_21'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/txtBoxEndDateCreateShcedule'))

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/a_22'))

not_run: WebUI.delay(1)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/txtBoxStartDateCreateShcedule'), 
    GlobalVariable.startDate)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/txtBoxEndDateCreateShcedule'), 
    GlobalVariable.endDate)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/btnSavePromo'))

