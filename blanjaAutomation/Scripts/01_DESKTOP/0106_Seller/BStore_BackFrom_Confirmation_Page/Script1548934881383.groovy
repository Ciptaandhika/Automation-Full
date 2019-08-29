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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/ddBStoreInputBank'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/ddBStoreInputBank'))

    WebUI.delay(GlobalVariable.setTimeOutGlobal)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/li_BCA'))

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreBranchName'), GlobalVariable.BranchBank)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreBankNumber'), GlobalVariable.accountBankNumber)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreBankAccountOwner'), GlobalVariable.storeOwnerName)

    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxBStoreCompanyName'), GlobalVariable.storeName)

    String Projectpath = System.getProperty('user.dir')

    String Filepath = Projectpath + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnBStoreUploadNPWP'), Filepath)

    String Imagepath = Projectpath + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnUploadSIUP'), Imagepath)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnLanjutkanBStore'))

    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Back_BStore_ConfirmPage'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Back_BStore_ConfirmPage'), [:], FailureHandling.STOP_ON_FAILURE)
}

