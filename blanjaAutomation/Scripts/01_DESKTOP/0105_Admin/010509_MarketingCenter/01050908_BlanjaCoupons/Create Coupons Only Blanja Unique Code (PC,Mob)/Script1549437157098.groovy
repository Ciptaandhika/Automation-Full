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

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbPC'), 
    30)

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbMob'), 
    30)

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbLTDSpecialPrice'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbLTDSeller'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/Page_/cbLTDSeller'), 
    30)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbTELKOMSEL'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/cbTELKOMSEL'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/txtTotalBudget'), 
    GlobalVariable.txtBlanjaCoupons_TotalBudget)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/ddBudgetType'), 
    GlobalVariable.ddvalueBlanjaCoupons_BudgetType3, GlobalVariable.isTrue)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/btnCreate'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/lblChannelPCMob'), 
    30)

not_run: WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/Blanja Coupons/lblDiskon100K'), 
    30)

