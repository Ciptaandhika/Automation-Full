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

WebUI.navigateToUrl(GlobalVariable.URLMemberMainsite)

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010201_LoginPage/txtBoxUsernameBuyer01'), GlobalVariable.usernameBuyerLoginPage)

WebUI.setText(findTestObject('Object Repository/01_DESKTOP/0102_Member/010201_LoginPage/txtBoxPassword'), GlobalVariable.passwordBuyerLoginPage)

WebUI.click(findTestObject('Object Repository/01_DESKTOP/0102_Member/010201_LoginPage/btnMasuk'))
