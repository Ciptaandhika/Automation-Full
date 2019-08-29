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

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/txtBoxBillingTime-Start'), 
    'startDate', -30, 0)

CustomKeywords.'com.mii.AutoDatePicker.pickDateDynamicStartDateEndDate'(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/txtBoxBillingTime-End'), 
    'endDate', -30, 0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/btnSearch'))

startDate = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/txtBoxBillingTime-Start'))

endDate = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/txtBoxBillingTime-End'))

log.logInfo(startDate)

log.logInfo(endDate)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/btnExport'))

WebUI.verifyElementClickable(findTestObject('01_DESKTOP/0105_Admin/010502_TransactionManagement/01050208_BillingTransaction/Page_/btnExport'))

