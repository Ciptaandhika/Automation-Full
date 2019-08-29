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

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxSkuID'), 
    GlobalVariable.SKUIDPrepaidSettingPLN)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxTopUp'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnSearch'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnEditPLN'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnEditPLN'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/tableInformation'), 
    0)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxOperatorName'), 
    GlobalVariable.ddValuePLN, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxProviderName'), 
    GlobalVariable.ddValuePLN, GlobalVariable.isTrue)

WebUI.selectOptionByValue(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxType'), 
    GlobalVariable.ddValuePLN_TOKEN, GlobalVariable.isTrue)

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxTopUp'), 
    GlobalVariable.nominalAddNominalPrepaidCreditSetting)

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxTopUp'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/cbShowOnPdp'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/cbShowOnPdp'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/rbShowPublic'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/tableHistory'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnUpdateSetting'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnOKTest'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnOkUpdate'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/tableListItem'), 
    0)

WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/lableVerifyAddNewPrepaidCreditSetting'), 
    0)

