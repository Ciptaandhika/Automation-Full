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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/hrefBankPaymentPromotion'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtPromotionName'), 
    GlobalVariable.txtBankPaymentPromotion_PromotionName)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddbank_name'), 
    GlobalVariable.ddvalueBankPaymentPromotion_BankName, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddVendor_Type'), 
    GlobalVariable.ddvalueBankPaymentPromotion_VendorType, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddPayment_Type'), 
    GlobalVariable.ddvalueBankPaymentPromotion_PaymentType, GlobalVariable.isTrue)

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtBoxStartDate'), 
    'startDate')

CustomKeywords.'com.mii.AutoDatePicker.pickDate'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtBoxEndDate'), 
    'endDate')

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddpromotion_status'), 
    GlobalVariable.ddvalueBankPaymentPromotion_PromotionStatus, GlobalVariable.isTrue)

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnAddPromotion2'), 
    0)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddProgramName2'), 
    GlobalVariable.ddBankPaymentPromotion_ProgramName, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtSiteID'), 
    GlobalVariable.txtBankPaymentPromotion_SiteId)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtPromotionName2'), 
    GlobalVariable.txtBankPaymentPromotion_PromotionName)

text1 = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtPromotionName2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddVendor_Type2'), 
    GlobalVariable.ddvalueBankPaymentPromotion_VendorType, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddBank_Name2'), 
    GlobalVariable.ddvalueBankPaymentPromotion_BankName, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddBinBank'), 
    GlobalVariable.txtBankPaymentPromotion_GroupBinBank, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/ddPayment_Type2'), 
    GlobalVariable.ddvalueBankPaymentPromotion_PaymentType, GlobalVariable.isTrue)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/cbVisa'))

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
    GlobalVariable.txtBankPaymentPromotion_MinPromotion)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtInformationCardPromo'), 
    GlobalVariable.txtBnakPaymentPromotion_InformationCardPromo)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnSave'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/btnOK'))

CustomKeywords.'com.blanja.web.Click_UsingJS.clickUsingJS'(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/hrefView'), 
    0)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

List<WebElement> Columns_row = rows_table.get(0).findElements(By.tagName('td'))

List<WebElement> listhref = Columns_row.get(11).findElements(By.tagName('a'))

listhref.get(0).click()

text2 = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050903_BankPaymentPromotion/Bank_Payment_Promotion/txtPromotionNameView'))

WebUI.verifyEqual(text1, text2)

