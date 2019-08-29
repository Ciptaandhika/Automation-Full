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

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/hrefViewDetailReport'))

WebUI.switchToWindowIndex('1')

WebUI.delay(3)

blanjaCouponUsed = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/lblBlanjaCouponUsed'))

orderTotal = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/lblOrderTotal'))

println(blanjaCouponUsed)

println(orderTotal)

WebUI.switchToWindowIndex('0')

WebUI.delay(3)

leftBudget = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/lblLeftBudgetBlanja'))

totalLeftBudget = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050908_BlanjaCoupons/lblTotalLeftBudget'))

println(leftBudget)

println(totalLeftBudget)
