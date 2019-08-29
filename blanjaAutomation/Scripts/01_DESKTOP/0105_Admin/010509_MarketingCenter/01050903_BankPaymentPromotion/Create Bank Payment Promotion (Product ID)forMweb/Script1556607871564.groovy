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

mydate = new Date()

datehour = mydate.format('HHmm')

dynamic_Campaign = ('Sprint Asia ' + datehour)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/hrefBankPaymentPromotion'))

not_run: WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtPromotionName'), 
    dynamic_Campaign)

not_run: WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddbank_name'), 
    GlobalVariable.ddvalueBankPaymentPromotion_BankName, GlobalVariable.isTrue)

not_run: WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddVendor_Type'), 
    GlobalVariable.ddvalueBankPaymentPromotion_VendorType, GlobalVariable.isTrue)

not_run: WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddPayment_Type'), 
    GlobalVariable.ddvalueBankPaymentPromotion_PaymentType, GlobalVariable.isTrue)

not_run: CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtBoxStartDate'), 
    'startDate')

not_run: CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtBoxEndDate'), 
    'endDate')

not_run: WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddpromotion_status'), 
    GlobalVariable.ddvalueBankPaymentPromotion_PromotionStatus, GlobalVariable.isTrue)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnAddPromotion'))

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddProgramName2'), 
    GlobalVariable.ddBankPaymentPromotion_ProgramName, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtSiteID'), 
    GlobalVariable.txtBankPaymentPromotion_SiteId)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtPromotionName2'), 
    dynamic_Campaign)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddVendor_Type2'), 
    GlobalVariable.ddvalueBankPaymentPromotion_VendorType, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddBank_Name2'), 
    GlobalVariable.ddValueBankName, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddBinBank'), 
    GlobalVariable.txtBankPaymentPromotion_GroupBinBank, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddPayment_Type2'), 
    GlobalVariable.ddValueBankPaymentPromotion_PaymentType2, GlobalVariable.isTrue)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/cbVisa'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/cbMasterCard'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/cbJcb'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/rbBlanja'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtMDRCharge'), 
    GlobalVariable.ddValue3)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtInstallmentPlan'), 
    GlobalVariable.txtBankPaymentPromotion_InstallmentPlan6month)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/rbYes'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnAdd'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/lbl6month'), 
    30)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtInstallmentPlan'), 
    GlobalVariable.txtBankPaymentPromotion_InstallmentPlan12month)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/rbYes'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnAdd'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/lbl12month'), 
    30)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtboxStartDate2'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtboxEndDate2'), 
    'endDate')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtTransactionMin'), 
    GlobalVariable.txtBankPaymentPromotion_MinPromotion)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtTransactionMax'), 
    GlobalVariable.txtBankPaymentPromotion_MaxPromotion)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/rbDiscountRp'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtDiscountRp'), 
    GlobalVariable.txtBankPaymentPromotion_DiscountRp)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtLimitPerUser'), 
    GlobalVariable.txtBankPaymentPromotion_LimitPerUser)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/cbPerDay'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtMaxUser'), 
    GlobalVariable.txtBankPaymentPromotion_MaxUser)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/cbPromotionBudgetBy_Blanja'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtPromotionBudgetBy_Blanja'), 
    GlobalVariable.txtBankPaymentPromotion_MaxPromotion)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtInformationCardPromo'), 
    GlobalVariable.txtBnakPaymentPromotion_InformationCardPromo)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/cbApplyFilter'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/rbProductID'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtProductID'), 
    GlobalVariable.txtBoxProductId5)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnSave'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnOK'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/lblPromoSerbaMurahWardah'), 
    30)

