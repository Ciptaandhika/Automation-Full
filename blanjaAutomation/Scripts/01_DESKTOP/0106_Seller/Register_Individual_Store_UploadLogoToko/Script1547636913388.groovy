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

if (WebUI.verifyElementPresent(findTestObject('01_DESKTOP/0106_Seller/btnOpenStore'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('01_DESKTOP/0106_Seller/Click_Open_Individual_Store'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickUploadLogoToko'), FailureHandling.STOP_ON_FAILURE)

    String Projectpath = System.getProperty('user.dir')

    String Filepath = Projectpath + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnUploadLogoToko'), Filepath, FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.setText(findTestObject('01_DESKTOP/0106_Seller/txtboxOwnerName'), GlobalVariable.storeOwnerName)

    WebUI.click(findTestObject('01_DESKTOP/0106_Seller/btnClickUploadLogoToko'), FailureHandling.CONTINUE_ON_FAILURE)

    String Projectpath = System.getProperty('user.dir')

    String Filepath = Projectpath + GlobalVariable.relativeImage

    WebUI.uploadFile(findTestObject('01_DESKTOP/0106_Seller/btnUploadLogoToko'), Filepath, FailureHandling.STOP_ON_FAILURE)
}

