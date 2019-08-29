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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl(GlobalVariable.UrlRegulerDesktopPDP)

not_run: WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/ihrefTersediaLayanan'))

not_run: WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/btnTambahkeTroli'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefTroliHomePage'))

WebUI.click(findTestObject('01_DESKTOP/0104_Trade/010401_Cart/btnLanjutkanPembayaran'))

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/usernamePopUpLogin'), GlobalVariable.usernameBuyerLoginPage)

WebUI.setText(findTestObject('01_DESKTOP/0103_Product/010301_PDP/passwordPopUpLogin'), GlobalVariable.passwordBuyerLoginPage)

WebUI.click(findTestObject('01_DESKTOP/0103_Product/010301_PDP/HrefMasuk'))

