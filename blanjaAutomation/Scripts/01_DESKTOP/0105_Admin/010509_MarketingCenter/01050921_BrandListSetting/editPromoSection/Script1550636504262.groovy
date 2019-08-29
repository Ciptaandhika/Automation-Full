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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/btnEditPromo'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/txtBoxPromoName'), 
    GlobalVariable.promoName)

String Projectpath = System.getProperty('user.dir')

String Filepath1 = Projectpath + GlobalVariable.filePromo280

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/uploadFilePromo'), 
    Filepath1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/txtBoxBannerTitle'), 
    GlobalVariable.promoName)

String Filepath2 = Projectpath + GlobalVariable.filePromo560

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/uploadFilePromoMobile'), 
    Filepath2)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/txtBoxBannerTitleMobile'), 
    GlobalVariable.promoName)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/textBoxProductList'), 
    GlobalVariable.productList)

String Filepath3 = Projectpath + GlobalVariable.filePromo1440

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/uploadInnerPromo'), 
    Filepath3)

String Filepath4 = Projectpath + GlobalVariable.filePromo560

WebUI.uploadFile(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/uploadInnerMobile'), 
    Filepath4)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/btnUpdatePromo'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050921_BrandListSetting/Page_Upload Promo Section - BLANJA/buttonOkEdit'))

WebUI.acceptAlert()

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.urlBrandListSetting)

WebUI.verifyTextPresent(GlobalVariable.promoName, true)

