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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnXGoSend'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/btnXGoSend'), FailureHandling.OPTIONAL)
} else {
}

WebUI.verifyTextPresent(GlobalVariable.txt131, true)

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/txtBoxQty'), GlobalVariable.txt131)

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/a_Tambahkan ke Troli'))

WebUI.delay(3)

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Page_Jual Fit Bakso  BLANJA.com/btnTroli'))

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010509_MarketingCenter/01050919_LimitedTimeDiscountPromotion/Page_Jual Fit Bakso  BLANJA.com/spinUp'), 
    FailureHandling.STOP_ON_FAILURE)

