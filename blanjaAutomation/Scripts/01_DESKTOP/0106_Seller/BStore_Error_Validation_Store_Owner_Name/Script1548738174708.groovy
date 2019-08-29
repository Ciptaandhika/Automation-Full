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
import org.openqa.selenium.Keys as Keys

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnOpenStore'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Business_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), GlobalVariable.input1Character)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanPemilikToko'), GlobalVariable.setTimeOutGlobal)
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), GlobalVariable.input1Character)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanPemilikToko'), GlobalVariable.setTimeOutGlobal)
} else {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKembaliDokumenPage'))

    WebUI.waitForPageLoad(30)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanPemilikToko'), GlobalVariable.setTimeOutGlobal)
}
