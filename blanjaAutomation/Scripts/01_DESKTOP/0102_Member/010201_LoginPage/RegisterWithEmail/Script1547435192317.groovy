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

WebUI.openBrowser(GlobalVariable.urlhomepage)

WebUI.maximizeWindow()

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnCloseBukuPanduan'))

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010101_Homepage/btnDaftar'))

WebUI.setText(findTestObject('01_DESKTOP/0102_Member/010201_LoginPage/txtBoxUsernameCopy'), GlobalVariable.usernameRegisterPage)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010105_DaftarMember/txtBoxMobilePhone'), GlobalVariable.noHpRegisterPage)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010105_DaftarMember/txtBoxEmail'), GlobalVariable.emailRegisterPage)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010105_DaftarMember/rbGender'))

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010105_DaftarMember/txtBoxPassword'), GlobalVariable.passwordRegisterPage)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010105_DaftarMember/txtBoxConfirmPassword'), GlobalVariable.passwordRegisterPage)

WebUI.setText(findTestObject('01_DESKTOP/0101_Mainsite/010105_DaftarMember/txtBoxKode'), '')

WebUI.delay(10)

WebUI.click(findTestObject('01_DESKTOP/0101_Mainsite/010105_DaftarMember/btnDaftar'))

WebUI.closeBrowser()

