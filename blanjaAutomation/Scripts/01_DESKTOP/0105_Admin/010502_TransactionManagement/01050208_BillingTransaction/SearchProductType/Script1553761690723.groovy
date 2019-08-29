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

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/txtBoxProductType'), 
    GlobalVariable.ddValueIndihome)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/btnSearch'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/btnSearch'), 
    30)

totalOrder = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/lblOrderTotal'))

log.logInfo((totalOrder).toString())

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/lblOrderTotal'), 
    2)

