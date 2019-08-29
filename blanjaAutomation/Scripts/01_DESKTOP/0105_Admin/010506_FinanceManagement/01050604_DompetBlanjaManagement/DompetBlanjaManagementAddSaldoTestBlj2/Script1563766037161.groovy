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

WebUI.navigateToUrl(GlobalVariable.urlLoginAdminAdmin)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxUsernameAdmin'), GlobalVariable.usernameAdminMii)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/txtBoxPasswordAdmin'), GlobalVariable.passwordAdminMii)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/btnLoginAdmin'))

WebUI.navigateToUrl(GlobalVariable.urlDompetBlanjaManagement)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/txtBoxAccountName'), 
    GlobalVariable.usernameBuyerLoginPayment)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/btnSearchAccount'))

WebUI.delay(2)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/hrefEditOptionDompetBlanja'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/rbAddButton'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/txtBoxAddAmount'), 
    GlobalVariable.saldoAdd50K)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/txtAreaNoteAddAmount'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/txtAreaNoteAddAmount'), 
    GlobalVariable.noteTambahkanSaldo)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010506_FinanceManagement/01050604_DompetBlanjaManagement/btnConfirmAddAmount'))

WebUI.acceptAlert()

