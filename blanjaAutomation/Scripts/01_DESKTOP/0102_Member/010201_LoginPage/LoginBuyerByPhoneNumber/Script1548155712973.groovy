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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.urlhomepage)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnCloseBukuPanduan'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/hrefMasuk'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010201_LoginPage/txtBoxUsername'), GlobalVariable.noHpRegisterPage)

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010201_LoginPage/txtBoxPassword'), GlobalVariable.passwordRegisterPage)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010201_LoginPage/btnMasuk'))

