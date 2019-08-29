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

WebUI.openBrowser('')

WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl(GlobalVariable.urlLoginAdminAdmin)

not_run: WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxUsernameAdmin'), GlobalVariable.usernameAdminAdmin)

not_run: WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxPasswordAdmin'), GlobalVariable.passwordAdminAdmin)

not_run: WebUI.click(findTestObject('01_DESKTOP/0105_Admin/btnLoginAdmin'))

WebUI.navigateToUrl('admin.bljstaging.com')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxUsernameAdmin'), 'mpadmin')

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxPasswordAdmin'), 'a123456')

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/btnLoginAdmin'))

