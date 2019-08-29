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

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/divAction'), 
    0)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/cbActionSKUID'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnEdit'))

WebUI.scrollToElement(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxSkuID'), 
    0)

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxOperatorName'), 
    GlobalVariable.OperatorName)

if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtBoxProviderName1'), 
        GlobalVariable.ProviderName)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxType1'), 
        GlobalVariable.Type)
} else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(2)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxProviderName2'), 
        GlobalVariable.ProviderName)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtBoxType2'), 
        GlobalVariable.Type)
} else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(3)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxProviderName3'), 
        GlobalVariable.ProviderName)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxType31'), 
        GlobalVariable.Type)
} else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(4)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxProviderName4'), 
        GlobalVariable.ProviderName)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxType4'), 
        GlobalVariable.Type)
} else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(5)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxProviderName5'), 
        GlobalVariable.ProviderName)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxType5'), 
        GlobalVariable.Type)
} else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(6)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxProviderName6'), 
        GlobalVariable.ProviderName)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxType61'), 
        GlobalVariable.Type)
} else {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxProvideName7'), 
        GlobalVariable.ProviderName)

    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/txtBoxType71'), 
        GlobalVariable.Type)
}

WebUI.clearText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtBoxTopUp'))

WebUI.setText(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/Page_/txtBoxTopUp'), 
    GlobalVariable.TopUp)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/cbShowPublicYes'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnUpdateSetting'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnOKPopUp'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/btnOK'))

WebUI.verifyElementChecked(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051401_PrepaidCreditSetting/cbActionSKUID'), 
    0)

