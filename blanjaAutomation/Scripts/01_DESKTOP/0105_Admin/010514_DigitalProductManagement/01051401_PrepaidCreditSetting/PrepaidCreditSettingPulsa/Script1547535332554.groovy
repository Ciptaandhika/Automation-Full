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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtSKUID'), 
    GlobalVariable.idSKUPulsa)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/ddOperatorName'), 
    GlobalVariable.ddValue3, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/ddProviderName'), 
    GlobalVariable.ddValue3, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/ddType'), 
    GlobalVariable.ddValuePulsa, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtTopUp'), 
    GlobalVariable.nominalPulsa3)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtTopUp'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/rbYesUnlimited'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/cbDisplayOn'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtDesktop'), 
    GlobalVariable.urlPulsa3Desktop)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtMobile'), 
    GlobalVariable.urlPulsa3Mobile)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/rbYesPublic'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/btnCreateSetting'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/btnOKPopup'))

