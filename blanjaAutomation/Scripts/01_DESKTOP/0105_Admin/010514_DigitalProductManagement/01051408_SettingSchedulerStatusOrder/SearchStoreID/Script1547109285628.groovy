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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl(GlobalVariable.urlLoginAdminAdmin)

not_run: WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/txtInputAdmin'), 
    GlobalVariable.usernameAdminAdmin)

not_run: WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/txtInputPassAdmin'), 
    GlobalVariable.passwordAdminAdmin)

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/btnLoginAdm'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/txtStoreId'), 
    GlobalVariable.idStore)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/btnSearch'))

idStore = WebUI.getText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051408_SettingSchedulerStatusOrder/Page_/lableStoreId'))

WebUI.verifyMatch(GlobalVariable.idStore, idStore, false)

