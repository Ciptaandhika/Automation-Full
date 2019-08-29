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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/btnListBrand'))
String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.lb10060
WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/Page_Upload Brand Logo - BLANJA.com/uploadListBrandNew'), 
    Filepath)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/Page_Upload Brand Logo - BLANJA.com/txtBoxBrandTitleNew'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/Page_Upload Brand Logo - BLANJA.com/txtBoxBrandLinkNew'), 
    GlobalVariable.blLinkBanner)
String Projectpath1 = System.getProperty('user.dir')
String Filepath1 = Projectpath1 + GlobalVariable.lb8460
WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/Page_Upload Brand Logo - BLANJA.com/uploadListBrandMobileNew'), 
    Filepath1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/Page_Upload Brand Logo - BLANJA.com/txtBoxBrandTitleMobileNew'), 
    GlobalVariable.txtSamsung)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/Page_Upload Brand Logo - BLANJA.com/txtBoxBrandLinkMobileNew'), 
    GlobalVariable.blLinkBanner)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/ListBrand/Page_Upload Brand Logo - BLANJA.com/btnAddBrand'))

WebUI.verifyTextPresent(GlobalVariable.txtSamsung, true)

