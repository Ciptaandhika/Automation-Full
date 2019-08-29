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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/txtSearchProduct'), 
    GlobalVariable.namePulsa30k)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/btnSearch2'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/btnEdit30k'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/h2ScrollToTitle'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/rbAction'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/rbPlaceToClose'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/rbPlaceToClose'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/btnSubmit'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/btnOk'))

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/SCHEDULER/btnOkClose'))

