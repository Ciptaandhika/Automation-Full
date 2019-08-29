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

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.delay(3)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanNomorTelepon'), GlobalVariable.setTimeOutGlobal)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input6DigitNumber)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input14DigitNumber)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreOwnerName'), 5, FailureHandling.OPTIONAL)) {
    WebUI.delay(3)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.delay(3)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanNomorTelepon'), GlobalVariable.setTimeOutGlobal)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input6DigitNumber)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input14DigitNumber)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)
} else if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/ddBStoreInputBank'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKembaliDokumenPage'))

    WebUI.delay(3)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanNomorTelepon'), GlobalVariable.setTimeOutGlobal)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input6DigitNumber)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input14DigitNumber)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)
} else {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKembaliConfirmPage'))

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnBStoreKembaliDokumenPage'))

    WebUI.delay(3)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningMohonMasukanNomorTelepon'), GlobalVariable.setTimeOutGlobal)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input6DigitNumber)

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.clearText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'))

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), GlobalVariable.input14DigitNumber)

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.sendKeys(findTestObject('01_DESKTOP/0106_Seller/txtboxPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

    WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/labelWarningIniBukanNomorTeleponValid'), GlobalVariable.setTimeOutGlobal)
}

