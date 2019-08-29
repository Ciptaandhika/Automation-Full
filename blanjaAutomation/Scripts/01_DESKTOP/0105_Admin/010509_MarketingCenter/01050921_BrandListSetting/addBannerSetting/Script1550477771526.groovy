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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/btnBannerSetting'))

String Projectpath = System.getProperty('user.dir')

String Filepath1 = Projectpath + GlobalVariable.pathMainBrand

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/uploadFileMainBanner'), 
    Filepath1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxTitleMainBanner'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxLinkMainBanner'), 
    GlobalVariable.blLinkBanner)

String Filepath2 = Projectpath + GlobalVariable.pathMainBrandMobile

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/uploadFileMainMobile'), 
    Filepath2)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxTitleMainMobile'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxLinkMainMobile'), 
    GlobalVariable.blLinkBanner)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/btnAddMainBanner'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/buttonOkMainBanner'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxTitleSideBanner1'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxLinkSideBanner1'), 
    GlobalVariable.blLinkBanner)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxTitleSideBanner2'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxLinkSideBanner2'), 
    GlobalVariable.blLinkBanner)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxTitleMiniBanner1'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxLinkMiniBanner1'), 
    GlobalVariable.blLinkBanner)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxTitleMiniBanner2'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/txtBoxLinkMiniBanner2'), 
    GlobalVariable.blLinkBanner)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Banner Setting/buttonSubmit'))

alert = WebUI.getAlertText()
log.logInfo(alert)
WebUI.acceptAlert()

