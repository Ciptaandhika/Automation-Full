import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.ConcurrentSkipListMap.KeySet as KeySet
import java.util.logging.Logger as Logger
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordLogger log = new KeywordLogger()

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnEditPLN'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/txtProductName'), 
    GlobalVariable.nmIndiHome)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/txtShopId'), 
    GlobalVariable.idShop)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/txtInformation'), 
    GlobalVariable.nmIndiHomeINFO)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnSubmit'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnOkEditPLN'))

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/lblBerhasilEdit'), 
    5)

resultEdit = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/lblBerhasilEdit'))

log.logInfo(resultEdit)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051406_MasterProductBilling/Page_/btnCloseEditPLN'))

