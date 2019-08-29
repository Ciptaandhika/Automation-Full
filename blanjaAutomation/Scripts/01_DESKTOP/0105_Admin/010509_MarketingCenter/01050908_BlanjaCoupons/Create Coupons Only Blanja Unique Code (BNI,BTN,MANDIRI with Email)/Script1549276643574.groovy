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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/hrefBlanjaCoupons'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/ddProgramName'), 
    GlobalVariable.ddvalueBlanjaCoupons_ProgramName, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtCouponName'), 
    GlobalVariable.txtBlanjaCoupons_CouponName)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbCashback'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/rbCouponTypeUnique'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/rbPleaseChooseValue'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtPleaseChooseValue'), 
    GlobalVariable.txtBlanjaCoupons_PleaseChooseValue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtThreshold'), 
    GlobalVariable.txtBlanjaCoupons_Threshold)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtThreshold'), 
    Keys.chord(Keys.TAB))

CustomKeywords.'com.mii.AutoDatePicker.pickDateTab'('startDate')

WebUI.sendKeys(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtThreshold'), 
    Keys.chord(Keys.TAB, Keys.TAB, Keys.TAB))

CustomKeywords.'com.mii.AutoDatePicker.pickDateTab'('endDate')

WebUI.delay(1)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtNumberOfCoupon'), 
    GlobalVariable.txtBlanjaCoupons_NumberOfCoupon)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtCouponCodeUnique'), 
    GlobalVariable.txtBlanjaCoupons_CouponCode)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbMob'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbTELKOMSEL'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbTELKOMSEL'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbApplyFilter'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbApplyFilter'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/rbBackendProductCategory'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/rbBackendProductCategory'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/btnTambah'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbKidsBabynToys'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/btnInclude'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbLockCoupon'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbLockCoupon'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbLockPayment'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbLockPayment'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbEmail'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbEmail'), 
    30)

String Projectpath = System.getProperty('user.dir')

String Filepath = Projectpath + GlobalVariable.xlsBlanjaCoupon

CustomKeywords.'com.blanja.web.uploadFileByRobot.uploadFile'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/btnChooseFile'),
	Filepath)

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/btnDownloadTemplate'))

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/btnChooseFile'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbCCKlikBCA'))

WebUI.verifyElementVisible(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbCCKlikBCA'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbBNIDebitOnline'))

WebUI.verifyElementVisible(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbBNIDebitOnline'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbBTNDebitOnline'))

WebUI.verifyElementVisible(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbBTNDebitOnline'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbMandiriDebitOnline'))

WebUI.verifyElementVisible(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbMandiriDebitOnline'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtTotalBudget'), 
    GlobalVariable.txtBlanjaCoupons_TotalBudget)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/ddBudgetType'), 
    GlobalVariable.ddvalueBlanjaCoupons_BudgetType3, GlobalVariable.isTrue)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/btnCreate'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/lblDiskon100K'), 
    30)

