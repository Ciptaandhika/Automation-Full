import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
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

List<WebElement> objectLists = WebUI.findWebElements(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050917_SearchProductKeywordBoost/Page_/cbxKeyword'), 
    0)

String categoryName = objectLists.get(1).getAttribute('categoryname')

new_btn = WebUI.modifyObjectProperty(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050917_SearchProductKeywordBoost/Page_/cbxKeyword'), 
    'categoryname', 'equals', categoryName, false)

println(WebUI.getAttribute(new_btn, 'categoryname'))

WebUI.check(new_btn)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050917_SearchProductKeywordBoost/Page_/btnUnbind'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050917_SearchProductKeywordBoost/Page_/btnConfrmUnbind'))

